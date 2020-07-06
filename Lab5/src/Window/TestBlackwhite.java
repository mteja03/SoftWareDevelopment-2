package Window;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Blackwhite extends JFrame
{  
	public Blackwhite()
	{  
		getContentPane().setBackground(Color.black);  }

	private void pause(long millisecs)
	{  
		long startTime = Calendar.getInstance().getTimeInMillis();
		while(Calendar.getInstance().getTimeInMillis()-startTime<millisecs);
	}

	public void flash()
	{  
		Color [] rainbow ={ Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta}; 
		int index=0;
		while(true)
		{  
			pause(1000);
			getContentPane().setBackground(rainbow[index]);
			index++;
			if(index==6)
				index=0;
		}
	}
}

public class TestBlackwhite
{  
	public static void main(String [] args)
	{  
		Blackwhite b;
		b = new Blackwhite();
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
