package ch.genevaJug.fooBarQix;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Document;

public class Window extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTextPane textPane = new JTextPane();
    
    public Window () {
        this.setTitle("FooBarQix");
        this.setSize(300,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(new JScrollPane(textPane));
        this.setVisible(true);
    }
    
    public void addValue(String value) {
        Document doc = textPane.getDocument();
        textPane.setCaretPosition(doc.getLength());
        textPane.replaceSelection(value + "\n");
    }
    
}
