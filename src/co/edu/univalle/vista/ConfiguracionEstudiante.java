/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.vista;

import co.edu.univalle.controlador.*;
import co.edu.univalle.modelo.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JHOJAN L
 */
public class ConfiguracionEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form ConfiguracionAdministrador
     */
    private Estudiante estudiante;
    private ImageIcon imagen;
    private Icon icon;

    public ConfiguracionEstudiante(Estudiante estudiante) {
        initComponents();
        this.estudiante = estudiante;
        
        CtrConfigEstudiante ctrl = new CtrConfigEstudiante(this, estudiante);
        jlAtras.addMouseListener(ctrl);
        jbActualizar.addActionListener(ctrl);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlAvatar = new javax.swing.JLabel();
        jlAtras = new javax.swing.JLabel();
        jcListaAvatar = new javax.swing.JComboBox<>();
        jtNombre = new javax.swing.JTextField();
        jtUsuario = new javax.swing.JTextField();
        jtPass = new javax.swing.JTextField();
        jbActualizar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlUsuario1 = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retorno.png"))); // NOI18N
        jlAtras.setToolTipText("Atras");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");

        jlNombre.setText("Nombre:");

        jlUsuario.setText("Usuario:");

        jLabel3.setText("Contrasena:");

        jlUsuario1.setText("Edad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtUsuario)
                            .addComponent(jtNombre)
                            .addComponent(jLabel3)
                            .addComponent(jlNombre)
                            .addComponent(jlUsuario)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jbActualizar))
                            .addComponent(jcListaAvatar, 0, 168, Short.MAX_VALUE)
                            .addComponent(jtPass)
                            .addComponent(jlUsuario1)
                            .addComponent(jtEdad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jlAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jcListaAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActualizar)
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void asignarImagen(JLabel label, String ruta) {
        this.imagen = new ImageIcon(ruta);//establecemos la ruta
        this.icon = new ImageIcon(this.imagen.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));

        label.setIcon(this.icon);
        this.repaint();

    }
    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JComboBox<String> jcListaAvatar;
    private javax.swing.JLabel jlAtras;
    private javax.swing.JLabel jlAvatar;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel jlUsuario1;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPass;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JButton getJbActualizar() {
        return jbActualizar;
    }

    public void setJbActualizar(JButton jbActualizar) {
        this.jbActualizar = jbActualizar;
    }

    public JComboBox<String> getJcListaAvatar() {
        return jcListaAvatar;
    }

    public void setJcListaAvatar(JComboBox<String> jcListaAvatar) {
        this.jcListaAvatar = jcListaAvatar;
    }

    public JLabel getJlAtras() {
        return jlAtras;
    }

    public void setJlAtras(JLabel jlAtras) {
        this.jlAtras = jlAtras;
    }

    public JLabel getJlAvatar() {
        return jlAvatar;
    }

    public void setJlAvatar(JLabel jlAvatar) {
        this.jlAvatar = jlAvatar;
    }

    public JLabel getJlNombre() {
        return jlNombre;
    }

    public void setJlNombre(JLabel jlNombre) {
        this.jlNombre = jlNombre;
    }

    public JLabel getJlUsuario() {
        return jlUsuario;
    }

    public void setJlUsuario(JLabel jlUsuario) {
        this.jlUsuario = jlUsuario;
    }

    public JTextField getJtNombre() {
        return jtNombre;
    }

    public void setJtNombre(JTextField jtNombre) {
        this.jtNombre = jtNombre;
    }

    public JTextField getJtUsuario() {
        return jtUsuario;
    }

    public void setJtUsuario(JTextField jtUsuario) {
        this.jtUsuario = jtUsuario;
    }

    public JTextField getJtPass() {
        return jtPass;
    }

    public void setJtPass(JTextField jtPass) {
        this.jtPass = jtPass;
    }

    public JTextField getJtEdad() {
        return jtEdad;
    }

    public void setJtEdad(JTextField jtEdad) {
        this.jtEdad = jtEdad;
    }

}
