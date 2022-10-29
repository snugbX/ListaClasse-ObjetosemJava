
package Classes;

public class Filme {
    private String titulo;
    private int duracaoEmMinutos;
    
    public Filme(){
    }
    public Filme(String titulo,int duracaEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaEmMinutos;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the duracaoEmMinutos
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * @param duracaoEmMinutos the duracaoEmMinutos to set
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    public void exibirDuracaoEmHoras(){
        int horas = this.duracaoEmMinutos/60;
        int minutos = this.duracaoEmMinutos%60;
        
        System.out.println("O Filme "+this.titulo+" possui "+horas+"h e "+minutos+"m de duração.");
        
    }
    
    
    
}
