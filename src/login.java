package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JPasswordField jpassClave;
	private JButton btnIngresar;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 16));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(12, 13, 420, 16);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(101, 65, 63, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(80, 106, 84, 16);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(194, 62, 116, 22);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(192, 103, 118, 22);
		contentPane.add(jpassClave);
		
		btnIngresar = new JButton("INGRESAR\r\n");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] clave =jpassClave.getPassword();
				String claveFinal = new String (clave);
				
				if(txtUsuario.getText ().equals("diego") && claveFinal.contentEquals("123")) {
					dispose ();
					JOptionPane.showMessageDialog(null,"Bienvenido al Sistema","INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
				
					//LINEA DE CODIGO PARA QUE SE HABRA LA OTRA VENTANA DE REGISTRO DE POSTRES
				//	registroPostre rp = new registroPostre ();
				//	p.setVisable(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta vuelve a intentar", "ERROR", JOptionPane.ERROR_MESSAGE);
					
					txtUsuario.setText("");
					jpassClave.setText("");
					txtUsuario.requestFocus();
				}
			}
		});
		btnIngresar.setBounds(189, 181, 97, 25);
		contentPane.add(btnIngresar);
	}
}
