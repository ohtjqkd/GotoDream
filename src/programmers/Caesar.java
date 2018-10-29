package programmers;


public class Caesar {
	String lower = "abcdefghijklmnopqrstuvwxyz";
	String upper = lower.toUpperCase();
	public String caesar(String str, int n) {
		String result = "";
		String[] splStr = str.split("");
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				result += str.charAt(i);
				continue;
			}
			System.out.println("z".hashCode());
			if(splStr[i].hashCode()>96 && splStr[i].hashCode()<123) {
				int pos = ( splStr[i].hashCode() + n - 97 )  % 26;
				result += lower.charAt(pos);
			} else {
				int pos = ( splStr[i].hashCode() + n - 65 )  % 26;
				result += upper.charAt(pos);
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 27));
	}

}
