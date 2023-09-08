import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente, agencia;
        float saldoConta;
        int numeroConta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome e sobrenome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, informe o número da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();
        System.out.println("Informe seu saldo bancário: ");
        saldoConta = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " 
        + numeroConta + " e seu saldo de: R$" + saldoConta + " já está disponivel para saque!");

         scanner.close();
    }
}
