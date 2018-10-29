package programmers;

public class Printer {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		for (int i = 0; i < priorities.length; i++) {
			answer = priorities[i]<=priorities[location]? answer+1:answer;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		Printer p = new Printer();
		System.out.println(p.solution(priorities, location));
	}

}
