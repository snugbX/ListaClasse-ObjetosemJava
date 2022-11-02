
package Classes;

public class ContaCorrente {
    private String nome;
    private double Saldo;
    private int agencia;
    private int numero_conta;
    
    
    public ContaCorrente() {
    }
    
    public ContaCorrente(double Saldo, int agencia, int numero_conta, String nome) {
        this.Saldo = Saldo;
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        this.nome = nome;
    }

    
    public double getSaldo() {
        return Saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void Deposito(double valor){
        this.Saldo += valor;
        System.out.printf("\nValor deposito: %.2f\nSaldo atual: %.2f\n",valor,this.Saldo);
    }
    
    public void sacar(double valor){
        if(valor + ((0.5/100)*valor)<= this.Saldo){
            this.Saldo -= valor + ((0.5/100)*valor);
            System.out.printf("\nSaque efetuado com sucesso!!\nValor sacado %.2f\nSeu saldo é: %.2f\n",valor,this.Saldo);
        }else{
            System.out.printf("\nValor indisponivel para sacar!!\nValor do saque: %.2f\nSeu saldo é: %.2f\n",valor,this.Saldo);
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "nome=" + nome + ", Saldo=" + Saldo + ", agencia=" + agencia + ", numero_conta=" + numero_conta + '}';
    }
    
}
