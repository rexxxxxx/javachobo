package javachobo;

import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"Chair","의자"},
				{"Computer","컴퓨터"},
				{"Integer","정수"}
				};
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<words.length;i++){
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp =sc.nextLine();
			if(tmp.equals(words[i][1])){
				System.out.printf("정답입니다,%n%n");
			}else
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", words[i][1]);
		}
	}

}
