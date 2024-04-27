import java.util.Scanner;

public class ContaTerminal {
    /**
      * Esta é uma classe que representa o projeto da DIO.
    */

    /**
     * Variáveis declarado antes do metedo main definada como static.
     * numero Numero da conta.
     * agencia Numero da agência.
     * nomeClient Nome do cliente.
     * saldo Saldo bancário.
     */

    static int numero;
    static String agencia;
    static String nomeClient;
    static double saldo;
   
    
    public static void main(String[] args) throws Exception {
        /**
        * Chama o metodo Scanner.
        * escaneio input de textos e números do Scanner.
        */
        //Aqui declaramos o Scanner definindo uma variavel para ele como escaneio
        Scanner escaneio = new Scanner(System.in);
        //Aqui exibimos uma mensagem em seguido o input do scanner para Strings
        System.out.println("Por favor, digite o número da Agência !");
        agencia = escaneio.next();
        //Aqui exibimos uma mensagem em seguido o input do scanner para números inteiros
        System.out.println("Por favor, digite o número da conta !");
        numero = escaneio.nextInt();
        //Aqui exibimos uma mensagem em seguido o input do scanner para Strings
        System.out.println("Por favor, digite o seu nome !");
        nomeClient = escaneio.next();
        //Aqui exibimos uma mensagem em seguido o input do scanner para números com casas decimais
        //E lembrando o valor deve ser declarado com uma , e não . mesmo que no console não exiba a
        //, e sim o .
         System.out.println("Por favor, digite a quantia do saldo !");
        saldo = escaneio.nextDouble();
        //Aqui está representado o bloco de mensagens que ele exibirar no console de forma que foi pedido no projeto
        System.out.println("Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco" +
                ", sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque.");
    }
}