//private static inner class 
class Mother{
	
	public void SolveProblem(){
		System.out.println("Problem....!");
		}

	 private  class MyFamily{
		
		public void myFamilyProblem(){
			System.out.println("My Family Problem");
		}
	}
}
class Father{
	
	public static void main(String args[]){
		
	Mother mother = new Mother();
	mother.SolveProblem();
	
	}
	
}