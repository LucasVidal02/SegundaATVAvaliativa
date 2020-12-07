package sistemarodoviario.model;

import sistemarodoviario.dao.ExceptionDao;
import sistemarodoviario.dao.OnibusDao;

public class Onibus extends OnibusFactory{

    private static Onibus instance;
    
    private String Rota;
    private Onibus[] onibus2 = new Onibus[2000];
    
    public static synchronized Onibus getInstance(){
        if(instance !=null){
            return instance;
        }else{
            instance = new Onibus();
            return instance;
        }
    }
    
    
    private Onibus() {
        
    }

    public String getRota() {
        return Rota;
    }

    public Onibus[] getOnibus() {
        return onibus2;
    }

    public void setRota(String Rota) {
        this.Rota = Rota;
    }

    public void setOnibus(Onibus[] onibus) {
        this.onibus2 = onibus;
    }

    public void cadastrarOnibus2(Onibus onibus) throws ExceptionDao {
        new OnibusDao().cadastrarOnibus(onibus);
    }
    //Factory method
    @Override
    public void criarOnibus(String tipo){
        if(tipo.equals("onibus")){
            onibus = new Onibus();
        }
    }

}
