import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XML_2_Object {
	public static void main(String[] args)  throws JAXBException {
		Unmarshaller unmarshaller = JAXBContext.newInstance(Airline.class).createUnmarshaller();
		
		Airline airline = (Airline)unmarshaller.unmarshal(new File("airline.xml"));
		System.out.println("id: "+ airline.getId());
		System.out.println("");
	}
}
