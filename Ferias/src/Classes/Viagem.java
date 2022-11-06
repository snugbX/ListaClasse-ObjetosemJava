
package Classes;

public class Viagem {
    /*
            – Crie um programa para gerenciar uma viagem. Nesse programa, você deve criar 
            uma classe Viagem com os atributos, distancia, gastoLitroporKM (gasto de combustível
            por cada km), custo de passeios, quantidade pessoas, custo alimentação, e nome do 
            destino
    
            
    */
    private String destino;
    private float distancia;
    private float gastoLitroporKM;
    private int quantidadePessoas;
    private double CustoAlimentacao;
    private double custoPasseio;

    public Viagem() {
    }

    public Viagem(String destino, float distancia, float gastoLitroporKM, int quantidadePessoas, double CustoAlimentacao, double custoPasseio) {
        this.destino = destino;
        this.distancia = distancia;
        this.gastoLitroporKM = gastoLitroporKM;
        this.quantidadePessoas = quantidadePessoas;
        this.CustoAlimentacao = CustoAlimentacao;
        this.custoPasseio = custoPasseio;
    }

    public String getDestino() {
        return destino;
    }

    public float getDistancia() {
        return distancia;
    }

    public float getGastoLitroporKM() {
        return gastoLitroporKM;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public double getCustoAlimentacao() {
        return CustoAlimentacao;
    }

    public double getCustoPasseio() {
        return custoPasseio;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setGastoLitroporKM(float gastoLitroporKM) {
        this.gastoLitroporKM = gastoLitroporKM;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public void setCustoAlimentacao(double CustoAlimentacao) {
        this.CustoAlimentacao = CustoAlimentacao;
    }

    public void setCustoPasseio(double custoPasseio) {
        this.custoPasseio = custoPasseio;
    }

    @Override
    public String toString(){
        return "__________Dados de minha Viagem__________\n destino: " + destino + "\n distancia: " + distancia + "\n gasto de combustivel Litro por KM: " + gastoLitroporKM + "\n quantidade de Pessoas: " + quantidadePessoas + "\n Custo de Alimentação: " + CustoAlimentacao + "\n custo do Passeio: " + custoPasseio + '\n';
    }
    
    public void addPessoaViagem(){
        this.quantidadePessoas++;
    }
    public void removerPessoaViagem(){
        if(this.quantidadePessoas > 1){
            this.quantidadePessoas--;
        }else{
            System.out.println("\nNão a pessoas nessa Viagem!!\n");
        }
    }
    
    public float consumo_Gasolina(){
        float consumo = this.distancia * this.gastoLitroporKM;
        return consumo;
    }
    
    public double custoGasolina(){
        return consumo_Gasolina() * 8.75;
    }
    
    public void custoTotal(){
        this.custoPasseio = custoGasolina()+(this.CustoAlimentacao*this.quantidadePessoas);
    }
    
    public boolean viavel_Viagem(double valor){
        double custoPasseio70 = this.custoPasseio +(this.custoPasseio*0.70);
        if(valor > custoPasseio70){
            return true;
        }else{
            return false;
        }
    }
    
}
