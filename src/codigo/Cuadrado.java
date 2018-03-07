/*
 * En esta clase se dibujan cuadrados
 */
package codigo;

import java.awt.Color;

/**
 * @author Gonzalo Izuzquiza
 */
public class Cuadrado extends Forma {
    
    public Cuadrado (int _posX, int _posY, Color _color, boolean _relleno){
        // inicializo el constructor del cuadrado correctamente
        super(_posX, _posY, 4, _color, _relleno);

    }
}
