package task15;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends Frame implements ActionListener{
	Question question[];
	static int i=0;
	int right=0,total=1;
	JLabel marks,ques;
	JPanel panel;
	JButton ans1,ans2,ans3,ans4,next;
	String q,one,two,three,four,correct;
	public Test() throws IOException
	{
		question=new Question[100];
		Test.generateQuestion(question);
		q=question[0].getQuestion();
		one=question[0].getOpt1();
		two=question[0].getOpt2();
		three=question[0].getOpt3();
		four=question[0].getOpt4();
		correct=question[0].getCorrect();
		
		setSize(300,300);
		setVisible(true);
		panel=new JPanel();
		panel.setLayout(new GridLayout(7,1));
		marks=new JLabel("");
		marks.setAlignmentX(CENTER_ALIGNMENT);
		ques=new JLabel(q);
		ques.setAlignmentX(CENTER_ALIGNMENT);
		ans1=new JButton(one);
		ans2=new JButton(two);
		ans3=new JButton(three);
		ans4=new JButton(four);
		next=new JButton("next");
		ans1.setOpaque(true);
		ans2.setOpaque(true);
		ans3.setOpaque(true);
		ans4.setOpaque(true);
		ans1.setBackground(Color.white);
		ans2.setBackground(Color.white);
		ans3.setBackground(Color.white);
		ans4.setBackground(Color.white);
		next.setEnabled(false);
		ans1.addActionListener(this);
		ans2.addActionListener(this);
		ans3.addActionListener(this);
		ans4.addActionListener(this);
		next.addActionListener(this);
		panel.add(marks);
		panel.add(ques);
		panel.add(ans1);
		panel.add(ans2);
		panel.add(ans3);
		panel.add(ans4);
		panel.add(next);
		add(panel);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
	String comnd=ae.getActionCommand();
	if(comnd.equals("next"))
	{

			if(total<i)
			{
				ans1.setEnabled(true);
				ans2.setEnabled(true);
				ans3.setEnabled(true);
				ans4.setEnabled(true);
				next.setEnabled(false);
				ans1.setBackground(Color.white);
				ans2.setBackground(Color.white);
				ans3.setBackground(Color.white);
				ans4.setBackground(Color.white);
				
				q=question[total].getQuestion();
				one=question[total].getOpt1();
				two=question[total].getOpt2();
				three=question[total].getOpt3();
				four=question[total].getOpt4();
				correct=question[total].getCorrect();
			ques.setText(q);
			ans1.setText(one);
			ans2.setText(two);
			ans3.setText(three);
			ans4.setText(four);
			total++;
			}
		
	}
	else
	{
		if(ae.getActionCommand().equals(correct))
		{
			right++;
			marks.setText("CORRECT!"+right+"/"+total);
			ans1.setEnabled(false);
			ans2.setEnabled(false);
			ans3.setEnabled(false);
			ans4.setEnabled(false);
			next.setEnabled(true);
			if(ans1.getText().contentEquals(correct))
				ans1.setBackground(Color.green);
			else
				ans1.setBackground(Color.red);
			if(ans2.getText().contentEquals(correct))
				ans2.setBackground(Color.green);
			else
				ans2.setBackground(Color.red);
			if(ans3.getText().contentEquals(correct))
				ans3.setBackground(Color.green);
			else
				ans3.setBackground(Color.red);
			if(ans4.getText().contentEquals(correct))
				ans4.setBackground(Color.green);
			else
				ans4.setBackground(Color.red);
		}
		else
		{
			marks.setText("WORNG!"+right+"/"+total);
			ans1.setEnabled(false);
			ans2.setEnabled(false);
			ans3.setEnabled(false);
			ans4.setEnabled(false);
			next.setEnabled(true);
			if(ans1.getText().contentEquals(correct))
				ans1.setBackground(Color.green);
			else
				ans1.setBackground(Color.red);
			if(ans2.getText().contentEquals(correct))
				ans2.setBackground(Color.green);
			else
				ans2.setBackground(Color.red);
			if(ans3.getText().contentEquals(correct))
				ans3.setBackground(Color.green);
			else
				ans3.setBackground(Color.red);
			if(ans4.getText().contentEquals(correct))
				ans4.setBackground(Color.green);
			else
				ans4.setBackground(Color.red);

		}
	}
	
	}
	public static void generateQuestion(Question q[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new FileReader("/Users/tejamattapalli/Desktop/SD2/file.txt"));
		

		while(br.ready())
		{
			q[i]=new Question();
		q[i].setQuestion(br.readLine());
		q[i].setOpt1(br.readLine());
		q[i].setOpt2(br.readLine());
		q[i].setOpt3(br.readLine());
		q[i].setOpt4(br.readLine());
		q[i].setCorrect(br.readLine());
		i++;
		
		}
		br.close();
	}
	public static void main(String args[])
	{
		try {
			Test t=new Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
