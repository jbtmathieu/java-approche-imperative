import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		int nombreChoisi=0;
		boolean end = false;
		
		
		System.out.println("Veuillez choisir une valeur comprise entre 0 et 10 :");

	
		while (end==false)	{
			
			nombreChoisi= scanner.nextInt();
		
		 if (nombreChoisi>1 && nombreChoisi<10) {
			
				
		 	end = true;
		 	System.out.println("Nombre choisi : "+ nombreChoisi);
		 	System.out.println("Fin du programme");
					
			}else {
				System.out.println("La valeur n'est pas comprise entre 0 et 10.");
				System.out.println("Veuillez choisir une valeur comprise entre 0 et 10 :");		
		}
		
	}

}
}
