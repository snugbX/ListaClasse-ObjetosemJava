
package Classes;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private float VelocidadeAtual;
    private float velocidadeMaxima;
    private int marcha;

    public Carro() {
    }

    public Carro(String modelo, String cor, String placa, float VelocidadeAtual, float velocidadeMaxima, int marcha) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.VelocidadeAtual = VelocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.marcha = marcha;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public float getVelocidadeAtual() {
        return VelocidadeAtual;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidadeAtual(float VelocidadeAtual) {
        this.VelocidadeAtual = VelocidadeAtual;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------Dados do Carro-----");
        sb.append("\n  modelo:").append(modelo);
        sb.append("\n cor:").append(cor);
        sb.append("\n placa:").append(placa);
        sb.append("\n VelocidadeAtual:").append(VelocidadeAtual);
        sb.append("\n velocidadeMaxima:").append(velocidadeMaxima);
        sb.append("\n marcha:").append(marcha);
        sb.append("----------------------------");
        return sb.toString();
    }
    
    
}
