import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		int nombreChoisi=0;
		boolean conditionA = false;
		boolean conditionB = false;
		
		System.out.println("Veuillez choisir une valeur comprise entre 0 et 10 :");

	
		while (conditionA !=true && conditionB !=true)	{
			
			nombreChoisi= scanner.nextInt();
		
			
			// <1
		 if (nombreChoisi<1 ) { // && nombreChoisi<10) {
			 
			System.out.println("Ce nombre est trop petit, veuillez recommencer.");
			System.out.println("Veuillez choisir une valeur comprise entre 0 et 10 :");
			
		 	}else {
		 		
		 		conditionA = true;
		 	}
		 	
		 
		 // <10
		 if (nombreChoisi>10) {
		 
			System.out.println("Ce nombre est trop grand, veuillez recommencer.");
			System.out.println("Veuillez choisir une valeur comprise entre 0 et 10 :");
					
			}else {
		 		
		 		conditionB = true;
		 	}
		}
		
		System.out.println("Nombre choisi : "+ nombreChoisi);
	 	System.out.println("Fin du programme");
		
	}

}
