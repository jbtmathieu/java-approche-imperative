import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		int nombreChoisi = 0;
		
		double somme= 0;
		
		System.out.println("Veuillez choisir un nombre:");
		nombreChoisi= scanner.nextInt();
		
		for (double i = 1;i<=nombreChoisi;i++) {
			
			somme = somme+i;
			
		}
		
		System.out.println("La somme des nombres compris entre ce nombre et "+ nombreChoisi +" est : " + somme);	
		
	}

}
