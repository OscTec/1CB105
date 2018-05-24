package p3;
import java.awt.*;
import javax.swing.*;
public class UseTheSource{
	
	
	public static void main(String[] args) {
		
		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(42,-100,100,1);
		JFrame.setDefaultLookAndFeelDecorated(false);
		JFrame frame = new JFrame("GridLayout Test");
		Panel panel = new Panel();
		JSlider slider = new JSlider();
		JSpinner spinner = new JSpinner();
		JComboBox combo = new JComboBox();
		JLabel label = new JLabel("I'm a Label");
		JButton button = new JButton("I'm a button");
		JTextField text = new JTextField("Hello Dave");
		JCheckBox check = new JCheckBox("Check",true);
		JRadioButton radio = new JRadioButton();
		
		
		
		panel.setLayout(new GridLayout(4, 2));
		panel.add(combo);
		panel.add(slider);
		panel.add(spinner);
		spinner.setModel(spinnerModel);
		panel.add(button);
		panel.add(label);
		panel.add(text);
		panel.add(check);
		panel.add(radio);
		
		frame.setLayout(new GridLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
}
