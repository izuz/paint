/*
 * En esta clase se dibujan lineas
 */
package codigo;

import java.awt.Color;

/**
 * @author Gonzalo Izuzquiza
 */
public class Linea extends Forma {
    
    public Linea (int _posX, int _posY, Color _color, boolean _relleno){
        // inicializo el constructor de las lineas correctamente
        super(_posX, _posY, 2, _color, _relleno);

    }
}
