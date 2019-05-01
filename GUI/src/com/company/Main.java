package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        Runnable guiObj = new Runnable()
        {
            @Override
            public void run()
            {
                makeGui();
            }
        };
        SwingUtilities.invokeLater(guiObj);
    }

    public static void makeGui()
    {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        JLabel lable = new JLabel("Hi How r u?");
        frame.getContentPane().add(lable);
        frame.pack();
        frame.setVisible(true);
    }
}
