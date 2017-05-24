package text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Snakecontor extends Mainframe{
public Snakecontor(){
	jbtnex.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ai){
			System.exit(0);
		}
	});
}
}
