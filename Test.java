import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	String oddOrEven = ""; // Part : 2.2
	boolean isInteger = false; //Part : 2.3
        int number = 0;
        

        System.out.println("Bonjour & bienvenue dans mon programme Java");

        // CLI Mode -  Part : 2.4
        if (args.length > 0) {
   
            String arg = args[0];
            boolean isNumeric = true;
            int i = 0;

            if (arg.length() > 0 && (arg.charAt(0) == '-' || arg.charAt(0) == '+')) {
                i = 1;
		    }

            while (i < arg.length()) {
                if (arg.charAt(i) < '0' || arg.charAt(i) > '9') {
                    isNumeric = false;
                }
                i++;
            }

            if (isNumeric && arg.length() > 0) {
                number = Integer.parseInt(arg);
                isInteger = true;
            } else {
                System.out.println("Argument invalide.");
            }
        }

        // Classic Mode
        if (!isInteger) {
            System.out.println("Entrez un nombre entier :");
            String line = sc.nextLine();

            
            if (!line.isEmpty()) {
                boolean isNumeric = true;
                int i = 0;

                if (line.charAt(0) == '-' || line.charAt(0) == '+') {
                    i = 1; // skip sign
                }

                while (i < line.length()) {
                    if (line.charAt(i) < '0' || line.charAt(i) > '9') {
                        isNumeric = false;
                    }
                    i++;
                }

                if (isNumeric) {
                    number = Integer.parseInt(line);
                    isInteger = true;
                } else {
                    System.out.println("Entrée invalide, on passe en mode interactif.");
                }
            }

                while (!isInteger) {
                System.out.print("Entrez un nombre entier : ");
                if (sc.hasNextInt()) {
                    number = sc.nextInt();
                    isInteger = true;
                } else {
                    sc.next(); // consomme l'entrée invalide
                    System.out.println("Entrée invalide, merci de saisir un entier.");
                }
            }
        }

        oddOrEven = (number % 2 == 0) ? "pair" : "impair";

        if (number > 0) {
            System.out.println("Votre nombre est positif et " + oddOrEven);
        } else if (number == 0) {
            System.out.println("Votre nombre est égal à zéro.");
        } else {
            System.out.println("Votre nombre est négatif et " + oddOrEven);
        }
    }
}
