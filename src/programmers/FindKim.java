package programmers;

public class FindKim {
	public String findKim(String[] seoul) {
		int x = 0;
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				x = i;
			}
		}
		
		
		return "�輭���� "+ x + "�� �ִ�";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
