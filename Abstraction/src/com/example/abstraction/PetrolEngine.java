package com.example.abstraction;

public class PetrolEngine extends Engine {
	
	public void shiftGear() {
		System.out.println("Enginr gear shifted");
	}

	public static void main(String[] args) {
		
		PetrolEngine petrolEngine = new PetrolEngine();
		petrolEngine.Start();
		petrolEngine.shiftGear();
		petrolEngine.Stop();
	}

	

}
