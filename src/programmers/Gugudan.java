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
		System.out.print("���ϴ� ��������?");
		String inputStr = "";
		try {
			Scanner sc = new Scanner(System.in);
			inputStr = sc.nextLine();
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("�߸��� Ÿ���� Input");
		}
		String[] splitedStr = inputStr.split(",");
		for (int i = 0; i < splitedStr.length; i++) {
			splitedStr[i] = splitedStr[i].trim();
		}
		int inputNumber1 = Integer.parseInt(splitedStr[0]);
		int inputNumber2 = Integer.parseInt(splitedStr[1]);
		Gugudan ggd = new Gugudan();
		// normal
		
			System.out.println(inputNumber1 + "��");
			for (int i = 1; i <= inputNumber2; i++) {
				//n��
				System.out.println(ggd.calculate(inputNumber1,i));
			}
		}
		//�迭
//		int[] resultArray = ggd.arrayGgd(inputNumber);
//		if (inputNumber<2 || inputNumber>9) {
//			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
//		} else {
//			System.out.println(inputNumber + "��");
//			for (int i = 0; i < resultArray.length; i++) {
//				System.out.println(resultArray[i]);
//			}
//		}
}
