package com.ds.jackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			//Create Object mapper
			ObjectMapper mapper = new ObjectMapper();
			
//			Student student = mapper.readValue(new File("data/sample-lite.json"),Student.class);
			Student student = mapper.readValue(new File("data/sample-full.json"),Student.class);
			
			System.out.println("FirstName: " + student.getFirstName() );
			System.out.println("LastName: " + student.getLastName() );
			
			System.out.println("Student: " + student );
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
