import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class prodconsgui extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1703721049316100365L;
	JLabel head,pcprod,pccons;
	JPanel pcframe;
	JButton backs;
	static JTextArea pcpro,pccon;
	
	prodconsgui()
	{
		setTitle("Producer Consumer Problem");
		setBounds(100,100,969,660);
		 pcframe=new JPanel();
		 pcframe.setBackground(Color.WHITE);
		 pcframe.setLayout(null);
		 pcframe.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pcframe);
		
		head=new JLabel("Producer Consumer Problem With Synchronization");
		head.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		head.setBounds(200,0,550,100);
		 pcframe.add(head);
		 
	     backs =new JButton("Back");
		backs.setBounds(800,80,80,50);
		pcframe.add(backs);
		backs.addActionListener(this);
		
		pcprod=new JLabel("Producer");
		pcprod.setBounds(250,125,120,50);
		pcprod.setFont(new Font("Yu Gothic", Font.BOLD,18));
		pcprod.setBackground(new Color(205, 92, 92));
		pcprod.setOpaque(true);
		pcprod.setHorizontalAlignment(SwingConstants.CENTER);
		pcframe.add(pcprod);
		
		pccons=new JLabel("Consumer");
		pccons.setBounds(550,125,120,50);
		pccons.setFont(new Font("Yu Gothic", Font.BOLD,18));
		pccons.setBackground(new Color(205, 92, 92));
		pccons.setOpaque(true);
		pccons.setHorizontalAlignment(SwingConstants.CENTER);
		 pcframe.add(pccons);
		
		pcpro=new JTextArea();
		pcpro.setEditable(false);
		pcpro.setFont(new Font("Yu Gothic",Font.PLAIN,14));
		pcpro.setBounds(275,200,200,340);
		pcpro.setLineWrap(true);
		 pcframe.add(pcpro);
		
		pccon=new JTextArea();
		pccon.setEditable(false);
		pccon.setFont(new Font("Yu Gothic",Font.PLAIN,14));
		pccon.setBounds(575,200,200,340);
		pccon.setLineWrap(true);
		pcframe.add(pccon);
			
	}
	public void actionPerformed(ActionEvent e)
	{
		//System.out.println(" pcconsmain main " + SwingUtilities.isEventDispatchThread() );
		this.setVisible(false);
		this.dispose();
		home.main(null);
	}

}
