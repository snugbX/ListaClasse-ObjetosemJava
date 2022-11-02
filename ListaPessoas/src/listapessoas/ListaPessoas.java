
package listapessoas;

import Classes.Pessoa;
import java.util.Scanner;
public class ListaPessoas {

    public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
       
       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa();
       
       System.out.println("Informe o nome: ");
       p1.setNome(tc.next());
       
       System.out.println("Informe a idade: ");
       p1.setIdade(tc.nextInt());
       
       System.out.println("Informe a altura: ");
       p1.setAltura(tc.nextFloat());
       
        System.out.println("---------------------Dados Pessoasis--------------\n"+p1.toString());
        if(p1.maiorDeIdade()){
            System.out.println("Sou maior de Idade!!");
        }else{
            System.out.println("Não sou maior de Idade!!");
        }
       
       System.out.println("Informe o nome: ");
       p2.setNome(tc.next());
       
       System.out.println("Informe a idade: ");
       p2.setIdade(tc.nextInt());
       
       System.out.println("Informe a altura: ");
       p2.setAltura(tc.nextFloat());
       
       System.out.println("---------------------Dados Pessoasis--------------\n"+p2.toString());
        if(p2.maiorDeIdade()){
            System.out.println("Sou maior de Idade!!");
        }else{
            System.out.println("Não sou maior de Idade!!");
        }
       
    }
    
}
