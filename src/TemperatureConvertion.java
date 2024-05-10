/********************************************
 * Author: A.S.M.Thasneem 					*
 * Index Number: DSE/21/120					*
 * Title: Temperature Converter				*
 * ******************************************/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConvertion extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConvertion frame = new TemperatureConvertion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TemperatureConvertion() {
		setResizable(false);
		setTitle("\t\t\t\t\t\t\tTemperature Convertion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(30, 11, 133, 33);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JTextArea txtFah = new JTextArea();
		txtFah.setEditable(false);
		txtFah.setBackground(SystemColor.control);
		txtFah.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtFah.setText("Fahrenheit");
		txtFah.setBounds(30, 75, 295, 22);
		contentPane.add(txtFah);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if(!textField1.getText().isEmpty())
				{
					try 
					{
						double celcius = Double.parseDouble(textField1.getText());
						double farenheit = (celcius*1.8) + 32.0;
						
						double farenFinal = Math.round(farenheit*1000)/1000.0; // Round to 3 decimal places;
						
						txtFah.setText(farenFinal+ " Fahrenheit");
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(328, 6, 142, 42);
		contentPane.add(btnNewButton);
		
		
		JTextArea txtrCelcius = new JTextArea();
		txtrCelcius.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrCelcius.setBackground(SystemColor.control);
		txtrCelcius.setText("Celcius");
		txtrCelcius.setBounds(167, 17, 67, 22);
		contentPane.add(txtrCelcius);
		
	}
}
