package ProyectoAutomatas;

public class Automovil {
	 private EstadoAutomovil estadoActual;

	    public Automovil() {
	        this.estadoActual = new Apagado(this);
	    }

	    public void cambiarEstado(EstadoAutomovil nuevoEstado) {
	        this.estadoActual = nuevoEstado;
	    }

	    public void encender() {
	        this.estadoActual.encender();
	    }

	    public void apagar() {
	        this.estadoActual.apagar();
	    }

	    public void conducirManual() {
	        this.estadoActual.conducirManual();
	    }

	    public void conducirAutomatico() {
	        this.estadoActual.conducirAutomatico();
	    }

	    public void estacionar() {
	        this.estadoActual.estacionar();
	    }
}