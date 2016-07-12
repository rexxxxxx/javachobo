package javachobo;

class Car1{
	String color;
	String gearType;
	int door;
	
	Car1(){
		this("white","auto",4);
	}
	Car1(String color){
		this(color,"auto",4);
	}
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("blue");
		
		
	}

}
