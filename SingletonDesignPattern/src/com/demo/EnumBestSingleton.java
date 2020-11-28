package com.demo;

public class EnumBestSingleton {
	
	public static void main(String[] args) {
		
		Abcd obj1 = Abcd.INSTANCE;
		obj1.i =5;
		obj1.show();
		
		Abcd obj2 = Abcd.INSTANCE;
		obj2.i =6;
		
		obj1.show();
		
		
	}

}	

enum Abcd // ENum is Thread safe -- Special Type of Class 
{
	 INSTANCE; // implicity creates private constructor 
	// public static 
	 int i;
	 public void show() {
		 System.out.println(i);
	 }
}
