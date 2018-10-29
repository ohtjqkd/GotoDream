package headfirstjava;

import javax.swing.*;
import java.awt.*;

public class FlowLayOut {
	
	public static void main(String[] args) {
		FlowLayOut flo = new FlowLayOut();
		flo.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		JButton buttonThree = new JButton("huh?");
		
		panel.add(button);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(250,200);
		frame.setVisible(true);
		
	}

}
