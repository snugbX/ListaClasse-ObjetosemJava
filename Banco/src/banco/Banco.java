
package banco;

import Classes.ContaCorrente;
import java.util.Scanner;


public class Banco {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        c1.setNome(tc.next());
        System.out.println("Informe sua Agencia: ");
        c1.setAgencia(tc.nextInt());
        System.out.println("Informe o numero da conta: ");
        c1.setNumero_conta(tc.nextInt());
        System.out.println("Informe seu Saldo: ");
        c1.setSaldo(tc.nextDouble());
        
        c1.Deposito(100);
        c1.sacar(200);
        c1.Deposito(50);
        c1.Deposito(60);
        c1.sacar(150);
        
        
        System.out.println("Informe seu nome: ");
        c2.setNome(tc.next());
        System.out.println("Informe sua Agencia: ");
        c2.setAgencia(tc.nextInt());
        System.out.println("Informe o numero da conta: ");
        c2.setNumero_conta(tc.nextInt());
        System.out.println("Informe seu Saldo: ");
        c2.setSaldo(tc.nextDouble());
        
        c2.Deposito(25);
        c2.sacar(10);
        c2.Deposito(15);
        c2.sacar(300);
        
        System.out.println("Informe seu nome: ");
        c3.setNome(tc.next());
        System.out.println("Informe sua Agencia: ");
        c3.setAgencia(tc.nextInt());
        System.out.println("Informe o numero da conta: ");
        c3.setNumero_conta(tc.nextInt());
        System.out.println("Informe seu Saldo: ");
        c3.setSaldo(tc.nextDouble());
        
        c3.sacar(50);
        c3.sacar(900);
        
        System.out.println("\n\n_________________Contas do Meu Banco_________________\n"+c1.toString());
        System.out.println("\n______________________________________________________\n"+c2.toString());
        System.out.println("\n______________________________________________________\n"+c3.toString());
    }
    
}
