package fromch7;
import java.util.*;
public class PolyArgumentTest2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(com);
		b.buy(new Audio());
		b.summary();
		b.refund(com);
		b.summary();
	}

}

class Product{
	int Price;
	int bonusPoint;
	
	Product(int price){
		this.Price = price;
		bonusPoint =(int)(price/10.0);
	}
	Product(){}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString(){return "Tv";}
}
class Computer extends Product{
	Computer(){super(200);}
	
	public String toString(){return "Computer";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString(){return "Audio";}
}

class Buyer{
	int money =1000;
	int bonusPoint =0;
	Vector item = new Vector();
	int i=0;
	
	void buy(Product p){
		if(money<p.Price){
			System.out.println("No money");
		}
		money -=p.Price;
		bonusPoint += p.bonusPoint;
		//item[i++]=p;
		item.add(p);
		System.out.println(" you buyed "+p);
		
	}
	void refund(Product p){
		if(item.remove(p)){
			money+=p.Price;
			bonusPoint-=p.bonusPoint;
			System.out.println("you refund "+p);
		}else{
			System.out.println("you didn't buy "+p);
		}
	}
	void summary(){
		int sum=0;
		String itemList ="";
		
		if(item.isEmpty()){
			System.out.println("You didn't buy anything");
			return;
		}
		
		/*for(int i=0;i<item.length;i++){
			if(item[i]==null) break;
			sum+=item[i].Price;
			itemList += item[i]+", ";
			
		}*/
		for(int i=0;i<item.size();i++){
			Product p =(Product)item.get(i);
			sum += p.Price;
			itemList += (i==0)? ""+p: ", " +p;
		}
		System.out.println("Your Buyed money is "+ sum+". ");
		System.out.println("You buyed things "+itemList+". ");
	}
}