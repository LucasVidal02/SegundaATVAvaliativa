
package sistemarodoviario.controller;

import sistemarodoviario.dao.ExceptionDao;
import sistemarodoviario.model.Assento;
import sistemarodoviario.model.Cliente;
import sistemarodoviario.model.Onibus;


public class ControllerFacade {
    
    private AssentoControler ac;
    private OnibusControler oc;
    private ClinteControler cc;
    
    public ControllerFacade(){
        this.ac = new AssentoControler();
        this.cc = new ClinteControler();
        this.oc = new OnibusControler();
        
    }
    
    public void Controller() throws ExceptionDao{
        
        ac.adicionarAssento(Assento.getInstance());
        cc.adicionarCliente2(Cliente.ClienteBuilder);
        oc.adicionarOnibus(Onibus.getInstance());
        oc.resevarAssento(Onibus.getInstance());
                
    }
}
