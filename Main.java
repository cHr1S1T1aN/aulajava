import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int[] lerNumeros(int qtd) {
        int[] nums = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.print("Quantos numeros? ");
        int qtd = sc.nextInt();

        int[] numeros = lerNumeros(qtd);

        Calculadora calc = new Calculadora(); // 👈 objeto
	
	int maior = calc.numeroMaior(numeros);
        int soma = calc.calcularSoma(numeros);
        double media = calc.calcularMedia(soma, qtd);

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
	System.out.println("Maior numero é o: "+ maior);

        sc.close();
    }
}
