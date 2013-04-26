/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author DAM
 */
public abstract class SistemasOperativos {
    
     private String  version;
    private int ramMaxima,bits;

    public SistemasOperativos(String version, int ramMaxima, int bits) {
        this.version = version;
        this.ramMaxima = ramMaxima;
        this.bits = bits;
    }   

    

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getRamMaxima() {
        return ramMaxima;
    }

    public void setRamMaxima(int ramMaxima) {
        this.ramMaxima = ramMaxima;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }
    
    public void copiar(){
        System.out.println("Copiado");
    }
    
    public void pegar(){
        System.out.println("Pegado");
    }
    
    public abstract String pantallazoAzul();
    public abstract String buscarVirus(); 
    
    
}
