package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class NewInstanceMethod {

	public static void main(String[] args) throws Exception {
		
		//load the java class 
		Class c = Class.forName(args[0]);
		//get all the constructor of loaded class
		Constructor cons[]=c.getDeclaredConstructors();
		//create the objects for the loaded class
		Object obj1=cons[0].newInstance();  //uses 0-param constructor
				System.out.println(obj1.toString());
		System.out.println("----------------");
		Object obj2=cons[1].newInstance(10,20);  //uses 2-param constructor
		System.out.println(obj2.toString());
		
		 Field fields[] =obj2.getClass().getDeclaredFields();
		//set access to private properties
		fields[0].setAccessible(true);
		fields[1].setAccessible(true);
		//set values properties
		fields[0].setInt(obj2,2000);
		fields[1].setInt(obj2,5000);
		System.out.println(obj2.toString());
		

	}

}
