package clases;

import java.util.Scanner;

public class Vehiculo {

	//atributos
	private String matricula;
	private int caballos;
	
	Scanner sc=new Scanner(System.in);
	
	
	//getters and setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCaballos() {
		return caballos;
	}
public void setCaballos(int caballos) {
		this.caballos = caballos;
	}



//toString
	@Override
public String toString() {
	return "Vehiculo [matricula=" + matricula + ", caballos=" + caballos + "]";
}
	//set datos
	public void setDatos() {
		// TODO Auto-generated method stub
		System.out.println("Introduce matricula");
		matricula=sc.next();
		System.out.println("Introduce caballos");
		caballos=sc.nextInt();
		
	}
	
	
	
	
}
