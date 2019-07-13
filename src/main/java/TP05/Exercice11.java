package TP05;

import java.util.Scanner;
//TP05
public class Exercice11 {

	public static void main(String[] args) {
		//Fait � la maison
		int choix;
		int rangN = 0, cpt = 0;
		int valA=0,valB=1;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Choisir le rang N pour calcul de la suite de Fibonacci :");
		choix=scanner.nextInt();
		
		if (choix>1) {
			do{
				rangN=valA+valB;
				valA=valB;
				valB=rangN;
				
				cpt++;
			} while (cpt!=choix);
		
		System.out.println("La valeur du rang "+ choix + " est "+ rangN + ".");
	} else {
		System.out.println("Valeur trop petite.\nFin du programme.");
	}

}
}
