import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This class represents the Login window of the application.
 * It allows the user to connect to the server by entering their username and
 * the server's IP address and port number.
 */
public class Login extends JFrame {

	/**
	 * The IP address of the server.
	 */
	static final String IP = "localhost";

	/**
	 * The instance of the Login window.
	 */
	static Login loginFrame;

	/**
	 * Creates new form Login.
	 */
	public Login() {
		initComponents();
		jPanel9.requestFocus();
		scaleImage(jLabel4, "images/tschat-logo.png");
		scaleImage(jLabel1, "images/Username.png");
		scaleImage(jLabel3, "images/Port.png");
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel9 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel9.setBackground(new java.awt.Color(137, 76, 223));

		jPanel1.setBackground(new java.awt.Color(33, 36, 43));

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(137, 76, 223));
		jLabel2.setText("tsChat.v2");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout
												.createSequentialGroup()
												.addGap(46, 46, 46)
												.addComponent(jLabel2))
										.addGroup(jPanel1Layout
												.createSequentialGroup()
												.addGap(104, 104, 104)
												.addComponent(jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														81,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(51, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(161, 161, 161)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										56, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										73,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(252, 252, 252)));

		jPanel2.setBackground(new java.awt.Color(33, 36, 43));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 250, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 5, Short.MAX_VALUE));

		jTextField1.setBackground(new java.awt.Color(137, 76, 223));
		jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		jTextField1.setForeground(new java.awt.Color(33, 36, 43));
		jTextField1.setText("Enter your username");
		jTextField1.setToolTipText("");
		jTextField1.setBorder(null);
		jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jTextField1FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				jTextField1FocusLost(evt);
			}
		});
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextField2.setBackground(new java.awt.Color(137, 76, 223));
		jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		jTextField2.setForeground(new java.awt.Color(33, 36, 43));
		jTextField2.setText("Enter your port");
		jTextField2.setToolTipText("");
		jTextField2.setBorder(null);
		jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jTextField2FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				jTextField2FocusLost(evt);
			}
		});

		jPanel3.setBackground(new java.awt.Color(33, 36, 43));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 250, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 5, Short.MAX_VALUE));

		jPanel4.setBackground(new java.awt.Color(137, 76, 223));
		jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 36, 43), 4));

		jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(33, 36, 43));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("Login");
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel5MouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jLabel5MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel5MouseExited(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel5,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										91, Short.MAX_VALUE)
								.addContainerGap()));
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel5,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addContainerGap()));

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(
				jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout
								.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										50, Short.MAX_VALUE)
								.addGroup(jPanel9Layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel9Layout.createSequentialGroup()
														.addGroup(jPanel9Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(jLabel3,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		64,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel9Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel9Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jPanel2,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextField1,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				240,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		jPanel9Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jPanel3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jTextField2,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						241,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addComponent(jPanel4,
												javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(76, 76, 76)));
		jPanel9Layout.setVerticalGroup(
				jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel9Layout.createSequentialGroup()
								.addGap(172, 172, 172)
								.addGroup(jPanel9Layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel9Layout
												.createSequentialGroup()
												.addComponent(jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														38,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPanel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												65,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel9Layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel9Layout
												.createSequentialGroup()
												.addComponent(jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														38,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPanel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												65,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jPanel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Text field UI behaviour
	 */
	private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusGained
		// TODO add your handling code here:
		if (jTextField1.getText().equals("Enter your username")) {
			jTextField1.setText("");
		}
	}// GEN-LAST:event_jTextField1FocusGained

	/**
	 * Text field UI behaviour
	 */
	private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusLost
		// TODO add your handling code here:
		if (jTextField1.getText().equals("")) {
			jTextField1.setText("Enter your username");
		}
	}// GEN-LAST:event_jTextField1FocusLost

	/**
	 * Text field UI behaviour
	 */
	private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField2FocusGained
		// TODO add your handling code here:
		if (jTextField2.getText().equals("Enter your port")) {
			jTextField2.setText("");
		}
	}// GEN-LAST:event_jTextField2FocusGained

	/**
	 * Text field UI behaviour
	 */
	private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField2FocusLost
		// TODO add your handling code here:
		if (jTextField2.getText().equals("")) {
			jTextField2.setText("Enter your port");
		}
	}// GEN-LAST:event_jTextField2FocusLost

	/**
	 * Text field UI behaviour
	 */
	private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseEntered
		// TODO add your handling code here:
		jLabel5.setForeground(jPanel4.getBackground());
		jPanel4.setBackground(new Color(33, 36, 43));
	}// GEN-LAST:event_jLabel5MouseEntered

	/**
	 * Text field UI behaviour
	 */
	private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseExited
		// TODO add your handling code here:
		jPanel4.setBackground(jLabel5.getForeground());
		jLabel5.setForeground(new Color(33, 36, 43));
	}// GEN-LAST:event_jLabel5MouseExited

	/**
	 * Login and connect to the server
	 */
	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked

		String username = jTextField1.getText();
		String PORT = jTextField2.getText();

		// Check for username duplicates

		Socket socket;
		try {
			socket = new Socket(IP, Integer.parseInt(PORT));

			// Connected successfully
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

			// register user with nickname
			Packet packet = new Packet("register", username, null);
			out.writeObject(packet);
			packet = (Packet) in.readObject();

			// duplicate username
			if (packet.type == "error") {

				JOptionPane.showMessageDialog(loginFrame, "Invalid username", "Error", JOptionPane.ERROR_MESSAGE);

				return;
			}

			// show client
			loginFrame.setVisible(false);
			Client clientFrame = new Client(socket, in, out, username);

			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					// prevent default behaviour on close
					clientFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					clientFrame.setVisible(true);
				}
			});

		} catch (Exception e) {
			// TODO: Invalid port / IP
			e.printStackTrace();
		}

	}// GEN-LAST:event_jLabel5MouseClicked

	/**
	 * Text field UI behaviour
	 */
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	/**
	 * Scale an image to the desired size
	 */
	public void scaleImage(JLabel j, String image) {
		ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image)));

		Image img1 = myImage.getImage();
		Image img2 = img1.getScaledInstance(j.getWidth() - 10, j.getHeight() - 10, Image.SCALE_SMOOTH);
		ImageIcon i = new ImageIcon(img2);
		j.setIcon(i);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel.
		 * For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		loginFrame = new Login();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				loginFrame.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables
}
