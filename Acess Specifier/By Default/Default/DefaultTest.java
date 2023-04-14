package Default;

import Default.Defaults.DefaultDemo;

public class DefaultTest{
	
	public static void main(String args[]){
		/* This object creation will call explicitly decleared default constructor */
		DefaultDemo demo = new DefaultDemo();
		
		/*getting and setting the values to private data memeber of default class*/
		demo.setName("Bhushan");
		System.out.println("Contact Numbers"+demo.getName());
		
		/*getting and setting the values to default data memeber of default class */
		demo.setMobileNo("7499143898");
		System.out.println(demo.getMobileNo());
		
		/* calling default method of default class */
		int c = demo.add(20,20);
		System.out.println("Addition is:: " +c);
	}
	
}