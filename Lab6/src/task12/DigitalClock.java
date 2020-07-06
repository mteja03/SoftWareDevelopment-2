package task12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.*;

public class DigitalClock {

    public static void main(String[] args) {
        JFrame clock = new TextClockWindow();
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setVisible(true);
    }
}


class TextClockWindow extends JFrame {

    private JPanel p;
    private JLabel l1,l2,l3,l4;

    public TextClockWindow() {
    	p=new JPanel();
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l1.setFont(new Font("serif", Font.ITALIC, 24));
        l2.setFont(new Font("serif", Font.ITALIC, 24));
        l3.setFont(new Font("serif", Font.ITALIC, 24));
        l4.setFont(new Font("serif", Font.ITALIC, 24));
        p.setBorder(new LineBorder(Color.black, 1));
        l1.setBorder(new LineBorder(Color.black, 1));
        l2.setBorder(new LineBorder(Color.black, 1));
        l3.setBorder(new LineBorder(Color.black, 1));
        
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.setBounds(10,10,150,50);
        l4.setBounds(60,60,50,50);
       
        setLayout(null);
        setSize(200,200);
        add(p);
        add(l4);
        setVisible(true);
        this.setTitle("DIGITAL CLOCK");
        this.pack();


        javax.swing.Timer t = new javax.swing.Timer(1000,
              new ActionListener() {
                  public void actionPerformed(ActionEvent e) {

                  Calendar calendar = new GregorianCalendar();
   String am_pm;


                     Calendar now = Calendar.getInstance();
                      int h = now.get(Calendar.HOUR_OF_DAY);
                      int m = now.get(Calendar.MINUTE);
                      int s = now.get(Calendar.SECOND);


  if( calendar.get( Calendar.AM_PM ) == 0 ){
             am_pm = "AM";

         }
        else{
            am_pm = "PM";

        }   // Code to Determine whether the time is AM or PM

  l1.setText("" + h +"");
  l2.setText(""+m+"");
  l3.setText(""+s+"");
  l4.setText(am_pm);
                  
           }
              });
        t.start();
    }
} // End of Code
