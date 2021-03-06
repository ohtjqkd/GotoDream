package programmers;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.Oneway;

public class MouiTest {
	int[] onePattern = {1,2,3,4,5};
	int[] twoPattern = {2,1,2,3,2,4,2,5};
	int[] threePattern = {3,3,1,1,2,2,4,4,5,5};
	public int[] solution(int[] answers) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int oneScore = 0;
		int twoScore = 0;
		int threeScore = 0;
		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == onePattern[i%onePattern.length]) oneScore++;
			if(answers[i] == twoPattern[i%twoPattern.length]) twoScore++;
			if(answers[i] == threePattern[i%threePattern.length]) threeScore++;
		}
		int[] judge = {oneScore, twoScore, threeScore};
		for (int i = 0; i < judge.length; i++) {
			System.out.println((int) judge[i]);
		}
		for (int i = 0; i < judge.length-1; i++) {
			for (int j = i+1; j < judge.length; j++) {
				if(judge[i] >= judge[j]) {
					array.clear();
					array.add(i);
				} else if(judge[i] == judge[j]) {
					array.add(i);
				}
			}
		}
		
		int[] result = new int[array.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = array.get(i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,3,2,4,2};
		MouiTest mt = new MouiTest();
		int[] tmp = mt.solution(answers);
		for (int i : tmp) {
			System.out.println(i);
		}
	}

}
