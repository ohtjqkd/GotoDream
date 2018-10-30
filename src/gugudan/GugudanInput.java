package gugudan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanInput {
	String inputStr;
	public String[] input() {
		try {
			Scanner sc = new Scanner(System.in);
			inputStr = sc.nextLine();
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		String[] splitedStr = inputStr.split(",");
		for (int i = 0; i < splitedStr.length; i++) {
			splitedStr[i] = splitedStr[i].trim();
		}
		return splitedStr;
	}
}
