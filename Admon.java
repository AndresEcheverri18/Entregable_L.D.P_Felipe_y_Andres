package Proyecto_1;
import java.util.Scanner;
public class Admon extends Perfiles_De_Usuario{
	
	Scanner reader = new Scanner(System.in);
	private static String clave_Admon;
	       
	       
	public Admon(String nombre, String correo) {
		super(nombre, correo);
		
					
	}
	
    public void crear_Clave() {
    	System.out.print("----------------------------------------------------------\n"
    			         +"Ingrese su clave de Administrador:");
    	this.clave_Admon = reader.next();
    	System.out.println("----------------------------------------------------------");
    	
    }
	
	public void mostrar_Contenido_A() {
		System.out.println("Su clave es:"+ clave_Admon);
	}

			
	
}
