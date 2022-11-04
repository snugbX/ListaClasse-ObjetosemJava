
package Classes;


public class Elevador {
    private int quantidadeAndares;
    private int andarAtual;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador() {
    }

    public Elevador(int quantidadeAndares ,int andarAtual, int capacidade, int quantidadePessoas) {
        this.quantidadeAndares = quantidadeAndares;
        this.andarAtual = andarAtual;
        this.capacidade = capacidade;
        this.quantidadePessoas = quantidadePessoas;
    }
    
    public int getQuantidadeAndares() {
        return quantidadeAndares;
    }
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    
    public void setQuantidadeAndares(int quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public String toString() {
        return "Informações atuais:\n Quantidade de Andares = " + quantidadeAndares + "\n Andar atual = " + andarAtual + "\n capacidade do Elevador = " + capacidade + "\n quantida de Pessoas no Elevador = " + quantidadePessoas;
    }
    
    public void entrar(){
        if(this.quantidadePessoas < this.capacidade){
            this.quantidadePessoas++;
            System.out.println("Entrou uma pessoa!!");
        }else{
            System.out.println("Capacidade maxima atingida!! Pegue o proximo!!");
        }
    }
    
    public void sair(){
        if(this.quantidadePessoas > 0){
            this.quantidadePessoas--;
            System.out.println("Saiu uma pessoa!!");
        }else{
            System.out.println("Não a nenhuma pessoa no elevador!!");
        }
    }
    
    
    public void subir(){
        if(this.andarAtual != this.quantidadeAndares){
            this.andarAtual++;
            System.out.println("Estou no andar -> "+this.andarAtual);
        }else{
            System.out.println("Utimo andar atingido!!");
        }
    }
    
    public void descer(){
        if(this.andarAtual > 0){
            this.andarAtual--;
            System.out.println("Estou no andar -> "+this.andarAtual);
        }else{
            System.out.println("Estamos no Terrio!!");
        }
    }

    

  
    
    
    
}
