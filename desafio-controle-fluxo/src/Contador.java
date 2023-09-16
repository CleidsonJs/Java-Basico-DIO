import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro parâmetro");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Informe o segundo parâmetro");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);

        }catch (ParametrosInvalidosException Exception) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        }
        static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
            if(primeiroParametro > segundoParametro){
                throw new ParametrosInvalidosException();
            }
            int contagem = primeiroParametro;
        for(; contagem <= segundoParametro; contagem ++ ){
        System.out.println("Imprimindo ocorrência: " + contagem);
        }
    }
}

