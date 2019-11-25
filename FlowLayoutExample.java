// Copyright 2019 Jacob Reola, all rights reserved 

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample {

    // needed for URL link
    public void openWebPage(String url){
        try {
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }

        catch (java.io.IOException e) {
        System.out.println(e.getMessage());
   }
}

	FlowLayoutExample(){
		JFrame frame = new JFrame("Flow Layout");

        // designing button
		JButton button,button1, button2, button3,button4;

        // creating button
		button = new JButton("Animation");
		button1 = new JButton("Video");
		button2 = new JButton("button 3");
		button3 = new JButton("button 4");
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

        // button 1 link
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                openWebPage("");    // PUT YOUR WEBSITE HERE!!!!
            }
        });

        // button 1 link
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                openWebPage("https://youtu.be/Re457SbYWLs");
            }
        });

		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutExample();
	}
}
