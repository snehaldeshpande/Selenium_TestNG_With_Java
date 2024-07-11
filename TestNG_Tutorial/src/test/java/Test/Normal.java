package Test;

public class Normal {
	
	public void before() {
		System.out.println("Test before executed");
	}

	public void after() {
		System.out.println("Test after executed");
	}
	public void tc1() {
		System.out.println("Test case1 executed");
	}
	public void tc2() {
		System.out.println("Test case2 executed");
	}
	public static void main(String[] args) {
		 Normal obj =  new Normal();
		 obj.before();
		 obj.tc1();
		 obj.after();
		 
		 obj.before();
		 obj.tc2();
		 obj.after();

	}

}
