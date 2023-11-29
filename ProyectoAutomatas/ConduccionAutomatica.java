package ProyectoAutomatas;

public class ConduccionAutomatica implements EstadoAutomovil {
	Automovil auto;
	public void encender() {
		System.out.println("El sistema del auto ya est� encendido.");
	}

	public void apagar() {
		System.out.println("El sistema del auto est� apagado.");
	}

	public void conducirManual() {
		System.out.println("Encienda el sistema del auto para poder acceder a las dem�s funciones.");
	}

	public void conducirAutomatico() {
		System.out.println("Modo de conducci�n autom�tica activado.");
	}

	public void estacionar() {
		System.out.println("Estacionando el auto.");
	}

	public void setAutomovil(Automovil auto) {
		this.auto = auto;
	}
}