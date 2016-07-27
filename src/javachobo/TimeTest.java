package javachobo;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timea t = new Timea(12,35,30);
		System.out.println(t);
		
		t.setHour(t.getHour()+1);
		System.out.println(t);;
	}

}

// Time is already exist

//Don't forget myself
//Remember what I be
class Timea{
	private int hour;
	private int minute;
	private int second;
	
	Timea(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public int getHour(){return hour;}
	public void setHour(int h){
		if(h<0||h>23) return;
		this.hour = h;
	}
	
	public int getMinute(){return minute;}
	public void setMinute(int m){
		if(m<0||m>59)return;
		this.minute = m;
	}
	
	public int getSecond(){return second;}
	public void setSecond(int s){
		if(s<0||s>59)return;
		this.second = s;
	}
	public String toString(){
		return hour +":"+minute+":"+second;
	}
}