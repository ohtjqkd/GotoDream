package programmers;

public class RightBraket {
	public boolean solution(String str) {
		int judge = 0;
		if(str.length()%2 == 1 || str.charAt(0) == ')') return false;
		for (int i = 0; i < str.length(); i++) {
			judge += str.charAt(i) == '(' ? 1 : -1;
		}
		if(judge != 0) return false;
		return true;
	}
	public static void main(String[] args) {
		RightBraket rb = new RightBraket();
		System.out.println(rb.solution("(()("));
	}
}
