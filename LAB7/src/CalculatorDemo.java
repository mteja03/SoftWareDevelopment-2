import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CalculatorDemo extends JFrame implements FocusListener,ActionListener{
	JLabel l;
	JTextField t;
	JButton b1,b2,b3,b4,b5;
	JPanel p1,p2,p3;
	double d1,d2;
	StringBuffer sb;
	CalculatorDemo()
	{
		setSize(300,300);
		setLayout(new GridLayout(3,1));
		setVisible(true);
		setTitle("Calculator");
		
		
		p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.setSize(300,25);
	//	p1.setAlignmentY(RIGHT_ALIGNMENT);
		l=new JLabel("0", SwingConstants.RIGHT);
	//	l.setHorizontalAlignment(JLabel.RIGHT);
	//	l.setHorizontalTextPosition(JLabel.RIGHT);
		l.setBackground(Color.WHITE);
		l.setBorder(new LineBorder(Color.BLUE,1));
		l.setSize(300,10);
		
		//l.setHorizontalTextPosition();
		p1.add(l);
		
		
		
		
		p2=new JPanel();
		p2.setSize(300,25);
		t=new JTextField(25);
		t.setSize(300,10);
		t.addFocusListener(this);
		t.setHorizontalAlignment(JTextField.RIGHT);
		p2.add(t);
		p3=new JPanel();
		b1=new JButton("CLR");
		b2=new JButton("+");
		b3=new JButton("-");
		b4=new JButton("*");
		b5=new JButton("/");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		add(p1);
		add(p2);
		add(p3);
		
	}
	public static void main(String args[])
	{
		CalculatorDemo cd=new CalculatorDemo();
	}
	public void focusGained(FocusEvent fe)
	{
		t.setText("");
	}
	public void focusLost(FocusEvent fe)
	{
		d1=Double.parseDouble(t.getText());
	}
	
		public void actionPerformed(ActionEvent ae)
	{
		String s=new String(ae.getActionCommand());
		if(s.equals("CLR"))
		{
			l.setText("0");
			t.setText("");
			
		}
		else if(s.equals("+"))
		{	
			
				d2=Double.parseDouble(l.getText());
				Double res=d1+d2;
				l.setText(res.toString());
				
			
		}
		else if(s.equals("-"))
		{	
			
				d2=Double.parseDouble(l.getText());
				Double res=d2-d1;
				l.setText(res.toString());
				
			
		}
		else if(s.equals("*"))
		{	
			
				d2=Double.parseDouble(l.getText());
				Double res=d2*d1;
				l.setText(res.toString());
				
			
		}
		else if(s.equals("/"))
		{	
			
				d2=Double.parseDouble(l.getText());
				Double res=d2/d1;
				l.setText(res.toString());
				
			
		}
	}
}
