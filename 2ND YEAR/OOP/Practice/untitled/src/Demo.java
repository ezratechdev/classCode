// Java program to show JRadioButton Example.
// in java. Importing different Package.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Demo extends JFrame {

    // Declaration of object of JRadioButton class.
    JRadioButton jRadioButton1;

    // Declaration of object of JRadioButton class.
    JRadioButton jRadioButton2;

    // Declaration of object of JButton class.
    JButton jButton;

    // Declaration of object of ButtonGroup class.
    ButtonGroup G1;

    // Declaration of object of JLabel class.
    JLabel L1;
    private JTextField textField1;
    private JButton clickMeButton;

    // Constructor of Demo class.
    public Demo()
    {

        // Setting layout as null of JFrame.
        this.setLayout(null);

        // Initialization of object of "JRadioButton" class.
        jRadioButton1 = new JRadioButton();

        // Initialization of object of "JRadioButton" class.
        jRadioButton2 = new JRadioButton();

        // Initialization of object of "JButton" class.
        jButton = new JButton("Click");

        // Initialization of object of "ButtonGroup" class.
        G1 = new ButtonGroup();

        // Initialization of object of " JLabel" class.
        L1 = new JLabel("Bit");

        // setText(...) function is used to set text of radio button.
        // Setting text of "jRadioButton2".
        jRadioButton1.setText("One");

        // Setting text of "jRadioButton4".
        jRadioButton2.setText("Two");

        // Setting Bounds of "jRadioButton2".
        jRadioButton1.setBounds(120, 30, 120, 50);

        // Setting Bounds of "jRadioButton4".
        jRadioButton2.setBounds(250, 30, 80, 50);

        // Setting Bounds of "jButton".
        jButton.setBounds(125, 90, 80, 30);

        // Setting Bounds of JLabel "L2".
        L1.setBounds(20, 30, 150, 50);

        // "this" keyword in java refers to current object.
        // Adding "jRadioButton2" on JFrame.
        this.add(jRadioButton1);

        // Adding "jRadioButton4" on JFrame.
        this.add(jRadioButton2);

        // Adding "jButton" on JFrame.
        this.add(jButton);

        // Adding JLabel "L2" on JFrame.
        this.add(L1);

        // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2".
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                jRadioButton1.setText((G1.getButtonCount()));
            }
        });
    }
}

class RadioButton {
    // Driver code.
    public static void main(String args[])
    { // Creating object of demo class.
        Demo f = new Demo();

        // Setting Bounds of JFrame.
        f.setBounds(100, 100, 400, 200);

        // Setting Title of frame.
        f.setTitle("RadioButtons");

        // Setting Visible status of frame as true.
        f.setVisible(true);
    }
}
