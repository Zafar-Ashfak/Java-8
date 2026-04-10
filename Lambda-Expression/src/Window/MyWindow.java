package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");

        // create button and add on the window
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button is clicked");
                JOptionPane.showMessageDialog(null,"Button is clicked");
            }
        });

        frame.add(button);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 250);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
