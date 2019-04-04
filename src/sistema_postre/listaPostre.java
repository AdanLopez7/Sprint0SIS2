package sistema_postre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class listaPostre implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	
	
	{
		
		try {
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			Statement miStatement=miConexion.createStatement();
			ResultSet miResultado=miStatement.executeQuery("SELECT * FROM postres");
			
			while(miResultado.next()) 
			{
				
				System.out.println(miResultado.getString("nombre"));
			}
			
		}catch(Exception ee)
		{
			
			System.out.println("no conecta");
			
		}
	}
	
	
	
	

}
