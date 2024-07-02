import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField Screen;
    private JRadioButton onRadioButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divideButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton mulButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton minusButton;
    private JButton clearButton;
    private JButton a0Button;
    private JButton dotButton;
    private JButton equalsButton;
    private JButton plusButton;
    private JButton clButton;
    private JRadioButton offRadioButton;

    public Calculator() {
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen.setText("9");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen.setText("8");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen.setText("7");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen.setText("6");
            }
        });
    }
}
