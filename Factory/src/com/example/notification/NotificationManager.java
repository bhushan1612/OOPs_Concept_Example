package com.example.notification;

class NotificationManager{
	public static void main(String args[]){
	NotificationFactory notificationFactory = new NotificationFactory();
	Notification notification = notificationFactory.createNotification("Facebook");
	notification.notificationService();
	}
}
