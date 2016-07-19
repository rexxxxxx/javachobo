package javachobo;

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cardc c = new Cardc("HEART", 10);
		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
class Cardc{
	int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Cardc(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Cardc(){
		this("HEART", 1);
	}
	
	public String toString(){
		return KIND+" "+NUMBER;
	}
}
