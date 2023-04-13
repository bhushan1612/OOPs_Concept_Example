package com.example.abstractClass;

abstract public class Body {

	public void respiretory() {
		System.out.println("Body has respiretory system");
	}
	
	public void bloodCirculation() {
		System.out.println("Body has blood Circulation in blood cell");
	}
	
	public void brainInstruction() {
		System.out.println("brain gives Instruction for body parts");
	}
	
	public abstract void hair();
	public abstract void walk();
	public abstract void colour();
	public abstract void behaviour();
	public abstract void lifeSpan();
}
