package text;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;

public class Mainframe extends JFrame implements KeyListener {
	protected Label lab = new Label("Greedy Node");
	protected Label lab2 = new Label("Time");

//	protected JButton jbtnl = new JButton("初級");
//	protected JButton jbtnc = new JButton("中級");
//	protected JButton jbtnh = new JButton("高級");
	
	
	protected Label lab5 = new Label("point:");
	protected Label lab6 = new Label("0");
	

	protected JLabel jlabsn[][] = new JLabel[20][30];
	protected int data[][] = new int[1][2];
	protected int dataf[][] = new int[6][2];
	protected JPanel jpmid = new JPanel(new GridLayout(20, 30, 0, 0));// 中間盤子
	
	protected JPanel jplavel = new JPanel(new GridLayout(1, 2, 3, 3));// 級數盤子
	
	protected JPanel jptop = new JPanel (new GridLayout(2,1,5,5));//最上面盤子
	
	protected Font font1 = new Font(null, Font.PLAIN, 30);
	protected Container cp;
private int count = 0;
	public Mainframe(){
		init();
	}

	private void init() {
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lab.setBackground(Color.PINK);
		cp = this.getContentPane();
		cp.setLayout(new BorderLayout(5, 5));
		cp.add(lab, BorderLayout.NORTH);
		
		lab.setAlignment(Label.CENTER);
		lab2.setAlignment(Label.CENTER);
		lab5.setAlignment(Label.CENTER);
		
		cp.add(jptop, BorderLayout.NORTH);
		cp.add(jplavel, BorderLayout.SOUTH);
		cp.add(jpmid, BorderLayout.CENTER);
		
		lab.setFont(font1);
		lab2.setFont(font1);
		lab5.setFont(font1);
		lab6.setFont(font1);
		jptop.add(lab);
		jptop.add(lab2);

		jplavel.add(lab5);
		jplavel.add(lab6);
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		data[0][0] = 0;// y data[0][0]->data[y]
		data[0][1] = 0;// x 0->1 data[0][1]->data[x]
		
		dataf[0][0] = 9;
		dataf[0][1] = 9;
		dataf[1][0] = 8;
		dataf[1][1] = 6;
		dataf[2][0] = 2;
		dataf[2][1] = 10;
		dataf[3][0] = 10;
		dataf[3][1] = 2;
		dataf[4][0] = 5;
		dataf[4][1] = 4;
		dataf[5][0] = 6;
		dataf[5][1] = 6;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 30; j++) {
				jlabsn[i][j] = new JLabel();
				jlabsn[i][j].setBackground(Color.black);
				jlabsn[i][j].setOpaque(true);
				jpmid.add(jlabsn[i][j]);}}

		// for(int i = 0;i<6;i++){
		jlabsn[data[0][0]][data[0][1]].setBackground(Color.BLUE);
		// }
		
		



	}

	@Override
	public void keyPressed(KeyEvent arg0){
		
		System.out.println(count);

		// TODO Auto-generated method stub
		try{
		switch (arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
			data[0][0]--;
			break;
		case KeyEvent.VK_DOWN:
			data[0][0]  ++;
			break;
		case KeyEvent.VK_RIGHT:
			data[0][1] ++;
			break;
		case KeyEvent.VK_LEFT:
			data[0][1] --;
			break;
		default:
			break;
		}
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j <30; j++) {	
				jlabsn[i][j].setBackground(Color.black);
				jlabsn[i][j].setOpaque(true);
			}
		}
		
		jlabsn[dataf[0][0]][dataf[0][1]].setBackground(Color.YELLOW);
		jlabsn[dataf[1][0]][dataf[1][1]].setBackground(Color.green);
		jlabsn[dataf[2][0]][dataf[2][1]].setBackground(Color.red);
		jlabsn[dataf[3][0]][dataf[3][1]].setBackground(Color.pink);
		jlabsn[dataf[4][0]][dataf[4][1]].setBackground(Color.cyan);
		jlabsn[dataf[5][0]][dataf[5][1]].setBackground(Color.orange);
		


		
		
		jlabsn[data[0][0]][data[0][1]].setBackground(Color.BLUE);
		if(data[0][0]==dataf[0][0] && data[0][1] ==dataf[0][1]){
			dataf[0][0] = new Random().nextInt(20);
			dataf[0][1] = new Random().nextInt(30);
			count++;
		}else if(data[0][0]==dataf[1][0] && data[0][1]==dataf[1][1]){
			dataf[1][0] = new Random().nextInt(20);
			dataf[1][1] = new Random().nextInt(30);
			count++;
		}else if(data[0][0]==dataf[2][0] && data[0][1]==dataf[2][1]){
			dataf[2][0] = new Random().nextInt(20);
			dataf[2][1] = new Random().nextInt(30);
			count++;
		}else if(data[0][0]==dataf[3][0] && data[0][1]==dataf[3][1]){
			dataf[3][0] = new Random().nextInt(20);
			dataf[3][1] = new Random().nextInt(30);
			count++;
		}else if(data[0][0]==dataf[4][0] && data[0][1]==dataf[4][1]){
			dataf[4][0] = new Random().nextInt(20);
			dataf[4][1] = new Random().nextInt(30);
			count++;
		}else if(data[0][0]==dataf[5][0] && data[0][1]==dataf[5][1]){
			dataf[5][0] = new Random().nextInt(20);
			dataf[5][1] = new Random().nextInt(30);
			count++;
		}
		lab6.setText(Integer.toString(count));

//		for(int n = 5;n>=0;n--){
//			Thread.sleep(1000);
//			lab2.setText(Integer.toString(n));
//			}}
		TimerThread newThread = new TimerThread();
		newThread.start();
//		lab6.setText(Integer.toString(a));
		
		
			

		
		} catch (Exception a) {
			
			JOptionPane.showMessageDialog(null, "撞到牆惹啦!!!!傻B!!!");
			if(count<10){
				JOptionPane.showMessageDialog(null, "爛透了");
			}else if(count>20){
				JOptionPane.showMessageDialog(null, "普通貨色");

			}else if(count>40){
				JOptionPane.showMessageDialog(null, "快成為高手了");
			}else if(count >60){
				JOptionPane.showMessageDialog(null, "您是高手");
			}
			JOptionPane.showMessageDialog(null, "獲得"+count+"分");
			count = 0;
			data[0][0] = 0;
			data[0][1] = 0;
			
			jlabsn[data[0][0]][data[0][1]].setBackground(Color.BLUE);
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

//class timeup extends Exception{
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		int n = 0;
//		for(n = 5;n>=0;n--){
//			Thread.sleep(1000);
//			System.out.println(n);
//	
//	
//	
//		}
//	}
//}


