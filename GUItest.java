package sprint0;

import java.awt.*;

import javax.swing.*;

public class GUItest {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JLabel line1 = new JLabel("Test GUI");
		line1.setBounds(10,5,100,10);
		frame.add(line1);
		
		Checkbox check1 = new Checkbox("Does this work?");
		check1.setBounds(30,5,120,50);
		frame.add(check1);
		
		JRadioButton rad1 = new JRadioButton();
		JRadioButton rad2 = new JRadioButton();
		JButton jButton = new JButton("Click");
		ButtonGroup rad = new ButtonGroup();
		JLabel line2 = new JLabel("Are You?");
		rad1.setText("Him");
		rad2.setText("Her");
		rad1.setBounds(50,100,50,20);
		rad2.setBounds(120,100,50,20);
		jButton.setBounds(40, 5, 100, 50);
		line2.setBounds(80, 65, 60, 50);
		frame.add(rad1);
		frame.add(rad2);
		frame.add(line2);
		
		rad.add(rad1);
		rad.add(rad2);
		
		JSeparator drawLine = new JSeparator();
		drawLine.setBounds(0,140,400,50);
		frame.add(drawLine);
	}
}
