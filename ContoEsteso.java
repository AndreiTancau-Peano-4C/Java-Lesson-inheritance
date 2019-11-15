/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author tancau.andrei
 */
public class ContoEsteso extends ContoBancario {

    private int fido;

    public ContoEsteso(String contoBancario) {
        super(contoBancario);
        this.fido = 1000;
    }

    public ContoEsteso(String contoBancario, int bilancio) {
        super(contoBancario, bilancio);
        this.fido = 1000;
    }

    public ContoEsteso(String contoBancario, int bilancio, int fido) {
        super(contoBancario, bilancio);
        this.fido = fido;
    }
    
    public int getFido(){
        return fido;
    }
    
    public void setFido(int fido){
        this.fido=fido;
    }
    
    @Override
    public int prelievo(int prelievo){
        if(getBilancio()+getFido()>prelievo){
            bilancio=getBilancio()-prelievo;
        }
        else{
            System.out.println("bilancio insufficiente");
        }
        return bilancio;
    }
    

}
