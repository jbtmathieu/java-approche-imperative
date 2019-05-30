import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fait à la maison
		
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		int choix;
		int i = 0,j=0 ;
		boolean fin=false;
		int[] array= new int[2];
		int[] array2=new int[1];
		
		while (fin!=true) {
		
		System.out.println("\n########################################");
		System.out.println("####            M E N U             ####");
		System.out.println("####                                ####");
		System.out.println("####    1. Aiouter un nombre        ####");
		System.out.println("####    2. Afficher le Tableau      ####");
		System.out.println("####    3. Quitter                  ####");
		System.out.println("####                                ####");
		System.out.println("########################################\n");
		System.out.println("Votre choix:");
		
		choix=scanner.nextInt();
		
		
		switch (choix) {
			case 1:
				if (i< array.length)
				{
					System.out.println("Taper le nombre à aiouter au tableau : <");
					array[i]=scanner.nextInt();
					i++;
					System.out.println("Valeur de i : " + i);
				} else if (i==array.length )
				{
					System.out.println("Traitement, veuillez patienter");
					array2 = new int[array.length+1];
					System.out.println("Taper le nombre à aiouter au tableau : ==");
					array2[i]=scanner.nextInt();
					for (j=0;j<i;j++) {
						array2[j]=array[j];
						System.out.println("Copie de " + array2[j]);
					}
					i++;
					System.out.println("Valeur de i : " + i);
				} else
				{
				//	if (i== array2.length){
						System.out.println("Traitement, veuillez patienter");
						array = new int[array2.length+1];
						System.out.println("Taper le nombre à aiouter au tableau : >");
						array[i]=scanner.nextInt();
						for (j=0;j<i;j++) {
							array[j]=array2[j];
							System.out.println("Copie de " + array[j]);
						}
						i++;
						System.out.println("Valeur de i : " + i);					
				}
				break;
				
			case 2:
				if (array.length>array2.length) 
				{
					for (j=0;j<array.length;j++)
					{
						System.out.print(array[j]+" ");
					}
				}else {

					for (j=0;j<array2.length;j++)
					{
						System.out.print(array2[j]+" ");
					}

				}
				System.out.println();
				break;
				
			case 3:
				fin=true;
				System.out.println("Fin du programme");
				break;	
				
			default:
				;
		}
		}
	}

}
