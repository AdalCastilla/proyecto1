package Examen1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el numero que quiera realizar\n");
		System.out.println("1.De vocales a mayuscula\n 2.FizzBuzz\n 3.Primera letra a mayuscula\n 4.Invertir una palabra\n 5.Palindromo");
		Examen examen = new Examen();
		int choose = scan.nextInt();
		
		switch (choose) {
		
		case 1:
		//Vocales a mayusculas
		System.out.println("Ingrese su palabra");
		String palabra = scan.next();
		String vocalesaMayuscula = examen.vocalamayuscula(palabra);
		System.out.println("Palabras con vocales en Mayuscula= "+vocalesaMayuscula);
		break;
		
		
		case 2:
		//FizzBuzz
		examen.FizzBuzz();
		break;
		
		
		case 3:
		//primera letra a mayuscula
		System.out.println("Ingrese su palabra");
		String palabra2 = scan.next();
		String pM = examen.primeraMayuscula(palabra2);
		System.out.println(pM);
		break;
		
		
		case 4:
		//invertir una palabra 
		System.out.println("Ingrese su palabra");
		String palabra3= scan.next();
		String invertirpalabra = examen.invertirPalabra(palabra3);
		System.out.println(invertirpalabra);
		break;
		
		case 5:
		//palabra palindroma	
		System.out.println("Ingrese su palabra sin espacios");
		String palabra4= scan.next();
		boolean palindroma =examen.esPalindromo(palabra4);
		if (palindroma==true)
		{
			System.out.println("Es palindroma");
		}else {
			System.out.println("No Es palindroma");
		}
		    break;
		    default:System.out.println("Invalido");
		
		}
		
		
		
		
		
		scan.close();
	}
	
}
