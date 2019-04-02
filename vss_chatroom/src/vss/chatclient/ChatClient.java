package vss.chatclient;

import java.awt.*;
import javax.swing.*;


public class ChatClient extends JFrame{
	
	public static final long serialVersionUID = 1L;
	private JTextArea text;

  public static void main(String[] args) 
  {
	  final String server, user;
	  
	  if((server = (String) JOptionPane.showInputDialog(null, "Please enter your chat server.", "ChatClient", JOptionPane.QUESTION_MESSAGE, null, null, "localhost")) == null || server.equals("")) return;
	  if((user = (String) JOptionPane.showInputDialog(null, "Please enter your username.", "ChatClient", JOptionPane.QUESTION_MESSAGE, null, null, "smf")) == null) return;
	  SwingUtilities.invokeLater(new Runnable() {
		  public void run()
		  {
			  new ChatClient();
		  }
	  });
  }
	
  public ChatClient()
  {
	  super("Test");
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  setLayout(new BorderLayout());
	  add(text=new JTextArea(), BorderLayout.CENTER);
	  text.setPreferredSize(new Dimension(400, 300));
	  JPanel bottom=new JPanel();
	  bottom.setLayout(new BorderLayout());
	  bottom.add(new JTextField(), BorderLayout.CENTER);
	  bottom.add(new JButton("send"), BorderLayout.EAST);
	  add(bottom, BorderLayout.SOUTH);
	  pack();
	  setVisible(true);
  }
}
