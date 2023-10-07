package apps;

//a classe apps.MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

   // public abstract void salvarHistoricoMensagem();

    //Somento as classes filhas conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Validade se está conectado");
    }
}