//package myBookStore;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
class MyFrame2 extends JFrame
{
	JFrame f;
	JTextField t1,t2,t3,t4,t5,t6;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JButton b1,b2,b3,b4,b5,b6,b7;

	MyFrame2()
	{
		JFrame f = new JFrame();
		CheckboxGroup cbg = new CheckboxGroup();

		//Initialized Components
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();

		b1 = new JButton("Save");
		b2 = new JButton("Modify");
		b3 = new JButton("Delete");
		b4 = new JButton("Reset");
		b5 = new JButton("Exit");
		b6 = new JButton("Search");
		b7 = new JButton("Get Vehicle Information");

		l1 = new JLabel("LICENCE INFORMATION");
		l2 = new JLabel("Licence No : ");
		l3 = new JLabel("Licence Status : ");
		l4 = new JLabel("Vehicle Type : ");
		l5 = new JLabel("VALIDITY ");
		l6 = new JLabel("From : ");
		l7 = new JLabel("Till : ");
		l8 = new JLabel("PERSONAL INFORMATION ");
		l9 = new JLabel("Name : ");
		l10 = new JLabel("Blood Group : ");
		l11 = new JLabel("Image : ");
		l12 = new JLabel("DOB : ");
		l13 = new JLabel("ID : ");
		l14 = new JLabel("Address : ");
		l15 = new JLabel("Contact No. : ");
		l16 = new JLabel("Gender : ");

		Checkbox checkBox1 = new Checkbox("Male", cbg, false);    
        checkBox1.setBounds(680,460, 50,50);    
        Checkbox checkBox2 = new Checkbox("Female", cbg, false);    
        checkBox2.setBounds(800,460, 50,50);    
		
		//Set Component
		l1.setBounds(20,20,500,50);
		
		
		l2.setBounds(40,40,100,100);
		t1.setBounds(160,70,350,30);
		

		l3.setBounds(40,80,100,100);
		l4.setBounds(40,120,100,100);
		l5.setBounds(20,160,100,100);
		l6.setBounds(40,190,100,100);
		l7.setBounds(40,220,100,100);
		l8.setBounds(550,20,260,50);
		
		l9.setBounds(550,40,120,100);
		t2.setBounds(680,70,350,30);

		l10.setBounds(550,100,100,100);
		
		l11.setBounds(550,160,100,100);
		t3.setBounds(680,190,350,30);


		l12.setBounds(550,220,100,100);
		

		l13.setBounds(550,280,100,100);
		t4.setBounds(680,310,350,30);

		
		l14.setBounds(550,340,100,100);
		t5.setBounds(680,370,350,30);

		l15.setBounds(550,400,100,100);
		t6.setBounds(680,430,350,30);

		l16.setBounds(550,430,100,100);

		
	
		b1.setBounds(150,575,100,50);
		b2.setBounds(260,575,100,50);
		b3.setBounds(370,575,100,50);
		b4.setBounds(480,575,100,50);
		b5.setBounds(590,575,100,50);
		b6.setBounds(150,500,100,50);
		b7.setBounds(400,500,200,50);
		
		Font f1 = new Font("Arial",Font.BOLD,20);

		l1.setFont(f1);
		l5.setFont(f1);
		l8.setFont(f1);

		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);


		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);

		f.add(checkBox1);    
        f.add(checkBox2);  

		f.setSize(1200,680);
		f.setLayout(null); 
		f.setVisible(true);
		

		addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
	
	
	public static void main(String args[])
	{
		new MyFrame2();
	}
}