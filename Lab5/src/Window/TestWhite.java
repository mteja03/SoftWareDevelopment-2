package Window;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class White extends JFrame
{ 
	public White(Color color)
	{  
		getContentPane().setBackground(color);  
	}
}

class TestWhite
{  
	public static void main(String [] args)
	{  
		White w,w1,w2;
		w = new White(Color.RED);
		w.setSize(250,250);
		w.setTitle("RED WINDOW");
		w1 = new White(Color.BLUE);
		w1.setSize(350,100);
		w1.setTitle("BLUE WINDOW");
		w2 = new White(Color.GREEN);
		w.setSize(200,450);
		w.setTitle("GREEN WINDOW");
		w.setVisible(true);
		w1.setVisible(true);
		w2.setVisible(true);
		w.addWindowListener(new WindowAdapter()
		{  
			public void windowClosing(WindowEvent e)
			{  System.exit(0); }
		});
	}
}

