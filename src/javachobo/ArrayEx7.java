package javachobo;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i =0;i<numArr.length;i++){
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		/*for(int i =0;i<100;i++){
			int n = (int) (Math.random() * 10);	//0~9
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}*/

		change100Arr(numArr);
		
		
		for(int i=0;i<numArr.length;i++){
			System.out.print(numArr[i]);
		}
	}

	public static int[] change100Arr(int[] arr){
		for(int i=0;i<100;i++){
			int n = (int) (Math.random()*10);
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
			
			
		}
		
		return arr;
	}
}
