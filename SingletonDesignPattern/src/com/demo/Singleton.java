package com.demo;

public class Singleton {

	public static void main(String[] args) {
		//Abc obj1 = new Abc(); // Only one instance -- default constructor(public)
		
		Thread t1 =new Thread(new Runnable() {
			@Override
			public void run() {
				Abc obj= Abc.getinstance();		
			}
		});
		
		
		Thread t2 =new Thread(new Runnable() {
			@Override
			public void run() {
				Abc obj= Abc.getinstance();		
			}
		});
		
		t1.start();
		t2.start();
		// Adding the Delay
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//			
//		}
	
		
		//Abc obj1= Abc.getinstance();
		//Abc obj2= Abc.getinstance(); 
       
		// What If I create two thread on working with obj1 and another working on obj2
		// Both might enter the method
	}

}
class Abc{
	
	//Step 1: 
	//static Abc obj = new Abc(); // get instance is static method -- > 1)Eargerly Instance Creation
	// Disadvantage : Even if you are not using the object there in the memory -- Consume Lot of resources -- Wastage of memory
	
	
	// 2)Lazy Instantiation
	public static Abc obj;
	//Step2 :
	
	private Abc() {
		System.out.println("Instance Created"); // 2 Instance possible
	}
	
	//STep 3:
	//3)public static synchronized Abc getinstance() {
		
		// Decrease your performance by factor of 100
	
	public static  Abc getinstance() { //4) Double checking locking -- Synchronized block instead of sync method
		if (obj == null)
		{
			synchronized (Abc.class) {
				
				if(obj ==null) 
				obj = new Abc();
			}
			
		}
		
		return obj;
	}
}
