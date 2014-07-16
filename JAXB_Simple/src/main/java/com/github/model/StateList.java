/**
 * This class represents list of states for each country.
 */
package main.java.com.github.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "states")
public class StateList {

	private List<State> list;

	@XmlElement(name = "state_province")
	public List<State> getList() {
		return list;
	}

	public void setList(List<State> list) {
		this.list = list;
	}
	
	
}
