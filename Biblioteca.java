import java.util.ArrayList;

public class Biblioteca {
    
    //ATRIBUTOS
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Adm> adms;
    private static final String SENHA_ADM_PADRAO = "admin";
    
    //CONSTRUTOR DA BIBLIOTECA
    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.adms = new ArrayList<>();
    }
    
    //METODO PARA VRIFICAR SENHA
    public boolean autenticarAdm(String senha){
        return SENHA_ADM_PADRAO.equals(senha);
    }
    
    //METODO PARA BUSCAR LIVRO
    public Livro buscarLivroPorIsbn(int isbn){
        for (Livro livro : livros){
            if(livro.getIsbn()==isbn){
                return livro;
            }
        }
        return null;
    }
    
    //METODO PARA BUSCAR LIVRO
    public Usuario buscarUsuarioPorId(int idUsuario){
        for (Usuario usuario : usuarios){
            if(usuario.getId()==idUsuario){
                return usuario;
            }
        }
        return null;
    }
    
    //METODO PARA BUSCAR ADM POR ID
    public Adm buscarAdmPorId(int idAdm){
        for(Adm adm : adms){
            if(adm.getId()== idAdm){
                return adm;
            }
        }
        return null;
    }
    
    // METODO PARA CADASTRAR LIVRO
    public String cadLivro(String titulo, String autor, int ano){
        
        if(titulo==null
        || titulo.trim().isEmpty()
        || autor==null
        || autor.trim().isEmpty()){
        
        return "Erro: Titulo ou autor nao podem ser validos.";
    }
    
    Livro livro = new Livro(titulo, autor, ano);
    livros.add(livro);
    return "livro "+titulo+ "cadastrado.";
}
}
