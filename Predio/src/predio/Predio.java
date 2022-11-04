
package predio;

import Classes.Elevador;
import java.util.Scanner;
public class Predio {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        Elevador el = new Elevador();
        
        System.out.println("Informe a quantidade de andares do predio:");
        
        el.setQuantidadeAndares(tc.nextInt());
        
        System.out.println("Digite a Capacidade do Elevador: ");
        el.setCapacidade(tc.nextInt());
        
        el.setAndarAtual(0);
        el.setQuantidadePessoas(0);
        
        el.entrar();
        el.entrar();
        el.entrar();
        
        el.subir();
        el.subir();
        el.subir();
        el.subir();
        
        el.sair();
        el.sair();
        
        el.subir();
        el.subir();
        
        el.sair();
        
        el.entrar();
        el.entrar();
        el.entrar();
        el.entrar();
        
        el.descer();
        el.descer();
        el.descer();
        el.descer();
        el.descer();
        el.descer();
        
        
        System.out.println(el.toString());
    }
    
}
