import java.util.Scanner;

public class CondicionalRico {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    if(saldoTotal >= valorSaque){
     int saldo = saldoTotal - valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
    }else{
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
  }
}