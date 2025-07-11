
import javax.swing.*;
import java.awt.*;

class Welcome extends JFrame
{
	//state 
	private Container c;
	private JLabel labMsg;

	//behaviour
	public Welcome()
	{
		c = getContentPane();
		labMsg = new JLabel("Good Evening", JLabel.CENTER);
		Font f = new Font("Arial", Font.BOLD, 70);
		labMsg.setFont(f);
		labMsg.setForeground(Color.RED);
		c.add(labMsg);

		setTitle("Mera Pehla Frame");
		setSize(800,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class P1
{
	public static void main(String args[])
	{
		Welcome w = new Welcome();
	}

}