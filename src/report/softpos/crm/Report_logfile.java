/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report.softpos.crm;

/**
 *
 * @author softpos
 */
public class Report_logfile extends javax.swing.JDialog {

    /**
     * Creates new form Report_logfile
     */
    public Report_logfile(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        lblMonth = new javax.swing.JLabel();
        cmdDateChoose2 = new javax.swing.JButton();
        txt2 = new javax.swing.JFormattedTextField();
        cmdDateChoose1 = new javax.swing.JButton();
        txt1 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        cmdProcess = new javax.swing.JButton();
        cmdDateChoose4 = new javax.swing.JButton();
        cmdProcess1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานบันทึกเหตุกาณ์ (Log File)");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("กำหนดช่วงวันที่"));

        lblMonth.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N

        cmdDateChoose2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        cmdDateChoose2.setFocusable(false);
        cmdDateChoose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDateChoose2ActionPerformed(evt);
            }
        });
        cmdDateChoose2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmdDateChoose2FocusGained(evt);
            }
        });
        cmdDateChoose2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdDateChoose2KeyPressed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt2FocusGained(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });

        cmdDateChoose1.setFocusable(false);
        cmdDateChoose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDateChoose1ActionPerformed(evt);
            }
        });
        cmdDateChoose1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdDateChoose1KeyPressed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt1FocusGained(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        jLabel15.setText("ถึง");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDateChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDateChoose2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(lblMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDateChoose1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDateChoose2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        cmdProcess.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        cmdProcess.setText("ประมวณผล");
        cmdProcess.setFocusable(false);
        cmdProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProcessActionPerformed(evt);
            }
        });
        cmdProcess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdProcessKeyPressed(evt);
            }
        });

        cmdDateChoose4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cmdDateChoose4.setText("Exit");
        cmdDateChoose4.setFocusable(false);
        cmdDateChoose4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDateChoose4ActionPerformed(evt);
            }
        });
        cmdDateChoose4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdDateChoose4KeyPressed(evt);
            }
        });

        cmdProcess1.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        cmdProcess1.setText("พิมพ์");
        cmdProcess1.setFocusable(false);
        cmdProcess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProcess1ActionPerformed(evt);
            }
        });
        cmdProcess1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdProcess1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdProcess1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDateChoose4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdProcess)
                    .addComponent(cmdProcess1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdDateChoose4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วัน", "เวลา", "ประเภท", "ตำแหน่ง/ส่วน", "เหตุการณ์", "ผู้ดำเนินการ", "ชื่อเครื่อง"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDateChoose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose2ActionPerformed

    }//GEN-LAST:event_cmdDateChoose2ActionPerformed

    private void cmdDateChoose2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmdDateChoose2FocusGained

    }//GEN-LAST:event_cmdDateChoose2FocusGained

    private void cmdDateChoose2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdDateChoose2KeyPressed

    }//GEN-LAST:event_cmdDateChoose2KeyPressed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained

    }//GEN-LAST:event_txt2FocusGained

    private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed

    }//GEN-LAST:event_txt2KeyPressed

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased

    }//GEN-LAST:event_txt2KeyReleased

    private void cmdDateChoose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose1ActionPerformed

    }//GEN-LAST:event_cmdDateChoose1ActionPerformed

    private void cmdDateChoose1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdDateChoose1KeyPressed

    }//GEN-LAST:event_cmdDateChoose1KeyPressed

    private void txt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1FocusGained

    }//GEN-LAST:event_txt1FocusGained

    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed

    }//GEN-LAST:event_txt1KeyPressed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased

    }//GEN-LAST:event_txt1KeyReleased

    private void cmdProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProcessActionPerformed

    }//GEN-LAST:event_cmdProcessActionPerformed

    private void cmdProcessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdProcessKeyPressed

    }//GEN-LAST:event_cmdProcessKeyPressed

    private void cmdDateChoose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDateChoose4ActionPerformed
        dispose();
    }//GEN-LAST:event_cmdDateChoose4ActionPerformed

    private void cmdDateChoose4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdDateChoose4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdDateChoose4KeyPressed

    private void cmdProcess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProcess1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdProcess1ActionPerformed

    private void cmdProcess1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdProcess1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdProcess1KeyPressed

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
            java.util.logging.Logger.getLogger(Report_logfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report_logfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report_logfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report_logfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Report_logfile dialog = new Report_logfile(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDateChoose1;
    private javax.swing.JButton cmdDateChoose2;
    private javax.swing.JButton cmdDateChoose4;
    private javax.swing.JButton cmdProcess;
    private javax.swing.JButton cmdProcess1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JFormattedTextField txt1;
    private javax.swing.JFormattedTextField txt2;
    // End of variables declaration//GEN-END:variables
}
