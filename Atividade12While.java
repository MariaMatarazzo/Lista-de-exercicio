package Aula_19_06;
import java.util.Scanner;
public class Atividade12While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int contadorIntervalo = 0;
		int contadorNumeros = 0;
		
		
		while (contadorNumeros < 20) {
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		
		
		if (numero >= 0 && numero <= 100) {
		contadorIntervalo++;
		}
		
		contadorNumeros++;
		}
		
		
		System.out.println("Quantidade de números entre 0 e 100: " + contadorIntervalo);
		ler.close();

	}

}
