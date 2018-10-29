package programmers;

import java.util.Arrays;

public class NonCompletion {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			String p = participant[i];
			String c = completion[i];
			if(!p.equals(c)) return participant[i];
		}
		return participant[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonCompletion nc = new NonCompletion();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(nc.solution(participant, completion));
	}

}
