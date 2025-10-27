import java.util.Scanner;
import java.lang.Math;

public class Test {
	
	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String oddOrEven = "";
    		boolean isInteger = false;
    		int number = 0;
    		System.out.println("Bonjour & bienvenue dans mon programme Java");
		System.out.println("Entrez un nombre entier :");

    		while (!isInteger) {
        		if (sc.hasNextInt()) {
            			number = sc.nextInt();

            			oddOrEven = (number % 2 == 0) ? "pair" : "impair";

            				if (number > 0) {
                				System.out.println("Votre nombre est positif et " + oddOrEven);
            				} else if (number == 0) {
                				System.out.println("Votre nombre est égal à zéro.");
            				} else {
                				System.out.println("Votre nombre est négatif et " + oddOrEven);
            				}
            			isInteger = true;
            
        		} else {
           
            			sc.next(); 
            			System.out.println("Entrée invalide, merci de saisir un entier :"); 	
        		}
    		}

	}
}	