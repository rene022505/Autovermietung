import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 27.01.2020
 * @author
 */

public class GUI extends JFrame {
    private JRadioButton mini = new JRadioButton();
    private JRadioButton mittelklasse = new JRadioButton();
    private JRadioButton kleinwagen = new JRadioButton();
    private JRadioButton kombi = new JRadioButton();
    private JLabel streckeLabel = new JLabel();
    private JTextField streckeText = new JTextField();
    private JLabel dauerLabel = new JLabel();
    private JTextField dauerText = new JTextField();
    private JLabel preisOut = new JLabel();
    private JButton preisBerechnen = new JButton();

    public GUI() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 558;
        int frameHeight = 513;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("yeet");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        mini.setBounds(47, 24, 100, 20);
        mini.setOpaque(false);
        cp.add(mini);
        mittelklasse.setBounds(45, 56, 100, 20);
        mittelklasse.setOpaque(false);
        cp.add(mittelklasse);
        kleinwagen.setBounds(49, 89, 100, 20);
        kleinwagen.setOpaque(false);
        cp.add(kleinwagen);
        kombi.setBounds(42, 132, 100, 20);
        kombi.setOpaque(false);
        cp.add(kombi);
        streckeLabel.setBounds(44, 169, 110, 20);
        streckeLabel.setText("text");
        cp.add(streckeLabel);
        streckeText.setBounds(167, 175, 75, 20);
        streckeText.setText("");
        cp.add(streckeText);
        dauerLabel.setBounds(45, 208, 110, 20);
        dauerLabel.setText("text");
        cp.add(dauerLabel);
        dauerText.setBounds(172, 212, 75, 20);
        dauerText.setText("");
        cp.add(dauerText);
        preisOut.setBounds(43, 250, 110, 20);
        preisOut.setText("text");
        cp.add(preisOut);
        preisBerechnen.setBounds(171, 248, 75, 25);
        preisBerechnen.setText("jButton1");
        preisBerechnen.setMargin(new Insets(2, 2, 2, 2));
        preisBerechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            }
        });
        cp.add(preisBerechnen);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

}