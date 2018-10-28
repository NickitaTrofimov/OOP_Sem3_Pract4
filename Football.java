package ru.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    private int Milan = 0;
    private int Madrid = 0;
    public Football()
    {
        JButton button_1 = new JButton("AC Milan");
        JButton button_2 = new JButton("Real Madrid");
        JLabel lb_1 = new JLabel("Result: 0 X 0");
        JLabel lb_2 = new JLabel("Last Scorer: N/A");
        Label lb_3 = new Label("Winner: Draw");

        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                String str = "Result: " +Milan+ " X " +Madrid;
                lb_1.setText(str);
                str = "Last Scorer: AC Milan";
                lb_2.setText(str);
                if (Milan > Madrid){
                    str = "Winner: AC Milan";
                    lb_3.setText(str);
                }
            }
        });

        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                String str = "Result: " +Milan+ " X " +Madrid;
                lb_1.setText(str);
                str = "Last Scorer: Real Madrid";
                lb_2.setText(str);
                if (Milan < Madrid){
                    str = "Winner: Real Madrid";
                    lb_3.setText(str);
                }
            }
        });

        setLayout(new BorderLayout());

        add(button_1,BorderLayout.WEST);
        add(button_2,BorderLayout.EAST);
        add(lb_3,BorderLayout.SOUTH);
        add(lb_2,BorderLayout.NORTH);
        add(lb_1,BorderLayout.CENTER);

        setSize(300,200);
    }
}
