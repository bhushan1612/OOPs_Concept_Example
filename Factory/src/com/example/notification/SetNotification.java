package com.example.notification;

public class SetNotification {

	PostNotification postNotification;
	
	public SetNotification() {
		postNotification = new PostNotification();
		postNotification.setLike("One person like your photo");
		postNotification.setComment("One person comment your photo");
		postNotification.setShare("One person share your photo");
	}

	public PostNotification getNotification() {
		return postNotification;
	}
}
