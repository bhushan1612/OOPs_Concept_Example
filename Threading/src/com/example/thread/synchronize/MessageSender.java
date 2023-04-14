package com.example.thread.synchronize;

public class MessageSender {
	
	public void Send(String msg) {
		System.out.println("Sending\t"+msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("\n");
		System.out.println("\n"+ msg +"Sent");
		
	}
}
