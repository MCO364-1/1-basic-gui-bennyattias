import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Sum Calculator");
        frame.setVisible(true);

        frame.setLayout(new GridLayout(2,2));
        JTextField text = new JTextField(10);
        frame.add(text);
        text.setText("NUM1 \n(click and press ENTER)");
        JTextField text2 = new JTextField(10);
        frame.add(text2);
        text2.setText("NUM2 \n(click and press ENTER)");
        text.setBackground(Color.PINK);
        text2.setBackground(Color.LIGHT_GRAY);
        JButton button = new JButton("Calculate Sum");
        frame.add(button);
        button.setBackground(Color.YELLOW);
        JLabel label = new JLabel("     ");
        label.setFont(new Font("Serif", Font.BOLD, 50));
        frame.add(label);
        text.setFont(new Font("Serif", Font.PLAIN, 50));
        text2.setFont(new Font("Serif", Font.PLAIN, 50));

        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        text2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text2.setText("");
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = text.getText();
                String num2 = text2.getText();
                double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                label.setText(String.valueOf(result));
            }
        });

    }
}