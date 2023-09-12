package Proyecto_1;
import java.util.Scanner;
public class Perfiles_De_Usuario {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);	
		System.out.print("Ingrese su nombre:");
		String nombre = reader.next();
		System.out.print("Ingrese su correo:");
		String correo = reader.next();
		Perfiles_De_Usuario P1 = new Perfiles_De_Usuario(nombre,correo);
		P1.Asignar_Codigo_A_Perfil();
		System.out.println(P1);
		Admon A1 = new Admon(nombre,correo);
		A1.crear_Clave();
		A1.mostrar_Contenido_A();
		Cajero C1 = new Cajero(nombre,correo);
		C1.crear_Clave();
		C1.mostrar_Contenido_C();
		Cliente Cl1 = new Cliente(nombre,correo,234892,"Carrera 54B #7");
        Cl1.mostrar_Contenido_Cl();
		
		
	}
	
	
Scanner reader = new Scanner(System.in);	
private static int perfil_Admon = 1;
private static int perfil_Cajero = 2;
private static int perfil_Cliente = 3;

	private String nombre;
	private String correo;
	private int perfil;

	public Perfiles_De_Usuario(String nombre, String correo) {
	
		this.nombre = nombre;
		this.correo = correo;
	}	
	
	public void Asignar_Codigo_A_Perfil() {
		
		System.out.println("----------------------------------------------------------\n"
				           + "¡El encargado de asignar usuarios es el Administrador!\n"
				           + "----------------------------------------------------------");
		
		System.out.println("Ingrese su tipo de usuario: \n"
				+ "1) Administrador \n"
				+ "2) Cajero \n"
				+ "3) Cliente \n"
				+ "----------------------------------------------------------");
		int usuario  = reader.nextInt();
		
		if(usuario == 1) {
			System.out.println("----------------------------------------------------------\n"
				    +"Usted es el usuario Administrador");
			this.perfil= perfil_Admon;
		}else if(usuario == 2) {
			System.out.println("----------------------------------------------------------\n"
					+ "Usted es el usuario Cajero");
			this.perfil = perfil_Cajero;
		}else if(usuario == 3) {
			System.out.println("----------------------------------------------------------\n"
					+ "Usted es el usuario Cliente");
			this.perfil = perfil_Cliente;
		}
		
	}
	
	public void registrar_Venta() {
		System.out.println("Se ha registrado una venta");
	}
	
	public void consultar_Productos() {
		System.out.println("Hay x cantidad de productos");
	}

	@Override
	public String toString() {
		return "----------------------------------------------------------\n"
			 + "Su nombre es:" + nombre +"\n"
			 + "Su correo es:" + correo + "\n"
			 + "Su perfil es:"+perfil ;
	}

	
}
