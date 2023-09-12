package Proyecto_1;

public class Cajero extends Perfiles_De_Usuario{
	
	private static String clave_Cajero;

	public Cajero(String nombre, String correo) {
		super(nombre, correo);
		
	}
	
	public void crear_Clave() {
    	System.out.print("----------------------------------------------------------\n"
    			         +"Ingrese su clave de cajero:");
    	this.clave_Cajero = reader.next();
    	System.out.println("----------------------------------------------------------");
    	
    }
	
	public void mostrar_Contenido_C() {
		System.out.println("Su clave es:"+clave_Cajero);
	}

}
