package com.example.abstraction;

public abstract class Engine {

	public void Start() {
		System.out.println("Engine start");
	}
	
	public void Stop() {
		System.out.println("Engine Stop");
	}
	
	public abstract void shiftGear();

}
