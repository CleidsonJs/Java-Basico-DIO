import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor bruto do salário: ");
        float valorSalario = entrada.nextFloat();
        System.out.println("Informe o valor dos beneficios: ");
        float valorBeneficios = entrada.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            //Atribui aliquota de 5%
            valorImposto = 0.05F * valorSalario;
        }else if(valorSalario >= 1100.01F && valorSalario <= 2500){
            //Atribui aliquota de 10%
            valorImposto = 0.10F * valorSalario;
        }else {
            // Atribui aliquota de 15% referente a salários +2500
            valorImposto = 0.15F * valorSalario;
        }
        //Calcula e imprime a Saída (com 2 casas decimais);
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

    } 
}
