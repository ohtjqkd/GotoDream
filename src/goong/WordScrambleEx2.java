package goong;

import java.util.ArrayList;
import java.util.Scanner;
public class WordScrambleEx2 {
	public static void main(String[] args) {
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		while(true) {
			Scanner input = new Scanner(System.in);
			String ans = input.nextLine();
			String ansUp = ans.toUpperCase();
			System.out.println("Question: " + question);
			System.out.println("Your answer is: " + ans);
			if (ansUp.equals("Q") || ansUp.equals(answer)) {
				input.close();
				break;				
			}
			System.out.println(ans + "은/는 정답이 아닙니다. 다시 시도해보세요.");
		}
		System.out.println("end");
		
	}
	public static String getAnswer(String[] strArr) {
		int randNumber = (int) (Math.random() * 4);
		return strArr[randNumber];
	}
	public static String getScrambledWord(String str) {
		String result = "";
		ArrayList<String> scrambledWrd = new ArrayList<String>();
		
		for (int i = 0; i < str.length(); i++) {
			scrambledWrd.add(Character.toString(str.charAt(i)));
		}
		for (int i = 0; i < str.length(); i++) {
			int idx = (int) (Math.random() * scrambledWrd.size());
			result += scrambledWrd.get(idx);
			scrambledWrd.remove(idx);
		}
		return result;
	}
}
