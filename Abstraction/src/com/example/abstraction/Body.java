package com.example.abstraction;

public abstract class Body {
	
	public void birth() {
		System.out.println("Life is begin");
	}
	
	public void death() {
		System.out.println("Life is end");
	}

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
