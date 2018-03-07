/*
 * Esta clase dibuja estrellas
 */
package codigo;

import java.awt.Color;
/**
 * @author Gonzalo Izuzquiza
 */
public class Estrella extends Forma {
    
    public Estrella (int _posX, int _posY, Color _color, boolean _relleno){
        // inicializo el constructor de las estrella correctamente para que guarde los 24 lados
        super(_posX, _posY, 24, _color, _relleno);

    }
    
    @Override 
    public void calculaVertices (int _radio, double _giro){
        for (int i=0; i<npoints;i++){
            this.xpoints [i] = (int) (x +_radio*Math.cos((2*Math.PI*i+ _giro)/npoints));
            this.xpoints [i+1] = (int) (x +(_radio/2)*Math.cos((2*Math.PI*i+ _giro/2)/npoints));
            
            this.ypoints [i] = (int) (y +_radio*Math.sin((2*Math.PI*i+ _giro)/npoints));
            this.ypoints [i+1] = (int) (y +(_radio/2)*Math.sin((2*Math.PI*i+ _giro/2)/npoints));
            i++;
        }
    }
    
}

