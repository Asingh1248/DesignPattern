package com.animesh;

public class Enum {
	
	//USe : Range of Integers
	
	// Define my constant , Range of color , Create o Range of constnat
	enum Mobile{
		APPLE(100) ,HTC,SAMSUNG(50);
		
		int price;
		
		public int getPrice() {
			return price;
		}
		
		Mobile()
		{
			price= 80;
		}
		
		Mobile(int p)
		{
			price=p;
		}
	}
	
	// BEHIND SCENE  : 
//	//class Mobile {
//	
//	static final Mobile APPLE = new Mobile();
//	static final Mobile HTC = new Mobile();		
//  static final Mobile SAMSUNG = new Mobile();
//     }
//	
	public static void main (String args[]) {
		
		//System.out.println(Mobile.APPLE);
		
		// Before Java 1.5 We used to use Interface to handle constant -- > Problem Datatypes
		// C++ : We can define enum inside the class
		// We can define methods in enum -- > lofigc behing classis created by Complier
		
		//ENUM IN SWITCH
		
		Mobile m = Mobile.APPLE;
		switch(m) {
		case APPLE:
			System.out.println("Apple is best ");
			break;
			
		//case NAVIN:
			
		}
		
		System.out.println(Mobile.APPLE.getPrice());
		
		//ENUM has lot of methods ; but kaha se aa rha hai
		// Every enum in jva extends class called enum
		
		System.out.println(Mobile.APPLE.ordinal());
		Mobile m1[] = Mobile.values();
		//System.out.println(m1);
		
		for(Mobile mobile : m1) {
			System.out.println(mobile);
		}
	}

}
