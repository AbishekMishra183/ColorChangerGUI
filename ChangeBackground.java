import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class ChangeBackground {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3)); // Set layout for three buttons
        frame.add(panel, BorderLayout.SOUTH); // Add panel to the bottom of the frame

        // Add the panel for changing color
        JPanel colorPanel = new JPanel();
        frame.add(colorPanel, BorderLayout.CENTER);

        // Create buttons
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton yellowButton = new JButton("Yellow");

        // Add action listeners to the buttons
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.RED);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.GREEN);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.YELLOW);
            }
        });

        // Add buttons to the panel
        panel.add(redButton);
        panel.add(greenButton);
        panel.add(yellowButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}