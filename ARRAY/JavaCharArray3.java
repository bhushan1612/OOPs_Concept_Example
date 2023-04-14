//case3 array display
class JavaArray3{
	
	public void show(){
			//char[] JavaCharArray;
	
	char[] JavaCharArray = new char[5];
	int i;
	JavaCharArray [0]='J';
	JavaCharArray [1]='A';
	JavaCharArray [2]='V';
	JavaCharArray [3]='A';
	JavaCharArray [4]='A';

	
	try{
		//char[] JavaCharArray = {'J','A','V','A'};
	
		for(i=0; i<6;i++){
		System.out.println(JavaCharArray[i]);
		}		

	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	catch(Exception e1){
		System.out.println(e1);
	}	
}
	
	
	public static void main(String args[]){
		
		JavaArray3 javaArray = new JavaArray3();
		javaArray.show();
	}
}
