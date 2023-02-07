package Examen1;

public class Examen {
public String palabra;


//Vocales a Mayuscula 
public String vocalamayuscula(String palabra ) {
	palabra=palabra.replace('a', 'A');
	palabra=palabra.replace('e', 'E');
	palabra=palabra.replace('i', 'I');
	palabra=palabra.replace('o', 'O');
	palabra=palabra.replace('u', 'U');
	return palabra;
}
//FuzzBuzz
public void FizzBuzz() {
	
	for (int i=1; i<=100; i++)
	{
		if (i%3==0 && i%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(i%3==0) {
			System.out.println("Fizz");
			
		}else if (i%5==0){
			System.out.println("Buzz");	
		}else {
			System.out.println(i);
		}
	}
}
//Primera letra mayuscula
public String primeraMayuscula(String parametro) {
	
	if (parametro.length()>0) {
		char primeraletra=parametro.charAt(0);
		parametro=Character.toUpperCase(primeraletra)+parametro.substring(1, parametro.length());
	}
	return parametro; 	
}

//para invertir una palabra
public String invertirPalabra(String palabra) {
	palabra = new StringBuilder(palabra).reverse().toString();
	return palabra;
}

//Palabra palindromo
public boolean esPalindromo(String palabra) {
	palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
			.replace("ú", "u").replace(".", "").replace(",", "");
	palabra = palabra.replace(" ","");		
	for(int i = 0, j = palabra.length()- 1; i<=j; i++, j--) {
		
		if (palabra.charAt(i) != palabra.charAt(j)) {
			return false;
		    }
		
		} 
			return true;
		
	}
	
}



