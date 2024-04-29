import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            //aqui a primeira forma de tratar o erro
            if(parametroUm<parametroDois){
                System.out.println("O primeiro parâmetro deve ser maior que o segundo");
            }
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        //aqui a segunda forma de tratar o erro
		if (parametroUm <= parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior que o segundo");
        }
		int contagem = parametroDois - parametroUm;

        for (int i = 1; i < Math.abs(contagem) + 1; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
	}
}   