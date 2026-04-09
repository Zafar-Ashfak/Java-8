package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create click Here button and add on window
        JButton button = new JButton("Click Here");
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // <<<<<<<<<<<   Listening events using anonymous class    >>>>>>>>>>>>>>
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button is clicked");
//                JOptionPane.showMessageDialog(null, "Button is clicked!!");
//            }
//        });

        // <<<<<<<<<<<<<<<<<  Listening events using lambda expression  >>>>>>>>>>>>>>>>>>>>
        button.addActionListener((e) -> {
            System.out.println("Button is clicked");
            JOptionPane.showMessageDialog( null,"Button is clicked");
        });

    }



}
