import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Exercise5_1 {

	private JFrame frame;
	private JTextField input1TextField; //c as input num 1
	private JTextField input2TextField; //d as input num 2
	private JTextField TotalAnsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5_1 window = new Exercise5_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercise5_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 896, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		input1TextField = new JTextField();
		input1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		input1TextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		input1TextField.setBounds(129, 79, 195, 69);
		frame.getContentPane().add(input1TextField);
		input1TextField.setColumns(10);
		
		input2TextField = new JTextField();
		input2TextField.setHorizontalAlignment(SwingConstants.CENTER);
		input2TextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		input2TextField.setColumns(10);
		input2TextField.setBounds(548, 79, 195, 69);
		frame.getContentPane().add(input2TextField);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setForeground(Color.WHITE);
		AddButton.setBackground(Color.BLUE);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int c,d,answer; 
				try {					
					c = Integer.parseInt(input1TextField.getText());
					d = Integer.parseInt(input2TextField.getText());
					
					answer = c + d;
					TotalAnsTextField.setText(Integer.toString(answer));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the valid number!");
				}
			}
		});
		AddButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		AddButton.setBounds(129, 229, 195, 74);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.setForeground(Color.WHITE);
		MinusButton.setBackground(Color.MAGENTA);
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int c,d,answer; 
				try {					
					c = Integer.parseInt(input1TextField.getText());
					d = Integer.parseInt(input2TextField.getText());
					
					answer = c - d;
					TotalAnsTextField.setText(Integer.toString(answer));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the valid number!");
				}
			}
		});
		MinusButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		MinusButton.setBounds(548, 229, 195, 74);
		frame.getContentPane().add(MinusButton);
		
		JLabel AnswerLabel = new JLabel("The answer is");
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		AnswerLabel.setBounds(175, 379, 233, 69);
		frame.getContentPane().add(AnswerLabel);
		
		TotalAnsTextField = new JTextField();
		TotalAnsTextField.setHorizontalAlignment(SwingConstants.CENTER);
		TotalAnsTextField.setFont(new Font("Tahoma", Font.BOLD, 28));
		TotalAnsTextField.setBounds(389, 376, 296, 89);
		frame.getContentPane().add(TotalAnsTextField);
		TotalAnsTextField.setColumns(10);
	}
}
