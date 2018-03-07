/*
 * Con esta clase elegimos grosor del trazo
 */
package codigo;

import java.awt.BasicStroke;

/**
 * @author Gonzalo Izuzquiza
 */
public class Trazo extends BasicStroke {
    
    public Trazo (int _grosor){
        super(_grosor);
    }
    public Trazo (int _grosor,boolean rayas ){
        super(_grosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0.0f);
    }
}
