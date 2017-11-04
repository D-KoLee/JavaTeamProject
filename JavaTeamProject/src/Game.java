import java.awt.*;
import javax.swing.*;

public class Game extends JFrame{
	
	public Game() {
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
	    ImageIcon cimg  = new ImageIcon("charter.png");
	    JLabel charter  = new JLabel(cimg);
	    charter.setBounds(500, 300, 200, 700);
	    add(charter);
	    
	    ImageIcon bimg  = new ImageIcon("background.jpg");
	    JLabel background  = new JLabel(bimg);
	    background.setBounds(0, 0, 1200, 1000);
	    c.add(background);
	    
		setTitle("�Ű� �Բ�");
		setSize(1200,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public static void main(String[] args) {
		new Game();
	}

}
