package programmers;


public class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i=0;i < commands.length; i++) {
			int start = commands[i][0]-1;
			int last = commands[i][1]-1;
			int arrayLength = last - start + 1;
			int[] tmpArray = new int[arrayLength];
			for (int j = 0; j < tmpArray.length; j++) {
				tmpArray[j] = array[start+j];
			}
			for (int j = 0; j < tmpArray.length-1; j++) {
				for (int j2 = j+1; j2 < tmpArray.length; j2++) {
					if(tmpArray[j] > tmpArray[j2]) {
						int tmp = tmpArray[j];
						tmpArray[j] = tmpArray[j2];
						tmpArray[j2] = tmp;
					}
				}
			}
			answer[i] = tmpArray[commands[i][2] -1 ];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthNumber kn = new KthNumber();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		for (int j = 0; j < commands.length; j++) {
			System.out.println(kn.solution(array, commands)[j]);
		}
	}

}
