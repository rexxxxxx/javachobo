package javachobo;
class Parent{
	int x = 10;
}
public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.method();
	}

}

class Child extends Parent{
	int x = 20;
	void method(){
		System.out.println("x="+x);					//normal is this
		System.out.println("this.x ="+this.x);		//this is child
		System.out.println("super.x="+super.x);		//super is Parent
	}
}