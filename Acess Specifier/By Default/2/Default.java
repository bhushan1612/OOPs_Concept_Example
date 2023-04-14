class Default{
	String name;
	String surName;
	int rollNo; 
	
	public  Default(String fname,String lname,int number){//parameterized constructor
		this.name = fname;
		this.surName = lname;
		this.rollNo = number;
		System.out.println("The Roll Number of Student is: "+ number);
		System.out.println("The Full Name of Student is: "+ fname + " "+ lname);
		
	}
	public static void main(String args[]){
		Default d = new Default("Bhushan","Mahajan",101);
		
	}
}