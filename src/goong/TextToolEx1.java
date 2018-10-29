package goong;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 

public class TextToolEx1 extends Frame implements WindowListener 
{ 
      TextArea ta; 
      TextField tfParam1, tfParam2; 
      Panel pNorth, pSouth; 
      Label lb1, lb2; 

      String[] btnName = { 
            "짝수줄삭제", // btn[0] - 짝수줄을 삭제하는 기능 
      }; 

      Button[] btn = new Button[btnName.length]; 

      private final String CR_LF = System.getProperty("line.separator"); // 개행문자(줄바꿈문자)
      
      private String prevText ="";   // TextArea ta의 내용을 저장하기 위한 변수


      
      private void registerEventHandler() { 
            addWindowListener(this); 

            btn[0].addActionListener(new ActionListener() { // 짝수줄삭제 - 짝수줄을 삭제하는 기능 
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


                      /*

                       다음의 코드를 완성하세요.

 

                       1. TextArea ta의 텍스트를 가져온다.(getText()사용)

                       2. 작업의 결과를 저장할 StringBuffer sb를 생성한다.

                       3. Scanner클래스와 반복문을 이용해서 1에서 가져온  텍스트를 라인단위로 읽는다.

                          (Scanner클래스의 hasNextLine(), nextLine()사용)

                       4. 조건문을 사용해서 짝수줄인 경우에만 sb에 담는다.

                       5. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)

                     */
                  } 
            }); 
      }       // end of registerEventHandler() 

      public static void main(String[] args) { 
            TextToolEx1 win = new TextToolEx1("Text Tool"); 
            win.show(); 
      } 

      public TextToolEx1(String title) { 
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

            for(int i=0; i < btn.length;i++) {             // 버튼배열을 하단 Panel에 넣는다. 
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

