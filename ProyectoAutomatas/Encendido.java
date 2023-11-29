package ProyectoAutomatas;

public class Encendido implements EstadoAutomovil {
	Automovil auto;

	public void encender() {
		System.out.println("El sistema esta en funcionamiento");
	}

	public void apagar() {
		System.out.println("El sistema del auto se apago");
	}

	public void conducirManual() {
		System.out.println("Activando el modo de conduccion manual");
	}

	public void conducirAutomatico() {
		System.out.println("Activando el modo de conduccion automatica");
	}

	public void estacionar() {
		System.out.println("Estacionando el auto");
	}

	public void setAutomovil(Automovil auto) {
		this.auto = auto;
	}

}