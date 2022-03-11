import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TextEditor extends JFrame implements ActionListener{

	JTextArea textArea;
	JScrollPane scrollPane;
	JSpinner spinner;
	
	TextEditor(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Text Editor");
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(350,350));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		spinner = new JSpinner();
		spinner.setPreferredSize(new Dimension(50,25));
		spinner.setValue(20);
		spinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				textArea.setFont(new Font(textArea.getFont().getFamily(), Font.PLAIN, (int) spinner.getValue()));
				
			}
			
			
		});
		
		this.add(spinner);
		this.add(scrollPane);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
