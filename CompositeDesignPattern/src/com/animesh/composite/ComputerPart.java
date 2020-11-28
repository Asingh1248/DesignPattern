package com.animesh.composite;

import java.util.ArrayList;
import java.util.List;

interface Component{
	void showPrice();
}

class Leaf implements Component{
    int price;
    String name;
    
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}


	@Override
	public void showPrice() {
     System.out.println(name + ":" +price);
		
	}

}

class Composite implements Component {
   
	String name;
	List<Component> components = new ArrayList<>();
	 //It contains Another Composite Object and Leaf Object
	
	////Why ? : When I create the object I can assing the value while the creating object itself
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	public void addComponent(Component com) {
		components.add(com);
	}
	
	

	// Can add  remove method
	@Override
	public void showPrice() {
	
		System.out.println(name);
		// Show the price of each component
		for(Component c : components) {
			c.showPrice();
			//1st Object -- Composite , 2nd Object --> Composite , 3rd Object --> Leaf
			// for Leaf it will print the price
			// for Composite it will traverse
		}
	}

}

