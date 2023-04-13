package com.example.innerClass;

public class StaticInnerClassDemo {
	
	private static String name = "kiran";
	
	static class InnerClass{
		
		public void show() {
			System.out.println("inside static inner class : "+name);
		}
	}

	public static void main(String[] args) {
		
		StaticInnerClassDemo.InnerClass demo = new StaticInnerClassDemo.InnerClass();
		demo.show();
	}

}
