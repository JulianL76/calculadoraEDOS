package Vista;

import Modelo.FactorIntegrante;
import Modelo.Integral;
import Modelo.LaTex;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Autores: 
 * Daniela Alexandra Patiño Davila - 1152136 
 * Cristian Julian Lamus Lamus - 1152139 
 * Jairo Alexis Rojas Ramirez - 1152142 
 * Jairo Alberto Duran Rivero - 1152160
 */
public class calculadora extends javax.swing.JFrame {

    private final Color btnPressed = new Color(153, 153, 153);
    private final Color btnFocused = new Color(254, 215, 215);
    private ImageIcon imagen;
    private Icon icono;
    public static String ecu = "";
    
    FactorIntegrante factorIntegrante = new FactorIntegrante();

    public calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        this.mostrarImagen(imgLogo, "src/Vista/logoDJ.png");       
        this.mostrarImagen(imgUFPS, "src/Vista/logoufps.png");
        getContentPane().setBackground(new Color(255, 255, 255));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblInserteEcuacion = new javax.swing.JLabel();
        ecuacion = new javax.swing.JTextField();
        lblSolucion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        calcular = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        exponente = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        slash = new javax.swing.JButton();
        modelo = new javax.swing.JButton();
        lblDesarrollador1 = new javax.swing.JLabel();
        lblDesarralldor2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        imgUFPS = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmdMostarpasos = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora EDOS");

        lblInserteEcuacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        lblInserteEcuacion.setText("Inserte aquí su ecuación diferencial lineal de primer orden");

        ecuacion.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N

        lblSolucion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblSolucion.setForeground(new java.awt.Color(255, 0, 0));
        lblSolucion.setText("Solución ");

        area.setColumns(20);
        area.setFont(new java.awt.Font("Cambria", 2, 16)); // NOI18N
        area.setLineWrap(true);
        area.setRows(5);
        area.setText("El programa esta diseñado para resolver solo Ecuaciones Diferenciales Ordinales de primer orden por metodo de factor integrante.");
        area.setWrapStyleWord(true);
        jScrollPane1.setViewportView(area);

        calcular.setBackground(new java.awt.Color(255, 255, 255));
        calcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calcular.setText("Resolver");
        calcular.setFocusable(false);
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcularMouseExited(evt);
            }
        });
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(255, 255, 255));
        borrar.setText("Borrar");
        borrar.setFocusable(false);
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrarMouseExited(evt);
            }
        });
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        exponente.setBackground(new java.awt.Color(255, 255, 255));
        exponente.setText("^");
        exponente.setFocusable(false);
        exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponenteActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setFocusable(false);
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        slash.setBackground(new java.awt.Color(255, 255, 255));
        slash.setText("/");
        slash.setFocusable(false);
        slash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slashActionPerformed(evt);
            }
        });

        modelo.setBackground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelos ");
        modelo.setFocusable(false);
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        lblDesarrollador1.setText(" Daniela Alexandra Patiño Cód: 1152136 - Cristian Julian Lamus Cód: 1152139");

        lblDesarralldor2.setText("Jairo Alexis Rojas Ramirez Cód: 1152142 - Jairo Alberto Duran Cód: 1152160");

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTitulo.setText("Calculadora DJ3");

        imgUFPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/logoufps.png"))); // NOI18N

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/logoDJ.png"))); // NOI18N

        jLabel1.setText("V 1.2");

        cmdMostarpasos.setBackground(new java.awt.Color(255, 255, 255));
        cmdMostarpasos.setText("Mostar Pasos");
        cmdMostarpasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostarpasosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesarrollador1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(exponente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(igual)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(slash)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(borrar))
                                            .addComponent(ecuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(calcular))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblInserteEcuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(imgUFPS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(lblTitulo)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSolucion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdMostarpasos)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesarralldor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgUFPS, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblInserteEcuacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exponente)
                    .addComponent(slash)
                    .addComponent(igual)
                    .addComponent(borrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modelo)
                        .addComponent(cmdMostarpasos))
                    .addComponent(lblSolucion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesarrollador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblDesarralldor2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponenteActionPerformed
        ecuacion.setText(ecuacion.getText() + "^");
    }//GEN-LAST:event_exponenteActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        ecuacion.setText(ecuacion.getText() + "=");
    }//GEN-LAST:event_igualActionPerformed

    private void slashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slashActionPerformed
        ecuacion.setText(ecuacion.getText() + "/");
    }//GEN-LAST:event_slashActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        ecu = ecuacion.getText(); 
        factorIntegrante.calcular(ecuacion.getText());
        area.setText(factorIntegrante.getMsg()); 
    }//GEN-LAST:event_calcularActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        ecuacion.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        new info().setVisible(true);
    }//GEN-LAST:event_modeloActionPerformed

    private void calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseEntered
        calcular.setBackground(btnFocused);
    }//GEN-LAST:event_calcularMouseEntered

    private void calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseExited
        calcular.setBackground(Color.white);
    }//GEN-LAST:event_calcularMouseExited

    private void borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseExited
        borrar.setBackground(Color.white);
    }//GEN-LAST:event_borrarMouseExited

    private void borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseEntered
        borrar.setBackground(btnPressed);
    }//GEN-LAST:event_borrarMouseEntered

    private void cmdMostarpasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostarpasosActionPerformed
        new pasos().setVisible(true);
    }//GEN-LAST:event_cmdMostarpasosActionPerformed

    public static void main(String[] args) {
        calculadora calculadora = new calculadora();
        calculadora.setVisible(true);
        
        calculadora.setResizable(false);
        calculadora.setLocationRelativeTo(null);
    }

    private void mostrarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(icono);
        lbl.repaint();
    }
    
    public String getEcuacion(){
    return ecu;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton borrar;
    private javax.swing.JButton calcular;
    private javax.swing.JButton cmdMostarpasos;
    private javax.swing.JTextField ecuacion;
    private javax.swing.JButton exponente;
    private javax.swing.JButton igual;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgUFPS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesarralldor2;
    private javax.swing.JLabel lblDesarrollador1;
    private javax.swing.JLabel lblInserteEcuacion;
    private javax.swing.JLabel lblSolucion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JButton modelo;
    private javax.swing.JButton slash;
    // End of variables declaration//GEN-END:variables
}
