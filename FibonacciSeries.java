// public class fibonacci {
    

// }
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FibonacciSeries extends JFrame {

    // Components
    private JTextField inputField;
    private JTextArea resultArea;
    private JButton calculateButton;

    public FibonacciSeries() {
        // Set up the frame
        setTitle("Fibonacci Series");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Input Label
        JLabel inputLabel = new JLabel("Enter number of terms:");
        inputLabel.setBounds(20, 20, 150, 25);
        add(inputLabel);

        // Input Field
        inputField = new JTextField();
        inputField.setBounds(180, 20, 150, 25);
        add(inputField);

        // Calculate Button
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150, 60, 100, 25);
        add(calculateButton);

        // Result Area
        resultArea = new JTextArea();
        resultArea.setBounds(20, 100, 340, 140);
        resultArea.setEditable(false);
        add(resultArea);

        // Button action
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFibonacci();
            }
        });
    }

    private void calculateFibonacci() {
        resultArea.setText("");
        try {
            int n = Integer.parseInt(inputField.getText());
            if (n <= 0) {
                resultArea.setText("Please enter a positive integer.");
                return;
            }

            // Generate Fibonacci series
            StringBuilder sb = new StringBuilder();
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                sb.append(a).append(" ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            resultArea.setText(sb.toString());
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input! Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FibonacciSeries().setVisible(true);
            }
        });
    }
}

