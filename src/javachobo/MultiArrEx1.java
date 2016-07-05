package javachobo;

import java.util.Scanner;

public class MultiArrEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		int x= 0; int y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				//	1 2 3 4 5 6 7 8 9
					{0,0,0,0,0,0,1,0,0},//1
					{1,1,1,1,0,0,1,0,0},//2
					{0,0,0,0,0,0,1,0,0},//3
					{0,0,0,0,0,0,1,0,0},//4
					{0,0,0,0,0,0,0,0,0},//5
					{1,1,0,1,0,0,0,0,0},//6
					{0,0,0,1,0,0,0,0,0},//7
					{0,0,0,1,0,0,0,0,0},//8
					{0,0,0,0,0,1,1,1,0},//9
		};
		for(int i=0;i<SIZE;i++){
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.printf("Input your x_y. (End is 00)>");
			String input = sc.nextLine();
			
			if(input.length()==2){
				x = input.charAt(0) - '0'; // Char to Integer
				y = input.charAt(1) - '0';
				
				if(x==0&& y==0)
					break;
			}
			
			if(input.length()!=2 || x<=0 || x>=SIZE || y<=0|| y>=SIZE){
				System.out.println("Wrong Input. Try Again");
				continue;
			}
			//shipBoard[x-1][y-1]'s is 1, Save 'O'in board[x][y]
			board[x][y] = shipBoard[x-1][y-1] ==1 ? 'O':'X';
		
			for(int i=0;i<SIZE; i++){
				System.out.println(board[i]);
			}
			System.out.println();
		}

		
		
	}
	
}
