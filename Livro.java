public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int isbn;
    private static int proximoIsbn = 1;
    private boolean isDisponivel;
    private int idUsuarioEmprestadoPara;
    
    //GETTERS
    public int getIsbn(){
        return this.isbn;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public int getIdUsuarioEmprestadoPara(){
        return this.idUsuarioEmprestadoPara;
    }
    
    //SETTERS
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
    
    public void setAno(int novoAno){
        this.ano = novoAno;
    }
    
    public void setIsnb(int novoIsnb){
        this.isbn = novoIsnb;
    }
    
    public void setIdDisponivel(boolean isDisponivel){
        this.isDisponivel = isDisponivel;
    }
    
    public void setIdUsuarioEmprestadoPara(int idUsuario){
        this.idUsuarioEmprestadoPara = idUsuario;
    }
    
    //CONSTRUTOR LIVRO
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = proximoIsbn++;
        this.isDisponivel = true;
        this.idUsuarioEmprestadoPara = 0;
    }
    
    //METODO PARA EXIBIR AS INFORMAÇÕES
    public String exibirInfoLivro(){
        String info = "Livro | ISBN: "+isbn+", Titulo: "+titulo+", Autor: "+autor+", Ano: "+ano+", Disponivel: "+isDisponivel;
        if(!isDisponivel && idUsuarioEmprestadoPara!=0){
            info+=", Emprestado para o ID usuario: "+idUsuarioEmprestadoPara;
    }
        return info;
    }
}