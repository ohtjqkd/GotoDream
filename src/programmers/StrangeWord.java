package programmers;

public class StrangeWord {
	  public String solution(String s) {
		String answer = "";
		int cnt = 0;
		String[] spl = s.split("");
		for (int i = 0; i < spl.length; i++) {
			answer += (cnt % 2 == 0) ? spl[i].toUpperCase() : spl[i].toLowerCase();
			cnt++;
			if(spl[i].equals(" "))cnt = 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		StrangeWord sw = new StrangeWord();
		
		System.out.println(sw.solution("show me the mo n  ey     please          "));
	}

}
