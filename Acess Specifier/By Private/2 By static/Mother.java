class Mother{
	public void solveProblem(){
		MyFamily.myfamilyProblem();
		System.out.println("money problem solve ");
	}
	public static void main(String args[]){
		Mother mother = new Mother();
		mother.solveProblem();
		
	}
	private static class MyFamily{//static inner class
		public static void myfamilyProblem(){
		System.out.println("money problem");
		}
	}
}