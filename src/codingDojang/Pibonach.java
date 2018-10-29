package codingDojang;
import java.util.*;
public class Pibonach {
	public int sumPibo(int first, int second, long limit) {
		int result = 0;
		if(first % 2 == 0) result = result + first;
		if(second % 2 == 0) result = result + second;
		int sum = first + second;
		while(sum <= limit) {
			if(sum % 2 == 0) result += sum;
			first = second;
			second = sum;
			sum = first + second;
		}
		return result;
	}

	public static void main(String[] args) {
		Pibonach pb = new Pibonach();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 항을 입력하세요.");
		int first = sc.nextInt();
		System.out.println("두 번째 항을 입력하세요.");
		int second = sc.nextInt();
		System.out.println("최대 값을 입력하세요.");
		long limit = sc.nextLong();
		sc.close();	
		
		System.out.print(pb.sumPibo(first, second, limit));

	}

}
