package javachobo;

import java.util.Scanner;
import java.io.FileInputStream;

public class StoneLoad {

	static int stone; // N

	public static void main(String args[]) throws Exception {
		/*
		 * 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다. 만약 본인의
		 * PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면, 표준입력 대신
		 * input.txt 파일로 부터 입력값을 읽어 올 수 있습니다. 또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을
		 * 사용하여 테스트하셔도 무방합니다. 단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나
		 * 주석(//) 처리 하셔야 합니다.
		 */
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		Scanner sc = new Scanner(System.in);

		int T;
		int test_case;

		int max_range; // K
		int mine; // L

		int[] mine_p = new int[25000];

		T = sc.nextInt();
		for (test_case = 1; test_case <= T; test_case++) {
			// 이 부분에서 알고리즘 프로그램을 작성하십시오. 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도
			// 됩니다.
			stone = sc.nextInt();
			max_range = sc.nextInt();
			mine = sc.nextInt();

			if (mine != 0) {
				for (int i = 0; i < mine; i++) {
					mine_p[i] = sc.nextInt();
				}
			}

			int[] a = new int[5000];

			a[1] = 1;
			a[2] = 2;
			int sum;
			int result;
			if (stone >= 3) {
				for (int i = 3; i <= stone; i++) {
					sum = 0;
					for (int j = 1; j <= max_range; j++) {
						if (i - j >= 0) {
							sum = sum + a[i - j];
						}

					}
					a[i] = sum;
				}
			}
			result = a[stone];
			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);

			System.out.println(result);

			/*for (int i = 1; i <= stone; i++) {
				System.out.println("" + a[i]);
			}*/
		}
	}

	public static int Step(int n) {
		if (n == stone) {
			return 1;
		}

		else {

			Step(n);
		}
		return 0;
	}
}