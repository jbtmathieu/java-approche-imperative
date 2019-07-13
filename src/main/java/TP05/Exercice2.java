package TP05;

//TP05
public class Exercice2 {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		float somme = 0.0f;

		float moyenne= 0.0f;
		
		for (int i=0;i<array.length;i++) {
			
			somme = somme + array[i];
		}
		
		moyenne= somme/array.length;
		
		System.out.println("La somme des valeurs du tableau est : " + somme);
		System.out.println("La moyenne des valeurs du tableau est : " + moyenne);


	}

}
