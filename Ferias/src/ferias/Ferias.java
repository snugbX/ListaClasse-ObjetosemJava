
package ferias;

import Classes.Viagem;
import java.util.Scanner;

public class Ferias {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Viagem v1 = new Viagem();
        
        System.out.println("Informe seu destino: ");
        v1.setDestino(tc.nextLine());
        
        System.out.println("Informe distancia : ");
        v1.setDistancia(tc.nextFloat());
        
        System.out.println("Informe o consumo de gasolina por km : ");
        v1.setGastoLitroporKM(tc.nextFloat());
        
        System.out.println("Informe quantidade de pessoas : ");
        v1.setQuantidadePessoas(tc.nextInt());
        
        System.out.println("Informe o custo de Alimentação : ");
        v1.setCustoAlimentacao(tc.nextDouble());
        
        v1.addPessoaViagem();
        v1.removerPessoaViagem();
        v1.removerPessoaViagem();
        
        v1.custoTotal();
        
        System.out.println("Informe o valor da Vaquinha: ");
        boolean viavel = v1.viavel_Viagem(tc.nextDouble());
        
        if(viavel){
            System.out.println("Partiu Viagem!!");
        }else{
            System.out.println("Vamos ter que fazer uma vaquinha mais gorda!!! Não partiu Viagem!! 😭😭");
        }
        
        System.out.println(v1.toString());
        
        //Outro Objeto de Viagem
        
        tc = new Scanner(System.in);
        
        Viagem v2 = new Viagem();
        
        System.out.println("Informe seu destino: ");
        v2.setDestino(tc.nextLine());
        
        System.out.println("Informe distancia : ");
        v2.setDistancia(tc.nextFloat());
        
        System.out.println("Informe o consumo de gasolina por km : ");
        v2.setGastoLitroporKM(tc.nextFloat());
        
        System.out.println("Informe quantidade de pessoas : ");
        v2.setQuantidadePessoas(tc.nextInt());
        
        System.out.println("Informe o custo de Alimentação : ");
        v2.setCustoAlimentacao(tc.nextDouble());
        
        v2.addPessoaViagem();
        v2.addPessoaViagem();
        
        v2.removerPessoaViagem();
        
        v2.custoTotal();
        
        System.out.println("Informe o valor da Vaquinha: ");
        viavel = v2.viavel_Viagem(tc.nextDouble());
        
        if(viavel){
            System.out.println("Partiu Viagem!!");
        }else{
            System.out.println("Vamos ter que fazer uma vaquinha mais gorda!!! Não partiu Viagem!!");
        }
        
        System.out.println(v2.toString());
        
    }
    
}
