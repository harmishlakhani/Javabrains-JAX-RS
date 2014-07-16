/**
 * This converter class is used to convert State XML into Java Object(List of States)
 */
package main.java.com.github.conversion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import main.java.com.github.model.State;
import main.java.com.github.model.StateList;

public class XMLToJavaState {

	public static void main(String[] args) {

		try {
			//JAXBContext that is responsible for creating Marshaller/Unmarshaller
			JAXBContext context = JAXBContext.newInstance(StateList.class);
			
			//Unmarshaller that will convert XML to Java Object
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File file = new File("src/main/resources/state.xml");
			StateList list = (StateList) unmarshaller.unmarshal(file);
			
			for(State state : list.getList()) {
				System.out.println(state.getCountryId() + " " + state.getName() + " " + state.getAbbreviation());
			}
		} catch (JAXBException e) {
			System.out.println("Exception occured in JAXB");
			e.printStackTrace();
		}
	}

}
