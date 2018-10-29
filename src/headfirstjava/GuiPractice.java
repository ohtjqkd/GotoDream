package headfirstjava;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class GuiPractice {
	JFrame frame;
	JButton button;
	JButton button2;
	JPanel panel;
	public void button() {
		frame = new JFrame("button1");
		panel = new MyDrawPanel();
		button = new JButton("Click me!");
		button.addActionListener(new Button1Listener());
		
		button2 = new JButton("Draw circle");
		button2.addActionListener(new DrawButton());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.NORTH, button2);
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}
	class Button1Listener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if (button.getText() == "Click me!") {
				button.setText("I have been clicked!");
			}	else {
				button.setText("Click me!");
			}
		}
	}
	class DrawButton implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			button2.setText("I have been draw!");
			frame.getContentPane().add(panel);
		}
	}
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(20, 50, 100, 100);
		}
	}
	public static void main(String[] args) {
		GuiPractice gui = new GuiPractice();
		gui.button();
	}
}
