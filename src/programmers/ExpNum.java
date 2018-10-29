package programmers;

public class ExpNum {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			long total = 0;
			int start = i;
			while(total<=n) {
				total += start;
				if(total == n) {
					answer++;
					break;
				}
				start++;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpNum en = new ExpNum();
		System.out.println(en.solution(15));
	}

}
