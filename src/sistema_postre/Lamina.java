package sistema_postre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lamina extends JPanel {

	public JTextField campo1;
	
	public Lamina()
	{
		
	
			
			JLabel etiqueta =new JLabel("Introducir postre");
			add(etiqueta);
			campo1=new JTextField(20);	
			add(campo1);
			JButton miBoton=new JButton("Guardar");
			 DameTexto in=new DameTexto();
			miBoton.addActionListener(in);
			add(miBoton);	
			JButton lista=new JButton("Ver lista postres");
			ListaPostre postres=new ListaPostre();
			lista.addActionListener(postres);
			add(lista);  
			 
		
	}
	
	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(campo1.getText().trim());
			try {
				
				Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
				
				
				PreparedStatement miConsulta=(PreparedStatement) miConexion.prepareStatement("SELECT nombre FROM postres");
				ResultSet resul=miConsulta.executeQuery();
				boolean bandera=false;
				while(resul.next())
				{
					if(campo1.getText().equals(resul.getString(1)))
					{
						
						bandera=true;
					}
					//System.out.println(resul.getString(1));
				}
				resul.close();
				if(bandera==false)
				{
				   PreparedStatement miSentencia=(PreparedStatement) miConexion.prepareStatement("INSERT INTO postres(nombre) VALUES (?)");
				   miSentencia.setString(1,campo1.getText());
			       miSentencia.executeUpdate();
			       JOptionPane.showMessageDialog(Lamina.this,"GUARDADO");
				   System.out.println("registro guardado");
				}else
				{
					
					JOptionPane.showMessageDialog(Lamina.this,"YA EXISTE EL POSTRE","Advertencia",0);
					System.out.println("YA EXISTE EL POSTRE");
				}
				
				
			}catch(Exception ea) {
				
				System.out.println("no conectado");
				
			}
		
		}
		
		
	}
	
	
}


