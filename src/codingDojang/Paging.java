package codingDojang;
import java.util.*;

public class Paging {
	public int paging(int n, int m) {
		int result = 0;
		result = (m%n==0)? m/n:(int)m/n + 1;
		return result;
	}

	public static void main(String[] args) {
		Paging pg = new Paging();
		Scanner input = new Scanner(System.in);
		System.out.println("페이지당 게시물");
		int n = input.nextInt();
		System.out.println("전체게시물");
		int m = input.nextInt();
		System.out.print(pg.paging(n, m));
		input.close();

	}

}
