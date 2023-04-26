package UIG;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Date;

public class AnwendungMitUhr {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Mein Title");
		
		jf.setSize(200,500);
		
		jf.setBounds(100, 100, 500, 500);
		
		JLabel label = new JLabel();
		label.setText("Halli Hallo, wie gehts denn so :)");
		jf.add(label);  // .add fügt hinzu
		label.setBounds(100, 100, 50, 50);
		
		JLabel label2 = new JLabel("Es ist: " );
		jf.add(label2);
		
		JLabel label3 = new JLabel(String.format("%tT", new Date()));
		jf.add(label3);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame !!
		
		jf.setVisible(true);
		
	
	
	while(true) {
		label3.setText(String.format("%tT", new Date()));
	}

	}
}
