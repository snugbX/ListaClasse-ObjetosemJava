/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinefilmes;

import Classes.Filme;

/**
 *
 * @author Everlan
 */
public class TesteFilmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Filme filme1 = new Filme("Titanic",194);
        Filme filme2 = new Filme("Os Vingadores",142);
        Filme filme3 = new Filme("Hotel Transilvania",93);
        
        filme1.exibirDuracaoEmHoras();
        filme2.exibirDuracaoEmHoras();
    }
    
}
