package javachobo;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args)is started");
		firstMethod();
		System.out.println("main(String[] args)is ended");

	}
	
	static void firstMethod(){
		System.out.println("firstMethod()is started");
		secondMethod();
		System.out.println("firstMethod()is ended");
	}

	static void secondMethod(){
		System.out.println("secMethod()is started");
		System.out.println("secMethod()is ended");
	}
}
