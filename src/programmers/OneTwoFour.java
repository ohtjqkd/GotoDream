package programmers;

public class OneTwoFour {
	public String solution(int n) {
		String answer = "";
		String[] num = {"4","1","2"};
		int nmg;
		answer = "";
		
		while(n>0){
			nmg = n%3;
			n = n/3;
			if(nmg==0) n--;				
			
			answer = num[nmg] + answer;
		}
		
		return answer;


	}
	public static void main(String[] args) {
		OneTwoFour otf = new OneTwoFour();
		System.out.println(otf.solution(10));
	}

}
