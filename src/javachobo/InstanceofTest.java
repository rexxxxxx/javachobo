package javachobo;

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FireEngine fe = new FireEngine();
		if(fe instanceof FireEngine){
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car2){
			System.out.println("This is a Car instance.");
		}
		System.out.println(fe.getClass().getName());
	}

}

class Car2{}
class FireEngine extends Car2{}