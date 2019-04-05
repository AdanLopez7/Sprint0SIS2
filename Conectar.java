package conexion;

public class Conectar {
	public class Conexion extends javax.swing.JFrame {

	    public Conexion() {
	        initComponents();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jButton1.setText("jButton1");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(154, 154, 154)
	                .addComponent(jButton1)
	                .addContainerGap(173, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(98, 98, 98)
	                .addComponent(jButton1)
	                .addContainerGap(179, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        Conectar cc = new Conectar();
	        cc.conexion();
	    }                                        

	    
	    public static void main(String args[]) {
	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Conexion().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    // End of variables declaration                   
	}
}
