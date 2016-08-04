/*package fromch7;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter f = new  Fighter();
		if(f instanceof Unit){
			System.out.println("f is Unit class's Child");
		}
		if(f instanceof Fightable){
			System.out.println("f is Fightable interface");
		}if(f instanceof Movable){
			System.out.println("f is Movable interface");
		}if(f instanceof Attackable){
			System.out.println("f is Attackable interface");
		}if(f instanceof Object){
			System.out.println("f is Object");
		}
	}

}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y){}
	public void attack(Unit u){}
}
class Unit {
	int currentHp;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable{}
interface Movable{ void move(int x, int y);}
interface Attackable{ void attack(Unit u);}*/