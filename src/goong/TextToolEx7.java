package goong;
import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 

public class TextToolEx7 extends Frame implements WindowListener 
{ 
      TextArea ta; 
      TextField tfParam1, tfParam2; 
      Panel pNorth, pSouth; 
      Label lb1, lb2; 

      String[] btnName = { 
            "Undo",         // 작업이전 상태로 되돌림 
            "Del Even", // 짝수줄을 삭제하는 기능 
            "Del Param1",    // Param1에 지정된 문자들을 삭제하는 기능 
            "trim",           // 라인의 앞뒤 공백을 제거 
            "Del Blank Line",   // 빈 줄 삭제 
            "Add head-tail", //접두사,접미사추가
            "Substring",	//접두사, 접미사삭제
            "Substring2"	//param1과 param2에 둘러싸인 부분을 남기고 제거
      }; 

      Button[] btn = new Button[btnName.length]; 

      private final String CR_LF = System.getProperty("line.separator"); // 줄바꿈문자 

      private String prevText =""; 

      private void registerEventHandler() { 
            addWindowListener(this); 

            int n = 0; // 버튼순서 

            btn[n++].addActionListener(new ActionListener() { // Undo - 작업이전 상태로 되돌림 
                  public void actionPerformed(ActionEvent ae) { 
                        String curText = ta.getText(); 

                        if(!prevText.equals("")) { 
                              ta.setText(prevText);                         
                        } 

                        prevText = curText; 
                  } 
            }); 

            btn[n++].addActionListener(new ActionListener() { // 짝수줄삭제 - 짝수줄을 삭제하는 기능 
                  public void actionPerformed(ActionEvent ae) { 
                      String curText = ta.getText(); 
                      StringBuffer sb = new StringBuffer(curText.length()); 

                      prevText = curText; 

                      Scanner s = new Scanner(curText); 

                      for(int i=0;s.hasNextLine();i++) { 
                            String line = s.nextLine(); 

                            if(i%2==0) { 
                                  sb.append(line).append(CR_LF); 
                            } 
                      } 

                      ta.setText(sb.toString()); 
                      } 
            }); 

            btn[n++].addActionListener(new ActionListener() { // 문자삭제 - Param1에 지정된 문자를 삭제하는 기능 
                  public void actionPerformed(ActionEvent ae) { 
                        String curText = ta.getText(); 
                        StringBuffer sb = new StringBuffer(curText.length()); 

                        prevText = curText; 

                        String delText = tfParam1.getText(); 

                        if("".equals(delText)) return; 

                        for(int i=0;i< curText.length();i++) { 
                              char ch = curText.charAt(i); 
                              
                              if(delText.indexOf(ch)==-1) 
                                    sb.append(ch); 
                        } 

                        ta.setText(sb.toString()); 
                  } 
            }); 

            btn[n++].addActionListener(new ActionListener() { // trim - 라인의 좌우공백을 제거하는 기능 
                  public void actionPerformed(ActionEvent ae) { 
                        String curText = ta.getText(); 
                        StringBuffer sb = new StringBuffer(curText.length()); 

                        prevText = curText; 
                        
                        Scanner s = new Scanner(curText);
                        while(s.hasNextLine()) {
                        	sb.append(s.nextLine().trim()).append(CR_LF);
                        }
                        ta.setText(sb.toString());

                  } 
            }); 

            btn[n++].addActionListener(new ActionListener() { // 빈줄삭제 - 빈 줄 삭제 
                  public void actionPerformed(ActionEvent ae) { 
                        String curText = ta.getText(); 
                        StringBuffer sb = new StringBuffer(curText.length()); 

                        prevText = curText; 
                        
                        Scanner s = new Scanner(curText);
                        while(s.hasNextLine()) {
                        	String line = s.nextLine();
                        	if(line.trim().length() > 0) 
                        		sb.append(line).append(CR_LF);
                        }
//	                        for(int i=0;s.hasNextLine();i++) { 
//	                            String line = s.nextLine(); 
//	                            
//	                            if(line.trim().length() > 0) 
//	                                  sb.append(line).append(CR_LF); 
//	                      } 


                        ta.setText(sb.toString());
                  } 
            }); 
            btn[n++].addActionListener(new ActionListener() { // 접두사 - 각 라인에 접두사, 접미사 붙이기 
                public void actionPerformed(ActionEvent ae) { 
                      String curText = ta.getText(); 
                      StringBuffer sb = new StringBuffer(curText.length()); 

                      prevText = curText; 
                      
                      String param1 = tfParam1.getText();
                      String param2 = tfParam2.getText();
                      
                      Scanner s = new Scanner(curText);
                      
                      while(s.hasNext()) {
                    	  String line = s.nextLine();
                    	  sb.append(param1).append(line).append(param2);
                      }
                      
                      ta.setText(sb.toString());
                } 
          }); 
            btn[n++].addActionListener(new ActionListener() { // substring - 문자열 자르기 
                public void actionPerformed(ActionEvent ae) { 
                      String curText = ta.getText(); 
                      StringBuffer sb = new StringBuffer(curText.length()); 

                      prevText = curText;

                      String param1 = tfParam1.getText();
                      String param2 = tfParam2.getText();
                      
                      Scanner s = new Scanner(curText);
                      while(s.hasNext()) {
                    	  String line = s.nextLine();
                    	  line = line.substring(param1.length(),line.length()-param2.length());
                    	  sb.append(line).append(CR_LF);
                      }
                      ta.setText(sb.toString());
                    /*

                     다음의 코드를 완성하세요.



                     1. param1과 param2의 값을 가져온다.(getText()사용)

                     2. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.

                        (Scanner클래스의 hasNextLine(), nextLine()사용)

                     3. 읽어온 라인을 substring으로 자른다. - param1과 param2의 내용에 관계없이 길이만큼 자른다.

                        (param1의 문자열길이와 param2의 문자열 길이를 이용)

                     4. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)

                   */

                } 
          }); 
            btn[n++].addActionListener(new ActionListener() { // substring2 - 지정된 문자를 찾아서 그 위치까지 잘라내기 
                public void actionPerformed(ActionEvent ae) { 
                      String curText = ta.getText(); 
                      StringBuffer sb = new StringBuffer(curText.length()); 

                      prevText = curText; 
                      
                      String param1 = tfParam1.getText();
                      String param2 = tfParam2.getText();
                      
                      Scanner s = new Scanner(curText);
                      
                      while(s.hasNext()) {
                    	  String line = s.nextLine();
                    	  int first = line.indexOf(param1);
                    	  int last = line.indexOf(param2);
                    	  System.out.println(first);
                    	  System.out.println(last);
                    	  sb.append(line.substring(first,last+1));
                      }
                      ta.setText(sb.toString());
                     /*

                         다음의 코드를 완성하세요.

                     1. param1과 param2의 값을 가져온다.(getText()사용)

                     2. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.

                     3. 각 라인에서 param1, param2과 일치하는 문자열의 위치를 찾는다.

                        (param1은 라인의 왼쪽끝부터, param2는 라인의 오른쪽끝부터 찾기 시작한다.)

                         param1과 param2로 둘러쌓인 부분을 sb에 저장한다.

                     4. sb의 내용을 TextArea에 보여준다.

                     */

                } 
          }); 





      }       // end of registerEventHandler() 

      public static void main(String[] args) { 
            TextToolEx7 win = new TextToolEx7("Text Tool"); 
            win.show(); 
      } 

      public TextToolEx7(String title) { 
            super(title); 
            lb1 = new Label("param1:", Label.RIGHT); 
            lb2 = new Label("param2:", Label.RIGHT); 
            tfParam1 = new TextField(15); 
            tfParam2 = new TextField(15); 

            ta = new TextArea(); 
            pNorth = new Panel(); 
            pSouth = new Panel(); 

            for(int i=0;i < btn.length;i++) {

                  btn[i] = new Button(btnName[i]); 
            } 

            pNorth.setLayout(new FlowLayout()); 
            pNorth.add(lb1); 
            pNorth.add(tfParam1); 
            pNorth.add(lb2); 
            pNorth.add(tfParam2); 

            pSouth.setLayout(new GridLayout(2,10)); 

            for(int i=0;i < btn.length;i++) { // 버튼배열을 하단 Panel에 넣는다. 
                  pSouth.add(btn[i]); 
            } 

            add(pNorth,"North"); 
            add(ta,"Center"); 
            add(pSouth,"South"); 

            setBounds(100, 100, 600, 300); 
            ta.requestFocus(); 
            registerEventHandler(); 
            setVisible(true); 
      } // public TextToolEx1(String title) { 

      public void windowOpened(WindowEvent e) {} 
      public void windowClosing(WindowEvent e) { 
            e.getWindow().setVisible(false); 
            e.getWindow().dispose(); 
            System.exit(0); 
      } 
      public void windowClosed(WindowEvent e) {} 
      public void windowIconified(WindowEvent e) {} 
      public void windowDeiconified(WindowEvent e) {} 
      public void windowActivated(WindowEvent e) {} 
      public void windowDeactivated(WindowEvent e) {} 
} // end of class 

