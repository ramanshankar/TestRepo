/**
 * 
 */
package com.goeuro.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import com.goeuro.Exception.GoEuroServiceException;
import com.goeuro.domain.CityInformation;
import com.google.gson.Gson;

/**
 * @author Raman
 * 
 *         Service has two methods one converts the json into array of objects
 *         and other writes the information into Csv file.
 */
public class TestService {

	private URL url;
	private Reader reader;
	private CityInformation[] CityInformationList;
	private FileWriter fileWriter = null;

	// Constants
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String ADDRESS = "http://api.goeuro.com/api/v2/position/suggest/en/";
	private static final String CHARSET = "UTF-8";
	private static final String FILE_HEADER = "_id,name,type,latitude,longitude";
	private static final String COPY_FILE_PATH = "C:\\GoEuroFiles\\";

	/*
	 * Exracts city informtion by reading the json object and stores into an
	 * array CityInformationList []
	 * 
	 * @param city
	 */
	public void extractCityInformation(String city)
			throws GoEuroServiceException {

		try {
			url = new URL(ADDRESS + URLEncoder.encode(city, CHARSET));
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			throw new GoEuroServiceException(
					"MalformedURLException in extractCityInformation() method",
					e);
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
			throw new GoEuroServiceException(
					"Unsupported Encoding Exception in extractCityInformation() method",
					e);
		}

		try {
			reader = new InputStreamReader(url.openStream(), CHARSET);
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
			throw new GoEuroServiceException(
					"Unsupported Encoding Exception in extractCityInformation() method",
					e);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw new GoEuroServiceException(
					"IO Exception in extractCityInformation() method", e);
		}
		CityInformationList = new Gson().fromJson(reader,
				CityInformation[].class);

		if (CityInformationList != null) {
			// Show entire list
			for (int i = 0; i < CityInformationList.length; i++) {
				// System.out.println("Id: " + CityInformationList[i].getId() +
				// "\n");
				// System.out.println("Full Name: " +
				// CityInformationList[i].getFullName());

				System.out.println(CityInformationList[i]);
			}

		} else {
			throw new GoEuroServiceException(
					"CityInformationList is null. Problem with Json read");
		}

		if (CityInformationList.length > 0) {
			// Pass the city name to WriteCityInfoToCsvService()
			writeCityInfoToCsvService(city);
		} else {
			throw new GoEuroServiceException(
					"No city information was found for " + city
							+ ". Please try with a another city name");
		}
	}

	/*
	 * 
	 * 
	 * @param city
	 * 
	 * Writes the CityInformation into <City>.csv file
	 */
	public void writeCityInfoToCsvService(String city)
			throws GoEuroServiceException {

		String filePath = COPY_FILE_PATH + city + ".csv";

		try {

			fileWriter = new FileWriter(filePath);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a City Information to the CSV file

			for (int i = 0; i < CityInformationList.length; i++) {
				fileWriter.append(String.valueOf(CityInformationList[i]
						.get_id()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(CityInformationList[i]
						.getName()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(CityInformationList[i].getType());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(CityInformationList[i]
						.getGeo_position().getLatitude()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(CityInformationList[i]
						.getGeo_position().getLongitude()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new GoEuroServiceException(e.getMessage(), e);
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				throw new GoEuroServiceException(
						"Error while flushing/closing fileWriter !!!", e);

			}

		}

	}
}
