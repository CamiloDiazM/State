package ProyectoAutomatas;

import java.util.Scanner;

public class Main {
	Automovil auto = new Automovil();

	public static void error() {
		System.out.println("Error, opcion errada");
	}

	public void inicio() {
		Scanner teclado = new Scanner(System.in);
		int opc;
		do {
			System.out.println("Selecione que desea hacer con el automovil");
			System.out.println("1. Encender");
			System.out.println("2. Activar la conduccion manual");
			System.out.println("3. Activar la conduccion automatica");
			System.out.println("4. Estacionar");
			System.out.println("5. Apagar");
			opc = teclado.nextInt();
			switch (opc) {
			case 1: {
				auto.encender();
			}
				break;
			case 2: {
				auto.conducirManual();
			}
				break;
			case 3: {
				auto.conducirAutomatico();
			}
				break;
			case 4: {
				auto.estacionar();
			}
				break;
			case 5: {
				auto.apagar();
			}
				break;
			default:
				error();
				break;
			}
		} while (opc != 5);
	}

	public static void main(String[] args) {
		Automovil auto = new Automovil();
		Main in = new Main();
		in.inicio();
	}
}