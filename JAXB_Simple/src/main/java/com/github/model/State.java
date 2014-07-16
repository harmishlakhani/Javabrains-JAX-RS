/**
 * This is model class for state.
 * It contains following details about each state.
 * 1. State Name
 * 2. State Abbreviation
 * 3. Country Id for each state  
 */
package main.java.com.github.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "state_province")
public class State {

	private String name;
	private  String abbreviation;
	private int countryId;
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "abbreviation")
	public String getAbbreviation() {
		return abbreviation;
	}
	
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	@XmlElement(name = "country_id")
	public int getCountryId() {
		return countryId;
	}
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
}
