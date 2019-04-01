package VSS_uebung02_a2;

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
			  new uebung02_a2_ChatClient();
		  }
	  });
  }

  public uebung02_a2_ChatClient()
  {
	  super("ChatClient");
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
