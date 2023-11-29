package ProyectoAutomatas;

public class Apagado implements EstadoAutomovil {
	   private Automovil auto;

	    public Apagado(Automovil auto) {
	        this.auto = auto;
	    }

	    public void encender() {
	        System.out.println("El sistema del auto est� encendido.");
	        auto.cambiarEstado(new Encendido());
	    }

	    public void apagar() {
	        System.out.println("El sistema del auto est� apagado.");
	    }

	    public void conducirManual() {
	        System.out.println("Encienda el sistema del auto para poder acceder a las dem�s funciones.");
	    }

	    public void conducirAutomatico() {
	        System.out.println("Encienda el sistema del auto para poder acceder a las dem�s funciones.");
	    }

	    public void estacionar() {
	        System.out.println("Encienda el sistema del auto para poder acceder a las dem�s funciones.");
	    }
}