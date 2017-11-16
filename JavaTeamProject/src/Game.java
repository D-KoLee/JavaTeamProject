import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.awt.event.MouseMotionListener;

public class Game extends JFrame {
	
	JLabel charter;
 
	public Game() {
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		
	    ImageIcon cimg  = new ImageIcon("charter.png");
	    charter  = new JLabel(cimg);
	    charter.setLocation(700,300); // 위치지정
		charter.setSize(200,400); // 크기 지정 
	    add(charter);
	    
		
	    ImageIcon bimg  = new ImageIcon("background.jpg");
	    JLabel background  = new JLabel(bimg);
	    background.setBounds(0, 0, 1600, 1000);
	    c.add(background);

		this.addMouseListener(new MyMouseListener()); // 마우스리스너 
		this.addMouseMotionListener(new MyMouseListener()); // 모션리스너 
	    
		setTitle("신과 함께");
		setSize(1600,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener{ 
		
	
		public void mouseDragged(MouseEvent e){ // 드래그일시
			int x = e.getX();
			int y = e.getY();
			if((charter.getX() < x && charter.getX()+200 > x) && (charter.getY()+80 < y && charter.getY()+370 > y))
			charter.setLocation(x-100, y-250); // 위치 조정

			if(charter.getX() < 300)
			{
				System.out.println("천국");
			}
			else if(charter.getX() > 1100)
			{
				System.out.println("지옥");
			}
		}
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
