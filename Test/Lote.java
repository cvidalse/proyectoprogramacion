package testing;

import java.util.Random;

public class Lote {
	private String disponibilidad;
	private Random azar;

	public Lote() {
		this.azar = new Random();
		this.disponibilidad = obtenerDisponibilidad();	
	}
	
	private int signal() { 
		int segnal = this.azar.nextInt(2);
		return segnal;
	}
	
	private String obtenerDisponibilidad() {
		int a = signal();
		if(a == 1) {
			return "Ocupado";
		}else {
			return "Disponible";
		}
	}
	
	public String getDisponibilidad() {
		return this.disponibilidad;
	}
	
	public void mostrar() {
		System.out.println(this.disponibilidad);
	}

}