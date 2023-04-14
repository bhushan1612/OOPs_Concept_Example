//case2 array display
class JavaArray2{
	
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
	
		for(i=0; i<JavaCharArray.length;i++){
		System.out.println(JavaCharArray[i]);
		}
		System.out.println(i);

	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	catch(Exception e1){
		System.out.println(e1);
	}	
}
	
	
	public static void main(String args[]){
		
		JavaArray2 javaArray = new JavaArray2();
		javaArray.show();
	}
}
