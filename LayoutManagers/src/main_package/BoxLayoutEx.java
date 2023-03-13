package main_package;


import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;


public class BoxLayoutEx  extends Frame{
	
    JButton[] buttons;

	public  BoxLayoutEx() {
		
		buttons = new JButton[8];
			
		for (int i = 0 ; i<buttons.length; i++ ) {
			
			buttons[i] = new JButton("Button "+ (i+1));
			add(buttons[i]);
			
		}
				
	addWindowListener(new WindowListener() {
			
		@Override
		public void windowClosing(WindowEvent e) {
		System.exit(0);;
			
		}

	});	
	
	
	setLayout(new BoxLayout(this , BoxLayout.Y_AXIS));
	setSize(350,350);
    setVisible(true);
				
	}
    
	public static void main(String[] args) {
		
		new BoxLayoutEx();
	}
}
