import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	static int contador(){
		int num1;
		int soma = 0;
		System.out.println("digite um numero para somar ou digite 0 para parar: ");
		num1= sc.nextInt();
		while(num1 != 0){	
			soma = soma+num1;
		System.out.println("digite um numero para somar ou digite 0 para parar: ");
		num1= sc.nextInt();
		}
		return soma;		
	}
	public static void main(String[]args) {
		int resultado = contador();
        	System.out.println("Resultado: " + resultado);
       		sc.close();
	}	
}