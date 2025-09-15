
package vista;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Jframe extends javax.swing.JFrame {
 float importeUnit,importeFinal,importeNeto,descuentoUn,descuentoDo,total=0;
        ArrayList<Float> importeNetoLis = new ArrayList<>();
        short cant;
    public Jframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnBorrarAnt = new javax.swing.JButton();
        btnBorrarT = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtImporteUnit = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        lblImporteNetoAcum = new javax.swing.JLabel();
        lblDescuentoUNO = new javax.swing.JLabel();
        lblDescuentoDOS = new javax.swing.JLabel();
        lblImporteTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        lblImporteNeto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("CAMI-sas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Bueno bonito y barato");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("EL 7% DEL 7% DE DESCUENTO EN TODA LA TIENDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnBorrarAnt.setText("Borrar Ant");
        btnBorrarAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAntActionPerformed(evt);
            }
        });

        btnBorrarT.setText("Borrar Lista");
        btnBorrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrarAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrarAnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrarT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Importe unit: S/");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Importe Neto acum:");

        jLabel6.setText("Descuento/verano:");

        jLabel7.setText("Descuento/verano:");

        jLabel8.setText("Importe total:");

        txtImporteUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteUnitActionPerformed(evt);
            }
        });
        txtImporteUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImporteUnitKeyPressed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        lblImporteNetoAcum.setText("S/ ");

        lblDescuentoUNO.setText("S/ ");

        lblDescuentoDOS.setText("S/ ");

        lblImporteTotal.setText("S/ ");

        txtPanel.setColumns(20);
        txtPanel.setRows(5);
        jScrollPane2.setViewportView(txtPanel);

        jLabel10.setText("Importe Neto :");

        lblImporteNeto.setText("S/ ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtImporteUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImporteTotal)
                                    .addComponent(lblDescuentoDOS)
                                    .addComponent(lblDescuentoUNO)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImporteNeto)
                                    .addComponent(lblImporteNetoAcum))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtImporteUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lblImporteNeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblImporteNetoAcum))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblDescuentoUNO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblDescuentoDOS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblImporteTotal))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAntActionPerformed
        borrarLineaAnterior();
                txtCantidad.setText("");
        txtImporteUnit.setText("");
        txtImporteUnit.requestFocus();
    }//GEN-LAST:event_btnBorrarAntActionPerformed

    private void btnBorrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTActionPerformed
        txtPanel.setText("");
        lblImporteNeto.setText("S/ ");
lblImporteNetoAcum.setText("S/ ");
lblDescuentoUNO.setText("S/ ");
lblDescuentoDOS.setText("S ");
lblImporteTotal.setText("S/");
        txtCantidad.setText("");
        txtImporteUnit.setText("");
        txtImporteUnit.requestFocus();
    }//GEN-LAST:event_btnBorrarTActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        String validacion=txtImporteUnit.getText().trim();
        String valid=txtCantidad.getText().trim();
        if(validacion.matches("\\d+(\\.\\d{1,2})?")&&valid.matches("\\d+(\\.\\d{1,2})?")){
        importeUnit=Float.parseFloat(txtImporteUnit.getText().trim());
        cant=Short.parseShort(txtCantidad.getText().trim());
        if(importeUnit>0 && cant>0){
            importeNeto=importeUnit*cant;
            importeNetoLis.add(importeNeto);
            total += importeNeto;
            descuentoUn=total*7/100;
            descuentoDo=total*93/100*7/100;
            importeFinal=total*93/100*93/100;
        }else{
        JOptionPane.showMessageDialog(this, "Ingrese un numero diferente de cero");
        txtImporteUnit.setText("");
        txtCantidad.setText("");
        txtImporteUnit.requestFocus();
        }
        }else{
        JOptionPane.showMessageDialog(this, "Ingrese numeros positivos con 2 decimales");
        txtImporteUnit.setText("");
        txtCantidad.setText("");
        txtImporteUnit.requestFocus();
        }
        
        mostarValores();
        mostrarVentas();
                txtCantidad.setText("");
        txtImporteUnit.setText("");
        txtImporteUnit.requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtImporteUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteUnitActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtImporteUnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteUnitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String valida = txtImporteUnit.getText().trim();

        if (!valida.matches("\\d+(\\.\\d{1,2})?")) {
            JOptionPane.showMessageDialog(this, "Ingrese un número positivo con 2 decimales como máximo");
            txtImporteUnit.setText("");
            txtImporteUnit.requestFocus();
        } else {
            txtCantidad.requestFocus();
        }
    }
    }//GEN-LAST:event_txtImporteUnitKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String validacion=txtImporteUnit.getText().trim();
        String valid=txtCantidad.getText().trim();
        if(validacion.matches("\\d+(\\.\\d{1,2})?")&&valid.matches("\\d+(\\.\\d{1,2})?")){
        importeUnit=Float.parseFloat(txtImporteUnit.getText().trim());
        cant=Short.parseShort(txtCantidad.getText().trim());
        if(importeUnit>0 && cant>0){
            importeNeto=importeUnit*cant;
            importeNetoLis.add(importeNeto);
            total += importeNeto;
            descuentoUn=total*7/100;
            descuentoDo=total*93/100*7/100;
            importeFinal=total*93/100*93/100;
        }else{
        JOptionPane.showMessageDialog(this, "Ingrese un numero diferente de cero");
        txtImporteUnit.setText("");
        txtCantidad.setText("");
        txtImporteUnit.requestFocus();
        }
        }else{
        JOptionPane.showMessageDialog(this, "Ingrese numeros positivos con 2 decimales");
        txtImporteUnit.setText("");
        txtCantidad.setText("");
        txtImporteUnit.requestFocus();
        }
        
        mostarValores();
        mostrarVentas();
        txtCantidad.setText("");
        txtImporteUnit.setText("");
        txtImporteUnit.requestFocus();
    }   
    }//GEN-LAST:event_txtCantidadKeyPressed
private void mostarValores(){
    DecimalFormat deci = new DecimalFormat("0.00");
lblImporteNeto.setText("S/ "+deci.format(importeNeto));
lblImporteNetoAcum.setText("S/ "+deci.format(total));
lblDescuentoUNO.setText("S/ "+deci.format(descuentoUn));
lblDescuentoDOS.setText("S "+deci.format(descuentoDo));
lblImporteTotal.setText("S/"+deci.format(importeFinal));
}
 private void borrarLineaAnterior() {
        if (!importeNetoLis.isEmpty()) {
        // 1. Eliminar el último importe
        float ultimoImporte = importeNetoLis.remove(importeNetoLis.size() - 1);

        // 2. Restar ese importe del total
        total -= ultimoImporte;

        // 3. Reconstruir el texto del panel
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de ventas registradas:\n\n");
        for (int i = 0; i < importeNetoLis.size(); i++) {
            sb.append("Venta ").append(i + 1)
              .append(" | Importe: S/. ").append(importeNetoLis.get(i))
              .append("\n");
        }

        sb.append("\nTOTAL NETO: S/. ").append(total);

        txtPanel.setText(sb.toString());
    } else {
        JOptionPane.showMessageDialog(this, "No hay ventas para eliminar.");
    }

    }
private void mostrarVentas() {
    DecimalFormat deci = new DecimalFormat("0.00");
    txtPanel.append("Importe/Unid:"+deci.format(importeUnit)+"cantidad:"+deci.format(cant)+"importeNet:"+deci.format(importeNeto)+"\n");      
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarAnt;
    private javax.swing.JButton btnBorrarT;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescuentoDOS;
    private javax.swing.JLabel lblDescuentoUNO;
    private javax.swing.JLabel lblImporteNeto;
    private javax.swing.JLabel lblImporteNetoAcum;
    private javax.swing.JLabel lblImporteTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtImporteUnit;
    private javax.swing.JTextArea txtPanel;
    // End of variables declaration//GEN-END:variables
}
