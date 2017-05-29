package text;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Snakecontor extends Mainframe {
	public Snakecontor() {
		int Move = 0;
		jbtnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ai) {
				System.exit(0);
			}
		});
		// this.addKeyListener(new KeyAdapter(){
		// public void KeyPressed(KeyEvent e){
		// int direction = 0;
		// switch(e.getKeyCode()){
		// case KeyEvent.VK_UP:
		// direction = 1;
		// break;
		// case KeyEvent.VK_DOWN:
		// direction = -1;
		// break;
		// case KeyEvent.VK_LEFT:
		// direction = 2;
		// break;
		// case KeyEvent.VK_RIGHT:
		// direction = -2;
		// break;
		// default:
		// break;
		// }
		// Move(direction);
		// }
		// });
		jbtnup.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent a) {
				switch (a.getKeyCode()) {
				case KeyEvent.VK_UP:
					direction = 1;
					break;
				default:
					break;
				}
				Move(direction);
			}
		});
		jbtndown.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent b) {
				switch (b.getKeyCode()) {
				case KeyEvent.VK_DOWN:
					direction = -1;
					break;
				default:
					break;
				}
				Move(direction);
			}
		});
		jbtnleft.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent c) {
				switch (c.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					direction = 2;
					break;
				default:
					break;
				}
				Move(direction);
			}
		});
		jbtnright.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent d) {
				switch (d.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					direction = -2;
					break;
				default:
					break;
				}
				Move(direction);
			}
		});
	}

	protected void Move(int direction) {
		// TODO Auto-generated method stub

	}

}
