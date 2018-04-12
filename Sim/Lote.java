package testing;

public class Lote {
	private String disponibilidad;

	public Lote() {
		this.disponibilidad = getDisponibilidad();	
	}
	
	private double signal() { //simulador señal/cambiar por timer/
		double segnal = Math.random();
		return segnal;
	}
	
	private boolean estadoLote() {
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
