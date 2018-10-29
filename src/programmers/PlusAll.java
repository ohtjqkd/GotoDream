package programmers;


public class PlusAll {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] splNum = num.split("");
        for (int i = 0; i < splNum.length; i++) {
			answer += Integer.parseInt(splNum[i]);
		}
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    public static void main(String[] args) {
		PlusAll pa = new PlusAll();
		System.out.print(pa.solution(123));
		
	}
}
