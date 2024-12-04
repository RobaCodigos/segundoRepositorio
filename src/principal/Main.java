package principal;

import clases.Coche;
import clases.Moto;
import clases.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hola");
		
		
		
		
		//voy a crear un vehiculo
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setDatos();
		
		System.out.println("El vehiculo introducido es "+ vehiculo);
		
		//crear coche
		vehiculo  =new Coche();
		vehiculo.setDatos();
		
		System.out.println("El coche introducido es "+vehiculo);
		
		
		//crear moto
		
		System.out.println("Introduce moto");
		vehiculo=new Moto();
		vehiculo.setDatos();
		
		System.out.println("La moto introducido es "+vehiculo);
	}

}
