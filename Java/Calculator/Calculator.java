import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton buttonAdd = new JButton();
		JButton buttonSub = new JButton();
		JButton buttonMul = new JButton();
		JButton buttonDiv = new JButton();
		JButton buttonExit = new JButton();
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		buttonAdd.setBounds(228,100,100,40);
		buttonSub.setBounds(330,100,100,40);
		buttonMul.setBounds(130,100,100,40);
		buttonDiv.setBounds(30,100,100,40);
		buttonExit.setBounds(30,50,100,40);

		frame.add(buttonAdd);
		frame.add(buttonSub);
		frame.add(buttonMul);
		frame.add(buttonDiv);
		frame.add(buttonExit;

	}
	public void actionPerformed(ActionEvent event){
		JButton button = (JButton) event.getSource();
		exitPressed();
	}
	private void exitPressed() {
		System.exit(0);
	}
}


