package _07_binary_converter;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField textfield = new JTextField(20);
	
	JButton rightButton = new JButton();
@SuppressWarnings("deprecation")
public void run() {
	frame.add(panel);
	frame.setVisible(true);
	
	rightButton.addActionListener(this);
	rightButton.setText("Enter");
	panel.add(textfield);
	panel.add(label);

	panel.add(rightButton);
	frame.pack();
	frame.setTitle("Binary");
	
	
	
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("hi");
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == rightButton) {
		String x = textfield.getText();
		System.out.println(x);
		String y = convert(x);
		System.out.println(y);
		label.setText(y);
		
}
}
}
