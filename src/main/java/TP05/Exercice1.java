package TP05;

//TP05 - Approche Imperative
public class Exercice1 {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		
		System.out.println("Taille tableau : "+ array.length);
		
		/* Affichage */
		System.out.println("Affichage :");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		//Passage � la ligne
		System.out.println();
		
		/* Ordre Inverse */
		System.out.println("Inverse :");
		for (int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		/* entiers sup�rieurs � trois */
		System.out.println("Entiers >3 :");
		for (int i=0;i<array.length;i++) {
			if(array[i]>3) {
			System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		
		/* Entier pairs */
		System.out.println("Entiers pairs :");
		for (int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
			System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		
		/* Index pairs */
		System.out.println("Index pairs :");
		for (int i=0;i<array.length;i++) {
			if(i%2==0) {
			System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		
		/* Entier impairs */
		System.out.println("Entiers impairs :");
		for (int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
			//;
			}else {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		
		/* Le plus grand �l�ment */
		System.out.println("Le plus grand �l�ment est :");
		
		int valeurMax=array[0];
		for (int i=0;i<array.length;i++) {
			if(array[i]>valeurMax) {
			valeurMax = array[i];
			}
		}
		System.out.println(valeurMax);
		
		
		/* Le plus petit �l�ment */
		System.out.println("Le plus petit �l�ment est :");
		
		int valeurMin=array[0];
		for (int i=0;i<array.length;i++) {
			if(array[i]<valeurMin) {
			valeurMin = array[i];
			}
		}
		System.out.println(valeurMin);
		
	}

}
