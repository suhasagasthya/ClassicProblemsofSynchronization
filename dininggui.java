import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class dininggui extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9024555640826586229L;
	/**
	 * 
	 */
	
	JPanel contentPane;
	 JButton pbacks;
	static JLabel phil1, phil2, phil3,phil4, phil5;
     JLabel fork1,fork2,fork3,fork4,fork5;
	dininggui() {
		
		setTitle("Dining Philosophers");
		setBounds(100,100,969,660);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		  pbacks =new JButton("Back");
			pbacks.setBounds(800,80,80,50);
			contentPane.add(pbacks);
			pbacks.addActionListener(this);
		
		phil1=new JLabel("Philosopher 0");
		phil1.setOpaque(true);
		phil1.setForeground(Color.WHITE);
		phil1.setBackground(Color.BLACK);
		phil1.setHorizontalAlignment(SwingConstants.CENTER);
		phil1.setFont(new Font("Tahoma", Font.BOLD, 12));
		phil1.setBounds(543, 206, 115, 70);
		contentPane.add(phil1);
		
		phil2=new JLabel("Philosopher 1");
		phil2.setOpaque(true);
		phil2.setForeground(Color.WHITE);
		phil2.setBackground(Color.BLACK);
		phil2.setHorizontalAlignment(SwingConstants.CENTER);
		phil2.setFont(new Font("Tahoma", Font.BOLD, 12));
		phil2.setBounds(590, 402, 115, 70);
		contentPane.add(phil2);
		
		phil3=new JLabel("Philosopher 2");
		phil3.setOpaque(true);
		phil3.setForeground(Color.WHITE);
		phil3.setBackground(Color.BLACK);
		phil3.setHorizontalAlignment(SwingConstants.CENTER);
		phil3.setFont(new Font("Tahoma", Font.BOLD, 12));
		phil3.setBounds(410, 501, 115, 71);
		contentPane.add(phil3);
		
		phil4=new JLabel("Philosopher 3");
		phil4.setOpaque(true);
		phil4.setForeground(Color.WHITE);
		phil4.setBackground(Color.BLACK);
		phil4.setHorizontalAlignment(SwingConstants.CENTER);
		phil4.setFont(new Font("Tahoma", Font.BOLD, 12));
		phil4.setBounds(213, 402, 115, 70);
		contentPane.add(phil4);
		
		phil5=new JLabel("Philosopher 4");
		phil5.setOpaque(true);
		phil5.setForeground(Color.WHITE);
		phil5.setBackground(Color.BLACK);
		phil5.setHorizontalAlignment(SwingConstants.CENTER);
		phil5.setFont(new Font("Tahoma", Font.BOLD, 12));
		phil5.setBounds(257, 206, 115, 70);
		contentPane.add(phil5);
		
		fork1 = new JLabel("Fork 0");
		fork1.setBackground(new Color(205, 92, 92));
		fork1.setOpaque(true);
		fork1.setHorizontalAlignment(SwingConstants.CENTER);
		fork1.setBounds(571, 310, 66, 27);
		contentPane.add(fork1);
		
		fork2 = new JLabel("Fork 1");
		fork2.setBackground(new Color(205, 92, 92));
		fork2.setOpaque(true);
		fork2.setHorizontalAlignment(SwingConstants.CENTER);
		fork2.setBounds(504, 463, 66, 27);
		contentPane.add(fork2);
		
		fork3 = new JLabel("Fork 2");
		fork3.setBackground(new Color(205, 92, 92));
		fork3.setOpaque(true);
		fork3.setHorizontalAlignment(SwingConstants.CENTER);
		fork3.setBounds(346, 463, 66, 27);
		contentPane.add(fork3);
		
		fork4 = new JLabel("Fork 3");
		fork4.setBackground(new Color(205, 92, 92));
		fork4.setOpaque(true);
		fork4.setHorizontalAlignment(SwingConstants.CENTER);
		fork4.setBounds(306, 316, 66, 27);
		contentPane.add(fork4);
		
		fork5 = new JLabel("Fork 4");
		fork5.setBackground(new Color(205, 92, 92));
		fork5.setOpaque(true);
		fork5.setHorizontalAlignment(SwingConstants.CENTER);
		fork5.setBounds(425, 228, 66, 27);
		contentPane.add(fork5);
		
		JTextArea txtrObserveTheDining = new JTextArea();
		txtrObserveTheDining.setEditable(false);
		txtrObserveTheDining.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		txtrObserveTheDining.setLineWrap(true);
		txtrObserveTheDining.setText("- 5 philosophers sit at a table\r\n- There are only 5 forks on the table \r\n- They are all hungry & want to eat\r\n- They can only eat when the fork to the left & right of them are both available\r\n- After eating for a period, they then take a quick snooze before trying to eat again :)\r\n- Watch as they take turns to use the forks");
		txtrObserveTheDining.setBounds(40, 11, 843, 141);
		contentPane.add(txtrObserveTheDining);
		
		EventQueue.invokeLater(new Runnable() {
		    public void run() {
		    	try {
		    		//DiningPhilosopherProblem.main(null);
		    		
		    	}catch(Exception e)
		    	{
		    		e.printStackTrace();
		    	}
		    }
		});
		
		
		
	}
	
	public static void changeColorToGreen(int p)
	{
		switch(p)
		{
		case 0: phil1.setBackground(Color.GREEN);
				
				break;
		case 1: phil2.setBackground(Color.GREEN);
				break;
		case 2:phil3.setBackground(Color.GREEN);
				break;
		case 3:phil4.setBackground(Color.GREEN);
				break;
		case 4:phil5.setBackground(Color.GREEN);
				break;
		default: break;		
		}
	}
	
	public static void changeColorToBlack(int p)
	{
		switch(p)
		{
		case 0: phil1.setBackground(Color.BLACK);
				break;
		case 1: phil2.setBackground(Color.BLACK);
				break;
		case 2:phil3.setBackground(Color.BLACK);
				break;
		case 3:phil4.setBackground(Color.BLACK);
				break;
		case 4:phil5.setBackground(Color.BLACK);
				break;
		default: break;		
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==pbacks)
		{
			this.setVisible(false);
			this.dispose();
			home.main(null);
		}
	}
	

	public static void main(String args[])
	{
		
		
		dininggui dining=new dininggui();
		dining.setVisible(true);
		dining.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//	DiningPhilosopherProblem.main(null);
		
	}


}
