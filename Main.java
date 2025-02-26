/**
 * 
 * @author Jefferson Alionco
 */

public class Main{
   
   
    public static void main(String[] args) {
    
    /* REALIZANDO TESTES DA CLASSE CLIENTE */
        System.out.println("\n\n REALIZANDO TESTES DA CLASSE CLIENTE \n\n");
    // Adicionando dados a clase cliente e depois exebindo elas, e depois alterando alguma coisa
       Cliente cliente1 = new Cliente("Jefferson", "45 9-9833-1383", "jeffersonalionco@gmail.com", "123.456.789-78");
       System.out.println(cliente1.getNome());
       System.out.println(cliente1.getEmail());
       System.out.println(cliente1.getCpf());
       System.out.println(cliente1.getTelefone());

       // alterando dados e depois exibindo na tela
        cliente1.setCpf("456745454new");
        cliente1.setEmail("jeffersnew@gmail.com");
        System.out.println("\n\n " + cliente1.getEmail());
        System.out.println(cliente1.getCpf());

        

        /*REALIZANDO CONSULTA E TESTES NOS GETTERS E SETTERS NA CLASE AUTOR */
        System.out.println("\n\n****** REALIZANDO CONSULTA E TESTES NOS GETTERS E SETTERS NA CLASE AUTOR\n\n");

        Autor autor1 = new Autor("Jefferson", "Brasileiro", "10/56/9878", true, null, "belem");

        // Exebindo dados 
        System.out.println(autor1.getNome());
        System.out.println(autor1.getCidadeNasc());
        System.out.println(autor1.getDatNasc());
        System.out.println(autor1.getDatObto());

        // Alterando dados e exibindo
        autor1.setNome("jefferson 02");
        autor1.setDatNasc("25/89/6578");
        System.out.println("\n\n" + autor1.getNome());
        System.out.println(autor1.getDatNasc());



        /*REALIZANDO TESTES E CONSULTAS NA CLASSE LIVRO */
        System.out.println("\n\n****** REALIZANDO TESTES E CONSULTAS NA CLASSE LIVRO\n\n");

        Livro livro1 = new Livro("Manga", "fruta", "12/12/9999", true);
        System.out.println(livro1.getEstaDisponivel());
        System.out.println(livro1.getAnoPublic());
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getGenero());
        
        // Alteranndo dados e exibindo
        livro1.setAnoPublic("89/56/5458");
        livro1.setEstaDisponivel(false);
        System.out.println("\n\n " + livro1.getEstaDisponivel());
        System.out.println(livro1.getAnoPublic());

    }

}