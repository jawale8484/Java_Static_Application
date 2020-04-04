package printstudent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.GridBagConstraints;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

public class printstudentRec {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					printstudentRec window = new printstudentRec();
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
	public printstudentRec() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1360, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 28, 1270, 85);
		frame.getContentPane().add(panel);
		
		
		JLabel lblStudentRecords = new JLabel("Student Records");
		lblStudentRecords.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblStudentRecords);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		textArea.setBounds(825, 150, 474, 433);
		textArea.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(269, 157, 324, 26);
		textField.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setBounds(269, 208, 324, 26);
		textField_1.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setBounds(269, 259, 324, 26);
		textField_2.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setBounds(269, 316, 324, 26);
		textField_3.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Refrance No");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(81, 157, 293, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Course Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(81, 213, 293, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCourseTitle = new JLabel("Course Title");
		lblCourseTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourseTitle.setBounds(81, 259, 293, 20);
		frame.getContentPane().add(lblCourseTitle);
		
		JLabel lblStudentId = new JLabel("Student Id");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentId.setBounds(81, 316, 293, 20);
		frame.getContentPane().add(lblStudentId);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(269, 376, 324, 26);
		textField_4.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_4);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentName.setBounds(81, 379, 293, 20);
		frame.getContentPane().add(lblStudentName);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNumber.setBounds(81, 536, 512, 20);
		frame.getContentPane().add(lblMobileNumber);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(269, 533, 324, 26);
		textField_5.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(269, 426, 324, 26);
		textField_6.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(269, 482, 324, 32);
		textField_7.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		frame.getContentPane().add(textField_7);
		
		JLabel lblDob = new JLabel("D.O.B.");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDob.setBounds(91, 429, 293, 20);
		frame.getContentPane().add(lblDob);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(81, 488, 293, 20);
		frame.getContentPane().add(lblAddress);
		
		JButton btnNewButton = new JButton("Add Records");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\t\t Student Records \n\n "+
			"=================================================="+
			"Refrance Number :-\t\t"+textField.getText()+"\n\n"+
			"Course Code :-\t\t"+textField_1.getText()+"\n\n"+
			"Course Title :-\t\t"+textField_2.getText()+"\n\n"+
			"Student Id :-\t\t"+textField_3.getText()+"\n\n"+
			"Student Name :-\t\t"+textField_4.getText()+"\n\n"+
			"D.O.B. :-\t\t"+textField_7.getText()+"\n\n"+
			"Address :-\t\t"+textField_6.getText()+"\n\n"+
			"Mobile Number :-\t"+textField_5.getText()+"\n"
						);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(81, 609, 199, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPrint.setBounds(373, 609, 189, 45);
		frame.getContentPane().add(btnPrint);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				
				
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(865, 609, 189, 45);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame();
				if(JOptionPane.showConfirmDialog(frame,"Conform if you want to exits","Print Sysyem",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(1105, 609, 189, 45);
		frame.getContentPane().add(btnExit);
		
		
	}
}
