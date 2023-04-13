package com.example.abstraction;

public class AnimalBody extends Body {

	public void hair() {
		System.out.println("Animals have more hair and depend upon animal body");
	}
	public void walk() {
		System.out.println("Animal body walks on four legs");
	}
	public void colour() {
		System.out.println("Animal body colour is black");
	}
	public void behaviour() {
		System.out.println("Hunting behaviour");
	}
	public void lifeSpan() {
		System.out.println("Animal body life span depends on their categeries");
	}
	
	public static void main(String[] args) {
		
		AnimalBody animalBody = new AnimalBody();
		animalBody.birth();
		animalBody.respiretory();
		animalBody.bloodCirculation();
		animalBody.brainInstruction();
		animalBody.hair();
		animalBody.walk();
		animalBody.colour();
		animalBody.behaviour();
		animalBody.lifeSpan();
		animalBody.death();
	}
}
