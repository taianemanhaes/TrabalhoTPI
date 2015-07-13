/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhotpa;

import Escalonador.Escalonador;
import Escalonador.FIFO;

/**
 *
 * @author Pedro
 */
public class TrabalhoTPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Escalonador e = escolheAlgoritmo();
            Fachada sistemaInterno = new Fachada(e);
            sistemaInterno.iniciaEscalonamento();

            System.out.println("Escalonador terminou sem erros!");
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static Escalonador escolheAlgoritmo(){
        int algEscalonador;
        //algEscalonador = ...Alguma coisa para o usuário escolher o algorítmo de escalonamento...
        
        algEscalonador = 1; //Forçando FIFO.
        switch(algEscalonador){
            case 1:
                return new FIFO();
//            case 2:
//                return new SJF();
//            case 3:
//                return new SJF();
//            case 4:
//                return new SRT();
//            case 5:
//                return new Loteria();
//            case 6:
//                return new escaneamentoGarantido();
//            case 7:
//                return new RR();  
//            case 8:
//                return new multiplasFilas();
                //teste
            default:
                return null;
        }
    }
    
}
