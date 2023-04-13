package com.example.notification;

class NotificationFactory{
	public Notification createNotification(String notificationName){
	if (notificationName != null && !notificationName.isEmpty()){
        if (notificationName == "Facebook"){
			return new Facebook();
		}
		else if (notificationName == "Instagram"){
			return new Instagram();
		}
		else if (notificationName == "WhatsApp"){
			return new WhatsApp();
		}
	    }
	return null;
	}
}
