package sistemarodoviario.view;


public class ViewFacade {
    
    private TelaCadastroCliente tcc;
    private TelaCadastroOnibus tco;
    private TelaResevarAssento tra;
    
    public ViewFacade(){
        this.tcc = new TelaCadastroCliente();
        this.tco = new TelaCadastroOnibus();
        this.tra = new TelaResevarAssento();
    }
    
    public void View(){
       
       
    }
}
