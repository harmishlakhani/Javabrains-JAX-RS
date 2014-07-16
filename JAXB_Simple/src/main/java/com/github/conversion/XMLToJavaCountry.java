/**
 * This converter class is used to convert Country XML into Java Object(List of Countries)
 */
package main.java.com.github.conversion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import main.java.com.github.model.Country;
import main.java.com.github.model.CountryList;

public class XMLToJavaCountry {

	public static void main(String[] args) {

		try {
			//JAXBContext that is responsible for creating Marshaller/Unmarshaller
			JAXBContext context = JAXBContext.newInstance(CountryList.class);
			
			//Unmarshaller that will convert XML to Java Object
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File file = new File("src/main/resources/country.xml");
			CountryList list = (CountryList) unmarshaller.unmarshal(file);
			
			for(Country con : list.getList()) {
				System.out.println(con.getCountryId() + " " + con.getName() + " " + con.getIsoCode());
			}
		} catch (JAXBException e) {
			System.out.println("Exception occured in JAXB");
			e.printStackTrace();
		}
	}

}
