package Afines;

public class Persona {
	
	 private int id;
	 private int edad;
	 private String nombre;
	 
	 private Afinidad afinidadesPersona; 
	
	 public Persona() {
		
		 id = 0;
		 edad = 0;
		 nombre = "";
		 afinidadesPersona = new Afinidad;
		
	 }
	
	 //metodos gettter y setter: 
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
	
	 public void setEdad(int edad) {
		 this.edad = edad;
	 } 
	
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	// !Aqui terminan los metodos¡
	
	public static void main(String[] args) {
		
		//pers 1
		Persona p1 = new Persona ();
		p1.setId(1);
		p1.setEdad(20);
		p1.getNombre("Juan");
		
		
		//pers 2
		Persona p2 = new Persona ();
		p2.setId(2);
		p2.setEdad(18);
		p2.getNombre("José");
		
		//pers 3
		Persona p3 = new Persona ();
		p3.setId(3);
		p3.setEdad(25);
		p3.getNombre("María");
		
		//pers 4
		Persona p4 = new Persona ();
		p4.setId(4);
		p4.setEdad(22);
		p4.getNombre("Ana");
		
		//pers 5
		Persona p5 = new Persona ();
		p5.setId(5);
		p5.setEdad(19);
		p5.getNombre("Pepe");

		//pers 6
		Persona p6 = new Persona ();
		p6.setId(6);
		p6.setEdad(23);
		p6.getNombre("Marta");

		//pers 7
		Persona p7 = new Persona ();
		p7.setId(7);
		p7.setEdad(22);
		p7.getNombre("Franciso");

		//pers 8
		Persona p8 = new Persona ();
		p8.setId(8);
		p8.setEdad(24);
		p8.getNombre("David");

		//pers 9
		Persona p9 = new Persona ();
		p9.setId(9);
		p9.setEdad(19);
		p9.getNombre("Julia");

		//pers 10
		Persona p10 = new Persona ();
		p10.setId(10);
		p10.setEdad(21);
		p10.getNombre("Alba");
		
		
	}
