package goong;

import java.util.ArrayList;
import java.util.Scanner;

public class WordScrambleEx4 {

    public static void main(String[] args) { 
          String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

          while(true) { 
                String answer = getAnswer(strArr); 
                String question = getScrambledWord(answer); 
                char[] hint = new char[answer.length()]; 

                for(int i=0;i < hint.length;i++) { 
                      hint[i] = '_'; 
                } 

                while(true) { 
                      System.out.println("Question :" + question); 
                      System.out.print("Your answer is :"); 

                      Scanner s = new Scanner(System.in); 
                      String input = s.nextLine(); 

                      if(input.equalsIgnoreCase("q")) 
                            System.exit(0); 

                      if(input.equalsIgnoreCase(answer)) { 
                            System.out.println("정답입니다."); 
                            System.out.println(); 
                            break; 
                      } else { 
                            System.out.println(input+"은/는 정답이 아닙니다. 다시 시도해보세요.");       
                            System.out.println("Hint:"+getHint(answer,hint)); 
                      } 
                } // while 
          } // outer while 

    } // main 

    public static String getAnswer(String[] strArr) { 
          int idx = (int)(Math.random()*strArr.length); 
          return strArr[idx]; 
    } 
    
    // 섞은 결과가 정답과 같은경우도 있을 수 있음. 복잡하지 않게... 그냥 간단히 
    public static String getScrambledWord(String str) { 
          char[] chArr = str.toCharArray(); 

          for(int i=0;i < str.length()*2;i++) { 
                int idx = (int)(Math.random()*str.length()); 
                
                char tmp = chArr[0]; 
                chArr[0] = chArr[idx]; 
                chArr[idx] = tmp; 
          } 

          return new String(chArr); 
    } // scramble(String str) 

    public static String getHint(String answer, char[] hint) { 
          int count = 0; 

          for(int i=0;i < hint.length;i++) { 
                if(hint[i]=='_') 
                      count++; 
          } 
          
          if(count > 2) { 
                while(true) { 
                      int idx = (int)(Math.random()*answer.length()); 

                      if(hint[idx]=='_') { 
                            hint[idx] = answer.charAt(idx); 
                            break;                   
                      }
                } // while 
          } 

          return new String(hint); 
    } // getHint() 
}
