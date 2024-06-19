package Aula_19_06;
import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int countPares = 0;
	        int count = 0;

	        System.out.println("Digite 20 números:");

	        while (count < 20) {
	            System.out.print("Número " + (count + 1) + ": ");
	            int numero = scanner.nextInt();

	            if (numero % 2 == 0) {
	                countPares++;
	            }

	            count++;
	        }

	        System.out.println("Quantidade de números pares: " + countPares);

	        scanner.close();

	}

}
