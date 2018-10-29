package programmers;
public class NumberInHead {
	//hash로 푸는 법을 알아보자
	public boolean solution(String[] phone_book) {
		for (int i = 0; i < phone_book.length-1; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if(phone_book[i].length()>phone_book[j].length()) {
					String tmp = phone_book[i];
					phone_book[i] = phone_book[j];
					phone_book[j] = tmp;
				}
			}
		}
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				String tmp = phone_book[j].substring(0, phone_book[i].length());
				if(phone_book[i].equals(tmp)) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] phone_book = {"12", "456", "789", "23412"};
		NumberInHead nih = new NumberInHead();
		System.out.println(nih.solution(phone_book));

	}

}
