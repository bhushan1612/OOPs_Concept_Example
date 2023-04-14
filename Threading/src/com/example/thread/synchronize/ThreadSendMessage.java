package com.example.thread.synchronize;

public class ThreadSendMessage extends Thread{

	private String msg;
	MessageSender sender;
	
	//Reciveing a message object and a String
	//message to be Send
	ThreadSendMessage(String m,MessageSender obj){
		msg = m;
		sender = obj;
	}
	
	public void run() {
		
		//Only one thread send a message one time 
		synchronized (sender) {
			
			//synchronizing the send object
			sender.Send(msg);
		}
	}
}
