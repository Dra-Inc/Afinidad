  package codigo;
 
  import javax.swing.JOptionPane;
  import Ventana.AfinidadV;


  public class Personas {
	
   /**
	 * @author Carlos Y Alex.
	 * @version: 05/03/2020
	 */
	  
	 private int id;
	 private int edad;
	 private String nombre;
	 String Aficiones [][] = {{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
			 { " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
			 { " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
			 { " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" }};
	
	 
	 //private Aficion aficionesPersona; 
	
     public Personas(int id, String nombre,int edad) {
		 
		  id = 0;
		 
		  
		 //aficionesPersona = 
		
	  }
	
	 
	 public Personas() {
		
	  }

   /**
     * @author drainED.
	 * @version: 02/03/2020
	 */
	 

	 public int getId() {
		  return id;
	  }
	
	  public int getEdad() {
		 return edad;
	  }
	
	  public String getNombre() {
		 return nombre;
	  }
	
	  public void setId(int id) {
		 this.id = id;
	  }
	
	  
   /**
	 *@author: carlos.
	 *@deprecated: setters sin uso. 
	 *
	 *public void setEdad(int edad) {
	 *this.edad = edad;
	 *} 
     *public void setNombre(String nombre) {
	 *this.nombre = nombre;
	 *}
	 */
   
	  
	/**
	 * 
	 * @author: carlos.
	 * @version: 04/03/2020.
	 * 
	 * */  
	  
	  public void setNombre(String nombre) {
			 this.nombre = nombre;
	
			 nombre = JOptionPane.showInputDialog(" Introduce tu edad ");
	  }
	  
	  
	  public void setEdad(int edad) {
			 this.edad = edad;
			
			 edad =Integer.parseInt( JOptionPane.showInputDialog(" Introduce tu edad ")) ;
	  }
	  
	 public void sonAfines (boolean afines, int afinidad) {
		 afines = false;
		 afinidad = 0;
		 for (int s = 0; s<Aficiones.length;s++){
			 for (int r=0; r<Aficiones.length;r++) {
	            if (Aficiones[r]==Aficiones[s]) {
	            	afinidad++;
	            	if (afinidad>=3) {
	            		afines=true;
	            		System.out.println("Son afines");
	            	} else {
	            		System.out.println("No son afines");
	            	}
	            }
			 }
		 
		}
	 }
	  
   /**
	 *@author: carlos.
	 *@deprecated: setters sin uso. 
	 *
	 *public Afinidad getAficionesPersona() {
	 *return aficionesPersona;
	 *}
	 */
	 
   /**@author: carlos.
	 *@deprecated: setters sin uso.
	 * 
	 * public void setAficionesPersona(Afinidad aficionesPersona) {
	 *this.aficionesPersona = aficionesPersona;
	 *}
	 */

	
	  
	public static void main(String[] args) {
	
		

		
   /**
	 * @author drainED.
	 * @version: 02/03/2020
	 * 
	 * int [] Edades = new  int [10];	 
	 * Edades[0]  = 12;
	 * Edades[1]  = 20;
	 * Edades[2]  = 20;
	 * Edades[3]  = 30;
	 * Edades[4]  = 50;
	 * Edades[5]  = 16;
	 * Edades[7]  = 30;
	 * Edades[8]  = 20;
	 * Edades[9]  = 25;
	 * 
	 *String []  Nombres = new String [10] ;
	 *	
	 * Nombres[0]  = " Pascual ";
	 * Nombres[1]  = " julio ";
	 * Nombres[2]  = " Pascual ";
	 * Nombres[3]  = " Pascual ";
	 * Nombres[4]  = " Pascual ";
	 * Nombres[5]  = " Pascual ";
	 * Nombres[6]  = " Pascual ";
	 * Nombres[7]  = " Pascual ";
	 * Nombres[8]  = " Pascual ";
	 * Nombres[9]  = " Pascual ";
	 * int [] id = new int [ 10 ];
	 * 
	 * 
	 * 
	 */
		
		  /**
		  *@author: Carlos y alex.
		  *@version: 05/03/2020.*/
	
		Personas obj = new Personas ();
		
		
		
		int  i = 0;
		
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
		 
		
		        /**
				  *@author: Carlos.
				  *@version: 05/03/2020.
				  *
				  * array bidimensional de Aficiones;
				  *  String Aficiones [][] = {{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
				  * { " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
				  *{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" },
				  *{ " Jardineria", "Bricolaje", "Pintura ","Videojuegos"," Jardineria", "Bricolaje", "Pintura ","Videojuegos","Pintura ","Videojuegos" }};
				  *
				  */
		 
		 
		 
	
		
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
		 
		 /**
		  * 
		  * @author carlos.
		  * @version: 04/03/2020
		  * 
		  * 		 obj.setEdad();
		  *obj.setNombre();
		  *obj.setId(obj.id = id[i]+1);		
		  * for (int  j = 0 ; j < Nombres.length; j++) {
		  *	 
		  *	obj.setId(obj.id = Edades [i]+1);
		  *		
		  *	System.out.println( " Nombre: " +  Nombres[i] +  " Edad: " + Edades[i] + " id: " + obj.id);
		  * 
		  * 
		  */
		
	    /**
		  *@author: Carlos.
		  *@version: 04/03/2020. 
		  *
		  *obj.setEdad(obj.edad);
		  *obj.setNombre(obj.nombre);
		  *
		  */
		 
		
		 
		  for (  i = 0 ; i < Nombres.length; i++) {
			 
			//  obj.setId(obj.id = Integer.parseInt(id.length));
				
			  System.out.println( " Nombre: " +  Nombres[i] +  " Edad: " + Edades[i] + " id: " + id[i] );			  
		}
		
		  
		  
		  
		  /**
		   * 
		   * @author carlos y Alex. 
		   * @version 05/03/2020.
		   * 
		   * 
		   * "llama a la ventana".
		   * AfinidadV window = new AfinidadV();
		   *window.setVisible(true);
		   */
			AfinidadV window = new AfinidadV();
			window.setVisible(true);
		 
  }
 }
