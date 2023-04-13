package com.example.notification.abstractClass;

public class NotificationFactory {

	public Notification createNotification(String notificationType) {
		
		if(notificationType != null && !notificationType.isEmpty()) {
			
			if(notificationType == "Facebook") {
				return new Facebook();
			}else if(notificationType == "Instagram") {
				return new Instagram();
			}else if(notificationType == "WhatsApp") {
				return new WhatsApp();
			}else {
				throw new IllegalArgumentException("invalid input");
			}
		}
		
		return null;
	}
}
