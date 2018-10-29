package goong;
import java.util.*;
public class ConsoleEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			String input = s.nextLine();
			if(input.equalsIgnoreCase("q")) {
				s.close();
				System.exit(0);
			}
			System.out.println(input);
		}
	}
}
