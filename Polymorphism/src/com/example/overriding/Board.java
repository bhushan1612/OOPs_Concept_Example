package com.example.overriding;

public class Board extends Paper {
	
	public void write(String pen) {
		System.out.println("Writing with : "+pen);
	}

	public static void main(String[] args) {
		
		Board board = new Board();
		board.write("marker");
	}

}
