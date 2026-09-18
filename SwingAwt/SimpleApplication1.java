import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleApplication1
{
	public static JFrame window = new JFrame("Graphics Lib");
	public static JPanel panel = new JPanel();
	public static JButton btn1 = new JButton("Show");
	public static JButton btn2 = new JButton("Reset");
	public static JTextArea ta = new JTextArea();

	public static void main (String[]args)
	{
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(400, 600);
	window.setLocation(400, 200);
	window.setLayout(new BorderLayout());
	
	panel.setLayout(new BorderLayout());
	ta.setEditable(false);
	
	btn1.addActionListener(new ActionListener ()
	{
		@Override
		public void actionPerformed( ActionEvent e)
		{
			ta.setText("Hello World using Graphics");
		}
	});

	btn2.addActionListener(new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e)
		{
			ta.setText(" ");
		}
	});

	panel.add(btn1, BorderLayout.WEST);
	panel.add(btn2, BorderLayout.EAST);
	window.add(panel, BorderLayout. SOUTH);
	window.add(ta, BorderLayout.CENTER);
	
	window.setVisible(true);
	
		
	}
}
