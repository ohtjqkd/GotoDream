package programmers;

import java.util.HashMap;

public class Camouflage {
	public int solution(String[][] clothes) {
		int answer = 0;
		HashMap<String, String> element = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			element.put(clothes[i][1], clothes[i][0]);
		}
		System.out.println(element.get("head"));
		element.
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellow_hat", "head"},{"blue_sunglasses","eye"},{"green_turban","head"}};
		Camouflage camo = new Camouflage();
		System.out.println(camo.solution(clothes));
	}
}
