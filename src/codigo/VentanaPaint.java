/*
 * Ventana principal del paint
 */
package codigo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JToggleButton;

/**
 * @author Gonzalo Izuzquiza
 */

public class VentanaPaint extends javax.swing.JFrame {
    
    BufferedImage buffer, buffer2, buffer3 = null;
    Forma miForma;
    //Linea linea;
    Color colorSeleccionado = Color.black;
    int formaSeleccionada = 3; // si vale 1, pinto con pincel
                               // si vale 2 pinto lineas,
                              // si vale 3 pinto triangulos, 
                              // si vale 4 pinto cuadrados,
                              // si vale 5 pinto pentagonos,
                              // si vale 11, borro
                              //si vale 100 pinto circulos,
                              
    
    Graphics2D bufferGraphics, buffer2Graphics, buffer3Graphics, jPanelGraphics = null;
    
    BasicStroke trazo1 = new BasicStroke(15);
    BasicStroke trazo2 = new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0.0f);
    
    /**
     * Creates new form VentanaPaint
     */
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double xOrigen;
    private double yOrigen;
    private int selectCursor = -1;
    private Cursor cursorLapiz;
    private boolean flagPaint=false;
    
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(640,470);
        
    }
    
    private void inicializaBuffers(){
        // creo una imagen del mismo ancho y alto que el lienzo
        buffer = (BufferedImage)jPanel1.createImage(jPanel1.getWidth(),jPanel1.getHeight());
        // creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        // inicializa el buffer para que sea un rectangulo rojo que ocupe todo el jpanel
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0, 0, buffer.getWidth(), buffer.getHeight()); 
        
        // inicializo el 2º buffer
             buffer2 = (BufferedImage)jPanel1.createImage(jPanel1.getWidth(),jPanel1.getHeight());
        // creo una imagen modificable
         buffer2Graphics = buffer2.createGraphics();
        // inicializa el buffer para que sea un rectangulo rojo que ocupe todo el jpanel
        buffer2Graphics.setColor(Color.white);
        buffer2Graphics.fillRect(0, 0, buffer2.getWidth(), buffer2.getHeight()); 
        
        jPanelGraphics = (Graphics2D) jPanel1.getGraphics();
    }
   
    @Override
    public void paint(Graphics g){
        super.paint(g);
        jPanelGraphics.drawImage(buffer, 0, 0, null);
        
    }
    public void deSelecciona(){
        Component [] components = (Component []) getContentPane().getComponents();
        for (Component comp : components) {
            if (comp instanceof JToggleButton){
                ((JToggleButton) comp).setSelected(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jSlider1 = new javax.swing.JSlider();
        jSpinner1 = new javax.swing.JSpinner();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(111, 111, 111))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCheckBox1.setText("Relleno");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color.png"))); // NOI18N
        jLabel1.setText("Colores");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png"))); // NOI18N
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton2MousePressed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadrado.png"))); // NOI18N
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton3MousePressed(evt);
            }
        });

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangulo.png"))); // NOI18N
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton4MousePressed(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pentagono.png"))); // NOI18N
        jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton5MousePressed(evt);
            }
        });

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        jToggleButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton6MousePressed(evt);
            }
        });

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setValue(1);
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/suprimir.jpg"))); // NOI18N
        jToggleButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton7MousePressed(evt);
            }
        });

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jToggleButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton8MousePressed(evt);
            }
        });

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goma.png"))); // NOI18N
        jToggleButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton9MousePressed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu1StateChanged(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cargar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton6))
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton7)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton8)
                            .addComponent(jToggleButton9))
                        .addGap(0, 133, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
            //Dibuja la forma correspondiente
        // miForma.dibujate(bufferGraphics, evt.getY(),evt.getX(), new Trazo (jSlider1.getValue(), true));
        // repaint(0,0,1,1);
        switch (formaSeleccionada) {
            //Con este caso selecciono el lapiz y me dibuja una linea a mano alzada
            case 1:
                x2 = evt.getX();
                y2 = evt.getY();
                if (x1 != x2 || y1 != y2) {
                    bufferGraphics.setColor(colorSeleccionado);
                    bufferGraphics.drawLine(x1, y1, x2, y2);
                    
                    x1 = x2;
                    y1 = y2;
                }
                break;
                //Con este caso selecciono el borrador, que lo que hace es 
                //pintar en blanco,  que es como si lo borrara ya que quieres
                //quitar la/s figura/s que tienes pinatada/s.
                case 11:
                x2 = evt.getX();
                y2 = evt.getY();
                if (x1 != x2 || y1 != y2) {
                    bufferGraphics.setColor(Color.WHITE);
                    bufferGraphics.drawLine(x1, y1, x2, y2);
                    
                    x1 = x2;
                    y1 = y2;
                }
                break;
            default:
                bufferGraphics.drawImage(buffer2, 0, 0, null);
                miForma.dibujate(bufferGraphics, evt.getY(), evt.getX(), new Trazo(jSlider1.getValue()));
                
                break;
        }
        repaint(0, 0, 1, 1);    
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // inicializo la forma que usare para dibujar en el buffer
        switch (formaSeleccionada){
            case 100: miForma = new Circulo (evt.getX(), evt.getY(), colorSeleccionado, jCheckBox1.isSelected()); 
                    break;
            case 2: miForma = new Linea (evt.getX(), evt.getY(),  colorSeleccionado, jCheckBox1.isSelected()); 
                    break;
            case 3: miForma = new Triangulo (evt.getX(), evt.getY(), colorSeleccionado, jCheckBox1.isSelected()); 
                    break;
            case 4: miForma = new Cuadrado (evt.getX(), evt.getY(),  colorSeleccionado, jCheckBox1.isSelected()); 
                    break;
            case 5: miForma = new Pentagono (evt.getX(), evt.getY(), colorSeleccionado, jCheckBox1.isSelected()); 
                    break;
            case 24: miForma = new Estrella (evt.getX(), evt.getY(), colorSeleccionado, jCheckBox1.isSelected()); 
                    break;
            case 1: x1 = evt.getX();
                    y1 = evt.getY();
                    break;
            case 11: x1 = evt.getX();
                    y1 = evt.getY();
                    break;
        }

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
            
        switch (formaSeleccionada) {
            case 1:
                buffer2Graphics.drawImage(buffer, 0, 0, null);
                break;
                case 11:
                buffer2Graphics.drawImage(buffer2, 0, 0, null);
                break;
            default:
                miForma.dibujate(buffer2Graphics, evt.getY(), evt.getX(), new Trazo(jSlider1.getValue()));
                break;
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code h
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        jDialog1.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
     jDialog1.setVisible(false);
     
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
     jDialog1.setVisible(false);
     colorSeleccionado = jColorChooser1.getColor();
    }//GEN-LAST:event_jButton1MousePressed

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        // elige los circulos
        formaSeleccionada = 100;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton1MousePressed

    private void jToggleButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MousePressed
        // elige los cuadrados
        formaSeleccionada = 4;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton3MousePressed

    private void jToggleButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MousePressed
     // elige los tirangulos
        formaSeleccionada = 3;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton4MousePressed

    private void jToggleButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton5MousePressed
    // eligo los pentagonos
        formaSeleccionada = 5;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton5MousePressed

    private void jToggleButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton6MousePressed
     // eligo las estrellas
        formaSeleccionada = 24;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton6MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        int seleccion = jFileChooser1.showSaveDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION){
        // si llego aqui es que el usuario ha pulsado en "guardar" cuando ha salido
        //el menu del jFileChooser
        File fichero = jFileChooser1.getSelectedFile();
        String nombre = fichero.getName();
        String extension = nombre.substring(nombre.lastIndexOf('.') +1);
        
        if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")){
            try {
                 ImageIO.write(buffer, extension, fichero);
                }
            catch (IOException e){
                 }
            }
        }
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jMenu1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu1StateChanged
        JMenu menu = (JMenu) evt.getSource();
        if (!menu.isSelected()){
            repaint();
        }
    }//GEN-LAST:event_jMenu1StateChanged

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
      int seleccion = jFileChooser1.showOpenDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION){
            //si llego aquí es que el usuario ha pulsado en "guardar" cuando ha salido 
            //el menú del jFileChooser
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.')+1);
            BufferedImage imagen = null;
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")){
                try{
                    imagen = ImageIO.read(fichero);
                    bufferGraphics.drawImage(imagen, 0, 0, null);
                    buffer2Graphics.drawImage(imagen, 0, 0, null);
                    repaint();
                }
                catch(IOException e){
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
       jSpinner1.setValue(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1MouseDragged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
      jSlider1.setValue((int) jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jToggleButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MousePressed
        // eligo las lineas
        formaSeleccionada = 2;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton2MousePressed

    private void jToggleButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton7MousePressed
      
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer3Graphics = buffer2.createGraphics();
        //dibujamos rectangulo blanco de tamaño del lienzo
        buffer3Graphics.setColor(Color.white);
        buffer3Graphics.fillRect(0, 0, buffer2.getWidth(), buffer3.getHeight());
    }//GEN-LAST:event_jToggleButton7MousePressed

    private void jToggleButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton8MousePressed
          //elige trazo
        formaSeleccionada=1;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton8MousePressed

    private void jToggleButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton9MousePressed
        //elige borrador
        formaSeleccionada=11;
        deSelecciona();
    }//GEN-LAST:event_jToggleButton9MousePressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       if (selectCursor == 1) {
            setCursor(cursorLapiz);
        } else {
            setCursor(Cursor.CROSSHAIR_CURSOR);
        }
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
       setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jPanel1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}