package testing;

public class Lote {
	private String disponibilidad;

	public Lote() {
		this.disponibilidad = getDisponibilidad();	
	}
	
	private double signal() {
		// simula una señal
		double segnal = Math.random();
		return segnal;
	}
	
	private boolean estadoLote() {
		// de acuerdo a la "intensidad" de la señal emitida retorna verdadero o falso
		double a = signal();
		if(a<0.5) {
			return true;	 	
		}else {
			return false;
		}
	}
	
	private String getDisponibilidad() {
		if(!estadoLote()) {
			return "Ocupado";
		}else {
			return "Disponible";
		}
	}
	
	public void mostrar() {
		System.out.println(this.disponibilidad);
	}

}
