package sistemarodoviario.model;

import sistemarodoviario.dao.ExceptionDao;


public class ModelFacade {
    
    private Assento assento;
    private Cliente cliente;
    private Onibus onibus;
    
    public ModelFacade(){
        this.cliente = Cliente.ClienteBuilder;
        this.assento = Assento.getInstance();
        this.onibus = Onibus.getInstance();
     
    }
    
    public void CadastrarOnibus() throws ExceptionDao{
        onibus.cadastrarOnibus2(onibus);        
    }
    public void CadastrarCliente() throws ExceptionDao{
        cliente.cadastrarCliente2(cliente);
    }
    public void ReservarAssento() throws ExceptionDao{
        assento.resevarAssento(assento);
    }
    
}
