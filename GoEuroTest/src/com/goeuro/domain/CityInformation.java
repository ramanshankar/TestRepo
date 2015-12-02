/**
 * 
 */
package com.goeuro.domain;

/**
 * @author Raman
 * City Information as per the Json Object
 */
public class CityInformation {

	private Integer _id;
	private String key;
	private String name;
	private String fullName;
	private String iataAirportCode;
	private String type;
	private String country;
	private GeoPosition geo_position;
	private Integer locationId;
	private boolean inEurope;
	private String countryCode;
	private String coreCountry;
	private double distance;


	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the iataAirportCode
	 */
	public String getIataAirportCode() {
		return iataAirportCode;
	}

	/**
	 * @param iataAirportCode
	 *            the iataAirportCode to set
	 */
	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return the geo_position
	 */
	public GeoPosition getGeo_position() {
		return geo_position;
	}

	/**
	 * @param geo_position the geo_position to set
	 */
	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	/**
	 * @return the inEurope
	 */
	public boolean isInEurope() {
		return inEurope;
	}

	/**
	 * @param inEurope
	 *            the inEurope to set
	 */
	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 *            the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the coreCountry
	 */
	public String getCoreCountry() {
		return coreCountry;
	}

	/**
	 * @param coreCountry
	 *            the coreCountry to set
	 */
	public void setCoreCountry(String coreCountry) {
		this.coreCountry = coreCountry;
	}

	/**
	 * @return the _id
	 */
	public Integer get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(Integer _id) {
		this._id = _id;
	}

	/**
	 * @return the locationId
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CityInformation [_id=" + _id + ", key=" + key + ", name="
				+ name + ", fullName=" + fullName + ", iataAirportCode="
				+ iataAirportCode + ", type=" + type + ", country=" + country
				+ ", geo_position=" + geo_position + ", locationId="
				+ locationId + ", inEurope=" + inEurope + ", countryCode="
				+ countryCode + ", coreCountry=" + coreCountry + ", distance="
				+ distance + "]";
	}
	
		
	
}
