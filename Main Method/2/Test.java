
class Test1 {

	public static void main(String args) {
		System.out.println("Hello");
	}
}
public class Test extends Test1 {

	public static void main(String[] args) {
		Test1.main("");
		System.out.println("Hello world");
	}
}
