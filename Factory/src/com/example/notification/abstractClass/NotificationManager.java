package com.example.notification.abstractClass;

public class NotificationManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("Facebook");
		notification.notificationService();
	}

}
