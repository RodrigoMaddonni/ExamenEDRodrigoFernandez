
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class VistaAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form VistaAlumnos
     */
    DefaultListModel modelo,modelo2;
    DefaultTableModel modelo3;
    Controlador control;
    
    public VistaAlumnos() {
        control = new Controlador();
        modelo = new DefaultListModel();
        modelo2 = new DefaultListModel();
        modelo3 = new DefaultTableModel();
        initComponents();
        rellenenarCurso();
        rellenarEvaluacion();
        setLocationRelativeTo(null);
        modelo3.addColumn("Alumnos");
        modelo3.addColumn("Asignatura");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cCurso = new java.awt.Choice();
        cEvaluacion = new java.awt.Choice();
        cAsignatura = new java.awt.Choice();
        bAplicar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lCandidatos = new javax.swing.JList();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lSeleccionados = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        bEvaluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tEvaluar = new javax.swing.JTable();
        bProcesar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluacion de Alumnos");
        setMinimumSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Seleccion Asignatura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 860, 20));

        jLabel2.setText("Curso :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel3.setText("Evaluacion :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel4.setText("Asignatura :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        cCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rellenarAsignatura(evt);
            }
        });
        getContentPane().add(cCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 140, -1));
        getContentPane().add(cEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 140, -1));
        getContentPane().add(cAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 150, -1));

        bAplicar.setText("Aplicar");
        bAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlumnos(evt);
            }
        });
        getContentPane().add(bAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Seleccion Alumnos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 850, 10));

        jLabel6.setText("Alumnos Candidatos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        lCandidatos.setModel(modelo);
        jScrollPane1.setViewportView(lCandidatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 320, 190));

        b1.setText("> >");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarSeleccionado(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, -1));

        b2.setText("> |");
        b2.setMaximumSize(new java.awt.Dimension(40, 30));
        b2.setMinimumSize(new java.awt.Dimension(40, 30));
        b2.setPreferredSize(new java.awt.Dimension(40, 30));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosCandidatos(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 80, -1));

        b3.setText("< <");
        b3.setMinimumSize(new java.awt.Dimension(40, 30));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarCandidato(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 80, -1));

        b4.setText("| <");
        b4.setMinimumSize(new java.awt.Dimension(40, 30));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarSeleccionados(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 80, -1));

        lSeleccionados.setModel(modelo2);
        jScrollPane2.setViewportView(lSeleccionados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 320, 190));

        jLabel7.setText("Alumnos Seleccionados");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        bEvaluar.setText("Evaluar");
        bEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluar(evt);
            }
        });
        getContentPane().add(bEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));

        jLabel8.setText("Evaluacion Alumnos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 840, 10));

        tEvaluar.setModel(modelo3);
        jScrollPane4.setViewportView(tEvaluar);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 620, 120));

        bProcesar.setText("Procesar");
        bProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarNotas(evt);
            }
        });
        getContentPane().add(bProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 90, -1));

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirApp(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarAlumnos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlumnos
        modelo.removeAllElements();
        ResultSet resultado = control.obtenerAlumnos(cCurso.getSelectedItem());
        try {
            if (resultado != null) {
                while (resultado.next()) {                    
                    modelo.addElement(resultado.getString("nombre"));
                }
            }else{
                System.out.println("Objeto vacio");
            }
        } catch (SQLException e) {
            System.out.println("Fallo mostrarAlumnos");
        }
        
    }//GEN-LAST:event_mostrarAlumnos

    private void pasarSeleccionados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarSeleccionados
        try {
            for (int i = 0; i < modelo2.getSize(); i++) {
                modelo.addElement(modelo2.getElementAt(i));
            }
            modelo2.removeAllElements();
        } catch (Exception e) {
            System.out.println("Sin Alumnos");
        }
    }//GEN-LAST:event_pasarSeleccionados

    private void evaluar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluar
        modelo3.setRowCount(0);
        if (cAsignatura.getSelectedItem() != null) {
            modelo3.setColumnCount(1);
            modelo3.addColumn(cAsignatura.getSelectedItem());
        }else{
            System.out.println("Choice Vacio");
        }
        for (int i = 0; i < modelo2.getSize(); i++) {
            ResultSet resultado = control.obtenerNota(""+modelo2.getElementAt(i), cCurso.getSelectedItem(), cEvaluacion.getSelectedItem(), cAsignatura.getSelectedItem());            
            try {
                if (resultado.getString("nota") == "") {
                    modelo3.addRow(new Object[]{modelo2.getElementAt(i),0});                    
                } else{
                    modelo3.addRow(new Object[]{modelo2.getElementAt(i),resultado.getString("nota")});
                }                
            } catch (SQLException e) {
                System.out.println("Fallo obtener notas");
            }
        }
        modelo2.removeAllElements();
    }//GEN-LAST:event_evaluar

    private void pasarCandidato(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarCandidato
        try {
            //int numCandidato = lCandidatos.getSelectedIndex();
            modelo.addElement(modelo2.get(lSeleccionados.getSelectedIndex()));
            modelo2.remove(lSeleccionados.getSelectedIndex());
        } catch (Exception e) {
            System.out.println("No se ha seleccionado un alumno");
        }
    }//GEN-LAST:event_pasarCandidato

    private void todosCandidatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosCandidatos
        try {
            for (int i = 0; i < modelo.getSize(); i++) {
                modelo2.addElement(modelo.getElementAt(i));
            }
            modelo.removeAllElements();
        } catch (Exception e) {
            System.out.println("Sin Alumnos");
        }        
    }//GEN-LAST:event_todosCandidatos

    private void salirApp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirApp
        System.exit(0);
    }//GEN-LAST:event_salirApp

    private void rellenarAsignatura(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rellenarAsignatura
        cAsignatura.removeAll();
        ResultSet resultado = control.obtenerAsignaturas(cCurso.getSelectedItem());
        try {
            if (resultado != null) {
                while (resultado.next()) {                    
                    cAsignatura.addItem(resultado.getString("asignatura"));
                }
            }else{
                System.out.println("Objeto vacio");
            }
        } catch (SQLException e) {
            System.out.println("Fallo rellenarAsignatura");
        }
    }//GEN-LAST:event_rellenarAsignatura

    private void pasarSeleccionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarSeleccionado
        try {
            //int numCandidato = lCandidatos.getSelectedIndex();
            modelo2.addElement(modelo.get(lCandidatos.getSelectedIndex()));
            modelo.remove(lCandidatos.getSelectedIndex());
        } catch (Exception e) {
            System.out.println("No se ha seleccionado un alumno");
        }
    }//GEN-LAST:event_pasarSeleccionado

    private void procesarNotas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarNotas
        
    }//GEN-LAST:event_procesarNotas

    private void rellenenarCurso(){
        ResultSet resultado = control.obtenerRegistros("cursos", "curso");
        try {
            if (resultado != null) {
                while (resultado.next()) {                    
                    cCurso.addItem(resultado.getString("curso"));
                }
            }else{
                System.out.println("Objeto vacio");
            }
        } catch (SQLException e) {
            System.out.println("Fallo rellenarCurso");
        }
    }
    
    private void rellenarEvaluacion(){
        ResultSet resultado = control.obtenerRegistros("notas", "evaluacion");
        
        try {
            if (resultado != null) {
                while (resultado.next()) {                    
                    cEvaluacion.addItem(resultado.getString("evaluacion"));
                }
            } else {
                System.out.println("Objeto Vacio");
            }
        } catch (SQLException e) {
            System.out.println("Fallo rellenarEvaluacion");
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton bAplicar;
    private javax.swing.JButton bEvaluar;
    private javax.swing.JButton bProcesar;
    private javax.swing.JButton bSalir;
    private java.awt.Choice cAsignatura;
    private java.awt.Choice cCurso;
    private java.awt.Choice cEvaluacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JList lCandidatos;
    private javax.swing.JList lSeleccionados;
    private javax.swing.JTable tEvaluar;
    // End of variables declaration//GEN-END:variables
}
