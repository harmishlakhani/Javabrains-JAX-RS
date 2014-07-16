/**
 * This class represents list of countries.
 */
package main.java.com.github.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "countries")
public class CountryList {

	private List<Country> list;

	@XmlElement(name = "country")
	public List<Country> getList() {
		return list;
	}

	public void setList(List<Country> list) {
		this.list = list;
	}
	
	
}
