package com.animesh;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List <Subscriber> subs = new ArrayList<>();
	 String title;
	
	@Override
	public void subscribe(Subscriber sub) {
		// Everytime you subscribe channel 
		subs.add(sub);
	}
	
	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}
	
	@Override
	public void notifySubscribers() // inbuilt method
	{
		for(Observer sub : subs) {
			sub.update(); // Video uploaded 
		}
	}
	
	@Override
	public void upload (String title) {
		this.title= title; // upload the video
		notifySubscribers();
	}
}
