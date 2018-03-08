/*
 * Esta clase dibuja decagonos
 */
package codigo;

/**
 * @author Gonzalo Izuzquiza
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Decagono extends Forma{
    
    public Decagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del decagono correctamente para que guarde 10 lados
        super(_posX, _posY, 10, _color, _relleno);
    }
    
}
