import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Affichage de la table du nombre */
		Scanner scanner= new Scanner(System.in);
		int chiffreChoisi;
		System.out.println("Veuillez choisir une valeur comprise entre 0 et 10 :");
		chiffreChoisi= scanner.nextInt();
		
		if (chiffreChoisi>1 && chiffreChoisi<10) {
			
		System.out.println("Table de " + chiffreChoisi +" :");
			
			for (int i=1;i<=10;i++){
	
				System.out.println(chiffreChoisi + " * " + i + " = "+ chiffreChoisi*i);

			}
				
			}else {
				System.out.println("La valeur n'est pas comprise entre 0 et 10.");
				System.out.println("Fin du programme");
		
		}
	}

}
