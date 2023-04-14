package Default.Defaults;

class DefaultDemo{
	
	private String name;
	String mobileNo;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}
	
	public String getMobileNo(){
		return mobileNo;
	}
	
	//Default Method
	int add(int a,int b){
		return a+b;
	}
	
	//Constructor
	DefaultDemo(){
		mobileNo = "9767277013";
		System.out.println("The mobile number::"+mobileNo);
	}
}