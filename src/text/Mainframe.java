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
	protected Label lab = new Label("Greedy snake");
	protected JButton jbtn = new JButton("計算成績");
	protected JButton jbtnex = new JButton("Exit");
	protected JButton jbtnl = new JButton("初級");
	protected JButton jbtnc = new JButton("中級");
	protected JButton jbtnh = new JButton("高級");
	protected JButton jbtnup = new JButton("↑");
	protected JButton jbtndown = new JButton("↓");
	protected JButton jbtnleft = new JButton("←");
	protected JButton jbtnright = new JButton("→");
	protected Label labsn[] = new Label[800];
	protected String labsnLabel[]=new String[800];
	protected JPanel jpmid = new JPanel(new GridLayout(20,40,0,0));//中間盤子
	protected JPanel jp = new JPanel(new GridLayout(1,2,3,3));//計算跟exit盤子
	protected JPanel jplavel = new JPanel(new GridLayout(1,3,3,3));//級數盤子
	protected JPanel jpall = new JPanel(new GridLayout(3,1,1,1));//裝jp跟jpleavel
	protected JPanel jpc = new JPanel(new GridLayout (2,1,1,1));//下方控制健全
	protected JPanel jpcd = new JPanel(new GridLayout(1,3,1,1));//↓ ← →的盤子
	protected Font font1 = new Font(null,Font.PLAIN,30);
	protected Container cp;
	protected int direction = 0;
	
	
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
//		jbtnex.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent ai){
//				System.exit(0);
//			}
//		});
		lab.setBackground(Color.PINK);
		cp = this.getContentPane();
		cp.setLayout(new BorderLayout(5,5));
		cp.add(lab, BorderLayout.NORTH);
		lab.setAlignment(Label.CENTER);
		cp.add(jpall, BorderLayout.SOUTH);
		cp.add(jpmid,BorderLayout.CENTER);
		lab.setFont(font1);
		jpall.add(jp);
		jpall.add(jplavel);
		jpall.add(jpc);
		jpc.add(jbtnup);
		jpc.add(jpcd);
		jp.add(jbtn);
		jp.add(jbtnex);
		jplavel.add(jbtnl);
		jplavel.add(jbtnc);
		jplavel.add(jbtnh);
		jpcd.add(jbtnleft);
		jpcd.add(jbtndown);
		jpcd.add(jbtnright);
		
//		for(int i = 0;i<800;i++){
//			labsnLabel[i] = " ";
//		}
		for(int i = 0;i<800;i++){
			labsn[i] = new Label(labsnLabel[i]);
			labsn[i].setBackground(Color.black);
			for(int j = 795;j<800;j++){
				labsn[j] = new Label(labsnLabel[i]);
				labsn[j].setBackground(Color.blue);
			}
			jpmid.add(labsn[i]);
		}
	}
}
