//case4 array display using null check and try with catch
class JavaArray4{
	
	public void show(){
			//char[] JavaCharArray;
	
	char[] JavaCharArray = new char[6];
	int i;
	JavaCharArray [0]='J';
	JavaCharArray [1]='A';
	JavaCharArray [2]='V';
	JavaCharArray [3]='A';
	JavaCharArray [4]='A';

	
	try{
		//char[] JavaCharArray = {'J','A','V','A'};
		
		if(JavaCharArray!=null){
			
		for(char c:JavaCharArray){
		System.out.println(c);
		}	
			
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
		
}
	
	
	public static void main(String args[]){
		
		JavaArray4 javaArray = new JavaArray4();
		javaArray.show();
	}
}
