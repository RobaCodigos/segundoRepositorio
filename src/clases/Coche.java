package clases;

import java.util.Scanner;

public class Coche extends Vehiculo{
	Scanner sc=new Scanner(System.in);
	private Integer numPuertas;

	public Integer getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}
	public void setDatos() {
		super.setDatos();
		System.out.println("Introduce numero de puertaas");
		numPuertas=sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString()+"Coche [numPuertas=" + numPuertas + "]";
	}
	public boolean esFaminiar() {
		
		
		
		
		return numPuertas>=4;
	}
	
}
