import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*; 

public class Start extends JFrame {
	
	public Start() {
			
		Container c = this.getContentPane();
		c.setLayout(null);

		JButton start = new JButton("GAME START");
		start.setBounds(480, 700, 250, 80);
		start.setFont(new Font("���� ���",Font.BOLD,20));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new Ranking();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		c.add(start);
		
		JButton rank = new JButton("Ranking");
		rank.setBounds(480, 800, 250, 80);
		rank.setFont(new Font("���� ���",Font.BOLD,20));
		rank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		c.add(rank);

		//setLocationRelativeTo(null);
		setTitle("�Ű� �Բ�");
		setSize(1200,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
