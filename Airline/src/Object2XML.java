import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Object2XML {
	public static void main(String[] args) throws JAXBException {
		Airline airline = new Airline();
		airline.setId(1);
		airline.setName("Pratian");
		airline.setServiceType("domestic");
		
		//convert object to xml
		Marshaller mars = JAXBContext.newInstance(Airline.class).createMarshaller();
		mars.marshal(airline, new File("airline.xml"));
	}
}
