package aula3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double price, quant, din, troco;
		
		System.out.print("Preço unitário do produto: ");
		price = sc.nextDouble();
		System.out.println("Quantidade comprada: ");
		quant = sc.nextDouble();
		System.out.println("Dinheiro recebido: ");
		din = sc.nextDouble();
		
		troco = (price * quant) - din;
		System.out.println("Troco = " + troco);
		sc.close();
	}

}
