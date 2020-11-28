package com.animesh;

public class Subscriber implements Observer {
	
	private String name;
	private Channel channel = new Channel();
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	// Assuming that one Channel will have multiple Subscriber not like real wordl
    
	// You will get to know upload video-- Call all teh Subscriber
	
	@Override
	public void update() {
		System.out.println(" Hey " +name +", Video uploaded :" + channel.title);
	}
	
	@Override
	public void subscribeChannel (Channel ch)
	{
		channel =ch;
	}
}
