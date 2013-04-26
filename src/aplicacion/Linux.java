/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Random;

/**
 *
 * @author DAM
 */
public class Linux extends SistemasOperativos {
    Random r = new Random();
    public Linux(String version, int ramMaxima, int bits) {
        super(version, ramMaxima, bits);
    }
    
    @Override
    public String pantallazoAzul() {
       String pantallazo = "";
       int num=r.nextInt(0-100)+1;
       if (num < 50)pantallazo="Pantallazo azul";
       else pantallazo = "No hay pantallazo azul";
       return pantallazo;
    }

    @Override
    public String buscarVirus() {
        String virus="";
        int num=r.nextInt(0-100)+1;
        if (num < 25)virus="Pantallazo azul";
        else virus = "No hay pantallazo azul";
        return virus;
    }    
}
