import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class nosyncpcgui extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4476676392899251147L;
	JLabel prod,cons;
	JButton back;
	static JTextArea pro,con;
	JPanel framenopc;
	nosyncpcgui()
	{
		setTitle("Producer Consumer Problem");
		setBounds(100,100,969,660);
		framenopc=new JPanel();
		
		framenopc.setBackground(Color.WHITE);
		framenopc.setLayout(null);
		framenopc.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(framenopc);
		
		JLabel nopcheading=new JLabel("Producer Consumer Problem Without Synchronization");
		nopcheading.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		nopcheading.setBounds(200,0,550,100);
		framenopc.add(nopcheading);
		
		back =new JButton("Back");
		back.setBounds(800,80,80,50);
		framenopc.add(back);
		back.addActionListener(this);
		
		prod=new JLabel("Producer");
		prod.setBounds(250,125,120,50);
		prod.setFont(new Font("Yu Gothic", Font.BOLD,18));
		prod.setBackground(new Color(205, 92, 92));
		prod.setOpaque(true);
		prod.setHorizontalAlignment(SwingConstants.CENTER);
		framenopc.add(prod);
		
		cons=new JLabel("Consumer");
		cons.setBounds(550,125,120,50);
		cons.setFont(new Font("Yu Gothic", Font.BOLD,18));
		cons.setBackground(new Color(205, 92, 92));
		cons.setOpaque(true);
		cons.setHorizontalAlignment(SwingConstants.CENTER);
		framenopc.add(cons);
		
		pro=new JTextArea();
		pro.setEditable(false);
		pro.setFont(new Font("Yu Gothic",Font.PLAIN,14));
		pro.setBounds(275,200,200,340);
		pro.setLineWrap(true);
		framenopc.add(pro);
		
		con=new JTextArea();
		con.setEditable(false);
		con.setFont(new Font("Yu Gothic",Font.PLAIN,14));
		con.setBounds(575,200,200,340);
		con.setLineWrap(true);
		framenopc.add(con);
			
		
	}
	public void actionPerformed(ActionEvent e)
	{
		this.setVisible(false);
		this.dispose();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		home.main(null);
	}
}
