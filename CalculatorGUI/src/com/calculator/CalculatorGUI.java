import java.awt.EventQueue;

// Import User Interface
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

// Import component JFrame
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField txtInterface; // Output Interface
	
	private ButtonGroup bg = new ButtonGroup(); // Membuat class agar on/off menjadi satu grup
	
	// Create variabel Jbutton 0 - 10
	private javax.swing.JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	// Create RadioButton untuk On dan Off
	private javax.swing.JRadioButton rdBtnOn, rdbtnOff;
	// Create Operator
	private javax.swing.JButton btnPlus, btnMinus, btnPembagian, btnExit, btnPerkalian, btnRes;
	// Create Fitur
	private javax.swing.JButton btnBack, btnClear;
	// Create Label
	private javax.swing.JLabel lblJudul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI(); // Membuat class window
					window.frame.setVisible(true); // Disini berfungsi untuk menampilkan GUI
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double ans, num;
	int cmd;
	
	public void operatorAritmatika() {
		switch (cmd){
			case 1: // Addition
				ans = num + Double.parseDouble(txtInterface.getText());
				txtInterface.setText(Double.toString(ans));
				break;
			
			case 2: // Substraction
				ans = num - Double.parseDouble(txtInterface.getText());
				txtInterface.setText(Double.toString(ans));
				break;
			
			case 3: // Multiplication
				ans = num * Double.parseDouble(txtInterface.getText());
				txtInterface.setText(Double.toString(ans));
				break;
				
			case 4: // Division
				ans = num / Double.parseDouble(txtInterface.getText());
				txtInterface.setText(Double.toString(ans));
				break;
				
		}
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
		Enable();
	}
	
	// Create RadioButton Off
	public void disable(){
		txtInterface.setEnabled(false);
		
		rdbtnOff.setEnabled(false); // Off button Disable
		rdBtnOn.setEnabled(true);   // On button Enable
		
		btn0.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btnPlus.setEnabled(false);
		btnMinus.setEnabled(false);
		btnPembagian.setEnabled(false);
		btnPerkalian.setEnabled(false);
		btnClear.setEnabled(false);
		btnBack.setEnabled(false);
		btnRes.setEnabled(false);
		txtInterface.setText("");
	}
	
	// Create RadioButton On
	public void Enable() {
		txtInterface.setEnabled(true);
		
		rdBtnOn.setEnabled(false); // On button Disable
		rdbtnOff.setEnabled(true); // Off button Enable
		
		btn0.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btnPlus.setEnabled(true);
		btnMinus.setEnabled(true);
		btnPembagian.setEnabled(true);
		btnPerkalian.setEnabled(true);
		btnClear.setEnabled(true);
		btnBack.setEnabled(true);
		btnRes.setEnabled(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 358, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtInterface = new JTextField();
		txtInterface.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtInterface.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInterface.setBounds(10, 37, 322, 41);
		frame.getContentPane().add(txtInterface);
		txtInterface.setColumns(10);
		
		lblJudul = new JLabel("");
		lblJudul.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJudul.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJudul.setBounds(198, 11, 134, 23);
		frame.getContentPane().add(lblJudul);
		
		btnBack = new JButton("←");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = txtInterface.getText().length();
				int number = txtInterface.getText().length() - 1;
				String store;
				
				if(len > 0) {
					StringBuilder back = new StringBuilder(txtInterface.getText());
					back.deleteCharAt(number);
					store = back.toString();
					//System.out.println(store);
					txtInterface.setText(store);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(98, 89, 56, 48);
		frame.getContentPane().add(btnBack);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(10, 89, 56, 48);
		frame.getContentPane().add(btnClear);
		
		btnRes = new JButton("=");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorAritmatika();
				lblJudul.setText("");
			}
		});
		btnRes.setBackground(SystemColor.textHighlight);
		btnRes.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRes.setBounds(187, 366, 145, 48);
		frame.getContentPane().add(btnRes);
		
		rdBtnOn = new JRadioButton("ON");
		rdBtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enable();
			}
		});
		rdBtnOn.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdBtnOn.setBounds(187, 85, 64, 26);
		frame.getContentPane().add(rdBtnOn);
		
		rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				disable();
			}
		});
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOff.setBounds(187, 114, 64, 23);
		frame.getContentPane().add(rdbtnOff);
		
		bg.add(rdBtnOn);
		bg.add(rdbtnOff);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtInterface.getText());
				cmd = 2;
				txtInterface.setText("");
				lblJudul.setText(num + "-");
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMinus.setBounds(276, 159, 56, 48);
		frame.getContentPane().add(btnMinus);
		
		btnPerkalian = new JButton("×");
		btnPerkalian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtInterface.getText());
				cmd = 3;
				txtInterface.setText("");
				lblJudul.setText(num + "×");
			}
		});
		btnPerkalian.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPerkalian.setBounds(276, 230, 56, 48);
		frame.getContentPane().add(btnPerkalian);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtInterface.getText());
				cmd = 1;
				txtInterface.setText("");
				lblJudul.setText(num + "+");
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.setBounds(276, 89, 56, 48);
		frame.getContentPane().add(btnPlus);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(10, 366, 56, 48);
		frame.getContentPane().add(btnExit);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(98, 366, 56, 48);
		frame.getContentPane().add(btn0);
		
		btnPembagian = new JButton("÷");
		btnPembagian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtInterface.getText());
				cmd = 3;
				txtInterface.setText("");
				lblJudul.setText(num + "÷");
			}
		});
		btnPembagian.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPembagian.setBounds(276, 300, 56, 48);
		frame.getContentPane().add(btnPembagian);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 300, 56, 48);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(98, 300, 56, 48);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(187, 300, 56, 48);
		frame.getContentPane().add(btn3);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(187, 230, 56, 48);
		frame.getContentPane().add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(98, 230, 56, 48);
		frame.getContentPane().add(btn5);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 230, 56, 48);
		frame.getContentPane().add(btn4);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(187, 159, 56, 48);
		frame.getContentPane().add(btn9);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(98, 159, 56, 48);
		frame.getContentPane().add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInterface.setText(txtInterface.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 159, 56, 48);
		frame.getContentPane().add(btn7);
	}
}
