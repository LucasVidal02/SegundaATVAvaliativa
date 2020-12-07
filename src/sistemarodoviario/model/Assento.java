package sistemarodoviario.model;

import sistemarodoviario.dao.AssentoDao;
import sistemarodoviario.dao.ExceptionDao;

public class Assento {
    
    private static Assento instance;

    private String lugar;
    
    private Assento() {
        
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public static synchronized Assento getInstance(){
        if(instance !=null){
            return instance;
        }else{
            instance = new Assento();
            return instance;
        }
    }

    public void resevarAssento(Assento assento2) throws ExceptionDao {
        new AssentoDao().cadastraAssento(assento2);
    }
}
