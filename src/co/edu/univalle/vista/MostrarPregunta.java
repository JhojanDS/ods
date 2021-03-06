/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.vista;

import co.edu.univalle.controlador.CtrGestionAdministrador;
import co.edu.univalle.controlador.CtrMostrarPreguntas;
import co.edu.univalle.modelo.Administrador;
import co.edu.univalle.modelo.Clase;
import co.edu.univalle.modelo.Examen;
import co.edu.univalle.modelo.Profesor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHOJANL
 */
public class MostrarPregunta extends javax.swing.JInternalFrame {

    public static String ventanaMostrarActiva;// determinara si esta abierto este internal frame
    private Profesor profesor;
    private Clase clase;
    private Examen examen;
    private DefaultTableModel modelo;

    public MostrarPregunta(Examen adminLog) {

        ventanaMostrarActiva = "activa";//declaramos que esta activa para despues validarla

        this.examen = adminLog;
        initComponents();
        modelo = (DefaultTableModel) jTablePregunta.getModel();//establecemos el modelo
   
        CtrMostrarPreguntas ctrl = new CtrMostrarPreguntas(examen, this);
        jbEliminar.addActionListener(ctrl);
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

        jlNombreExamen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePregunta = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jlNombreExamen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlNombreExamen.setText("nombreExamen");

        jTablePregunta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo de pregunta", "Enunciado", "Respuesta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePregunta);

        jbEliminar.setText("Eliminar..");

        jbActualizar.setText("Actualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNombreExamen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminar)
                            .addComponent(jbActualizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlNombreExamen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        ventanaMostrarActiva = null;//si esta cerrada la pondra como nulo
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePregunta;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JLabel jlNombreExamen;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public JLabel getjLabel1() {
        return jlNombreExamen;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jlNombreExamen = jLabel1;
    }

 
 
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

   
   
    public JButton getJbEliminar() {
        return jbEliminar;
    }

    public void setJbEliminar(JButton jbEliminar) {
        this.jbEliminar = jbEliminar;
    }

    public JTable getjTablePregunta() {
        return jTablePregunta;
    }

    public void setjTablePregunta(JTable jTablePregunta) {
        this.jTablePregunta = jTablePregunta;
    }

  
    public JButton getJbActualizar() {
        return jbActualizar;
    }

    public void setJbActualizar(JButton jbActualizar) {
        this.jbActualizar = jbActualizar;
    }

    public JLabel getJlNombreExamen() {
        return jlNombreExamen;
    }

    public void setJlNombreExamen(JLabel jlNombreExamen) {
        this.jlNombreExamen = jlNombreExamen;
    }
    

}
