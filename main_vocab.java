package Vocabolario;

import java.util.Random;
import java.util.Scanner;

public class main_vocab {

	public static void main(String[] args) {
		System.out.println("\nQuanti libri vuoi?\n");
		Scanner scanner = new Scanner(System.in);
		
		int nL = scanner.nextInt();
		System.out.println("\nE quanti dizionari?\n");
		int nV = scanner.nextInt();
		Libro[] libro_array = new Libro[nL];
		Vocabolario[] vocabolario_array = new Vocabolario[nV];
		Random random = new Random();
		
		System.out.println("\n----------------------------\nLIBRI:\n");

		for(int i=0;i<nL;i++) {
			int x=random.nextInt(400);
			libro_array[i]= new Libro(x);
			int nlib = i+1;
			System.out.println("Libro numero "+nlib+"] : ");
			libro_array[i].msgNumPagine();
		}
		
		System.out.println("\n----------------------------\nVOCABOLARI:\n");
		for(int i=0;i<nV;i++) {
			int x=random.nextInt(400);
			int y=random.nextInt(500)+400;
			vocabolario_array[i]= new Vocabolario(x,y);
			int nvoc=i+1;
			System.out.println("Vocabolario numero "+nvoc+"] : ");
			vocabolario_array[i].msgNumPagine();
		}
		
		
		
	}
	
}
