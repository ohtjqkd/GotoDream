package codingDojang;
import java.util.*;
public class AbsoluteNum {
	public String absoluteNum(int num) {
		StringBuffer sb = new StringBuffer();
		String result = "";
		for(int i = 2; i<= num; i++) {
			int sum = 0;
			for(int j = 1; j<= i/2; j++) {
				if(i%j == 0) {
					sum += j;
				}
			}
			if(sum == i) {
				result = sb.append(i + " ").toString();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AbsoluteNum an = new AbsoluteNum();
		System.out.println("자연수를 입력하세요.");
		int n = sc.nextInt();
		System.out.print("완전수: ");
		System.out.println(an.absoluteNum(n));
		sc.close();		

	}

}
