package com.mrprk;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Student student = objectMapper.readValue(
				new File("\\Users\\ATIM\\Desktop\\GSPL\\json-data-java-binding\\src\\main\\resources\\student.json"),
				Student.class);
		System.out.println(student);

		Student std = new Student();
		std.setName("Anil");
		std.setAddress("Bangalore");
		ObjectMapper maper = new ObjectMapper();
		maper.enable(SerializationFeature.INDENT_OUTPUT);
		maper.writeValue(new File(
				"\\Users\\ATIM\\Desktop\\GSPL\\json-data-java-binding\\src\\main\\resources\\studentWrite.json"), std);

	}
}
