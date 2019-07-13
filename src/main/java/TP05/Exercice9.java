package TP05;

import java.util.Scanner;
//TP05
public class Exercice9 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		double[] nombreChoisi= new double[10];
		double valeurMax=0;
		short i=0;
		
		
		System.out.println("Veuillez entrer 10 nombres:");
		
		do{
		
			nombreChoisi[i]= scanner.nextInt();
		
			if (nombreChoisi[i]>valeurMax) {
			
				valeurMax=nombreChoisi[i];
			}
		
			i++;
		
	
		} while (i<10);
			
			System.out.println("Le plus grand des nombres tap�s est : "+ valeurMax);
	}

}
