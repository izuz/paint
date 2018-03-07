/*
 * En esta clase dibujamos circulos
 */
package codigo;

import java.awt.Color;

/**
 * @author Gonzalo Izuzquiza
 */
public class Circulo  extends Forma {
    
public Circulo (int _posX, int _posY, Color _color, boolean _relleno){
        // inicializo el constructor del circulo correctamente
        super(_posX, _posY, 5000, _color, _relleno);

    }
}
