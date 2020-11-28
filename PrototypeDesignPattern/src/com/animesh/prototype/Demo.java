package com.animesh.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Ravechi");
		// Assigning the value from Db
		
		bs.loadData();
		
		// Used to Understand Shallow Cloning

	    // POWER OF PROTOYPE DESIGN PATTERN
		
		//BookShop bs1 = new BookShop();
		BookShop bs1 = bs.clone(); // Override it
		bs.getBooks().remove(2); // 3rd is removed
		// Its there in OBJECT CLASS -- ACCESS SPECIFIER IS PROTECTED
		// Hence You need to give Permission to your class 
		// CLONEABLE interface its marker interface -- Don't have any method
		
		// Shallow Cloning : Will get : - Not creating the two object Just two references pointing to same location  
		// Deep Cloning : We actually create two object : One will not affect other.-- > Proper coding into clone method
		
		bs1.setShopName("Bhavesh");
		//bs1.loadData();// It will go to Database and fetch data and it could be time consuming
		// Is there a way where we can get the data from Previous Object bs
		// Hey bs can you give the data 
		
		System.out.println(bs); 
		System.out.println(bs1);

	}

}
