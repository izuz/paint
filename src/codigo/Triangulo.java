/*
 * Esta clase dibuja triangulos
 */
package codigo;

import java.awt.Color;
/**
 * @author Gonzalo Izuzquiza
 */
public class Triangulo extends Forma {
    
    public Triangulo (int _posX, int _posY, Color _color, boolean _relleno){
        // inicializo el constructor del triangulo correctamente para que guarde los 3 lados
        super(_posX, _posY, 3, _color, _relleno);

    }
    
}

