package lab7;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;
public class DemoFrame extends JFrame implements ActionListener{
	JPanel panel;
	
	JButton btnok;
	JTextField txtName;
	
	public DemoFrame() {
		super('title');
	}
   
public void actionPerformed(ActionEvent evt) {
	Object obj=evt.getSource();
	if(obj=btnok) {
		String name=txtName.getText();
		
		JOptionPane.showMessageDialog(this, "button is clicked", Name="+name");
	}
}
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 400);

    JButton button = new JButton("ok!");
    JTextField textField = new JTextField();

    JPanel panel = new JPanel();
    panel.add(button);
    panel.add(textField);
    frame.add(panel);

    frame.setVisible(true);
}