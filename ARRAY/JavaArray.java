//case1 array display
class JavaArray{
	
	public void show(){
			//char[] JavaCharArray;
	
	char[] JavaCharArray = new char[5];
	
	JavaCharArray [0]='J';
	JavaCharArray [1]='A';
	JavaCharArray [2]='V';
	JavaCharArray [3]='A';
	JavaCharArray [4]='A';

	
	try{
		//char[] JavaCharArray = {'J','A','V','A'};
	
		for(int i=0; i<JavaCharArray.length;i++){
			System.out.println(JavaCharArray);
			/*this statement print array element as a string*/
		}	
		/*
			System.out.println(JavaCharArray[i]);*/
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}	
}
	
	
	public static void main(String args[]){
		
		JavaArray javaArray = new JavaArray();
		javaArray.show();
	}
}
