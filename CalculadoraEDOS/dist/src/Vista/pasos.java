package Vista;

import Modelo.FactorIntegrante;
import Modelo.LaTex;
import Modelo.StepbyStep;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Autores: Daniela Alexandra Patiño Davila - 1152136 Cristian Julian Lamus
 * Lamus - 1152139 Jairo Alexis Rojas Ramirez - 1152142 Jairo Alberto Duran
 * Rivero - 1152160
 *
 */
public final class pasos extends javax.swing.JFrame {

    calculadora calculadora = new calculadora();
    LaTex latex;
    String paso1 = "";
    FactorIntegrante factor = new FactorIntegrante();
    StepbyStep step = new StepbyStep();

    public pasos() {
        initComponents();
        factor.calcular(calculadora.ecu);
        step.StepbyStep(calculadora.ecu);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        latex = new LaTex("\\LaTeX{}");
        inicializarPasos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        modelo = new javax.swing.JLabel();
        PASO1 = new javax.swing.JLabel();
        PASO2 = new javax.swing.JLabel();
        PASO3 = new javax.swing.JLabel();
        PASO4 = new javax.swing.JLabel();
        PASO5 = new javax.swing.JLabel();
        PASO6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Más");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        modelo.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 18)); // NOI18N
        modelo.setText("Paso a Paso");

        PASO1.setText("PASO 1");

        PASO2.setText("PASO 2");

        PASO3.setText("PASO 3");

        PASO4.setText("PASO 4");

        PASO5.setText("PASO 5");

        PASO6.setText("PASO 6");
        PASO6.setMaximumSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PASO6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PASO5, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASO1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASO2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASO3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASO4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(modelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PASO1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PASO2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PASO3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PASO4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PASO5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PASO6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String info = "- A partir del modelo de la EDO se indentifica quien es px y fx\n"
                + "- cuando se obtiene a px se halla el factor ux que es euler elevado a la integral de px\n"
                + "- Luego, se debe integrar el producto de ux con fx empleado el método de integral por partes\n"
                + "- Finalmente, se despeja y pasando a dividir el resultado de la integral por partes por ux.";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String[] args) {
        pasos paso = new pasos();
        paso.setVisible(true);
        paso.setResizable(false);
        paso.setLocationRelativeTo(null);
    }

    public void inicializarPasos() {
//        System.out.println(step.getUx());
//        System.out.println(step.getPx);
String sol = factor.getSolucion().replace("1/"+step.getUx(),"");
        System.out.println(sol);
        PASO1.setText(null);
        PASO1.setIcon(latex.actualizarIconLaTex(step.getPaso1(), 20));

        PASO2.setText(null);
        PASO2.setIcon(latex.actualizarIconLaTex(step.getPaso2(), 25));

        PASO3.setText(null);
        PASO3.setIcon(latex.actualizarIconLaTex(step.getPaso3(), 25));

        PASO4.setText(null);
        PASO4.setIcon(latex.actualizarIconLaTex(step.getPaso4(), 20));

        PASO5.setText(null);
        PASO5.setIcon(latex.actualizarIconLaTex(step.getPaso5(), 20));

        PASO6.setText(null);
        PASO6.setIcon(latex.actualizarIconLaTex("y(x)=" + step.getSolucion(), 19));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PASO1;
    private javax.swing.JLabel PASO2;
    private javax.swing.JLabel PASO3;
    private javax.swing.JLabel PASO4;
    private javax.swing.JLabel PASO5;
    private javax.swing.JLabel PASO6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel modelo;
    // End of variables declaration//GEN-END:variables
}
