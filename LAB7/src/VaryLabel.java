
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VaryLabel extends Frame implements ActionListener {
	private JLabel l1,l2;
	private JButton b1,b2;
	private JPanel p1,p2;
	
	public VaryLabel()
	{
		Font f = new Font("Serif",Font.PLAIN,18);
		setLayout(new BorderLayout(3,1));
		setVisible(true);
		setSize(300,300);
		setTitle("Font Size");
		setLayout(new GridLayout(3,1));
		l1 = new JLabel();
		l2=new JLabel();
		l1.setFont(f);
		l2.setFont(f);
		l2.setText("18");
		l1.setText("X");
		
		p1 = new JPanel(); 
		
		p1.add(l1);
		p1.add(l2);
		add(p1);
		 p2=new JPanel();
		 p2.setSize(50,50);
		 b1 = new JButton("Increase");       
		 b1.setFont(f);              
		 p2.add(b1);      
		 
		 b1.addActionListener(this); 
		 b2 = new JButton("Decrease");       
		 b2.setFont(f);       
		 p2.add(b2);       
		 b2.addActionListener(this);         
		 add(p2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().contentEquals("Increase"))
		{
			int size=l1.getFont().getSize();
			l1.setFont(new Font("serif", Font.PLAIN, (size+1)));
			Integer i1=size+1;
		
			l2.setText(i1.toString());
		}
		else if(ae.getActionCommand().contentEquals("Decrease"))
		{
			int size=l1.getFont().getSize();
			if(size>0)
			{
			l1.setFont(new Font("serif", Font.PLAIN, (size-1)));
			Integer i1=size-1;
		
			l2.setText(i1.toString());
			}
		}
	}
	public static void main(String args[])
	{
		VaryLabel vl=new VaryLabel();
	}

}
