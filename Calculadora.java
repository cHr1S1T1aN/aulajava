public class Calculadora {

    int calcularSoma(int[] nums) {
        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
        return soma;
    }

    double calcularMedia(int soma, int qtd) {
        return (double) soma / qtd;
    }
	int numeroMaior(int [] numeros){
	int maior = numeros[0];
	for (int i = 1;i < numeros.length;i++){
		if (numeros[i] > maior){
		maior = numeros[i];
		}
	}
	return maior;
	}
}
