import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class home extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8512375100033077779L;
	JPanel contentPaneHome;
	JButton dpp,nosyncpcb,pc;
	home()
	{
		setTitle("Synchronization Problems");
		setBounds(200,100,969,660);
		contentPaneHome = new JPanel();
		contentPaneHome.setBackground(Color.WHITE);
		contentPaneHome.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPaneHome.setLayout(null);
		setContentPane(contentPaneHome);
		
		JLabel heading=new JLabel("BMS College of Engineering");
		heading.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		heading.setBounds(325,0,350,100);
		contentPaneHome.add(heading);
		
		JLabel subhead=new JLabel("Autonomous under VTU");
		subhead.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		subhead.setBounds(415,25,400,100);
		contentPaneHome.add(subhead);
		
		
		JLabel title=new JLabel("Classic Problems of Synchronization");
		title.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		title.setBounds(300,140,400,100);
		contentPaneHome.add(title);
		
		dpp =new JButton("Dining Philosophers Problem");
		dpp.setBounds(100,265,200,50);
		contentPaneHome.add(dpp);
		dpp.setVisible(false);
		
		nosyncpcb =new JButton();
		nosyncpcb.setText("<html>Producer-Consumer Problem<br /> without Synchronization</html>");
		nosyncpcb.setBounds(200,265,225,50);   //360x
		contentPaneHome.add(nosyncpcb);
		
		pc =new JButton("Producer-Consumer Problem");
		pc.setBounds(490,265,200,50);    //650x
		contentPaneHome.add(pc);
		
		dpp.addActionListener(this);
		nosyncpcb.addActionListener(this);
		pc.addActionListener(this);
		
		JTextArea Details = new JTextArea();
		Details.setEditable(false);
		Details.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		Details.setLineWrap(true);
		Details.setText("By: \n 1. Suhas M Suresh       1BM16CS109 \n 2. Sumukha R Nadig     1BM16CS110 \n 3. Smaran S Rao           1BM16CS153 \n 4. T A Vishwas             1BM16CS115");
		Details.setBounds(700,450,300,300);
		contentPaneHome.add(Details);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==dpp)
		{
			this.setVisible(false);
			
			EventQueue.invokeLater(new Runnable() {
			    public void run() {
			    	try {
			    		DiningPhilosopherProblem.main(null);
			    		
			    	}catch(Exception e)
			    	{
			    		e.printStackTrace();
			    	}
			    }
			});
			
			dininggui.main(null);
			
						
				
		}
		else if(e.getSource()==nosyncpcb)
		{
			this.setVisible(false);
			nosyncpc.main(null);
			contentPaneHome.repaint();
		}
		else if(e.getSource()==pc)
		{
			this.setVisible(false);
			prodcons.main(null);
			contentPaneHome.repaint();
		}
	}
	
	public static void main(String args[])
	{
		home fram=new home();
		fram.setVisible(true);
		fram.repaint();
		fram.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}