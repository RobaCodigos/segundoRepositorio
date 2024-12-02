package clases;

import java.util.Scanner;

public class Moto extends Vehiculo {
	
	Scanner sc=new Scanner(System.in);

	private boolean tieneSidecar;

	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	public void setDatos() {
		super.setDatos();
		System.out.println("Tiene sidecar?");
		tieneSidecar=sc.next().equals("si");
	}

	@Override
	public String toString() {
		return "Es una Moto, con matricula "+super.getMatricula() +"y los caballos "+ super.getCaballos()+  "[tieneSidecar=" + tieneSidecar + "]";
	}
	
	
	
}
