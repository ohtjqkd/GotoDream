package programmers;
import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = null;
        int ret = s % n;
        if(n>s) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
        for (int i = 0; i < n; i++) {
        	if (i == n - ret) {
				
			} else {

			}
			answer[i] = (int) Math.floorDiv(s, n);
		}
        for (int i = 0; i < ret; i++) {
			answer[n-i] = answer[n-i] + 1;
		}
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}