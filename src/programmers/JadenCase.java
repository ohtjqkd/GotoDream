package programmers;

public class JadenCase {
	public String solution(String str) {
		String answer = "";
		String[] spl = str.split("");
		int cnt = 0;
		for (int i = 0; i < spl.length; i++) {
			spl[i] = (cnt == 0) ? spl[i].toUpperCase() : spl[i].toLowerCase();
			cnt = (spl[i].equals(" ")) ? 0 : cnt + 1;
			System.out.println(cnt);
			answer += spl[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JadenCase jc = new JadenCase();
		System.out.println(jc.solution("3people unFollowed me"));
	}

}
