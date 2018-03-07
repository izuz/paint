/*
 * Esta clase dibuja pentagonos
 */
package codigo;

import java.awt.Color;

/**
 * @author Gonzalo Izuzquiza
 */
public class Pentagono extends Forma {

    public Pentagono (int _posX, int _posY, Color _color, boolean _relleno){
        // inicializo el constructor del pentagono correctamente para que guarde los 5 lados
        super(_posX, _posY, 5, _color, _relleno);
 }
}


