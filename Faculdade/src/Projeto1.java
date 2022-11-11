

/*
 *  Criar um programa que leia o preço de compra e o preço de venda de n mercadorias
usando um vetor para cada um dos preços. O programa deverá imprimir quantas
mercadorias proporcionam:
a) Lucro < 10%
b) 10 % <= Lucro <= 20%
c) Lucro > 20%
 */

import java.util.Scanner;
public class Projeto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadeDeMercadorias = sc.nextInt(), lucroMenorQue10 = 0, lucroMenorIgual20 = 0, lucroMaiorQue20 = 0;
		
		double[] precoDeCompra = new double[quantidadeDeMercadorias];
		double[] precoDeVenda = new double[quantidadeDeMercadorias];
		
		for(int i = 0; i < quantidadeDeMercadorias; i++) {
			System.out.print("Preco de compra do produto numero " + i + ": ");
			precoDeCompra[i] = sc.nextDouble();
			
			System.out.print("Preco de venda do produto numero " + i + ": ");
			precoDeVenda[i] = sc.nextDouble();
			
			double lucro = (precoDeVenda[i] * 100) / precoDeCompra[i];
			lucro -= 100.0;
			
			if(lucro < 10.0) {
				lucroMenorQue10 += 1;
			}
			else if(lucro <= 20.0) {
				lucroMenorIgual20 += 1;
			}
			else {
				lucroMaiorQue20 += 1;
			}
		}
		
		System.out.println("**** Listagem de lucros ****");
		System.out.println("Total de mercadorias que proporcionam o lucro menor que 10% --> " + lucroMenorQue10);
		System.out.println("Total de mercadorias que proporcionam o lucro menor ou igual a 20% --> " + lucroMenorIgual20);
		System.out.print("Total de mercadorias que proporcionam o lucro maior que 20% --> " + lucroMaiorQue20);
		
		sc.close();
	}

}
