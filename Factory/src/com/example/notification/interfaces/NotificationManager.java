package com.example.notification.interfaces;

public class NotificationManager {

	public static void main(String[] args) {
		
		NotificationFactory notificationFactory = new NotificationFactory();
		
		Notification notification = notificationFactory.createNotification("Facebook");
		notification.notificationService();
		
	}
}
