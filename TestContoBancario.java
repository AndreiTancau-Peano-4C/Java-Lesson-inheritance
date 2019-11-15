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
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoBancario c1 = new ContoBancario("IT60X0542811101000000123456");
        ContoBancario c2 = new ContoBancario("IT60X0542811101000000123456",3500);
        System.out.println("numero conto: "+c2.getContoBancario());
        System.out.println("Bilancio: "+c2.getBilancio()+"$");
        System.out.println("Bilancio attuale: "+c2.prelievo(500)+"$");
        
        ContoEsteso c3 = new ContoEsteso("IT60X0542811101000000123456");
        ContoEsteso c4 = new ContoEsteso("IT60X0542811101000000123456",15000);
        ContoEsteso c5 = new ContoEsteso("IT60X0542811101000000123456",15000,2000);
        System.out.println("Fido: "+c3.getFido());
        c5.setFido(2000);
        System.out.println("Bilancio attuale: "+c5.prelievo(500000)+"$"+" Fido: "+c5.getFido());
        System.out.println("Bilancio attuale: "+c5.prelievo(16000)+"$"+" Fido: "+c5.getFido());
        
        ContoEsteso abb = new ContoEsteso("ity005647", 2000, 2000);
        abb.deposito(100);
        System.out.println(abb.getContoBancario()+ "-" + abb.getBilancio());
        abb.prelievo(10750);
        System.out.println(abb.getContoBancario()+ "-" + abb.getBilancio());
        
    }
    
}
