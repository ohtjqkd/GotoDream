package headfirstjava;
// 이 코드는 왜 안될까 똑같이 했는데도 작동X
import javax.swing.*;
import java.awt.*;

public class Animate {

	int x = 1;
	int y = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animate gui = new Animate();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawP drawP = new MyDrawP();
		frame.getContentPane().add(drawP);
		frame.setSize(500,270);
		frame.setVisible(true);
		for (int i = 0; i < 124; i++, x++, y++) {
			x++;
			drawP.repaint();
		}
		try {
			Thread.sleep(50);
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
	
	class MyDrawP extends JPanel{

		public void paintComponent(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0, 0, 500,250);
			g.setColor(Color.blue);
			g.fillRect(x, y, 500-2*x,250-2*y);
		}
	}

}
