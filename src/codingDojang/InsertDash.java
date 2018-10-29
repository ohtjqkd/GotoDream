package codingDojang;
import java.util.*;
public class InsertDash {
	public String insertDash(String num) {
		String result = "";
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<num.length()-1;i++) {
			String dos = "";
			int a = num.charAt(i);
			int b = num.charAt(i+1);
			if(a != b) {
				result = sb.append(num.charAt(i)).toString();
				continue;
			} else { 
				dos = (a == 1) ? "-":"*";
				result = sb.append(num.charAt(i) + dos).toString();
			}
		}
		result = result + sb.append(num.charAt(num.length()-1)).toString();
		return result;
	}
	public static void main(String[] args) {
		
		InsertDash id = new InsertDash();
		System.out.println("숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		sc.close();
		System.out.println("결과값이 출력됩니다.");
		System.out.print(id.insertDash(num));
		
		
	}

}
