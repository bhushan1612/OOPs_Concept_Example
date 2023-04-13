package com.example.innerClass;

public class Mother2 {
	private int amount;
	private String problemStatement;
	
	public int getAmount() {
		return amount;
	}

	public String getProblemStatement() {
		return problemStatement;
	}

	public String sovleMyFamilyProblem(String problem) {
		//first way inner class methods called
		/*MyFamilyProblem myFamilyProblem = new MyFamilyProblem();
		myFamilyProblem.getMoney(25000);
		myFamilyProblem.getProblem("Money required");*/
		
		// second way inner class method called
		amount = new MyFamilyProblem().getMoney(50000);
		problemStatement = new MyFamilyProblem().getProblem("Money required");
		
		System.out.println("Problem in mother family : "+problem);
		return problem;
	}

	private class MyFamilyProblem {
		
		public int getMoney(int money) {
			//System.out.println("Get moneyt called : "+money);
			return money;
		}
		
		public String getProblem(String problemName) {
			//System.out.println("Get problem called : "+problemName);
			return problemName;
		}
	}
}
