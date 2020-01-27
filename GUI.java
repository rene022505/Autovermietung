import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

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
    private JRadioButton mini = new JRadioButton("Mini", true);
    private JRadioButton mittelklasse = new JRadioButton("Mittelklasse");
    private JRadioButton kleinwagen = new JRadioButton("Kleinwagen");
    private JRadioButton kombi = new JRadioButton("Kombi");
    private JLabel streckeLabel = new JLabel();
    private JTextField streckeText = new JTextField();
    private JLabel dauerLabel = new JLabel();
    private JTextField dauerText = new JTextField();
    private JLabel preisOut = new JLabel();
    private JButton preisBerechnen = new JButton();
    private ButtonGroup buttonGroup = new ButtonGroup();

    private HashMap<ButtonModel, Integer> buttonMap = new HashMap<ButtonModel, Integer>();

    public GUI() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 400;
        int frameHeight = 250;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Autovermietung");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        mini.setBounds((int)(frameWidth * 0.1), 20, 100, 20);
        mini.setOpaque(false);
        cp.add(mini);
        mittelklasse.setBounds((int)(frameWidth * 0.6), 20, 100, 20);
        mittelklasse.setOpaque(false);
        cp.add(mittelklasse);
        kleinwagen.setBounds((int)(frameWidth * 0.1), 50, 100, 20);
        kleinwagen.setOpaque(false);
        cp.add(kleinwagen);
        kombi.setBounds((int)(frameWidth * 0.6), 50, 100, 20);
        kombi.setOpaque(false);
        cp.add(kombi);
        streckeLabel.setBounds((int)(frameWidth * 0.1), 80, 110, 20);
        streckeLabel.setText("Strecke");
        cp.add(streckeLabel);
        streckeText.setBounds((int)(frameWidth * 0.25), 80, 75, 20);
        streckeText.setText("");
        cp.add(streckeText);
        dauerLabel.setBounds((int)(frameWidth * 0.1), 110, 110, 20);
        dauerLabel.setText("Dauer");
        cp.add(dauerLabel);
        dauerText.setBounds((int)(frameWidth * 0.25), 110, 75, 20);
        dauerText.setText("");
        cp.add(dauerText);
        preisOut.setBounds((int)(frameWidth * 0.1), 170, 110, 20);
        preisOut.setText("Preis: n/a");
        cp.add(preisOut);
        preisBerechnen.setBounds((int)(frameWidth * 0.1), 140, 120, 25);
        preisBerechnen.setText("Preis berechnen");
        preisBerechnen.setMargin(new Insets(2, 2, 2, 2));
        preisBerechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (buttonMap.get(buttonGroup.getSelection())) {
                    case 1:
                        System.out.println("Mini");
                        break;
                    case 2:
                        System.out.println("Kleinwagen");
                        break;
                    case 3:
                        System.out.println("Mittelklasse");
                        break;
                    case 4:
                        System.out.println("Kombi");
                        break;
                }
            }
        });
        buttonGroup.add(mini);
        buttonMap.put(mini.getModel(), 1);
        buttonGroup.add(mittelklasse);
        buttonMap.put(mittelklasse.getModel(), 3);
        buttonGroup.add(kleinwagen);
        buttonMap.put(kleinwagen.getModel(), 2);
        buttonGroup.add(kombi);
        buttonMap.put(kombi.getModel(), 4);
        cp.add(preisBerechnen);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

}