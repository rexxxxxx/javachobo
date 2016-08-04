package javachobo;

class Product3{
	int price;
	int bonusPoint;
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}
class Tv3 extends Product3{
	Tv3(){
		super(100);
	}
	public String toString(){
		return "Tv";
	}
}
class Computer extends Product3{
	Computer(){
		super(200);
	}
	public String toString(){
		return "Computer";
	}
}
class Buyer{
	int money =1000;
	int bonusPoint =0;
	
	
	void buy(Product3 p){
		if(money<p.price){
			System.out.println(" No Money");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+" buyed.");
	}
}
public class PolyArgumentTest {
	public static void main(String[] args){
		Buyer b = new Buyer();
		b.buy(new Tv3());
		b.buy(new Computer());
		
		System.out.println("Remain : "+b.money);
		System.out.println("Remain BPoint : "+b.bonusPoint);
	}
}
