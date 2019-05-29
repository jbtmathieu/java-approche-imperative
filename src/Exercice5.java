import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		int nombreChoisi;
		System.out.println("Veuillez choisir un nombre : ");
		nombreChoisi= scanner.nextInt();
		
		for (int i=0; i<10;i++) {
			
			System.out.println(nombreChoisi+i+1);
		}
		
	}

}
