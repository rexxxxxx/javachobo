package javachobo;
import java.util.Scanner;
import java.io.FileInputStream;
public class Bunker_cg4 {
	public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
        
		Scanner sc = new Scanner(System.in);
		Bunker_cg4 bk = new Bunker_cg4();
		int T;
		int test_case;

		
		int N, M, K;

		
		T = sc.nextInt();        
		for(test_case = 1; test_case <= T; test_case++) {
			// 이 부분에서 알고리즘 프로그램을 작성하십시오. 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
			N = sc.nextInt();		//node	 1~100,000
			M = sc.nextInt();		//line	 1~500,000
			K = sc.nextInt();		//Dot	 1~N
			
			
			//one more test
			
			int[][] map = new int[N][N];
			int[] dot = new int[K];
			Vertex[] points = new Vertex[N];
			int tmp1, tmp2;
			for(int i=0;i<M;i++){
				tmp1 = sc.nextInt();
				tmp2 = sc.nextInt();
				map[tmp2][tmp1]=map[tmp1][tmp2] = sc.nextInt();
			}
			int tmp;
			for(int i=0;i<K;i++){
				tmp=sc.nextInt();
				dot[tmp]=1;			//정점 
			}
			
			
			int sum_range, sum_dot;
			
			for(int i=0;i<N;i++){
				if(dot[i]==0){		//정점이 아닐경우 
					
					// 정점까지의 최소거리 구하는 알고리즘
					for(int j=0; j<N; j++){
						if(dot[j]==1){			//정점으로 연결되면 ?
							/*for(int k=step;k<=1;k--){ //역탐색  
								
							}*/
						}
						else{					//정점이 아닌 다른 점 ?
							
							
							//bk.search_node(1);
							//step++;
						}
					}
					
					
					// 각 노드에서 최소거리의 합 = sum_range; 
					
					
					// 각 노드에서 도착하는 정점의 합 = sum_dot;
				}
				
				
				
			}
        
        

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			for(int i=0;i<M;i++){
				for(int j=0;j<M;j++){
					System.out.println(i+"*"+j+"*" + map[i][j]);
					
					System.out.println("test");
				}
			}
			
		}
	}
	
	public int search_node(int n){
		return 0;
	}
}

class Vertex{
	public int x;
	public int y;
	public int cost;
	
	Vertex(int x, int y, int cost){
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}