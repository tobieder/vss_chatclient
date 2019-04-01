package VSS_uebung02_a2;

// This is a test to show the github push feature.

import java.awt.*;
import javax.swing.*;

public class VSS_uebung02_a2 extends JFrame 
{
	
	public static final long serialVersionUID = 1L;
	private JTextArea text;

  public static void main(String[] args) 
  {
	  SwingUtilities.invokeLater(new Runnable() {
		  public void run()
		  {
			  new VSS_uebung02_a2();
		  }
	  });
  }
	
  public VSS_uebung02_a2()
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
