import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(300, 250, 400, 300);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JLabel num1 = new JLabel("Enter First Number:");
        num1.setBounds(10, 20, 150, 25);
        c.add(num1);
        JTextField firstnum = new JTextField(20);
        firstnum.setBounds(160, 20, 165, 25);
        c.add(firstnum);

        JLabel num2 = new JLabel("Enter Second Number:");
        num2.setBounds(10, 50, 150, 25);
        c.add(num2);
        JTextField secondnum = new JTextField(20);
        secondnum.setBounds(160, 50, 165, 25);
        c.add(secondnum);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 80, 150, 25);
        c.add(resultLabel);
        JTextField resultField = new JTextField(20);
        resultField.setBounds(160, 80, 165, 25);
        resultField.setEditable(false);
        c.add(resultField);

        JButton addButton = new JButton("+");
        addButton.setBounds(10, 120, 50, 25);
        c.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstnum.getText());
                double num2 = Double.parseDouble(secondnum.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            }
        });

        JButton subButton = new JButton("-");
        subButton.setBounds(100, 120, 50, 25);
        c.add(subButton);
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstnum.getText());
                double num2 = Double.parseDouble(secondnum.getText());
                double result = num1 - num2;
                resultField.setText(Double.toString(result));
            }
        });

        JButton divideButton = new JButton("/");
        divideButton.setBounds(210, 120, 50, 25);
        c.add(divideButton);
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstnum.getText());
                double num2 = Double.parseDouble(secondnum.getText());
                if (num2 == 0) {
                    resultField.setText("Cannot divide by zero");
                } else {
                    double result = num1 / num2;
                    resultField.setText(Double.toString(result));
                }
            }
        });

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(300, 120, 50, 25);
        c.add(multiplyButton);
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firstnum.getText());
                double num2 = Double.parseDouble(secondnum.getText());
                double result = num1 * num2;
                resultField.setText(Double.toString(result));
            }
        });

        jf.setVisible(true);
    }
}
