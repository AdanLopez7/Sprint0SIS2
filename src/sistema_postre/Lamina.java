package sistema_postre;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lamina extends JPanel {

	protected JTextField campo1;
	public Lamina()
	{
		
	
			
			JLabel etiqueta =new JLabel("Introducir postre");
			add(etiqueta);
			campo1=new JTextField(20);
			
			add(campo1);
			
			JButton miBoton=new JButton("Guardar");
			
			add(miBoton);
			
		
	}

}
