package com.example.notification;

class Facebook implements Notification{
	LikeNotification likeNotification;
	SetNotification setNotification;
	
	public Facebook() {
	 likeNotification = new LikeNotification();
	 setNotification = new SetNotification();
	 System.out.println(setNotification.getNotification().getLike());
	 System.out.println(setNotification.getNotification().getComment());
	 System.out.println(setNotification.getNotification().getShare());
	}
	
	public void notificationService(){
	System.out.println("Facebook notification");
	}
}
