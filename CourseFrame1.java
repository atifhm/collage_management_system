/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollageManagement;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atif Hyder
 */
public class CourseFrame1 extends javax.swing.JInternalFrame {

    CourseTableOperation cop = new CourseTableOperation();
    
    public CourseFrame1() {
        initComponents();
        courseLoadTable();
        loadDeptCombo();
    }

     private void courseLoadTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblcrs.getModel();

        dtm.setRowCount(0);

        for (Course c : cop.viewAll()) {
            Object[] row = new Object[3];
            row[0] = c.getId();
            row[1] = c.getName();
            row[2] = c.getDeptName();
            dtm.addRow(row);
        }
        tblcrs.setModel(dtm);

    }

    private void loadDeptCombo() {

        DepartmentTableOperations dop = new DepartmentTableOperations();
        Vector<Department> list = dop.viewAll();

        cmbdept.removeAllItems();

        for (Department d : list) {

            cmbdept.addItem(d);

        }

    }

    private void clear() {

        txtcname.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbdept = new javax.swing.JComboBox<>();
        txtcname = new javax.swing.JTextField();
        btnCinsert = new javax.swing.JButton();
        btnCupdate = new javax.swing.JButton();
        btnCdelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblcrs = new javax.swing.JTable();

        setBorder(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Courses");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Department:");

        cmbdept.setBorder(null);

        btnCinsert.setText("Insert");
        btnCinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinsertActionPerformed(evt);
            }
        });

        btnCupdate.setText("Update");
        btnCupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCupdateActionPerformed(evt);
            }
        });

        btnCdelete.setText("Delete");
        btnCdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCdeleteActionPerformed(evt);
            }
        });

        tblcrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcrsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblcrs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbdept, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(btnCinsert)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCupdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCdelete)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCinsert)
                    .addComponent(btnCupdate)
                    .addComponent(btnCdelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinsertActionPerformed

        String name = txtcname.getText();

        Department dept = (Department) cmbdept.getSelectedItem();

        CourseTableOperation cop = new CourseTableOperation();

        int r = cop.insert(name, dept.getId());
        clear();
        courseLoadTable();
    }//GEN-LAST:event_btnCinsertActionPerformed

    private void btnCupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCupdateActionPerformed

        int tr = tblcrs.getSelectedRow();
        int id = Integer.parseInt(tblcrs.getValueAt(tr, 0).toString());
        String name = (tblcrs.getValueAt(tr, 1).toString());

        Department dept = (Department) cmbdept.getSelectedItem();

        CourseTableOperation cop = new CourseTableOperation();

        int r = cop.update(id, name, dept.getId());
        clear();
        courseLoadTable();
    }//GEN-LAST:event_btnCupdateActionPerformed

    private void btnCdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCdeleteActionPerformed

        int tr = tblcrs.getSelectedRow();
        int id = Integer.parseInt(tblcrs.getValueAt(tr, 0).toString());
        cop.delete(id);

        clear();
        courseLoadTable();
    }//GEN-LAST:event_btnCdeleteActionPerformed

    private void tblcrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcrsMouseClicked
        int tr = tblcrs.getSelectedRow();

        int id = Integer.parseInt(tblcrs.getValueAt(tr, 0).toString());
        txtcname.setText (tblcrs.getValueAt(tr, 1).toString());

        String deptName = (tblcrs.getValueAt(tr, 2).toString());

        int loc = -1;

        for (int i = 0; i < cmbdept.getItemCount(); i++) {

            Department dept = (Department) cmbdept.getItemAt(i);

            if (dept.getName().equalsIgnoreCase(deptName)) {

                loc = i;
                //   System.out.println(loc);
            }
        }

        if (loc >= 0) {
            cmbdept.setSelectedIndex(loc);
        }
    }//GEN-LAST:event_tblcrsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCdelete;
    private javax.swing.JButton btnCinsert;
    private javax.swing.JButton btnCupdate;
    private javax.swing.JComboBox<Object> cmbdept;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblcrs;
    private javax.swing.JTextField txtcname;
    // End of variables declaration//GEN-END:variables
}
