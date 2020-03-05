 package Ventana;

 
 /**
	 *@author: carlos y alex.
	 * @version: 05/03/2020.
	 */
 
 
 
  import java.awt.EventQueue;
  import javax.swing.JFrame;
  import java.awt.List;
  import java.awt.BorderLayout;
  import java.awt.Color;
  import java.awt.TextField;
  import javax.swing.JComboBox;
  import javax.swing.JLayeredPane;
  import javax.swing.JLabel;
  import javax.swing.JTable;
  import javax.swing.JTree;
  import javax.swing.JSplitPane;
  import javax.swing.JList;
  import javax.swing.AbstractListModel;
  import javax.swing.SwingConstants;
  import javax.swing.border.LineBorder;
  import javax.swing.JMenuBar;
  import javax.swing.JMenu;
  import javax.swing.JTextField;
  import javax.swing.table.DefaultTableModel;

  import codigo.Personas;

 import javax.swing.ListSelectionModel;
  import javax.swing.JMenuItem;
  import java.awt.Choice;
  import java.awt.event.MouseAdapter;
  import java.awt.event.MouseEvent; 
  import javax.swing.DefaultComboBoxModel;
  import java.awt.Button;
  import java.awt.Font;
 import javax.swing.JTextArea;
 import javax.swing.JTextPane;

  public class AfinidadV {

	 private JFrame ventanaAfinity;
	 private JTable informacionPersonas;
	
	 
	 /**
	 *@author carlos y alex.
	 * Launch the application.
	 */
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfinidadV window = new AfinidadV();
					window.ventanaAfinity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AfinidadV() {
		initialize();
	}

	

		 
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		int [] id = new int [ 10 ];
		 
		 id [0] = 1; 
		 id [1] = 2; 
		 id [2] = 3; 
		 id [3] = 4; 
		 id [4] = 5; 
		 id [5] = 6; 
		 id [6] = 7;
		 id [7] = 8; 
		 id [8] = 9; 
		 id [9] = 10; 
		 
		 
		 String []  Nombres = new String [10] ;
			
		 Nombres[0]  = " Pascual ";
		 Nombres[1]  = " julio ";
		 Nombres[2]  = " Pascual ";
		 Nombres[3]  = " Pascual ";
		 Nombres[4]  = " Pascual ";
		 Nombres[5]  = " Pascual ";
		 Nombres[6]  = " Pascual ";
		 Nombres[7]  = " Pascual ";
		 Nombres[8]  = " Pascual ";
		 Nombres[9]  = " Pascual ";
		 
			int [] Edades = new  int [10];
			 
			 Edades[0]  = 12;
			 Edades[1]  = 20;
			 Edades[2]  = 20;
			 Edades[3]  = 30;
			 Edades[4]  = 50;
			 Edades[5]  = 16;
			 Edades[7]  = 30;
			 Edades[8]  = 20;
			 Edades[9]  = 25;
			 
			String Aficiones [][] = {{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
					{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
					{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
					{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" }};
		
		ventanaAfinity = new JFrame();
		ventanaAfinity.getContentPane().setBackground(Color.ORANGE);
		ventanaAfinity.setBackground(Color.ORANGE);
		ventanaAfinity.setTitle("Comparador de afinidad");
		ventanaAfinity.setBounds(100, 100, 538, 545);
		ventanaAfinity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaAfinity.getContentPane().setLayout(null);
		
		JLabel lblPersonas = new JLabel("Listado de personas");
		lblPersonas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPersonas.setBackground(Color.WHITE);
		lblPersonas.setLabelFor(ventanaAfinity);
		lblPersonas.setBounds(28, 14, 209, 22);
		ventanaAfinity.getContentPane().add(lblPersonas);
		
		informacionPersonas = new JTable();
		informacionPersonas.setBorder(new LineBorder(new Color(0, 0, 0)));
		informacionPersonas.setEnabled(false);
		informacionPersonas.setSurrendersFocusOnKeystroke(true);
		informacionPersonas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		informacionPersonas.setForeground(new Color(0, 0, 0));
		informacionPersonas.setToolTipText("Personas");
		informacionPersonas.setModel(new DefaultTableModel(
			
			
				
				
			new Object[][] {
				
				{"Nombre", "Edades", "id"},
				
				
				{Nombres [0], Edades [0], id [0]},
				{Nombres [1], Edades [1], id [1]},
				{Nombres [2], Edades [2], id [2]},
				{Nombres [3], Edades [3], id [3]},
				{Nombres [4], Edades [4], id [4]},
				{Nombres [5], Edades [5], id [5]},
				{Nombres [6], Edades [6], id [6]},
				{Nombres [7], Edades [7], id [7]},
				{Nombres [8], Edades [8], id [8]},
				{Nombres [9], Edades [9], id [9]},
				
				
				
			
				},
				
			
			
			
			
			new String[] {
				"Nombre", "Edad", "ID" , " Aficiones"
			}
		));
		informacionPersonas.setBackground(new Color(255, 255, 255));
		informacionPersonas.setBounds(28, 60, 232, 176);
		ventanaAfinity.getContentPane().add(informacionPersonas);
		

				
				
		
		
		
		JComboBox<Object> persona1aComparar = new JComboBox<Object>();
		persona1aComparar.setModel(new DefaultComboBoxModel<Object>(new String[] {"Selecciona una persona para comparar", "Juan", "José", "María ", "Ana", "Pepe", "Marta", "Francisco", "David", "Julia", "Alba"}));
		persona1aComparar.setToolTipText("Selecciona una persona para comparar");
		persona1aComparar.setMaximumRowCount(11);
		persona1aComparar.setBounds(28, 278, 258, 20);
		ventanaAfinity.getContentPane().add(persona1aComparar);
		
		JComboBox<Object> persona2aComparar = new JComboBox<Object>();
		persona2aComparar.setModel(new DefaultComboBoxModel<Object>(new String[] {"Selecciona otra persona para comparar", "Juan", "José", "María ", "Ana", "Pepe", "Marta", "Francisco", "David", "Julia", "Alba"}));
		persona2aComparar.setToolTipText("Selecciona otra persona para comparar");
		persona2aComparar.setMaximumRowCount(11);
		persona2aComparar.setBounds(28, 322, 258, 20);
		ventanaAfinity.getContentPane().add(persona2aComparar);
		
		Button botonComparar = new Button("Comparar");
		botonComparar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					
				
				
			}
		});
		botonComparar.setActionCommand("Comparar");
		botonComparar.setBounds(28, 361, 70, 22);
		ventanaAfinity.getContentPane().add(botonComparar);
		
 }

	public void setVisible(boolean b) {
		
		
	}
}