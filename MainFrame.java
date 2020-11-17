package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class MainFrame extends JFrame {

    private BigDecimal result = BigDecimal.ZERO;
    private String lastCommand = "=";
    private Boolean start = Boolean.TRUE;

    public MainFrame() {
        setTitle("Calculator");
        setBounds(100, 100, 300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        add(top, BorderLayout.CENTER);
        top.setLayout(new GridLayout(4, 3));
        JPanel bottom = new JPanel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();

        ActionListener command = new CommandActionListener(inputField);

        DigitButtonListener digitButtonListener = new DigitButtonListener(inputField);
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonListener);
            top.add(btn);
        }

        JButton add = new JButton("+");
        add.addActionListener(command);
        top.add(add);
        JButton minus = new JButton("-");
        minus.addActionListener(command);
        top.add(minus);
        JButton multiple = new JButton("*");
        top.add(multiple);
        JButton divide = new JButton("/");
        top.add(divide);
        JButton pow = new JButton("^");
        top.add(pow);
        JButton calc = new JButton("=");
        calc.addActionListener(command);
        top.add(calc);

        bottom.add(inputField, BorderLayout.CENTER);
        JButton clear = new JButton("C");
        clear.addActionListener(new ClearButtonListener(inputField));
        bottom.add(clear, BorderLayout.EAST);

        setVisible(true);

        new ClearButtonListener(inputField);
    }

    public static class ClearButtonListener implements ActionListener {
        private JTextField inputField;

        ClearButtonListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
        }
    }

    public class CommandActionListener implements ActionListener {
        private JTextField inputField;

        CommandActionListener(JTextField inputField) {this.inputField = inputField;}

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    inputField.setText(command);
                    start = false;
                } else lastCommand = command;
            } else {
                calculate(new BigDecimal(inputField.getText()));
                lastCommand = command;
                start = true;
            }
        }
        void calculate(BigDecimal x) {
            switch (lastCommand) {
                case "+":
                    result = result.add(x);
                    break;
                case "-":
                    result = result.subtract(x);
                    break;
                case "=":
                    result = x;
                    break;
            }
            if (result.compareTo(BigDecimal.ZERO) == 0) {
                result = BigDecimal.ZERO;
            }
            inputField.setText(result.toString());
        }
    }

    public class DigitButtonListener implements ActionListener {
        private JTextField inputField;

        DigitButtonListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (start) {
                inputField.setText("");
                start = false;
            }
            StringBuilder sb = new StringBuilder(inputField.getText());
            JButton btn = (JButton) e.getSource();
            sb.append(btn.getText());
            inputField.setText(sb.toString());
        }
    }
}