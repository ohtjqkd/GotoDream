package programmers;

public class Palindrome {
	public int palin (String a) {
		int count = 0;
		int maxCount = 0;
		String reverseStr = "";

		if(a.length() == 1)
			return 1;

		for(int i = a.length()-1; i >= 0; i--)
			reverseStr += a.charAt(i);

		for(int i = 0; i < a.length(); i++){
			for(int j = 0; j < reverseStr.length(); j++){
				count = 0;
				if( a.charAt(i) == reverseStr.charAt(j)){
					count++;
					first:for(int x = i + count; x < a.length(); x++)
						for(int y = j + count; y < reverseStr.length(); y++)
		{
		if( a.charAt(x) == reverseStr.charAt(y))
		{
		count++;

		if( maxCount < count)
		maxCount = count;
		break;
		}

		else
		{
		if( maxCount < count)
		maxCount = count;
		break first;
		}
		}

		if( maxCount < count)
		maxCount = count;

		if( maxCount == a.length() || maxCount == a.length()-1)
		return maxCount;
		}
		}
		}
		return maxCount;
		}
//		for (int i = 1; i < str.length()-1; i++) {
//			int temp = 1;
//			for (int j = 1; j <= str.length()-i-1 & j <= i; j++) {
//				if(str.charAt(i + j) == str.charAt(i - j)) {
//					temp += 2;
//					if(temp>answer) {
//						answer = temp;
//					}
//				} else {
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == str.charAt(i+1)) {
//				int temp = 2;
//				for (int j = 1; j <= str.length()-i-2 & j <= i; j++) {
//					if(str.charAt(i + 1 + j) == str.charAt(i - j)) {
//						temp += 2;
//						if(temp>answer) {
//							answer = temp;
//						}
//					} else {
//						break;
//					}
//				}
//			}
//		}
//		return answer;
	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		System.out.println(pal.palin("asaaasdfasdffdsa"));
	}

}
