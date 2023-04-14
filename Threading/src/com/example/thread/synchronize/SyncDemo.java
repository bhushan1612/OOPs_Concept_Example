package com.example.thread.synchronize;

public class SyncDemo {

	public static void main(String[] args) {
		MessageSender sender = new MessageSender();
		ThreadSendMessage m1 = new ThreadSendMessage("Hii class is start", sender);
		ThreadSendMessage m2 = new ThreadSendMessage("Bye class is over", sender);
		
		//Start two thread of ThreadSend type
		m1.start();
		m2.start();

		//Wait for threads to end
		try {
			m1.join();
			m2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}
