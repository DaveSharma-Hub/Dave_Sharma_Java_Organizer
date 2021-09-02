package DOP;

import javax.swing.*;  
public class Message {  
	JFrame f;  
	Message(String tmp){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,tmp);  
	}
}