/**
 * 
 * @author Jefferson Alionco
 */

 
public class Autor {
    private String nome;
    private String nascionalidade;
    private String datNasc;
    private boolean estaVivo;
    private String datObto;
    private String cidadeNasc;

    
    // Criando metodo construtor para apoiar na hora de adicionar dados
    public Autor(String nome, String nascionalidade, String datNasc, boolean estaVivo, String datObto, String cidadeNasc) {
            this.nome = nome;
            this.nascionalidade = nascionalidade;
            this.datNasc = datNasc;
            this.estaVivo = estaVivo;
            this.datObto = datObto;
            this.cidadeNasc = cidadeNasc;
    }


    // Metodos Getters
    public String getNome() {
        return nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public String getDatNasc() {
        return datNasc;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public String getDatObto() {
        return datObto;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    
    
    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public void setDatNasc(String datNasc) {
        this.datNasc = datNasc;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setDatObto(String datObto) {
        this.datObto = datObto;
    }

    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }
    
    
    
    
    

}