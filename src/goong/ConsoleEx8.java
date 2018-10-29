package goong;
import java.io.*; 
import java.util.*;
import java.util.regex.*; 


public class ConsoleEx8 {
	static String[] argArr;                         // 입력한 매개변수를 담기위한 문자열배열 
    static LinkedList q = new LinkedList(); // 사용자가 입력한 내용을 저장할 큐(Queue) 
    static final int MAX_SIZE = 5;              // Queue에 최대 5개까지만 저장되도록 한다. 

    static File curDir; 

    static { 
          try { 
                curDir = new File(System.getProperty("user.dir")); 
          } catch(Exception e) {} 
    } 

    public static void main(String[] args) {

          Scanner s = new Scanner(System.in); // 한번만 생성해서 재사용하면 되므로 반복문 밖으로 이동

          while(true) { 
                try { 
                      String prompt = curDir.getCanonicalPath() + ">>"; 
                      System.out.print(prompt); 
                
                      // 화면으로부터 라인단위로 입력받는다. 
                      String input = s.nextLine(); 

                      save(input); 

                      input = input.trim();          // 입력받은 값에서 불필요한 앞뒤 공백을 제거한다. 
                      argArr = input.split(" +");  


                      String command = argArr[0].trim(); 

                      if("".equals(command)) continue; 

                      command = command.toLowerCase(); // 명령어를 소문자로 바꾼다. 

                      if(command.equals("q")) { // q 또는 Q를 입력하면 실행종료한다. 
                          System.exit(0); 
	                    } else if(command.equals("history")) { 
	                          history(); 
	                    } else if(command.equals("dir")) { 
	                          dir(); 
	                    } else if(command.equals("type")) { 
	                          type(); 
	                    } else if(command.equals("find")) {
	                    	  find();
	                    } else if(command.equals("find2")) {
	                    	  find2();
	                    } else { 
	                          for(int i=0; i < argArr.length;i++) { 
	                                System.out.println(argArr[i]); 
	                          } 
	                    } 


                } catch(Exception e) { 
                      System.out.println("입력오류입니다."); 
                }                   
          } // while(true) 
    } // main 

    public static void save(String input) { 
          if(input==null || "".equals(input)) return; 

          q.offer(input); // queue에 저장한다. 

          // queue의 최대크기를 넣으면 제일 오래된 저장값을 삭제한다. 
          if(((LinkedList)q).size() > MAX_SIZE) 
                q.remove(); 
    } 

    public static void history() { 
          int i=0; 

          // LinkedList의 내용을 보여준다. 
          LinkedList tmp = (LinkedList)q; 
          ListIterator it = tmp.listIterator(); 

          while(it.hasNext()) { 
                System.out.println(++i+"."+it.next()); 
          } 
    } 

    public static void dir() { 
          String pattern = ""; 

          switch(argArr.length) { 
                case 1 :  
                	File[] fileList = curDir.listFiles();
                	for (int i = 0; i < fileList.length; i++) {
                		if(fileList[i].isDirectory()) {
                			System.out.println("[" + fileList[i] + "]");
                		} else {
                			System.out.println(fileList[i]);
                		}
                	}
                      break;
                case 2 :  // dir과 패턴을 같이 입력한 경우, 예를 들면 dir *.class
                      pattern = argArr[1]; 
                      pattern = pattern.toUpperCase(); // 패턴에서 대소문자를 구별하지 않도록 대문자로 변경한다.
                      pattern = pattern.replace(".", "\\.");
                      pattern = pattern.replace("*", ".*");
                      pattern = pattern.replace("?",".{1}");
                      
                      Pattern p = Pattern.compile(pattern);
                      
                      for(File f : curDir.listFiles()) {
                    	  String tmp = f.getName().toUpperCase();
                    	  Matcher m = p.matcher(tmp);
                    	  if (m.matches()) {
							if (f.isDirectory()) {
								System.out.println("[" + f.getName() + "]");
							} else {
								System.out.println(f.getName());
							}
                    	  }
                      }
                      break; 
                default : 
                      System.out.println("USAGE : dir [FILENAME]"); 
          } // switch 
    } // dir() 
    public static void type() throws IOException { 
        if(argArr.length !=2) { 
              System.out.println("Usage : type FILE_NAME"); 
              return; 
        } 

        String fileName = argArr[1]; 

        File tmp = new File(fileName); 
        if(tmp.exists()) {
        	FileReader readFile = new FileReader(tmp);
        	BufferedReader bufferR = new BufferedReader(readFile);
        	String s;
        	while(( s=bufferR.readLine())!=null) {
        		System.out.println(s);
        	}
        } else {
        	System.out.println("존재하지 않는 파일");
        }

        return; 
    }  //type()
    public static void find() throws IOException { 
        if(argArr.length!=3) { 
              System.out.println("USAGE : find KEYWORD FILE_NAME"); 
              return; 
        } 

        String keyword = argArr[1]; 
        String fileName = argArr[2]; 

        File tmp = new File(fileName); 
        if(tmp.exists()) {
        	FileReader readFile = new FileReader(tmp);
        	BufferedReader bufferedR = new BufferedReader(readFile);
        	String s;
        	for(int i = 0; (s = bufferedR.readLine()) != null; i++) {
        			if(s.contains(keyword))
        				System.out.println((i+1) + s);
			}
        }

        return; 
    }
    public static void find2() throws IOException { 
        if(argArr.length!=3) { 
              System.out.println("USAGE : find2 KEYWORD FILE_NAME"); 
              return; 
        } 

        String keyword = argArr[1]; 
        String pattern = argArr[2]; 

        pattern = pattern.toUpperCase();
        pattern = pattern.replace(".", "\\.");
		pattern = pattern.replace("*", ".*");
		pattern = pattern.replace("?", ".{1}");
        
		Pattern p = Pattern.compile(pattern);
		
		for(File f : curDir.listFiles()) {
			String tmp = f.getName().toUpperCase();
			Matcher m = p.matcher(tmp);
			
			if (m.matches()) {
				if(f.isDirectory()) continue;
				
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				String line;
				
				System.out.println("---------------" + f.getName());
				
				for (int i = 0;(line = br.readLine()) != null; i++) {
					if(line.indexOf(keyword)!= -1)
						System.out.println(i + ":" + line);
				}
			}
        	FileReader readFile = new FileReader(tmp);
        	BufferedReader bufferedR = new BufferedReader(readFile);
        	String s;
        	for(int i = 0; (s = bufferedR.readLine()) != null; i++) {
        			if(s.contains(keyword))
        				System.out.println((i+1) + s);
			}
        }
        /*

           다음의 코드를 완성하세요.



           1. 입력된 패턴(pattern)을 정규식 표현(Regular Expression)에 알맞게 치환한다.

                String클래스의 String replace(CharSequence target, CharSequence replacement)를 사용하자.

                예를 들면, pattern = pattern.replace("A","AA")는 pattern의 "A"를 "AA"로 치환한다.



           2. 반복문을 이용해서 현재 디렉토리 중, 입력된 패턴과 일치하는 것들에 대해서,

                 2.1 반복문을 이용해서 라인별로 읽어서 keyword가 포함되었는지 확인한다.

                      (BufferedReader의 readLine()사용)

                 2.2 keyword가 포함된 라인을 발견하면, 라인번호와 함께 해당 라인을 화면에 출력한다.

        */

        return; 
    } 





} // class
