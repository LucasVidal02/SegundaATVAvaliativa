package sistemarodoviario.model;

import sistemarodoviario.dao.ClienteDao;
import sistemarodoviario.dao.ExceptionDao;

public class Cliente {

    public static Cliente ClienteBuilder;
    private String nome;
    private String telefone;
    private int idade;
    private String cpf;
    private static Cliente instance;
    
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public int getIdade(){
        return idade;
    }
    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    private Cliente (ClienteBuilder builder){
        if(builder == null ){
            throw new IllegalArgumentException("Builder não pode ser nulo.");   
        }
    }  

    
    public static class ClienteBuilder{
        private String nome;
        private String telefone;
        private int idade;
        private String cpf;
        
        ClienteBuilder(String nome, String telefone, int idade, String cpf ){
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.telefone = telefone;
            
        }
        
        ClienteBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        ClienteBuilder telefone(String telefone){
            this.telefone = telefone;
            return this;
        }
        ClienteBuilder idade (int idade){
            this.idade = idade;
            return this;
        }
        ClienteBuilder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }
        
        public Cliente build() throws IllegalArgumentException{
            return pInstance(this);
        }
    }
        private static Cliente pInstance(ClienteBuilder clientebuilder){
            if(instance == null){
                synchronized(ClienteBuilder.class){
                    if(instance == null){
                        instance = new Cliente(clientebuilder);
                    }
                }
        }
        return instance;
    }  

    public void cadastrarCliente2(ClienteBuilder cliente) throws ExceptionDao {
        new ClienteDao().cadastrarCliente(instance);
    }

}
