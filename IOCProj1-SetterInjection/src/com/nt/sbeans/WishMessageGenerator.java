package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	 //HAS-A property
	@Autowired
	@Qualifier("ldt2")
	private LocalDateTime dateTime;
	
	/*@Autowired
	private Date date;*/
	
	/*@Autowired
	public WishMessageGenerator(@Qualifier("ldt")LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator:1-param constructor()");
		this.dateTime=dateTime;
	}*/
				/*	@Autowired
					private Date date;
				*/
		/*@Autowired
		public WishMessageGenerator(LocalDateTime dateTime) {
			System.out.println("WishMessageGenerator.setDateTime()");
			this.dateTime=dateTime;
		}*/
		/*@Autowired 
		public void SetDate(Date date) {
			System.out.println("WishMessageGenerator.SetDate()");
		}*/
		
		/*	
			@Autowired
			public WishMessageGenerator(LocalDateTime dateTime,int x) {
				System.out.println("WishMessageGenerator:2-param constructor");
				this.dateTime=dateTime;*/
				
		
		/*//setter method for setter injection
		@Autowired
		 public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime=dateTime;*/
		
		/*	@Autowired
			public WishMessageGenerator(LocalDateTime dateTime,Date date) {
				System.out.println("WishMessageGenerator:2-param constructor");
				this.dateTime=dateTime;
				this.date=date;
				
			}*/
				
		/*	@Autowired
			public void put1(LocalDateTime dateTime) {
				System.out.println("WishMessageGenerator.put1()");
				this.dateTime=dateTime;
			}
			
			@Autowired
			public void assign2(Date date) {
				System.out.println("WishMessageGenerator.assign2()");
				this.date=date;
			}
		
		*/
				
				
		
		//b.method
		public String showWIshMessage(String user) {
			System.out.println("WishMessageGenerator.showWishMessage()");
			System.out.println("dateTime::"+dateTime+"date::");
			//get current hour of day
			int hour=dateTime.getHour();
			//generate the wish message
			if(hour<12)
				return "Good Morning:"+user;
			else if(hour<16)
				return "Good Afternoon:"+user;
			else if(hour<20)
				return "Good Evening:"+user;
			else
				return "Good Night:"+user;
		}
}

		
		
	


		
			
		
		




