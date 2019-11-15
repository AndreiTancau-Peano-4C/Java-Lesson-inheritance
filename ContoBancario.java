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
public class ContoBancario {

    private String contoBancario;
    protected int bilancio;

    public ContoBancario(String contoBancario) {
        this.contoBancario = contoBancario;
        this.bilancio = 0;
    }

    public ContoBancario(String contoBancario, int bilancio) {
        this.contoBancario = contoBancario;
        this.bilancio = bilancio;
    }

    public String getContoBancario() {
        return contoBancario;
    }

    public int getBilancio() {
        return bilancio;
    }

    public int prelievo(int prelievo) {
        if (getBilancio() > prelievo) {
            bilancio = getBilancio() - prelievo;
        } else {
            System.out.println("bilancio insufficiente");
        }
        return bilancio;
    }

    public int deposito(int deposito) {
        this.bilancio = getBilancio() + deposito;
        return getBilancio() + deposito;
    }

}
