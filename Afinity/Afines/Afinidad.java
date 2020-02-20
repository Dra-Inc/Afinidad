 package Afines;

 public class Afinidad {

   /*	
	*constructor para pillar el metodo de Afinidades.
	*Afinidades e1 = new Afinidades ();
	*metodo para crear la instrucción sonAfines.
	*public void  sonAfines( boolean sonAfines) {
	*sonAfines = false;//igualada a falso porque al principio no son afines.
	*if(  ) {
    *}}public String getAfines() { return "";}
	*/
private String nombreAfinidad;
	 
	 public Afinidades() {
	
	}
	 
	 public int getNombreAfinidad() {
		return nombreAfinidad;
	}
	 
	 public void setNombreAfinidad(String nombreAfinidad) {
		this.nombreAfinidad = nombreAfinidad;
	}
	 
	 public static void main(String[] args) {
		
		 //afinidad 1
		 Afinidad a1 = new Afinidad ();
		 a1.setNombreAfinidad("jardineria");
		 
		 //afinidad 2
		 Afinidad a2 = new Afinidad ();
		 a2.setNombreAfinidad("bricolaje");
		 
		//afinidad 3
		 Afinidad a3 = new Afinidad ();
		 a3.setNombreAfinidad("deportes");
		 
		//afinidad 4
		 Afinidad a4 = new Afinidad ();
		 a4.setNombreAfinidad("musica");
		 
		//afinidad 5
		 Afinidad a5 = new Afinidad ();
		 a5.setNombreAfinidad("videojuegos");
		 
		//afinidad 6
		 Afinidad a6 = new Afinidad ();
		 a6.setNombreAfinidad("pintura");
		 
		//afinidad 7
		 Afinidad a7 = new Afinidad ();
		 a7.setNombreAfinidad("moda");
		 
	}

 
 }
