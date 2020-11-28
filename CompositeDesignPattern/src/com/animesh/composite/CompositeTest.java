package com.animesh.composite;

public class CompositeTest {

	public static void main(String[] args) {
		
		// Everything is Component : DESIGN OF INTERFACE TECH on LHS
	    Component hd = new Leaf(4000, "HDD");
	    Component mouse = new Leaf(250, "mouse");
	    Component ram = new Leaf(2000, "RAM");
	    Component monitor = new Leaf(3000, "Monitor");
	    Component cpu = new Leaf(12000, "CPU Processor");
         
	    
	    Composite ph = new Composite("Pheripheral");
	    Composite cabinet = new Composite("Cabinet");
	    Composite mb = new Composite("MotherBoard");
	    Composite computer = new Composite("Computer");
	    
	    mb.addComponent(cpu);
	    mb.addComponent(ram);
	    
	    ph.addComponent(mouse);
	    ph.addComponent(monitor);
	    
	
	    cabinet.addComponent(hd);
	    cabinet.addComponent(mb);
	    
	    computer.addComponent(ph);
	    computer.addComponent(mb);
	    
	    //ram.showPrice();
	   // ph.showPrice();
	    
	    //V.Imp:-Same Operation on leaf object and composite object
	    computer.showPrice();
	    
	    
	    
       	    
	    
	    
	}

}
