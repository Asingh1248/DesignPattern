package com.animesh;

public class Youtube {
   public static void main(String args[]) {
	   
	   Channel telusko = new Channel();
	   
	   Subscriber s1 = new Subscriber("Animesh");
	   Subscriber s2 = new Subscriber("Abhishek");
	   Subscriber s3 = new Subscriber("Abhinay");
	   Subscriber s4 = new Subscriber("Abhijeet");
	   Subscriber s5 = new Subscriber("Avnish");
	   
	   //Add the subscriber to channel
	   telusko.subscribe(s1);
	   telusko.subscribe(s2);
	   telusko.subscribe(s3);
	   telusko.subscribe(s4);
	   telusko.subscribe(s5);
	   
	   // Subscriber should know that which Channel they have subscribe
	  
	   s1.subscribeChannel(telusko);
	   s2.subscribeChannel(telusko);
	   s3.subscribeChannel(telusko);
	   s4.subscribeChannel(telusko);
	   s5.subscribeChannel(telusko);
	   
	   telusko.unSubscribe(s3);
	   
	   
	   telusko.upload("How to learn programming ??");
	   
   }
}
