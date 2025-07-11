import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

class NameApp extends JFrame
{
	private Container c;
	private JLabel labName, labMsg;
	private JTextField textName;
	private JButton btnSwagat;
	NameApp()
	{
		c = getContentPane();
		//c.setLayout(new FlowLayout());

		labName = new JLabel("Enter name");
		textName = new JTextField(10);
		btnSwagat = new JButton("Swagat nahi karoge humara !");
		labMsg = new JLabel(".");

		c.add(labName);
		c.add(textName);
		c.add(btnSwagat);
		c.add(labMsg);
		
		setTitle("Name App");
		setSize(800, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class P3
{
	public static void main(String args[])
	{
		NameApp n = new NameApp();
	}
}