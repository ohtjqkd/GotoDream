package headfirstjava;
import java.awt.event.*;
import java.io.PrintWriter;
import java.net.*;

import javax.swing.*;

public class SimpleChatClientA {
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	
	public void go() {
		JFrame sendFrame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		sendFrame.getContentPane().add(mainPanel);
		setUpNetworking();
		sendFrame.setSize(400,500);
		sendFrame.setVisible(true);
	}
	private void setUpNetworking() {
		try {
		sock = new Socket("127.0.0.1", 5000);
		writer = new PrintWriter(sock.getOutputStream());
		System.out.println("networking established");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent a) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleChatClientA().go();
	}

}
