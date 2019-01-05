package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game2 extends JFrame implements ActionListener{

	JButton s, r, p;
	JFrame f;
	
	public Game2() {
		setTitle("�굹�쓽 媛��쐞諛붿쐞蹂�");
		setSize(500, 1000);
		
		s = new JButton();
		r = new JButton();
		p = new JButton();
		
		ImageIcon icon1 = new ImageIcon("dog.PNG");
		ImageIcon icon2 = new ImageIcon("dog.PNG");
		ImageIcon icon3 = new ImageIcon("dog.PNG");
		
		s.setIcon(icon1);
		r.setIcon(icon2);
		p.setIcon(icon3);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		add(s);
		add(r);
		add(p);
		
		//Game2 game = new Game2();
		s.addActionListener(this);
		r.addActionListener(this);
		p.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Game2 game = new Game2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int compuer = random.nextInt(3);
		//0:媛��쐞, 1:諛붿쐞, 2:蹂�
		
		if(e.getSource() == s) {//�궡媛� 媛��쐞
			if(compuer == 0) { //而댄벂�꽣媛� 媛��쐞
				f.setTitle("鍮꾧꼈�쓬");
			}
			if(compuer == 1) { //而댄벂�꽣媛� 諛붿쐞
				f.setTitle("而댄벂�꽣 �듅");
			}
			if(compuer == 2) { //而댄벂�꽣媛� 蹂�
				f.setTitle("�궡媛� �듅");
			}
		}
		
		if(e.getSource() == r) {//�궡媛� 諛붿쐞
			
		}
		if(e.getSource() == p) {//�궡媛� 蹂�
			
		}
		
	}

}
