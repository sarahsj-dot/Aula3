package aula3;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		// Exercicio 2
		
		Scanner sc = new Scanner(System.in);
		double larguraQ = 0, alturaQ = 0, area = 0, pe, diagonalQ = 0; 
		
		System.out.printf("Digite a largura do quadrado: %.1f", larguraQ);
		larguraQ = sc.nextDouble();
		System.out.printf("Digite a altura do quadrado: %.1f", alturaQ);
		alturaQ = sc.nextDouble();
		area = larguraQ + alturaQ;
		pe = larguraQ *2 + alturaQ *2;
		diagonalQ = Math.pow(larguraQ * larguraQ, diagonalQ);
		System.out.printf("Área = %.4f", area);
		System.out.printf("Perímetro = %.4f", pe);
		System.out.printf("Diagonal: %.4f", diagonalQ);
		
		sc.close();
	
	}
}