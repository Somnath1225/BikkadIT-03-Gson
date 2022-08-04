package com.BikkadIT.GSON.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsontoJava {
	
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		
		File file=new File("Person.Json");
		
		Gson gson=new Gson();
		Person fromJson = gson.fromJson(new FileReader(file), Person.class);
		System.out.println(fromJson);
	}

}
