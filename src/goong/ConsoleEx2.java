package goong;
import java.util.*;
public class ConsoleEx2 { 
    static String[] argArr;       // 입력한 매개변수를 담기위한 문자열배열 

    public static void main(String[] args) { 
          while(true) { 
                String prompt = ">>"; 
                System.out.print(prompt); 
                
                // 화면으로부터 라인단위로 입력받는다. 
                Scanner s = new Scanner(System.in); 
                String input = s.nextLine();

                String modiInput = input.trim();
                argArr = modiInput.split(" +");
                

               /*

                   다음의 코드를 완성하세요.

                   1. 입력받은 값에서 앞뒤 공백을 제거한다. (String클래스의 trim()사용)
               		
                   2. 입력받은 명령라인의 내용을 공백을 구분자로 해서 나눠서 argArr에 담는다.

                       String클래스의 split(String regex)를 사용 - 공백이 하나 이상인 경우에도 하나의 공백으로 간주해야함

                       실행결과를 주의깊게 확인하세요.

               */
 //
                if(input.equalsIgnoreCase("Q")) {//q 또는 Q를 입력하면 실행종료한다. 
                      System.exit(0); 
                } else { 
                      for(int i=0; i < argArr.length;i++) { 
                            System.out.println(argArr[i]); 
                      } 
                      /* 위의 코드를 향상된 for문으로 변경하면 다음과 같다.
                      for(String arg : argArr) { 
                            System.out.println(arg);                                                       
                      } 
                      */ 
                } 
          } // while(true) 
    } // main 
} // class


