package main_package;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardLayoutEx extends JFrame implements ActionListener {

	
	CardLayout cardLayout;
	JButton b1,b2,b3;
	Container container;
	
	public CardLayoutEx() {
		
		container = getContentPane();
		cardLayout = new CardLayout(40,30);
		
		container.setLayout(cardLayout);
		
		b1 = new JButton("Apple");
		b2 = new JButton("Cat");
		b3 = new JButton("Book");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		container.add(b1);
		container.add(b2);
		container.add(b3);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		cardLayout.next(container);
		
	}

	 
		public static void main(String[] args) {
			
			CardLayoutEx a  = new CardLayoutEx();
			
			a.setSize(400,400);
			a.setVisible(true);
			a.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
}








