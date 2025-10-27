import java.util.Scanner;
public class Hello {
	
	public static void main(String[] args) {
	String fullName="";
	Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour & bienvenu dans mon programme Java");
		System.out.println("Quel est votre nom ? :");
		String firstName = sc.nextLine();
		System.out.println("Quel est votre prénom ? :");
		String lastName = sc.nextLine();
		fullName=firstName+" "+ lastName;
		System.out.println("Salut "+fullName);

	}
}