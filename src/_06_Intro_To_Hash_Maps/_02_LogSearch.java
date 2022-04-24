package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	

	HashMap<Integer, String> log;
	
	public void run(){
		log = new HashMap<Integer, String>();
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button1.setText("Add Entry");
		button2.setText("Search ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		frame.pack();
	}
    /*
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==button1) {
			String input = JOptionPane.showInputDialog("Enter an ID number");
			int ID = Integer.parseInt(input);
			String name = JOptionPane.showInputDialog("Enter a name");
			log.put(ID, name);
		}
		if(arg0.getSource()==button2) {
			int input = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
			
				if(log.containsKey(input)){
					JOptionPane.showMessageDialog(null, log.get(input));
				}
				else {
					JOptionPane.showMessageDialog(null, "Entry does not exist");
				}
			
		}
		if(arg0.getSource() == button3) {
			String output = "";
			for(Integer ID: log.keySet()) {
				output += "ID: " + ID + " Name: " + log.get(ID) + "\n";
			}
			JOptionPane.showMessageDialog(null, output);
		}
		if(arg0.getSource() == button4) {
			int input = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
			if(log.containsKey(input)) {
				log.remove(input, log.get(input));
			}
			else {
				JOptionPane.showMessageDialog(null, "Entry does not exist");
			}
		}
			
	}
}
