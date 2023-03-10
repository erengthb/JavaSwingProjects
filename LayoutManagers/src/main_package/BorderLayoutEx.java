package main_package;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutEx {

	JFrame frame ;
	
	public  BorderLayoutEx() {
		frame = new JFrame("Border Layout");
		
		JButton button  = new JButton("Kuzey");
		JButton button1 = new JButton("Güney");
		JButton button2 = new JButton("Doğu ");
		JButton button3 = new JButton("Batı");
		JButton button4 = new JButton("Merkez");
		
		frame.add(button  ,BorderLayout.CENTER);
		frame.add(button1 ,BorderLayout.NORTH);
		frame.add(button2 , BorderLayout.SOUTH);
		frame.add(button3 ,BorderLayout.EAST);
		frame.add(button4 ,BorderLayout.WEST);
		
		frame.setSize(350,350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		
		new BorderLayoutEx();
	}

}
