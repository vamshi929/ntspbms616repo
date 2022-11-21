package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()(start)");
		//create the IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get target spring bean class object
				Object obj = ctx.getBean("wmg");
				//typeCasting
				WishMessageGenerator generator=(WishMessageGenerator)obj;
				//invoke the b.method
				String result=generator.showWIshMessage("vamshi");
				//display the result
				System.out.println(result);
				
				//close the container
				ctx.close();
				
	}

}
