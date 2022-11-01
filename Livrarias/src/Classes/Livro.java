package Classes;


public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    
    public Livro() {
        
    }
    
    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    
    public void verificaProgresso(){
        int qtd = (int)((100/(float)this.qtdPaginas)*this.paginasLidas);
        
        System.out.println("Quantidade de paginas: "+this.qtdPaginas+"\nPaginasLidas: "+this.paginasLidas);
        System.out.println("Você já concluiu "+qtd+"% do livro "+this.titulo+"\n");
    }
    
}
