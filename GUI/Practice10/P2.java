//GM/GA/GE

import javax.swing.*; //
import java.awt.*; //
import java.time.*;

class Greeting extends JFrame
{
	Container c;
	JLabel labMsg;
	
	Greeting()
	{
		c = getContentPane();
		setVisible(true);
		try{Thread.sleep(3000);} catch(Exception e){}

		labMsg = new JLabel("test", JLabel.CENTER);
		Font f = new Font("Impact", Font.BOLD, 70);
		labMsg.setFont(f);
		labMsg.setForeground(Color.blue);
		c.add(labMsg);
		

		LocalTime t = LocalTime.now();
		int hr = t.getHour();
		String msg = "";
		
		if(hr < 12)
			msg = "Good Morning";
		else if(hr < 12)
			msg = "Good Afternoon";
		else
			msg = "Good Evening";

		
		labMsg.setText(msg);
	
		setTitle("Greeting App");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);

	}

}

class P2
{
	public static void main(String args[])
	{
		Greeting g = new Greeting();
	}

}