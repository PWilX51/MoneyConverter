package api;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	public static void menu() {
		System.out.println("*****************************************");
		System.out.println("1: Peso argentino -> Dolar");
		System.out.println("2: Dolar -> Peso argentino");
		System.out.println("3: Peso dominicano -> Dolar");
		System.out.println("4: Dolar -> Peso dominicano");
		System.out.println("5: Real brasileño -> Dolar");
		System.out.println("6: Dolar -> Real brasileño");
		System.out.println("7: Peso chileno -> Dolar");
		System.out.println("8: Dolar -> Peso chileno");
		System.out.println("9: Peso colombiano -> Dolar");
		System.out.println("10: Dolar -> Peso colombiano");
		System.out.println("11: Boliviano boliviano -> Dolar");
		System.out.println("12: Dolar -> Boliviano boliviano");
		System.out.println("13: Salir");
		System.out.println("*****************************************");
		System.out.print("Elija una opcion: ");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);

		menu();
		int lectura=0;
		
		while(lectura<13) {
			try {
				lectura = scanner.nextInt();
				System.out.print("Ingresa el valor: ");
				double valor = scanner.nextDouble();
				double valor_convertido=0;
				Conexion conexion;
				switch(lectura) {
					case 1:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "ARS");
						valor_convertido=conexion.ars_usd(valor);
						break;
					case 2:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "USD");
						valor_convertido=conexion.usd_ars(valor);
						break;
					case 3:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "DOP");
						valor_convertido=conexion.dop_usd(valor);
						break;
					case 4:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "USD");
						valor_convertido=conexion.usd_dop(valor);
						break;
					case 5:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "BRL");
						valor_convertido=conexion.brl_usd(valor);
						break;
					case 6:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "USD");
						valor_convertido=conexion.usd_brl(valor);
						break;
					case 7:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "CLP");
						valor_convertido=conexion.clp_usd(valor);
						break;
					case 8:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "USD");
						valor_convertido=conexion.usd_clp(valor);
						break;
					case 9:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "COP");
						valor_convertido=conexion.cop_usd(valor);
						break;
					case 10:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "USD");
						valor_convertido=conexion.usd_cop(valor);
						break;
					case 11:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "BOB");
						valor_convertido=conexion.bob_usd(valor);
						break;
					case 12:
						conexion = new Conexion("5a6a3539416e937af43b4b4d", "USD");
						valor_convertido=conexion.usd_bob(valor);
						break;
				}
				System.out.println("\nEl valor convertido es: "+valor_convertido);
				menu();
			} catch(Exception e) {
				System.out.println("Error debes ingresar el valor entero"+e.getMessage());
			}
		}
		
	}
}
