/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhotpa;

/**
 *
 * @author Pedro
 */
public class CPU {
    
    private Processo processoEmExecucao = null;
    
    public CPU(){
        
    }
    
    /**
     * 
     * @return true se CPU está executando algum processo.
     *         false caso CPU esteja livre.
     */
    public boolean isOcupada(){
        if(processoEmExecucao == null)
            return false;
        else
            return true;
    }
    
    public Processo getProcessoEmExecucao() {
        return processoEmExecucao;
    }

    public void setProcessoEmExecucao(Processo processoEmExecucao) {
        this.processoEmExecucao = processoEmExecucao;
    }
    
}
