package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	int five = 5;
	int four = 4;
	Random randy = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {
			int num = five + four;
			JOptionPane.showMessageDialog(null, "5 + 4 = " + num);
		});
		
		randNumber.addActionListener(e -> {
			int randomnum = randy.nextInt();
			JOptionPane.showMessageDialog(null, "random number is " + randomnum);
		});
		
		tellAJoke.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "What do you call a cow with no legs? GROUND BEEF");
		});

		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
