package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	String newName;
	ArrayList<String> names = new ArrayList<String>();
	int number = 0;
	String text = "";
	
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	public void run() {
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	
	button.setText("Add Name");
	button2.setText("View Names");
	frame.pack();
	button.addActionListener(this);
	button2.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(button == arg0.getSource()) {
			newName = JOptionPane.showInputDialog("Add a name");
			number+=1;
			names.add("Guest #" + number + ": " + newName + "\n");
		}
		else if(button2 == arg0.getSource()) {
			text = "";
			for(int i=0; i<names.size(); i++) {
			text += names.get(i);
		}
			JOptionPane.showMessageDialog(null, text);
	}
}
}
