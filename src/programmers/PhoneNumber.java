package programmers;

public class PhoneNumber {
	public String solution(String phone_number) {
		String answer = "";
		for(int i = 0; i < phone_number.length()-4;i++) {
			answer+="*";
		}
		answer += phone_number.substring(phone_number.length()-4);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumber pn = new PhoneNumber();
		System.out.println(pn.solution("01066271012"));
	}

}
