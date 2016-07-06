package javachobo;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " +d.x);
		
		change(d);
		
		System.out.println("After Change(d.x) = " +d.x);
		
	}
	static void change(Data x){
		x.x = 100;
		System.out.println("change() : x = " +x.x);
	}

}
class Data{
	int x;
}
