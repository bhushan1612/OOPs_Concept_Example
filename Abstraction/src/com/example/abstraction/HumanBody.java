package com.example.abstraction;

public class HumanBody extends Body{

	public void hair() {
		System.out.println("Humnan body has very little hair");
	}
	public void walk() {
		System.out.println("Human body walks on two legs");
	}
	public void colour() {
		System.out.println("Human body colour is brown");
	}
	public void behaviour() {
		System.out.println("Eco-friendly behaviour");
	}
	public void lifeSpan() {
		System.out.println("Human body life span upto around 100 year");
	}

	public static void main(String[] args) {
		HumanBody humanBody = new HumanBody();
		humanBody.birth();
		humanBody.respiretory();
		humanBody.bloodCirculation();
		humanBody.brainInstruction();
		humanBody.hair();
		humanBody.walk();
		humanBody.colour();
		humanBody.behaviour();
		humanBody.lifeSpan();
		humanBody.death();
	}
}
