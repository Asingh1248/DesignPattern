package com.phone;

public class Shop {

	public static void main(String[] args) {
	 //Phone p =new Phone("Android",2,"Qualcomm",4000);		
    // System.out.println(p);
     
     // Disadvantge : 5 Parameter in Constructor
     // Remember Sequqncing ---> Ctrl + Space
     // I don't any parameter --> Pass NULL , 0 which is not aright
     
     Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3000).getPhone();
     System.out.println(p);
	// Remove all three disadvantage	
     
	}

}
