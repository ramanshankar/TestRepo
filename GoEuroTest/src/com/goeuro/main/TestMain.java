/**
 * 
 */
package com.goeuro.main;

import com.goeuro.Exception.GoEuroApplicationException;
import com.goeuro.service.TestService;

/**
 * @author Gomathi Shankar Raman
 *
 */
public class TestMain {

	public static TestService testService = new TestService();

	/**
	 * @param args
	 * @throws GoEuroApplicationException
	 */
	public static void main(String[] args) {

		String city = args[0];

		try {

			testService.extractCityInformation(city);
			
		} catch (GoEuroApplicationException e) {
			e.printStackTrace();
		}
	}
}
