package javachobo;

class Dataa{
	int x;
}

public class ReferenceReturnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dataa d = new Dataa();
		d.x = 10;
		
		Dataa d2 = copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		
	}
	static Dataa copy(Dataa d){
		Dataa tmp = new Dataa();
		tmp.x = d.x;
		
		return tmp;
	}
	
	

}

