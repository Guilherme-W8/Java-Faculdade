
import java.util.Locale;
import java.util.Scanner;

/*
 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas decimais.
 */

public class salaryBonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		double fixedSal = sc.nextDouble();
		double salesMade = sc.nextDouble();
		
		double total = fixedSal + salesMade * 0.15;
		
		System.out.printf("%s%nTOTAL = R$ %.2f", name, total);
		
		sc.close();

	}

}
