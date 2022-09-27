package ui;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int Opcion= 0;
		Scanner scan =new Scanner(System.in);
		do {
			
			System.out.println("1: Generar numero aleatorio");
			System.out.println("2: Sumar 2 numeros");
			System.out.println("3: Salir");
			System.out.println("\nIngresar Opcion");
			Opcion = scan.nextInt();
			
			switch (Opcion) {
			case 1:
				System.out.println("\n1: Generar numero aleatorio\n");
				break;
				
			case 2:
				System.out.println("\n2: Sumar 2 numeros\n");
				break;
			}
		}while(Opcion !=3);
		
		System.out.println("\nPrograma Finalizado");

	}

}
