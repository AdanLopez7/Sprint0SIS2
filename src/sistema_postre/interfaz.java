package sistema_postre;

import javax.swing.JFrame;

public class interfaz {
	
	public static void main(String args [])
	{
		
		Cuadro miCuadro=new Cuadro();
		miCuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}


class  Cuadro extends JFrame{
	
	public Cuadro()
	{
		setBounds(400,200,500,350);
		setVisible(true);
		
	}
	
}