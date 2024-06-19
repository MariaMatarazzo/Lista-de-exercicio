package Aula_19_06;
import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		int contadorIntervalo = 0;

		for (int contadorNumeros = 0; contadorNumeros < 20; contadorNumeros++) {
			System.out.print("Digite um número: ");
			int numero = ler.nextInt();


			if (numero >= 0 && numero <= 100) {
				contadorIntervalo++;
			}
		}
		System.out.println("Quantidade de números entre 0 e 100: " + contadorIntervalo);
		ler.close();

	}

}
