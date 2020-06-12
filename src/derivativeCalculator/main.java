package derivativeCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class main {

	private JFrame frmDerivativeCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmDerivativeCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDerivativeCalculator = new JFrame();
		frmDerivativeCalculator.setTitle("Derivative Calculator");
		frmDerivativeCalculator.setResizable(false);
		frmDerivativeCalculator.setBounds(100, 100, 960, 720);
		frmDerivativeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmDerivativeCalculator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mode Select");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(52, 48, 150, 25);
		panel.add(lblNewLabel);
		
		JRadioButton powerRuleSelect = new JRadioButton("Power Rule");
		powerRuleSelect.setSelected(true);
		
		buttonGroup.add(powerRuleSelect);
		powerRuleSelect.setBounds(52, 93, 109, 23);
		panel.add(powerRuleSelect);
		
		JRadioButton antiderivativeSelect = new JRadioButton("Quotient Rule");
		buttonGroup.add(antiderivativeSelect);
		antiderivativeSelect.setBounds(52, 129, 109, 23);
		panel.add(antiderivativeSelect);
		
		JRadioButton productRuleSelect = new JRadioButton("Product Rule");
		buttonGroup.add(productRuleSelect);
		productRuleSelect.setBounds(52, 171, 109, 23);
		panel.add(productRuleSelect);
		
		JLabel OutputLBL = new JLabel("Output:");
		OutputLBL.setFont(new Font("Tahoma", Font.PLAIN, 26));
		OutputLBL.setBounds(166, 431, 128, 32);
		panel.add(OutputLBL);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setBounds(304, 410, 423, 75);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(323, 76, 315, 244);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel productRule = new JPanel();
		panel_1.add(productRule, "productRulePane");
		productRule.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(20, 97, 74, 49);
		productRule.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		
		JLabel label_3 = new JLabel("X");
		label_3.setBounds(104, 97, 43, 44);
		productRule.add(label_3);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 46));
		
		JLabel label_4 = new JLabel(".");
		label_4.setBounds(139, 85, 42, 44);
		productRule.add(label_4);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 46));
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(168, 97, 74, 49);
		productRule.add(textField_6);
		
		JLabel label_5 = new JLabel("X");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 46));
		label_5.setBounds(260, 97, 43, 44);
		productRule.add(label_5);
		
		JPanel QuotientRule = new JPanel();
		panel_1.add(QuotientRule, "quotientRulePane");
		QuotientRule.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(72, 62, 74, 49);
		QuotientRule.add(textField_3);
		
		JLabel label = new JLabel("X");
		label.setBounds(156, 62, 43, 44);
		QuotientRule.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 46));
		
		JLabel label_1 = new JLabel("_____");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 46));
		label_1.setBounds(60, 78, 149, 64);
		QuotientRule.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(72, 142, 74, 49);
		QuotientRule.add(textField_4);
		
		JLabel label_2 = new JLabel("X");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 46));
		label_2.setBounds(156, 142, 43, 44);
		QuotientRule.add(label_2);
		
		JPanel powerRule = new JPanel();
		panel_1.add(powerRule, "powerRulePane");
		powerRule.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(42, 103, 86, 47);
		powerRule.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setBounds(138, 103, 43, 44);
		powerRule.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 46));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(181, 56, 98, 44);
		powerRule.add(textField);
		textField.setEnabled(true);
		textField.setEditable(true);
		textField.setText("");
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(662, 195, 89, 37);
		panel.add(btnNewButton);
		
		JLabel lblY = new JLabel("f(x) =");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblY.setBounds(180, 172, 133, 55);
		panel.add(lblY);
		
		CardLayout cardLayout = (CardLayout) panel_1.getLayout();
	    cardLayout.show(panel_1, "powerRulePane");
	    
	    powerRuleSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panel_1, "powerRulePane");
			}
		});
	    
	    antiderivativeSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panel_1, "quotientRulePane");
			}
		});
	    
	    productRuleSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panel_1, "productRulePane");
			}
		});
	    
//	    Calculate big boy
	    btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(powerRuleSelect.isSelected()) {
					System.out.println("powerrule");
					if(Calculate.isNumber(textField_1.getText()) && Calculate.isNumber(textField.getText())) {
						textField_2.setText(Calculate.powerRule(textField_1.getText(),textField.getText()));
					}else {
						JOptionPane.showMessageDialog(null,
							    "Only numbers can be inputed",
							    "Input warning",
							    JOptionPane.WARNING_MESSAGE);
					}
					
				}else if(antiderivativeSelect.isSelected()) {
					System.out.println("quotientrule");
					
					if(Calculate.isNumber(textField_3.getText()) && Calculate.isNumber(textField_4.getText())) {
						textField_2.setText(Calculate.quotientRule(textField_3.getText(),textField_4.getText()));
					}else {
						JOptionPane.showMessageDialog(null,
							    "Only numbers can be inputed",
							    "Input warning",
							    JOptionPane.WARNING_MESSAGE);
					}
				}else {
					System.out.println("product rule");
					
					if(Calculate.isNumber(textField_5.getText()) && Calculate.isNumber(textField_6.getText())) {
						textField_2.setText(Calculate.productRule(textField_5.getText(),textField_6.getText()));
					}else {
						JOptionPane.showMessageDialog(null,
							    "Only numbers can be inputed",
							    "Input warning",
							    JOptionPane.WARNING_MESSAGE);
					}
				}
				
			}
		});
	}
	
}
