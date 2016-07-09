package javachobo;

import java.util.Scanner;

public class FactorialTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		long result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Insert Number (0<n<=20) : > ");
		n = sc.nextInt();
		for(int i=1; i<=n;i++){
			result = factorial(i);
			if(result ==-1){
				System.out.printf("Cannot that data.(0<n<=20): %d\n",n);
				break;
			}
			System.out.printf("%2d! = %20d%n", i,result);
		}
	}
	static long factorial(int n){
		if(n<=0||n>20) return -1;
		if(n<=1) return 1;
		return n*factorial(n-1);
	}
	

}
