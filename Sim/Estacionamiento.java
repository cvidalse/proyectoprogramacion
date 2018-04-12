package testing;

import java.util.Scanner;
import java.util.ArrayList;
public class Estacionamiento {
	private ArrayList<Lote> parking;
	private int cantidad;
	private Scanner teclado;
	
	public Estacionamiento() {
		this.teclado = new Scanner(System.in);
		this.cantidad = Integer.parseInt(getCantidad());
		this.parking = crear(this.cantidad);
	}
	
	private boolean esNumero(String ingreso) {
		int numero;
		try {
			numero = Integer.parseInt(ingreso);
			if(numero < 1) {
				return false;
			}else {
				return true;				
			}
		}catch(Exception e) {
			return false;
		}
	}
	
	private String getCantidad() {
		System.out.println("Ingresa la cantidad de lotes del estacionamiento.");
		String entrada = this.teclado.nextLine();
		if(!esNumero(entrada)) {
			return getCantidad();
		}else {
			return entrada;
		}
	}
	
	
	public void mostrarE() {
		System.out.println("ESTACIONAMIENTO");
		for(int i=0;i<this.parking.size();i++) {
			System.out.print("\nLote N°"+(1+i)+": ");			
			this.parking.get(i).mostrar();
		}
	}
	
	public ArrayList<Lote> crear(int a){
		ArrayList<Lote> m = new ArrayList<Lote>();
		for(int i=0;i<a;i++) {
			m.add(new Lote());
		}
		return m;
	}
	
	public static void main(String[] args) {
		Estacionamiento m = new Estacionamiento();
		m.mostrarE();
		
	}

}
