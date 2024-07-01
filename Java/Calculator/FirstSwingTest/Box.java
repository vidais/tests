// Based on Tutorial available at https://www.javatpoint.com/java-swing

import javax.swing.*;

public class Box{
	public static void main(String[] args){
		JFrame f = new JFrame(); //Creating a window
		JButton b = new JButton("click"); //Creating a button. The text is what is placed on the button
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		b.setBounds(130,100,100,40); //X placement, Y placement, width, height
		f.add(b);
	}
}
