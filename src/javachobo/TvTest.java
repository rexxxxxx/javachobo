package javachobo;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EX _TV 1
		/*Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("Now your channel is : " + t.color );*/
	
		
		//Ex _TV2
		/*Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1's channel is : "+t1.channel);
		System.out.println("t2's channel is : " +t2.channel);
		
		t1.channel= 7;
		System.out.println("t1's channel is changed to 7");
		
		System.out.println("t1's channel is : "+t1.channel);
		System.out.println("t2's channel is : " +t2.channel);
*/
		
		// Ex _Tv 3
		/*Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1's channel is : "+t1.channel);
		System.out.println("t2's channel is : " +t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		
		System.out.println("t1's channel is : "+t1.channel);
		System.out.println("t2's channel is : " +t2.channel);*/
		
		Tv[] tvArr = new Tv[3];
		
		for(int i=0;i<tvArr.length;i++){
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length;i++){
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d \n", i,tvArr[i].channel);
		}
		
	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power()	{power=!power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
	
}
