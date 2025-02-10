package aula3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] arg) {
	//Exercicio 3
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		double altura1 , altura2, media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Altura: ");
		altura1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		nome2 = sc.nextLine();
		System.out.print("Altura: ");
		altura2 = sc.nextDouble();
		
		
		media = (altura1 + altura2)  /  2.0;
		System.out.println("A altura média de " + nome1 + " e " + nome2 + " é de " + media);
	
		sc.close();
		}
	}


