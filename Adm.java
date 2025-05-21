public class Adm extends Usuario{
    
    private String cargo;
    
    //GETTER
    public String getCargo(){
        return this.cargo;
    }
    
    //SETTER
    public void setCrago(String novoCargo){
        this.cargo = novoCargo;
    }
    
    //CONSTRUTOR
    public Adm(String nome, String email){
        super(nome, email);
    }
    
    //@Override
    public String exibirInfo(){
        String info = "ID: "+getId()+", Usuario: "+getNome()+", Email: "+getEmail()+", Cargo: "+cargo;
        return info;
    }
}