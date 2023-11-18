import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;


public class WordCount extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WordCount() {
		
        // Setting up JFrame properties
        setTitle("Word Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(getParent());

        // Create and add components
        initComponents();

        // Make the JFrame visible
        setVisible(true);
    }

	/* Function to create JFrame Components */
    private void initComponents() {
    	
        JTextArea textArea = new JTextArea();
        JButton countButton = new JButton("Count Words");
        JLabel resultLabel = new JLabel("Word Count: 0");

        // Set layout manager
        setLayout(new BorderLayout());

        // Add components to the JFrame
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(countButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);

        // Add action listener to the countButton
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                // Get the text from the JTextArea
                String text = textArea.getText();

                // Count words
                int wordCount = countWords(text);

                // Update the resultLabel
                resultLabel.setText("Word Count: " + wordCount);
            }
        });
    }

    /* Function to count words */
    private int countWords(String text) {
    	
        // Implement the logic to count words
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
