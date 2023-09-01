public class Operadores {
    public static void main(String[] args) {

        // Operador de Atribuição
        String nome = "Cleidson";
        int idade = 21;
        double peso = 60.5;
     //   char sexo = "M";
        boolean doadorOrgao = false;
     // Date dataNascimento = new Date();

        // Operador aritmético 
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        // Operador unário
        int numero =5;
        System.out.println( - numero);
        numero ++;
        System.out.println(numero);
        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(++ numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        // Operador ternário
        int a, b;
        a = 5;
        b = 6;
    /*  EXEMPLO IF/ELSE
        if(a==b)
            resultado = "verdadeiro"
        else
            resultado = "falso"
    */
        // Mesma condicional, porem usando operador ternário
        String resultadot = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultadot);

        // Operador relacional 
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
	        System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	        System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
	        System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
	        System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
	        System.out.print("Numero 1 é diferente de numero 2");

        // Operador lógico
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2)
	        System.out.print("Os dois valores precisam ser verdadeiros");;
            
        if(condicao1 || condicao2)
	        System.out.print("Um dos valores precisa ser verdadeiro");

    }
}
