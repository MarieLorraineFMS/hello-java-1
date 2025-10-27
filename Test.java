import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);         
	String oddOrEven = ""; // Part : 2.2            
	boolean isInteger = false; //Part : 2.3         
    	int number = 0;                               
        

        System.out.println("Bonjour & bienvenue dans mon programme Java");

        // CLI Mode -  Part : 2.4
        if (args.length > 0) {                         // si un argument est passé en ligne de commande
   
            String arg = args[0];                      // on récupère l'argument
            boolean isNumeric = true;                  
            int i = 0;

            if (arg.length() > 0 && (arg.charAt(0) == '-' || arg.charAt(0) == '+')) {
                i = 1;                                 // si signe présent, on démarre après
		    }

            while (i < arg.length()) {                // vérif caractère par caractère
                if (arg.charAt(i) < '0' || arg.charAt(i) > '9') {
                    isNumeric = false;                 // si caractère invalide
                }
                i++;
            }

            if (isNumeric && arg.length() > 0) {       // si format correct : 
                number = Integer.parseInt(arg);        // on parse en entier
                isInteger = true;                      // on marque qu'on a un entier
            } else {
                System.out.println("Argument invalide."); // message si format incorrect
            }
        }

        // Classic Mode
        if (!isInteger) {                               // si pas d'entier via CLI, on passe au clavier
            System.out.println("Entrez un nombre entier :");
            String line = sc.nextLine();                // lecture entrée

            
            if (!line.isEmpty()) {                      // si line !vide
                boolean isNumeric = true;               
                int i = 0;                              

                if (line.charAt(0) == '-' || line.charAt(0) == '+') {
                    i = 1;                             // si signe, on skip
                }

                while (i < line.length()) {             // vérif caractère par caractère
                    if (line.charAt(i) < '0' || line.charAt(i) > '9') {
                        isNumeric = false;              // si caractère invalide
                    }
                    i++;
                }

                if (isNumeric) {                        // si numeric
                    number = Integer.parseInt(line);    // on parse en entier
                    isInteger = true;                   // on marque qu'on a un entier
                } else {
                    System.out.println("Entrée invalide."); // message si format incorrect
                }
            }

                while (!isInteger) {                    // boucle tant qu'on n'a pas d'entier
                System.out.print("Entrez un nombre entier : ");
                if (sc.hasNextInt()) {                  // vérifie si la prochaine entrée est un int
                    number = sc.nextInt();              
                    isInteger = true;                   // on peut sortir de la boucle
                } else {
                    sc.next();                          // consomme l'entrée invalide, on passe à la suite ->prompt...test entrée...
                    System.out.println("Entrée invalide, merci de saisir un entier.");
                }
            }
        }

        oddOrEven = (number % 2 == 0) ? "pair" : "impair"; // calcul pair/impair

        if (number > 0) {
            System.out.println("Votre nombre est positif et  " + oddOrEven); // cas > 0
        } else if (number == 0) {
            System.out.println("Votre nombre est égal à zéro.");              // cas == 0
        } else {
            System.out.println("Votre nombre est négatif et " + oddOrEven);   // cas < 0
        }

    }
}
