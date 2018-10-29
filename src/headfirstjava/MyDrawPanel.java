package headfirstjava;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyDrawPanel extends JPanel {
	JFrame frame = new JFrame("MOVE CIRCLE");
	
	int x = 20;
	int y = 50;
	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, 100, 100);
	}
	class Repaint implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			x += 5;
			y += 5;
			System.out.println(format);
		}
	}
	public static void main(String[] args) {
		MyDrawPanel md = new MyDrawPanel();
		md.paintComponent(frame);
	}
}
