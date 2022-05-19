/**
 * Import GUI Libraries
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.event.*;

public class Window {
    
    
    /**
     * UID
     */
    private static final long serialVersionUID = 4555917589254575357L;

    
    private JFrame objFrame;
    private JButton btnClick = new JButton("Click me!");
    /**
     * Panels
     */
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel bottomPanel;

    /**
     * Top Panel
     * 2 textfields
     * 2 labels
     */
    private JLabel label1;
    private JLabel label2;

    private JTextField field1;
    private JTextField field2;

    /** Mid Panel */
    private JLabel midLabel;

    /** BottomPanel */
    private JButton btnAdd;
    private JButton btnClear;

    public void setUpGui(){
        /**
         * Set title of Window via JFrame
         */
        objFrame = new JFrame("JAVA GUI Calculator");
        /**
         * Set Size
         */
        objFrame.setSize(500,300);
        
        /**
         * Set Layout
         */
        // objFrame.setLayout(new FlowLayout());
        objFrame.setLayout(new GridLayout(3,1));

        /** Set Up Panels with FlowLayout */
        topPanel = new JPanel(new FlowLayout());

        /** Define and Add Components to Layout */
        label1 = new JLabel("Value #1");
        label2 = new JLabel("Value #2");

        field1 = new JTextField(10);
        field2 = new JTextField(10);

        topPanel.add(label1);
        topPanel.add(field1);
        topPanel.add(label2);
        topPanel.add(field2);

        /**
         * Mid panel
         */
        midLabel = new JLabel("Results : ");

        /** Create mid Panel */
        midPanel = new JPanel(new FlowLayout());
        
        midPanel.add(midLabel);

        /** Bottom Panel */
        btnAdd = new JButton("+");
        btnClear = new JButton("Clear Fields");

        bottomPanel = new JPanel(new FlowLayout());

        bottomPanel.add(btnAdd);
        bottomPanel.add(btnClear);


        /**
         * Add panel to Objframe
         */
        objFrame.add(topPanel);
        objFrame.add(midPanel);
        objFrame.add(bottomPanel);
        

        

        /**
         * Close Window/Terminate Program
         */
        objFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        /**
         * Make sure that window is shown
         */
        objFrame.setVisible(true);
    }

    public void setUpListeners(){
        /**
         * Set up listener for buttons
         */
        ActionListener btnListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(objFrame, "You have clicked me!", "Message From App", JOptionPane.PLAIN_MESSAGE);
            }
        };

        ActionListener clearFieldsListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                field1.setText("");
                field2.setText("");
            }
        };

        /**Attach the Listener to the Button */
        btnClick.addActionListener(btnListener);
        
        btnClear.addActionListener(clearFieldsListener);
    }

    
    public static void main(String[] args) {
        Window windowApp = new Window();
        windowApp.setUpGui();
        windowApp.setUpListeners();
    }

    
}
