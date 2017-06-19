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
import java.util.Timer;
import java.util.TimerTask;

public class Mainframe extends JFrame implements KeyListener {
	private Label lab = new Label("Greedy Node");
	private Label lab2 = new Label("Time");

	private Label lab5 = new Label("point:");
	private Label lab6 = new Label("0");

	private JLabel jlabsn[][] = new JLabel[20][30];
	private int data[][] = new int[1][2];
	private int dataf[][] = new int[10][2];
	private JPanel jpmid = new JPanel(new GridLayout(20, 30, 0, 0));// 中間盤子

	private JPanel jplavel = new JPanel(new GridLayout(1, 2, 3, 3));// 級數盤子

	private JPanel jptop = new JPanel(new GridLayout(2, 1, 5, 5));// 最上面盤子
	private Font font1 = new Font(null, Font.PLAIN, 30);
	private Container cp;
	private int count = 0;
	private int t = 60;

	public Mainframe() {
		init();
	}

	private void init() {
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lab.setBackground(new Color(136,0,255));
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
		Timer time = new Timer();
		time.schedule(new Timeup(), 1000, 1000);
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
		dataf[6][0] = 9;
		dataf[6][1] = 12;
		dataf[7][0] = 16;
		dataf[7][1] = 17;
		dataf[8][0] = 8;
		dataf[8][1] = 15;
		dataf[9][0] = 19;
		dataf[9][1] = 20;
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 30; j++) {
				jlabsn[i][j] = new JLabel();
				jlabsn[i][j].setBackground(Color.black);
				jlabsn[i][j].setOpaque(true);
				jpmid.add(jlabsn[i][j]);
			}
		}

		
		jlabsn[data[0][0]][data[0][1]].setBackground(new Color(255,255,255));
		
		

	}
	

	@Override
	public void keyPressed(KeyEvent arg0) {

		System.out.println(count);

		// TODO Auto-generated method stub
		try {
			switch (arg0.getKeyCode()) {
			case KeyEvent.VK_UP:
				data[0][0]--;
				break;
			case KeyEvent.VK_DOWN:
				data[0][0]++;
				break;
			case KeyEvent.VK_RIGHT:
				data[0][1]++;
				break;
			case KeyEvent.VK_LEFT:
				data[0][1]--;
				break;
			default:
				break;
			}
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 30; j++) {
					jlabsn[i][j].setBackground(Color.black);
					jlabsn[i][j].setOpaque(true);
				}
			}

			jlabsn[dataf[0][0]][dataf[0][1]].setBackground(Color.YELLOW);
			jlabsn[dataf[1][0]][dataf[1][1]].setBackground(Color.green);
			jlabsn[dataf[2][0]][dataf[2][1]].setBackground(Color.red);
			jlabsn[dataf[3][0]][dataf[3][1]].setBackground(Color.pink);
			jlabsn[dataf[4][0]][dataf[4][1]].setBackground(new Color(92,173,173));
			jlabsn[dataf[5][0]][dataf[5][1]].setBackground(Color.orange);
			jlabsn[dataf[6][0]][dataf[6][1]].setBackground(new Color(184,255,77));
			jlabsn[dataf[7][0]][dataf[7][1]].setBackground(new Color(173, 214, 255));
			jlabsn[dataf[8][0]][dataf[8][1]].setBackground(new Color(28, 253, 155));
			jlabsn[dataf[9][0]][dataf[9][1]].setBackground(new Color(136, 0, 255));

			jlabsn[data[0][0]][data[0][1]].setBackground(new Color(255,255,255));
			
			
			if (data[0][0] == dataf[0][0] && data[0][1] == dataf[0][1]) {
				dataf[0][0] = new Random().nextInt(20);
				dataf[0][1] = new Random().nextInt(30);
				count++;
			} else if (data[0][0] == dataf[1][0] && data[0][1] == dataf[1][1]) {
				dataf[1][0] = new Random().nextInt(20);
				dataf[1][1] = new Random().nextInt(30);
				count++;
			} else if (data[0][0] == dataf[2][0] && data[0][1] == dataf[2][1]) {
				dataf[2][0] = new Random().nextInt(20);
				dataf[2][1] = new Random().nextInt(30);
				count++;
			} else if (data[0][0] == dataf[3][0] && data[0][1] == dataf[3][1]) {
				dataf[3][0] = new Random().nextInt(20);
				dataf[3][1] = new Random().nextInt(30);
				count++;
			} else if (data[0][0] == dataf[4][0] && data[0][1] == dataf[4][1]) {
				dataf[4][0] = new Random().nextInt(20);
				dataf[4][1] = new Random().nextInt(30);
				count++;
			} else if (data[0][0] == dataf[5][0] && data[0][1] == dataf[5][1]) {
				dataf[5][0] = new Random().nextInt(20);
				dataf[5][1] = new Random().nextInt(30);
				count++;
			}else if (data[0][0] == dataf[6][0] && data[0][1] == dataf[6][1]) {
				dataf[6][0] = new Random().nextInt(20);
				dataf[6][1] = new Random().nextInt(30);
				count++;
			}else if (data[0][0] == dataf[7][0] && data[0][1] == dataf[7][1]) {
				dataf[7][0] = new Random().nextInt(20);
				dataf[7][1] = new Random().nextInt(30);
				count++;
			}else if (data[0][0] == dataf[8][0] && data[0][1] == dataf[8][1]) {
				dataf[8][0] = new Random().nextInt(20);
				dataf[8][1] = new Random().nextInt(30);
				count++;
			}else if (data[0][0] == dataf[9][0] && data[0][1] == dataf[9][1]) {
				dataf[9][0] = new Random().nextInt(20);
				dataf[9][1] = new Random().nextInt(30);
				count++;
			}
			lab6.setText(Integer.toString(count));

			

		} catch (Exception a) {

			JOptionPane.showMessageDialog(null, "撞到牆惹啦!!!!傻B!!!");
			if (count < 10) {
				JOptionPane.showMessageDialog(null, "爛透了");
			} else if (count > 20 && count <30) {
				JOptionPane.showMessageDialog(null, "普通貨色");

			} else if (count > 30 && count <50) {
				JOptionPane.showMessageDialog(null, "快成為高手了");
			} else if (count > 50) {
				JOptionPane.showMessageDialog(null, "您是高手");
			}
			JOptionPane.showMessageDialog(null, "獲得" + count + "分");
			count = 0;
			data[0][0] = 0;
			data[0][1] = 0;

			jlabsn[data[0][0]][data[0][1]].setBackground(new Color(255,255,255));
			
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
	class Timeup extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(t>=0){
			lab2.setText(String.valueOf(t--));
		}
		if(t==0){
			if (count < 10) {
				JOptionPane.showMessageDialog(null, "爛透了");
			} else if (count > 20 && count<30) {
				JOptionPane.showMessageDialog(null, "普通貨色");

			} else if (count > 40 && count<50) {
				JOptionPane.showMessageDialog(null, "快成為高手了");
			} else if (count > 50 ) {
				JOptionPane.showMessageDialog(null, "您是高手");
			}
			JOptionPane.showMessageDialog(null, "獲得" + count + "分");
			data[0][0] = 0;
			data[0][1] = 0;

			jlabsn[data[0][0]][data[0][1]].setBackground(new Color(255,255,255));
			
			count = 0;
			t = 60;
		}
		
	}

}
}



