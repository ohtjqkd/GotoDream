package programmers;

public class IsNumber {
	public boolean solution(String s) {
	    boolean answer = true;
	    String[] spl = s.split("");
	    for (int i = 0; i < spl.length; i++) {
	    	for (int j = 0; j < 10; j++) {
	    		String temp = j + "";
				if(spl[i].hashCode() == temp.hashCode()) {
					answer = true;
					break;
				} else {
					answer = false;
				}
			}
	    	if (answer == false) {
				return answer;
			}
		}
	    return answer;
	}
	public static void main(String[] args) {
		IsNumber isnum = new IsNumber();
		System.out.println(isnum.solution("a12344"));
	}

}
