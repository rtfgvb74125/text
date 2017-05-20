package text;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;
public class Mainframe extends JFrame{
	private Label lab = new Label("Greedy snake");
	private JButton jbtn = new JButton("start");
	private JButton jbtnex = new JButton("Exit");
	private JPanel jp = new JPanel(new GridLayout(1,2,3,3));
	private JPanel jp2 = new JPanel(new GridLayout(1,3,3,3));
	private JPanel jpall = new JPanel(new GridLayout(2,1,1,1));
	private Font font1 = new Font(null,Font.PLAIN,30);
	private Container cp;
	
	
	public Mainframe (){
		init();
	}
	public void init(){
		this.setBounds(100,100,500,500);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ae){
				System.exit(0);
			}
		});
		jbtnex.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ai){
				System.exit(0);
			}
		});
		lab.setBackground(Color.PINK);
		cp = this.getContentPane();
		cp.setLayout(new BorderLayout(5,5));
		cp.add(lab, BorderLayout.NORTH);
		lab.setAlignment(Label.CENTER);
		cp.add(jpall, BorderLayout.SOUTH);
		lab.setFont(font1);
		jpall.add(jp);
		jpall.add(jp2);
		jp.add(jbtn);
		jp.add(jbtnex);
		jp2.add(jbtnl);
		jp2.add(jbtnc);
		jp2.add(jbtnh);
		
	}
}
