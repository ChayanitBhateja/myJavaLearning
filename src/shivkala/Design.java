package shivkala;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Design {

	private JFrame frame;
	private JTextField loginText;
	private JTextField passwordText;
	private JTextField billNoText;
	private JTextField articleText;
	private JTextField editCustomerText;
	private JTable editBillTable;
	private JTable gstTable;
	private JTextField payRemText;
	private JTable table;
	private JTextField fromDateText;
	private JTextField toDateText;
	private JTextField custSearchText;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField viewCustText;
	private JTable customerTable;
	private JTable creditTable;
	private JTable debitTable;
	private JTextField acceptPayText;
	private JTable newBillTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design window = new Design();
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
	public Design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel navPanel = new JPanel();
		final JPanel mainPanel = new JPanel();
		final JPanel billPanel = new JPanel();
		final JPanel editBillPanel = new JPanel();
		final JPanel viewBillPanel = new JPanel();
		final JLabel lblFromDate = new JLabel("From Date");
		final JLabel toDateLabel = new JLabel("To Date");
		final JLabel lblCustomerName = new JLabel("Customer Name");
		final JButton btnSubmit = new JButton("Submit");
		final JPanel customerPanel = new JPanel();
	    final JTabbedPane newBillTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		final JScrollPane newBIllPanel = new JScrollPane();
		
		lblFromDate.setVisible(false);
		toDateLabel.setVisible(false);
		lblCustomerName.setVisible(false);
		
		
		JButton billButton = new JButton("Create New Bill");
		billButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels..
				mainPanel.removeAll();
				mainPanel.repaint();
				mainPanel.revalidate();
				
				//adding panel..
				mainPanel.add(billPanel);
				mainPanel.repaint();
				mainPanel.revalidate();
			}
		});
		
		
		
		JLabel billLabel = new JLabel("Billing");
		billLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton editBillButton = new JButton("Edit Old Bill");
		editBillButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels..
				mainPanel.removeAll();
				mainPanel.repaint();
				mainPanel.revalidate();
				
				//adding panel..
				mainPanel.add(editBillPanel);
				mainPanel.repaint();
				mainPanel.revalidate();
			}
		});
		
		JPanel headPanel = new JPanel();
		headPanel.setBackground(new Color(252, 0, 0));
		
		JLabel nameLabel = new JLabel("Shiv Kala Emporium");
		nameLabel.setFont(new Font("FreeSerif", Font.BOLD, 34));
		
		JLabel addressLabel = new JLabel("Inside delhi Gate, Malerkotla");
		addressLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		JLabel mobLabel = new JLabel("Mob No.:- 9463511147, 9417133049");
		mobLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
		GroupLayout gl_headPanel = new GroupLayout(headPanel);
		gl_headPanel.setHorizontalGroup(
			gl_headPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_headPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_headPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_headPanel.createSequentialGroup()
							.addComponent(addressLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
							.addComponent(mobLabel)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_headPanel.createSequentialGroup()
							.addComponent(nameLabel)
							.addGap(334))))
		);
		gl_headPanel.setVerticalGroup(
			gl_headPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_headPanel.createSequentialGroup()
					.addGap(29)
					.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_headPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(addressLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(mobLabel)))
		);
		headPanel.setLayout(gl_headPanel);
		
		JPanel bottonPanel = new JPanel();
		
		JButton viewBillButton = new JButton("View Bills");
		viewBillButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels..
				mainPanel.removeAll();
				mainPanel.repaint();
				mainPanel.revalidate();
				
				//adding panel..
				mainPanel.add(viewBillPanel);
				mainPanel.repaint();
				mainPanel.revalidate();
			}
		});
		
		JLabel customerLabel = new JLabel("Customer Account");
		customerLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton viewCustomerButton = new JButton("View Customers");
		viewCustomerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//removing panels..
				mainPanel.removeAll();
				mainPanel.repaint();
				mainPanel.revalidate();
				
				//adding panel..
				mainPanel.add(customerPanel);
				mainPanel.repaint();
				mainPanel.revalidate();
			}
		});
		
		JPanel adminPanel = new JPanel();
		
		JLabel adminLabel = new JLabel("Admin Account");
		adminLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		loginText = new JTextField();
		loginText.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		
		passwordText = new JTextField();
		passwordText.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_adminPanel = new GroupLayout(adminPanel);
		gl_adminPanel.setHorizontalGroup(
			gl_adminPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_adminPanel.createSequentialGroup()
					.addGroup(gl_adminPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adminPanel.createSequentialGroup()
							.addGap(5)
							.addComponent(adminLabel))
						.addGroup(gl_adminPanel.createSequentialGroup()
							.addGap(59)
							.addComponent(loginButton))
						.addGroup(gl_adminPanel.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_adminPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordLabel)
								.addComponent(loginText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(loginLabel))))
					.addContainerGap(77, Short.MAX_VALUE))
		);
		gl_adminPanel.setVerticalGroup(
			gl_adminPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_adminPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(adminLabel)
					.addGap(4)
					.addComponent(loginLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(loginText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(loginButton)
					.addGap(53))
		);
		adminPanel.setLayout(gl_adminPanel);
		
		JLabel footerLabel = new JLabel("Made With Love by");
		footerLabel.setForeground(new Color(102, 102, 255));
		footerLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel creditLabel = new JLabel("Chayanit Bhateja");
		creditLabel.setForeground(Color.RED);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bottonPanel, GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(navPanel, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(mainPanel, 0, 0, Short.MAX_VALUE))
							.addComponent(headPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 998, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(headPanel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(navPanel, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE)
						.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bottonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		
		billPanel.setBackground(Color.BLUE);
		mainPanel.add(billPanel, "name_6516767799765");
		
		JScrollPane scrollTabbedPanel = new JScrollPane();
		
		JButton newBillButton = new JButton("New Bill");
		newBillButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				newBillTabbedPane=new JTabbedPane();
			}
		});
		
		JButton cancelBillButton = new JButton("Cancel Bill");
		
		final JToggleButton newBillTypeButton = new JToggleButton("Regular");
		newBillTypeButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(newBillTypeButton.isSelected())
					newBillTypeButton.setText("FR");
				else
					newBillTypeButton.setText("Regular");
			}
		});
		
		
		GroupLayout gl_billPanel = new GroupLayout(billPanel);
		gl_billPanel.setHorizontalGroup(
			gl_billPanel.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollTabbedPanel, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
				.addGroup(gl_billPanel.createSequentialGroup()
					.addContainerGap(663, Short.MAX_VALUE)
					.addComponent(cancelBillButton)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_billPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(newBillButton, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(631, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_billPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(newBillTypeButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(656, Short.MAX_VALUE))
		);
		gl_billPanel.setVerticalGroup(
			gl_billPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_billPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(newBillButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(newBillTypeButton)
					.addGap(18)
					.addComponent(scrollTabbedPanel, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cancelBillButton)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		
		
		scrollTabbedPanel.setViewportView(newBillTabbedPane);
		
		
		newBillTabbedPane.addTab("New tab", null, newBIllPanel, null);
		
		newBillTable = new JTable();
		newBillTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Selling Price", "Description", "Unit(s)", "Article No", "GST", "Nett Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		newBillTable.getColumnModel().getColumn(0).setPreferredWidth(96);
		newBillTable.getColumnModel().getColumn(1).setPreferredWidth(97);
		newBIllPanel.setViewportView(newBillTable);
		billPanel.setLayout(gl_billPanel);
		
		
		editBillPanel.setBackground(Color.CYAN);
		mainPanel.add(editBillPanel, "name_8815903981742");
		
		JLabel billNoLabel = new JLabel("Bill No:");
		billNoLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		billNoText = new JTextField();
		billNoText.setColumns(10);
		
		JLabel articleLabel = new JLabel("Article No.:");
		articleLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		articleText = new JTextField();
		articleText.setColumns(10);
		
		JLabel editCustomerLabel = new JLabel("Customer:");
		editCustomerLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		editCustomerText = new JTextField();
		editCustomerText.setColumns(10);
		
		JLabel customerBalcLabel = new JLabel("balc");
		customerBalcLabel.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel searchLabel = new JLabel("Search By:- ");
		searchLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.GRAY);
		
		JLabel dateTextLabel = new JLabel("Date:");
		dateTextLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel dateLabel = new JLabel("Datee");
		dateLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JPanel billSummayPanel = new JPanel();
		
		Object[] columns = {"Selling", "Description", "unit", "Article No.", "GST", "Nett Price"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		final JToggleButton billTypeToggle = new JToggleButton("Regular");
		billTypeToggle.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(billTypeToggle.isSelected())
					billTypeToggle.setText("FR");
				else
					billTypeToggle.setText("Regular");
			}
		});
		
		JLabel totalTextLabel = new JLabel("Total:");
		totalTextLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel TotalLabel = new JLabel("totalll");
		TotalLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel paidLabel = new JLabel("Paid: ");
		paidLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		Object[] gstColumn= {"CGST", "SGST"};
		DefaultTableModel gstModel= new DefaultTableModel();
		gstModel.setColumnIdentifiers(gstColumn);
		
		JLabel remTextLabel = new JLabel("Remaining:");
		remTextLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel remLabel = new JLabel("rem");
		remLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JScrollPane sp = new JScrollPane();
		
		JScrollPane sp1 = new JScrollPane();
		
		payRemText = new JTextField();
		payRemText.setColumns(10);
//		editBillPanel.remove(payRemText);
		payRemText.setVisible(false);
		
		final JLabel payRemLabel = new JLabel("Pay:");
		payRemLabel.setFont(new Font("Dialog", Font.BOLD, 14));
//		editBillPanel.remove(payRemLabel);
		payRemLabel.setVisible(false);
		
		JLabel paidAmtLabel = new JLabel("Paiddd");
		paidAmtLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JSeparator totalSeprator = new JSeparator();
		
		final JLabel payViaLabel = new JLabel("Pay Via");
//		editBillPanel.remove(payViaLabel);
		payViaLabel.setVisible(false);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Paytm", "Card", "UPI"}));
//		editBillPanel.remove(comboBox);
		comboBox.setVisible(false);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton printButton = new JButton("Print");
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel customerDetailPanel = new JPanel();
		GroupLayout gl_editBillPanel = new GroupLayout(editBillPanel);
		gl_editBillPanel.setHorizontalGroup(
			gl_editBillPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_editBillPanel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_editBillPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(articleLabel)
										.addComponent(editCustomerLabel))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(articleText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(editCustomerText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(searchLabel))
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addGap(322)
									.addComponent(billNoLabel))
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(customerBalcLabel, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addComponent(dateTextLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dateLabel))
								.addComponent(billNoText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addGap(12)
									.addComponent(billTypeToggle, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addComponent(billSummayPanel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sp, GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addComponent(printButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(saveButton))
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(sp1, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addComponent(customerDetailPanel, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_editBillPanel.createSequentialGroup()
											.addComponent(payViaLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addComponent(payRemLabel)
									.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
									.addComponent(payRemText, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(totalTextLabel)
										.addComponent(paidLabel))
									.addGap(23)
									.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(TotalLabel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_editBillPanel.createSequentialGroup()
											.addGap(12)
											.addComponent(paidAmtLabel))))
								.addGroup(gl_editBillPanel.createSequentialGroup()
									.addComponent(remTextLabel)
									.addGap(18)
									.addComponent(remLabel))
								.addComponent(totalSeprator, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_editBillPanel.setVerticalGroup(
			gl_editBillPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_editBillPanel.createSequentialGroup()
					.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addGap(8)
							.addComponent(searchLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(articleLabel)
								.addComponent(articleText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(editCustomerLabel)
								.addGroup(gl_editBillPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(editCustomerText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(customerBalcLabel))))
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(dateTextLabel)
								.addComponent(dateLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(billNoLabel)
								.addComponent(billNoText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(billTypeToggle)))
					.addGap(18)
					.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(sp, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
						.addComponent(billSummayPanel, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(totalTextLabel)
								.addComponent(TotalLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(paidAmtLabel)
								.addComponent(paidLabel)))
						.addComponent(sp1, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_editBillPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(remTextLabel)
							.addComponent(remLabel))
						.addGroup(gl_editBillPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(totalSeprator, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(payRemText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_editBillPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(payRemLabel)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(payViaLabel)))
							.addGap(18)
							.addGroup(gl_editBillPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(saveButton)
								.addComponent(printButton)
								.addComponent(cancelButton)))
						.addComponent(customerDetailPanel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		final JLabel lblCustomerDetails = new JLabel("Customer Details");
		
		JLabel lblName = new JLabel("Name:");
		
		JLabel custNameLabel = new JLabel("namee");
		
		JLabel lblPhoneNo = new JLabel("Phone No.:");
		
		JLabel phoneLabel = new JLabel("chakahnio");
		
		JLabel lblAddress = new JLabel("Address:");
		
		JLabel custAddLabel = new JLabel("Shastri Nagar Railway Road Malerkotla");
		
		JLabel lblRemainingBalance = new JLabel("Remaining Balance:");
		
		JLabel remAmtLabel = new JLabel("152000");
		
		JLabel lblLastBill = new JLabel("Last Bill:");
		
		JLabel lastDateLabel = new JLabel("dateee");
		GroupLayout gl_customerDetailPanel = new GroupLayout(customerDetailPanel);
		gl_customerDetailPanel.setHorizontalGroup(
			gl_customerDetailPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_customerDetailPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_customerDetailPanel.createSequentialGroup()
							.addComponent(lblName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(custNameLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCustomerDetails)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPhoneNo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(phoneLabel))
						.addGroup(gl_customerDetailPanel.createSequentialGroup()
							.addComponent(lblAddress)
							.addGap(12)
							.addComponent(custAddLabel))
						.addGroup(gl_customerDetailPanel.createSequentialGroup()
							.addComponent(lblRemainingBalance)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(remAmtLabel)
							.addGap(24)
							.addComponent(lblLastBill)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lastDateLabel)))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_customerDetailPanel.setVerticalGroup(
			gl_customerDetailPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_customerDetailPanel.createSequentialGroup()
					.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCustomerDetails)
						.addGroup(gl_customerDetailPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(custNameLabel)
								.addComponent(lblPhoneNo)
								.addComponent(phoneLabel))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(custAddLabel)
						.addComponent(lblAddress))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblLastBill)
							.addComponent(lastDateLabel))
						.addGroup(gl_customerDetailPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblRemainingBalance)
							.addComponent(remAmtLabel)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		customerDetailPanel.setLayout(gl_customerDetailPanel);
		
		gstTable = new JTable();
		gstTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"HHSN No.", "GST %", "CGST", "SGST", "Amount"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		gstTable.setColumnSelectionAllowed(true);
		gstTable.setCellSelectionEnabled(true);
		gstTable.setRowHeight(30);
		gstTable.setFillsViewportHeight(true);
		gstTable.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		sp1.setViewportView(gstTable);
		
		editBillTable = new JTable();
		editBillTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Selling Price", "Description", "Unit(s)", "Article No.", "Nett Price"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		editBillTable.setSurrendersFocusOnKeystroke(true);
		editBillTable.setRowHeight(30);
		editBillTable.setFillsViewportHeight(true);
		editBillTable.setColumnSelectionAllowed(true);
		editBillTable.setCellSelectionEnabled(true);
		editBillTable.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		sp.setViewportView(editBillTable);
		
		JButton grButton = new JButton("Add GR");
		grButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton paymentButton = new JButton("Pay");
		paymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				editBillPanel.add(payViaLabel);
//				editBillPanel.add(payRemLabel);
//				editBillPanel.add(payRemText);
//				editBillPanel.add(comboBox);
				payViaLabel.setVisible(true);
				comboBox.setVisible(true);
				payRemLabel.setVisible(true);
				payRemText.setVisible(true);
				
			}
		});
		
		JButton addArtButton = new JButton("Add Art");
		addArtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		GroupLayout gl_billSummayPanel = new GroupLayout(billSummayPanel);
		gl_billSummayPanel.setHorizontalGroup(
			gl_billSummayPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_billSummayPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_billSummayPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(paymentButton, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(grButton, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(addArtButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_billSummayPanel.setVerticalGroup(
			gl_billSummayPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_billSummayPanel.createSequentialGroup()
					.addContainerGap(15, Short.MAX_VALUE)
					.addComponent(addArtButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(paymentButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(grButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		billSummayPanel.setLayout(gl_billSummayPanel);
		editBillPanel.setLayout(gl_editBillPanel);
		
		
		mainPanel.add(viewBillPanel, "name_4413544594050");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JRadioButton dateWiseRadio = new JRadioButton("DateWise Detail");
		dateWiseRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCustomerName.setVisible(false);
				custSearchText.setVisible(false);
				fromDateText.setVisible(true);
				toDateText.setVisible(true);
				lblFromDate.setVisible(true);
				toDateLabel.setVisible(true);
				btnSubmit.setVisible(true);
				
			}
		});
		buttonGroup.add(dateWiseRadio);
		
		JRadioButton customerWiseRadio = new JRadioButton("CustomerWise Detail");
		customerWiseRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fromDateText.setVisible(false);
				toDateLabel.setVisible(false);
				toDateText.setVisible(false);
				lblFromDate.setVisible(false);
				custSearchText.setVisible(true);
				lblCustomerName.setVisible(true);
				btnSubmit.setVisible(true);
			}
		});
		buttonGroup.add(customerWiseRadio);
		
		
		
		fromDateText = new JTextField();
		fromDateText.setColumns(10);
		fromDateText.setVisible(false);
		
		
		toDateText = new JTextField();
		toDateText.setColumns(10);
		toDateText.setVisible(false);
		
		
		custSearchText = new JTextField();
		custSearchText.setColumns(10);
		custSearchText.setVisible(false);
		
		
		btnSubmit.setVisible(false);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_viewBillPanel = new GroupLayout(viewBillPanel);
		gl_viewBillPanel.setHorizontalGroup(
			gl_viewBillPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
				.addGroup(gl_viewBillPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_viewBillPanel.createSequentialGroup()
							.addComponent(dateWiseRadio)
							.addGap(18)
							.addComponent(customerWiseRadio))
						.addGroup(gl_viewBillPanel.createSequentialGroup()
							.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(toDateLabel)
								.addComponent(lblFromDate))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(fromDateText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(toDateText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblCustomerName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(custSearchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSubmit)))
					.addContainerGap(195, Short.MAX_VALUE))
		);
		gl_viewBillPanel.setVerticalGroup(
			gl_viewBillPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_viewBillPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(dateWiseRadio)
						.addComponent(customerWiseRadio))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_viewBillPanel.createSequentialGroup()
							.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFromDate)
								.addComponent(fromDateText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(toDateLabel)
								.addComponent(toDateText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_viewBillPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCustomerName)
							.addComponent(custSearchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnSubmit)))
					.addGap(25)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Name", "Bill No.", "Unit(s)", "Amount", "paid"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setFillsViewportHeight(true);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane.setViewportView(table);
		viewBillPanel.setLayout(gl_viewBillPanel);
		
		mainPanel.add(customerPanel, "name_8361409064083");
		
		JLabel viewCustLabel = new JLabel("Customer Name");
		
		viewCustText = new JTextField();
		viewCustText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					
				}
			}
		});
		viewCustText.setColumns(10);
		
		JButton submitCustButton = new JButton("Submit");
		
		JScrollPane custScrollPane = new JScrollPane();
		
		JLabel viewCustomerNameLabel = new JLabel("CustomerName");
		
		JLabel viewCustomerAddLabel = new JLabel("shastri Nagar Railway Road malerkotla");
		
		JLabel viewPhoneNoLabel = new JLabel("9815713600");
		
		JScrollPane creditScrollPane = new JScrollPane();
		
		JScrollPane debitScrollPane = new JScrollPane();
		
		JLabel lblAcceptPayment = new JLabel("Accept Payment");
		
		acceptPayText = new JTextField();
		acceptPayText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					DefaultTableModel debitModel=(DefaultTableModel)debitTable.getModel();
					debitModel.addRow(new Object[] {acceptPayText.getText(), acceptPayText.getText()});
				}
			}
		});
		acceptPayText.setColumns(10);
		
		JButton acceptPayButton = new JButton("Submit");
		acceptPayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel debitModel=(DefaultTableModel)debitTable.getModel();
				debitModel.addRow(new Object[] {acceptPayText.getText(), acceptPayText.getText()});
				
			}
		});
		GroupLayout gl_customerPanel = new GroupLayout(customerPanel);
		gl_customerPanel.setHorizontalGroup(
			gl_customerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_customerPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_customerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_customerPanel.createSequentialGroup()
							.addComponent(creditScrollPane, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(debitScrollPane, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
						.addGroup(gl_customerPanel.createSequentialGroup()
							.addComponent(viewCustLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(viewCustText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(submitCustButton))
						.addComponent(custScrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
						.addGroup(gl_customerPanel.createSequentialGroup()
							.addComponent(viewCustomerAddLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
							.addComponent(viewPhoneNoLabel))
						.addGroup(Alignment.TRAILING, gl_customerPanel.createSequentialGroup()
							.addComponent(lblAcceptPayment)
							.addGap(4)
							.addComponent(acceptPayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(acceptPayButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(gl_customerPanel.createSequentialGroup()
					.addGap(315)
					.addComponent(viewCustomerNameLabel)
					.addContainerGap(359, Short.MAX_VALUE))
		);
		gl_customerPanel.setVerticalGroup(
			gl_customerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_customerPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_customerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(viewCustLabel)
						.addComponent(viewCustText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(submitCustButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(custScrollPane, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(viewCustomerNameLabel)
					.addGap(18)
					.addGroup(gl_customerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(viewCustomerAddLabel)
						.addComponent(viewPhoneNoLabel))
					.addGap(18)
					.addGroup(gl_customerPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(debitScrollPane, 0, 0, Short.MAX_VALUE)
						.addComponent(creditScrollPane, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_customerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(acceptPayButton)
						.addComponent(acceptPayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAcceptPayment))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		
		Object[] debitColumns = {"Date", "Amount"};
		final DefaultTableModel debitModel=new DefaultTableModel();
		debitModel.setColumnIdentifiers(debitColumns);
		debitTable = new JTable();
		debitTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Amount"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		debitTable.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					debitModel.addRow(new Object[]{"", ""});
				}
			}
		});
		
		debitTable.setFillsViewportHeight(true);
		debitScrollPane.setViewportView(debitTable);
		
		creditTable = new JTable();
		creditTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DATE", "Amount"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		creditTable.setFillsViewportHeight(true);
		creditScrollPane.setViewportView(creditTable);
		
		customerTable = new JTable();
		customerTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		customerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "c/o", "Address", "phoneNo", "balance", "last bill"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		customerTable.setFillsViewportHeight(true);
		custScrollPane.setViewportView(customerTable);
		customerPanel.setLayout(gl_customerPanel);
		GroupLayout gl_bottonPanel = new GroupLayout(bottonPanel);
		gl_bottonPanel.setHorizontalGroup(
			gl_bottonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bottonPanel.createSequentialGroup()
					.addGap(378)
					.addComponent(footerLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(creditLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(347))
		);
		gl_bottonPanel.setVerticalGroup(
			gl_bottonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bottonPanel.createSequentialGroup()
					.addGroup(gl_bottonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(footerLabel)
						.addComponent(creditLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		bottonPanel.setLayout(gl_bottonPanel);
		GroupLayout gl_navPanel = new GroupLayout(navPanel);
		gl_navPanel.setHorizontalGroup(
			gl_navPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navPanel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_navPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(billLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(billButton, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(editBillButton, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(viewBillButton, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(customerLabel)
						.addComponent(viewCustomerButton, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(adminPanel, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
		);
		gl_navPanel.setVerticalGroup(
			gl_navPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(billLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(billButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(editBillButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(viewBillButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(customerLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(viewCustomerButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(adminPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		navPanel.setLayout(gl_navPanel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
