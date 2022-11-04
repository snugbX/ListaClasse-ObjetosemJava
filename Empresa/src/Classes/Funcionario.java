
package Classes;

import java.util.Calendar;

public class Funcionario {
    Calendar c = Calendar.getInstance();
    
    private String nome;
    private String matricula;
    private double salario;
    private int dia;
    private int mes;
    private int ano;
    private String data;
    private String CPF;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula, double salario, int dia, int mes, int ano, String CPF) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getData() {
        return data;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia < 32){
            this.dia = dia;
        }else{
            this.dia = c.get(Calendar.DAY_OF_MONTH);
            System.out.println("Dia Não existe!! Por padrão colocaremos o dia atual!!\n");
        }
    }

    public void setMes(int mes) {
        if(mes > 0 && mes < 13){
            this.mes = mes;
        }else{
            this.mes = c.get(Calendar.MONTH);
            System.out.println("Mes Não existe!! Por padrão colocaresmos o mes atual!!\n");
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void organizaData(){
        this.data = this.dia+" / "+this.mes+" / "+this.ano;
    }
    
    public void dataAtual(){
        
        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH);
        this.ano = c.get(Calendar.YEAR);
        
        organizaData();
    }

    @Override
    public String toString() {
        return "Informações do Funcionario:\n nome: " + nome + "\n matricula: " + matricula + "\n salario: " + salario + "\n data: " + data + "\n CPF: " + CPF;
    }
    
    public void receberAumento(double valor){
        this.salario+= valor;
    }
    
    public double calcularGanhoLiquidoMensal(){
        if(this.salario > 2500){
            double inss = this.salario * 0.11;
            double ir = (this.salario - 2500) * 0.175;
            double liquido = this.salario - inss;
            liquido -= ir;
            return liquido;
        }else{
            return (this.salario - (this.salario * 0.11));
        }
    }
    
    
}   
