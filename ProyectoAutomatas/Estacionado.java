package ProyectoAutomatas;

public class Estacionado implements EstadoAutomovil {
	Automovil auto;
	public void encender() {
		System.out.println("El sistema esta encendido");
	}

	public void apagar() {
		System.out.println("El sistema ha sido apagado");
	}

	public void conducirManual() {
		System.out.println("Activando el modo de conduccion manual");
	}

	public void conducirAutomatico() {
		System.out.println("Estacionando el auto");
	}

	public void estacionar() {
		System.out.println("El auto ha sido estacionado");
	}

	public void setAutomovil(Automovil auto) {
		this.auto = auto;		
	}

}