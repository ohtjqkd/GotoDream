package programmers;

public class BiggestCombination {
	public String solution(int[] numbers) {
		String answer = "";
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, 30, 34, 5, 9};
		BiggestCombination bc = new BiggestCombination();
		bc.solution(numbers);
	}

}
