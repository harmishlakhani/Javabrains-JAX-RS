/**
 * This is model class for country.
 * It contains following details about each country.
 * 1. Country Id
 * 2. Country Name
 * 3. Country ISO Code  
 */
package main.java.com.github.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country")
public class Country {

	private int countryId;
	private String name;
	private String isoCode;

	@XmlElement(name = "country_id")
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "iso_code")
	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	
	
}
