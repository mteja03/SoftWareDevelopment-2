package Window;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class ColorFrame extends JFrame
{  
	public ColorFrame()
	{  
		getContentPane().setBackground(Color.black);  }

	

	public void flash()
	{  
		Color [] rainbow ={ Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta}; 
		int index=0;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{  
			System.out.println("Enter empty string");
			String str=sc.nextLine();
			if(str.isEmpty())
			getContentPane().setBackground(rainbow[index]);
			index++;
			if(index==6)
				index=0;
		}
	}
}

public class RandColor
{  
	public static void main(String [] args)
	{  
		ColorFrame b;
		b = new ColorFrame();
		b.setSize(200,220);
		b.setTitle("Black and white");
		b.setVisible(true);
		b.addWindowListener
		(new WindowAdapter()
		{  
			public void windowClosing(WindowEvent e)
			{  System.exit(0); }
		});
		b.flash();
	}
}
