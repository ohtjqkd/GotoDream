package programmers;
import java.util.*;
public class HateSame {
		public int[] solution(int []arr) {
	        ArrayList<Integer> tmp = new ArrayList<Integer> ();
	        for (int i = 0; i < arr.length; i++) {
	        	if(i==arr.length-1||arr[i]!=arr[i+1]) tmp.add(arr[i]);
			}
	        int[] answer = new int[tmp.size()];
	        for (int i = 0; i < tmp.size(); i++) {
				answer[i] = tmp.get(i);
			}
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");
	        return answer;
		}

	public static void main(String[] args) {
		int [] arr = {1,4,4,4,5,2,4,5,6,3,4,5,6,7,1,4,4,4,5,3,2,2,2,2,5,6,7,7};
		HateSame hs = new HateSame();
		int [] tmp = hs.solution(arr);
		System.out.print("[");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i]);
			if(i!=tmp.length-1)System.out.print(",");
		}
		System.out.print("]");
	}
}
