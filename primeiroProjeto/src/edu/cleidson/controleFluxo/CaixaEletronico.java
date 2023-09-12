package edu.cleidson.controleFluxo;
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 26.0;
        double valorSolicitado = 22.0;
        
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
        }else 
        System.out.println("Saldo insuficiente");
         
    }
}
