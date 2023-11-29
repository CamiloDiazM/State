package ProyectoAutomatas;

public class ConduccionAutomatica implements EstadoAutomovil {
	Automovil auto;
	public void encender() {
		System.out.println("El sistema del auto ya está encendido.");
	}

	public void apagar() {
		System.out.println("El sistema del auto está apagado.");
	}

	public void conducirManual() {
		System.out.println("Encienda el sistema del auto para poder acceder a las demás funciones.");
	}

	public void conducirAutomatico() {
		System.out.println("Modo de conducción automática activado.");
	}

	public void estacionar() {
		System.out.println("Estacionando el auto.");
	}

	public void setAutomovil(Automovil auto) {
		this.auto = auto;
	}
}