import java.util.Scanner;
//TP05
public class Exercice5 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		int nombreChoisi;
		System.out.println("Veuillez choisir un nombre : ");
		nombreChoisi= scanner.nextInt();
		
		for (int i=0; i<10;i++) {
			
			System.out.println(nombreChoisi+i+1);
		}
		
	}

}
