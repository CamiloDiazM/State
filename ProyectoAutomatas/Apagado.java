package ProyectoAutomatas;

public class Apagado implements EstadoAutomovil {
	   private Automovil auto;

	    public Apagado(Automovil auto) {
	        this.auto = auto;
	    }

	    public void encender() {
	        System.out.println("El sistema del auto está encendido.");
	        auto.cambiarEstado(new Encendido());
	    }

	    public void apagar() {
	        System.out.println("El sistema del auto está apagado.");
	    }

	    public void conducirManual() {
	        System.out.println("Encienda el sistema del auto para poder acceder a las demás funciones.");
	    }

	    public void conducirAutomatico() {
	        System.out.println("Encienda el sistema del auto para poder acceder a las demás funciones.");
	    }

	    public void estacionar() {
	        System.out.println("Encienda el sistema del auto para poder acceder a las demás funciones.");
	    }
}