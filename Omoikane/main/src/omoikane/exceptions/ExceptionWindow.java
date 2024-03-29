/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExceptionWindow.java
 *
 * Created on 6/12/2010, 07:45:29 AM
 */

package omoikane.exceptions;

/**
 *
 * @author mora
 */
public class ExceptionWindow extends javax.swing.JFrame {

    /** Creates new form ExceptionWindow */
    public ExceptionWindow() {
        initComponents();
    }

    public static void show(Throwable e) {
        ExceptionWindow ew = new ExceptionWindow();
        ew.getTxtExcepcion().setText(Misc.getStackTraceString(e));
        ew.setVisible(true);
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExcepcion = new javax.swing.JTextArea();
        lblTituloError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mensaje de error");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Se ha generado la siguiente excepción:");

        txtExcepcion.setColumns(20);
        txtExcepcion.setRows(5);
        jScrollPane1.setViewportView(txtExcepcion);

        lblTituloError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloError.setText("Error Desconocido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloError, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloError)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExceptionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloError;
    private javax.swing.JTextArea txtExcepcion;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnCerrar
     */
    public javax.swing.JButton getBtnCerrar() {
        return btnCerrar;
    }

    /**
     * @param btnCerrar the btnCerrar to set
     */
    public void setBtnCerrar(javax.swing.JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    /**
     * @return the txtExcepcion
     */
    public javax.swing.JTextArea getTxtExcepcion() {
        return txtExcepcion;
    }

    /**
     * @param txtExcepcion the txtExcepcion to set
     */
    public void setTxtExcepcion(javax.swing.JTextArea txtExcepcion) {
        this.txtExcepcion = txtExcepcion;
    }

    /**
     * @return the lblTituloError
     */
    public javax.swing.JLabel getLblTituloError() {
        return lblTituloError;
    }

}
