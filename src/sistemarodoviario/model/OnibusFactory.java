package sistemarodoviario.model;


public abstract class OnibusFactory {
    protected Onibus onibus;
    
    public abstract void criarOnibus(String tipo);
    
    
}
