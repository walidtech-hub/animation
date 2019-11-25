// Copyright 2019 Jacob Reola, all rights reserved 

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample {

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
		JButton button,button1, button2, button3,button4;
		button = new JButton("button 1");
		button1 = new JButton("button 2");
		button2 = new JButton("button 3");
		button3 = new JButton("button 4");
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                openWebPage("http://www.pornhub.com");
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
