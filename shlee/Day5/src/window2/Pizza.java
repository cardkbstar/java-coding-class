package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {
JFrame f;
JLabel top, count;
JButton b1, b2, b3;
JTextField total;
int sum = 0;
int combo = 0;
int potato = 0;
int bulgoki = 0;

JTextArea list;





public Pizza() {
	f = new JFrame();
	f.setSize(350, 200);
	top = new JLabel("<<<< 자바 피자에 오신 것을 환영합니다 >>>>");
	count = new JLabel("갯수");
	b1 = new JButton("콤보피자");
	b2 = new JButton("포테이토피자");
	b3  = new JButton("불고기피자");
	total = new JTextField(20);
	
	FlowLayout flow = new FlowLayout();
	f.setLayout(flow);
	list = new JTextArea(3, 30);
	
	
	f.add(top);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(count);
	f.add(total);
	f.add(list);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			sum++;
			total.setText(sum+"");
			
		}
	});

b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			sum++;
			total.setText(sum+"");
			
		}
	});
		
b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		sum++;
		total.setText(sum+"");
		
	}
});
	f.setVisible(true);
	
	}
	public static void main(String[] args) {
		Pizza p = new Pizza();
		

	}

}
