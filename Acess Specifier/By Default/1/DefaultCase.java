class DefaultCase{
	//default variables declaration
	int a;
	int b;
	
	public DefaultCase(int a,int b){//parameterized constructor
		this.a = a;
		this.b = b;
		System.out.println("In Default Case the values are:"+ a +","+b);
	}
	public static void main(String args[]){
		DefaultCase DefaultCase =new DefaultCase(10,20);
	}
}