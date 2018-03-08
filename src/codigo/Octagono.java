/*
 * Esta clase dibuja octogonos
 */
package codigo;

/**
 * @author Gonzalo Izuzquiza
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Octagono extends Forma{
    
    public Octagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del octogono correctamente para que guarde 8 lados
        super(_posX, _posY, 8, _color, _relleno);
    }
    
}
