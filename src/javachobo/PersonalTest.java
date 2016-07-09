package javachobo;

import java.util.Scanner;

public class PersonalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insert Stone >");
		
		String tmp = sc.nextLine();
		
		int a = tmp.charAt(0)-'0';
		int b = tmp.charAt(2)-'0';
		int c = tmp.charAt(4)-'0';
		
		System.out.println("What is number ? : > "+a+", "+b+", "+c);
		
		
	}

}
