package programmers;

public class GetMiddleString {
	public String solution(String s) {
		return s != null ? s.substring((s.length()-1) / 2, s.length()/2 + 1):"";
	}
	public static void main(String[] args) {
		GetMiddleString gms = new GetMiddleString();
		System.out.println(gms.solution(" "));
	}

}
