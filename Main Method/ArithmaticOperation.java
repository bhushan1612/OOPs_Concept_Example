public class ArithmaticOperation{
	
	public int adddition(int a,int b) {
	    return a+b;
	}
	
	
	public int division(int a,int b) {
		if(b==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("print"); 
		}
		return a/b;
	   
		
	}
	
	public int subtraction(int a,int b) {
	    return a-b;
	}
	
	public static void main(String[] args){
		
		ArithmaticOperation arithmaticOperation=new ArithmaticOperation();
		
	int x=arithmaticOperation.adddition(10, 2);
	System.out.println(x);
	int y=arithmaticOperation.division(10,0);
		System.out.println(y);
		
	
			int z=arithmaticOperation.subtraction(10, 5);
			System.out.println(z);
			
	
	}

	
	
}
