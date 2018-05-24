package p4;

import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumberWang {

	public static void main(String[] args) {

		random randomObject = new random();
		JFrame frame = new JFrame("GridLayout Test");
		JFrame.setDefaultLookAndFeelDecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		randomObject.setNumbers();
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(3, 3));
		panel.add(new JLabel(randomObject.tosZero()));
		panel.add(new JLabel(randomObject.tosOne()));
		panel.add(new JLabel(randomObject.tosTwo()));
		panel.add(new JLabel(randomObject.tosThree()));
		panel.add(new JLabel(randomObject.tosFour()));
		panel.add(new JLabel(randomObject.tosFive()));
		panel.add(new JLabel(randomObject.tosSix()));
		panel.add(new JLabel(randomObject.tosSeven()));
		panel.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel2 = new Panel();
		panel2.setLayout(new GridLayout(3, 3));
		panel2.add(new JLabel(randomObject.tosZero()));
		panel2.add(new JLabel(randomObject.tosOne()));
		panel2.add(new JLabel(randomObject.tosTwo()));
		panel2.add(new JLabel(randomObject.tosThree()));
		panel2.add(new JLabel(randomObject.tosFour()));
		panel2.add(new JLabel(randomObject.tosFive()));
		panel2.add(new JLabel(randomObject.tosSix()));
		panel2.add(new JLabel(randomObject.tosSeven()));
		panel2.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel3 = new Panel();
		panel3.setLayout(new GridLayout(3, 3));
		panel3.add(new JLabel(randomObject.tosZero()));
		panel3.add(new JLabel(randomObject.tosOne()));
		panel3.add(new JLabel(randomObject.tosTwo()));
		panel3.add(new JLabel(randomObject.tosThree()));
		panel3.add(new JLabel(randomObject.tosFour()));
		panel3.add(new JLabel(randomObject.tosFive()));
		panel3.add(new JLabel(randomObject.tosSix()));
		panel3.add(new JLabel(randomObject.tosSeven()));
		panel3.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel4 = new Panel();
		panel4.setLayout(new GridLayout(3, 3));
		panel4.add(new JLabel(randomObject.tosZero()));
		panel4.add(new JLabel(randomObject.tosOne()));
		panel4.add(new JLabel(randomObject.tosTwo()));
		panel4.add(new JLabel(randomObject.tosThree()));
		panel4.add(new JLabel(randomObject.tosFour()));
		panel4.add(new JLabel(randomObject.tosFive()));
		panel4.add(new JLabel(randomObject.tosSix()));
		panel4.add(new JLabel(randomObject.tosSeven()));
		panel4.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel5 = new Panel();
		panel5.setLayout(new GridLayout(3, 3));
		panel5.add(new JLabel(randomObject.tosZero()));
		panel5.add(new JLabel(randomObject.tosOne()));
		panel5.add(new JLabel(randomObject.tosTwo()));
		panel5.add(new JLabel(randomObject.tosThree()));
		panel5.add(new JLabel(randomObject.tosFour()));
		panel5.add(new JLabel(randomObject.tosFive()));
		panel5.add(new JLabel(randomObject.tosSix()));
		panel5.add(new JLabel(randomObject.tosSeven()));
		panel5.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel6 = new Panel();
		panel6.setLayout(new GridLayout(3, 3));
		panel6.add(new JLabel(randomObject.tosZero()));
		panel6.add(new JLabel(randomObject.tosOne()));
		panel6.add(new JLabel(randomObject.tosTwo()));
		panel6.add(new JLabel(randomObject.tosThree()));
		panel6.add(new JLabel(randomObject.tosFour()));
		panel6.add(new JLabel(randomObject.tosFive()));
		panel6.add(new JLabel(randomObject.tosSix()));
		panel6.add(new JLabel(randomObject.tosSeven()));
		panel6.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel7 = new Panel();
		panel7.setLayout(new GridLayout(3, 3));
		panel7.add(new JLabel(randomObject.tosZero()));
		panel7.add(new JLabel(randomObject.tosOne()));
		panel7.add(new JLabel(randomObject.tosTwo()));
		panel7.add(new JLabel(randomObject.tosThree()));
		panel7.add(new JLabel(randomObject.tosFour()));
		panel7.add(new JLabel(randomObject.tosFive()));
		panel7.add(new JLabel(randomObject.tosSix()));
		panel7.add(new JLabel(randomObject.tosSeven()));
		panel7.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel8 = new Panel();
		panel8.setLayout(new GridLayout(3, 3));
		panel8.add(new JLabel(randomObject.tosZero()));
		panel8.add(new JLabel(randomObject.tosOne()));
		panel8.add(new JLabel(randomObject.tosTwo()));
		panel8.add(new JLabel(randomObject.tosThree()));
		panel8.add(new JLabel(randomObject.tosFour()));
		panel8.add(new JLabel(randomObject.tosFive()));
		panel8.add(new JLabel(randomObject.tosSix()));
		panel8.add(new JLabel(randomObject.tosSeven()));
		panel8.add(new JLabel(randomObject.tosEight()));

		randomObject.setNumbers();
		Panel panel9 = new Panel();
		panel9.setLayout(new GridLayout(3, 3));
		panel9.add(new JLabel(randomObject.tosZero()));
		panel9.add(new JLabel(randomObject.tosOne()));
		panel9.add(new JLabel(randomObject.tosTwo()));
		panel9.add(new JLabel(randomObject.tosThree()));
		panel9.add(new JLabel(randomObject.tosFour()));
		panel9.add(new JLabel(randomObject.tosFive()));
		panel9.add(new JLabel(randomObject.tosSix()));
		panel9.add(new JLabel(randomObject.tosSeven()));
		panel9.add(new JLabel(randomObject.tosEight()));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3, 3));
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		frame.add(panel7);
		frame.add(panel8);
		frame.add(panel9);
		frame.pack();
		frame.setSize(640, 400);
		frame.setVisible(true);
	}

}
