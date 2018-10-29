package goong;

import java.util.ArrayList;

public class WordScrambleEx1 {
	public static void main(String[] args) {
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		
		System.out.println("Question: " + question);
		System.out.println("Answer: " + answer);
		
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
