/*
 * Esta clase dibuja hexagonos
 */
package codigo;

/**
 * @author Gonzalo Izuzquiza
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Hexagono extends Forma{
    
    public Hexagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del hexagono correctamente para que guarde 6 lados
        super(_posX, _posY, 6, _color, _relleno);
    }
    
}
