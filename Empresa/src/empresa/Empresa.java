
package empresa;
import Classes.Funcionario;
import java.util.Scanner;
public class Empresa {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        System.out.println("Informe o nome do Funcionario: ");
        f1.setNome(tc.next());
        
        System.out.println("Informe o CPF do Funcionario: ");
        f1.setCPF(tc.next());
        
        System.out.println("Informe a matricula: ");
        f1.setMatricula(tc.next());
        
        System.out.println("Informe o salario: ");
        f1.setSalario(tc.nextDouble());
        
        System.out.println("Informe o dia de admissão: ");
        f1.setDia(tc.nextInt());
        
        System.out.println("Informe o mes de admissão: ");
        f1.setMes(tc.nextInt());
        
        System.out.println("Informe o ano de admissão: ");
        f1.setAno(tc.nextInt());
        
        f1.organizaData();
        
        System.out.println(f1.toString()+"\nSalario liquido: "+f1.calcularGanhoLiquidoMensal()+"\n\n");
        
        f1.receberAumento(400);
        System.out.println(f1.toString()+"\nSalario liquido: "+f1.calcularGanhoLiquidoMensal()+"\n\n");
        
        f1.receberAumento(300);
        System.out.println(f1.toString()+"\nSalario liquido: "+f1.calcularGanhoLiquidoMensal()+"\n\n");
        
        
        //Outro Funcionario
        Funcionario f2 = new Funcionario();
        System.out.println("Informe o nome do Funcionario: ");
        f2.setNome(tc.next());
        
        System.out.println("Informe o CPF do Funcionario: ");
        f2.setCPF(tc.next());
        
        System.out.println("Informe a matricula: ");
        f2.setMatricula(tc.next());
        
        System.out.println("Informe o salario: ");
        f2.setSalario(tc.nextDouble());
        
        System.out.println("Informe o dia de admissão: ");
        f2.setDia(tc.nextInt());
        
        System.out.println("Informe o mes de admissão: ");
        f2.setMes(tc.nextInt());
        
        System.out.println("Informe o ano de admissão: ");
        f2.setAno(tc.nextInt());
        
        f2.organizaData();
        
        System.out.println(f2.toString()+"\nSalario liquido: "+f2.calcularGanhoLiquidoMensal()+"\n\n");
        
        
    }
    
}
