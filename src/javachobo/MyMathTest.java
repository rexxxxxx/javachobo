package javachobo;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println(result1 +", "+result2+", "+result3+", "+result4);
	}

}

class MyMath{
	long add(long a, long b){
		return a+b;
	}
	
	long subtract(long a, long b){
		return a-b;
	}
	
	long multiply(long a, long b){
		return a*b;
	}

	double divide(double a, double b){
		return a / b;
	}
}