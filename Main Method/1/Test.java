class Test{
	
	public int add(int a,int b){
		
		return a+b;
	}
	public int sub(int x,int y){
		return x-y; 
	}
public static void main(String args[]){
	Test T=new Test();
	int c=T.add(10,40);
	System.out.println("Addition of A+B= " +c);
	int z=T.add(50,20);
	System.out.println("Subtraction of X-Y= " +z);
}
}