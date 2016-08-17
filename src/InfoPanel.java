import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class InfoPanel {

	public static void createGUI(){
		JFrame frame = new JFrame("PFRPG Character Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));

        //Create a label to put in the content pane.
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(new Color(255, 255, 255));
        label.setPreferredSize(new Dimension(200, 180));
        

        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        //Add panels
        frame.add(new HealthPanel());
        frame.add(new BaseStatPanel());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
