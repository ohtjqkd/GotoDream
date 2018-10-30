package programmers;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Gugudan {
	public int calculate(int x, int y) {
		int answer = 0;
		answer = x * y;
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("원하는 구구단은?");
		String inputStr = "";
		try {
			Scanner sc = new Scanner(System.in);
			inputStr = sc.nextLine();
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 타입의 Input");
		}
		String[] splitedStr = inputStr.split(",");
		for (int i = 0; i < splitedStr.length; i++) {
			splitedStr[i] = splitedStr[i].trim();
		}
		int inputNumber1 = Integer.parseInt(splitedStr[0]);
		int inputNumber2 = Integer.parseInt(splitedStr[1]);
		Gugudan ggd = new Gugudan();
		// normal
		
			System.out.println(inputNumber1 + "단");
			for (int i = 1; i <= inputNumber2; i++) {
				//n단
				System.out.println(ggd.calculate(inputNumber1,i));
			}
		}
		//배열
//		int[] resultArray = ggd.arrayGgd(inputNumber);
//		if (inputNumber<2 || inputNumber>9) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		} else {
//			System.out.println(inputNumber + "단");
//			for (int i = 0; i < resultArray.length; i++) {
//				System.out.println(resultArray[i]);
//			}
//		}
}
