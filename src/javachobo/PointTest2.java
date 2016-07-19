package javachobo;

public class PointTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3Da p3 = new Point3Da();
		System.out.println("p3.x="+p3.x);
		
	}

}

class Pointb{
	int x;
	int y;
	
	Pointb(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Point3Da extends Pointb{
	int z=30;
	
	Point3Da(){
		this(100,200,300);
	}
	Point3Da(int x, int y, int z){
		super(x,y);
		this.z =z;
	}
}