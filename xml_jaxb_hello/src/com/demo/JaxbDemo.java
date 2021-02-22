package com.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbDemo {
	
	public static void main(String[] args) throws JAXBException {
		
		Emp emp=new Emp(12, "raj", "delhi");
		JAXBContext context=JAXBContext.newInstance(Emp.class);
		Marshaller marshaller=context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(emp, System.out);
	
	}

}
