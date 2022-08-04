package com.BikkadIT.GSON.model;

import com.google.gson.Gson;

public class JavatoJson {
	
	public static void main(String[] args) {
		
		Person person=new Person();
		person.setPid(111);
		person.setPname("Somnath");
		person.setPemail("somnath.dinde98@gmail.com");
		
		Gson gson=new Gson();
		String json = gson.toJson(person);
		
		System.out.println(json);
	}

}
