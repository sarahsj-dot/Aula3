package aula3;

import java.util.Scanner;

public class calculando {

	public static void main(String[] args) {
		// Exercicio 1
		
		Scanner sc = new Scanner(System.in);
		double l = 0, c = 0, metroQ = 0, area, custo; 
		
		System.out.printf("Digite a largura do cômodo: %.2f", l);
		l = sc.nextDouble();
		System.out.printf("Digite o comprimento do cômodo: %.2f", c);
		c = sc.nextDouble();
		System.out.printf("Digite o valor do metro quadrado do piso: %.2f", metroQ);
		metroQ = sc.nextDouble();
		area = (l * c);
		System.out.printf("Área do cômodo = %.2f", + area);
		custo = (area * metroQ);
		System.out.printf("Custo total do piso: %.2f", custo);
		
		sc.close();
	}
}