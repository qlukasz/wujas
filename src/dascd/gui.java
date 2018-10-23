package dascd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class gui {

	private JFrame frame;
	JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("aa");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
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
	public gui() {
		initialize();
		initialize_my();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Teltrade 2018");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblDedykowanySterownikDrukarki = new JLabel("Dedykowany sterownik drukarki kafka");
		lblDedykowanySterownikDrukarki.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.RED);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.RED);
		panel_2.setBackground(Color.WHITE);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("2018-10-23");
		
		JLabel lblNewLabel_2 = new JLabel("data start");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("22:00:00");
		
		JLabel lblGodzStart = new JLabel("godz start");
		
		JLabel lblOdstep = new JLabel("odstep pomiar");
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("00:15:00");
		
		JLabel lblOdstepWil = new JLabel("odstep wilgotnosc");
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setText("00:00:15");
		
		JFormattedTextField formattedTextField_6 = new JFormattedTextField();
		formattedTextField_6.setText("12");
		
		JLabel lblIloscPomiarow = new JLabel("ilosc pomiarow");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblIloscPomiarow, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblOdstep, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
							.addGap(32)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGodzStart, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOdstepWil, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
							.addGap(13))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(formattedTextField_6, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(3)
									.addComponent(lblGodzStart)))
							.addGap(9)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOdstepWil)
								.addComponent(lblOdstep)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIloscPomiarow)
						.addComponent(formattedTextField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.RED);
		panel_3.setBackground(Color.WHITE);
		
		JLabel lblTempPocztkowa = new JLabel("pocz\u0105tkowa");
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setText("55");
		
		JLabel lblWzorzec = new JLabel("wzorzec");
		
		JComboBox comboBox_2 = new JComboBox();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("wprowadz zaszumienie");
		
		JLabel lblNewLabel_3 = new JLabel("Temperatura");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblTempPocztkowa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(lblWzorzec, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblWzorzec)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTempPocztkowa)
							.addComponent(formattedTextField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.RED);
		panel_4.setBackground(Color.WHITE);
		
		JLabel lblPocztkowa = new JLabel("pocz\u0105tkowa");
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		formattedTextField_5.setText("55");
		
		JLabel label_1 = new JLabel("wzorzec");
		
		JComboBox comboBox_3 = new JComboBox();
		
		JCheckBox checkBox = new JCheckBox("wprowadz zaszumienie");
		
		JLabel lblWilgotno = new JLabel("Wilgotno\u015B\u0107");
		lblWilgotno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 387, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblWilgotno)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblPocztkowa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 84, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(lblWilgotno)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(checkBox))
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPocztkowa)
							.addComponent(formattedTextField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JButton btnNewButton = new JButton("Wy\u015Blij");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(553, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(21))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(67)
					.addComponent(lblDedykowanySterownikDrukarki, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(292, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(269, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(285, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addGap(232))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDedykowanySterownikDrukarki, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(31))
		);
		
		comboBox = new JComboBox();
		
		JLabel lblNewLabel_1 = new JLabel("COM");
		
		JButton btnOdwie = new JButton("od\u015Bwie\u017C");
		
		JLabel lblPrdko = new JLabel("pr\u0119dko\u015B\u0107");
		
		JComboBox comboBox_1 = new JComboBox();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblPrdko, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnOdwie))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOdwie)
						.addComponent(lblNewLabel_1))
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrdko)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
	}
	private void initialize_my() {
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
	}
}
