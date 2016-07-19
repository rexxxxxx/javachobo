package javachobo;



public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}

}

class Pointa{
	int x;
	int y;
	
	Pointa(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation(){
		return "x: "+x+", y: "+y;
	}
}

class Point3D extends Pointa{
	int z;
	Point3D(int x, int y, int z){
		super(x,y);
		this.x =x;
		this.y = y;
		this.z = z;
	}
	String getLocation(){
		return "x: "+x+", y: "+y+", z: "+z;
	}
}