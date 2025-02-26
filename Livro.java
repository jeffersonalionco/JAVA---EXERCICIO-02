
/**
 * 
 * @author Jefferson Alionco
 */

 
public class Livro {
    private String titulo;
    private String genero ;
    private String anoPublic;
    private boolean estaDisponivel;

    
    // Criando um construtor para adicionar dados mais facilmente!
    public Livro(String titulo, String genero, String anoPublic, boolean estaDisponivel){
            this.titulo = titulo;
            this.genero = genero;
            this.anoPublic = anoPublic;
            this.estaDisponivel = estaDisponivel;
    }



    // Os metodos getters e setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    
    public String getAnoPublic(){
        return anoPublic;
    }
    public void setAnoPublic(String anoPublic){
        this.anoPublic = anoPublic;
    }

    
    public boolean getEstaDisponivel(){
        return estaDisponivel;
    }


    public void setEstaDisponivel(boolean estaDisponivel){
        this.estaDisponivel = estaDisponivel;
    }
}
