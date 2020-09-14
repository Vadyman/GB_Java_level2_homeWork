package homeWork_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {
    public Chat() {
        setTitle("VadymanChat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(new Rectangle(500, 100, 300, 300));
        setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("Сообщение:");

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(0, 2));
        JTextField inputField2 = new JTextField();
        inputField2.setEditable(true);
        bottom.add(inputField2);

        JButton sendButton = new JButton("SEND");
        sendButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField2.getText();
                inputField.setText(message);
                inputField2.setText("");
            }
        });

        add(top);
        add(bottom);
        bottom.add(sendButton);
        setVisible(true);
    }

}
