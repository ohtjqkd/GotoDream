package programmers;
import java.util.*;

public class HateSameNum {

		public int[] solution(int []arr) {
	        int[] answer = {};
	        ArrayList arr1 = new ArrayList<Integer>;
	        for (int i = 0; i < arr.length; i++) {
				arr1.add(arr[i]);
			}
	        for (int i = 0; i < arr.length; i++) {
	        	System.out.println(arr1.);
	        }
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");

	        return answer;
	}
	
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,5,5,6,6,7,7,7,7,8,8,8,8,8,3,1,2};
		HateSameNum hsn = new HateSameNum();
		hsn.solution(arr);
		
	}

}
