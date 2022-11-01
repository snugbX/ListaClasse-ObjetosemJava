
package livrarias;

import Classes.Livro;
public class Livrarias {

    public static void main(String[] args) {
        
       
        
        Livro favorito = new Livro();

        favorito.setTitulo("O pequeno principe");
        favorito.setQtdPaginas(98);
        
        System.out.println("O livro "+favorito.getTitulo()+" possui "+favorito.getQtdPaginas()+" paginas!");
        
        favorito.setPaginasLidas(20);
        
        favorito.verificaProgresso();
        
        favorito.setPaginasLidas(50);
        
        favorito.verificaProgresso();
        
        
        // Outro objeto livro criado
        Livro livro1 = new Livro("Django de A à Z", 321, 15);
        
        System.out.println("O livro "+livro1.getTitulo()+" possui "+livro1.getQtdPaginas()+" paginas!");
        
        livro1.verificaProgresso();
        
        livro1.setPaginasLidas(50);
        
        livro1.verificaProgresso();
        
        livro1.setPaginasLidas(150);
        
        livro1.verificaProgresso();
        
         // Outro objeto livro criado
        
        Livro favorito2 = new Livro();

        favorito2.setTitulo("Desbravando Java e Orientação a Objeto");
        favorito2.setQtdPaginas(222);
        
        System.out.println("O livro "+favorito2.getTitulo()+" possui "+favorito2.getQtdPaginas()+" paginas!");

        favorito2.setPaginasLidas(60);
        favorito2.verificaProgresso();
        
        favorito2.setPaginasLidas(110);
        favorito2.verificaProgresso();
        
        favorito2.setPaginasLidas(215);
        favorito2.verificaProgresso();
        
        
        
    }
}
