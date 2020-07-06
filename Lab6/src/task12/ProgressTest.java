package task12;


import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgressTest extends Frame {
	JPanel p;
	JLabel b[];
	
	public ProgressTest()
	{
		p=new JPanel(new GridLayout(11,1));
		b=new JLabel[11];
		setLayout(new GridLayout(1,1));
		for(int i=0;i<11;i++)
		{
			b[i]=new JLabel();
			if(i!=10)
			b[i].setBackground(Color.RED);
			else
			{
			
				b[i].setHorizontalAlignment(JLabel.CENTER);
				b[i].setVerticalAlignment(JLabel.CENTER);
				b[i].setText("0%");
			}
			b[i].setOpaque(true);
			p.add(b[i]);
		}
		
		add(p);
		setVisible(true);
		
	}
	void doAction()
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		while(s.isEmpty())
		{
				if(i<=9)
					{
				b[i].setBackground(Color.GREEN);
				
				b[10].setText(((i+1)*10)+"%");
					
		
				i++;
					}
				else
				{
					for(int j=0;j<11;j++)
					{
						
						if(j!=10)
						b[j].setBackground(Color.RED);
						else
						{
						
							b[j].setHorizontalAlignment(JLabel.CENTER);
							b[j].setVerticalAlignment(JLabel.CENTER);
							b[j].setText("0%");
						}
						
					}
					i=0;
				}
				s=sc.nextLine();
				
				
			}
			
			
		}
	
	public static void main(String args[])
	{
		
		ProgressTest p1=new ProgressTest();
		p1.doAction();
	
	}

}
