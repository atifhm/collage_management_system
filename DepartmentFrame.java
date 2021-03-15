package CollageManagement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DepartmentFrame extends javax.swing.JInternalFrame {

    DepartmentTableOperations dto = new DepartmentTableOperations();

    private void clear() {

        txtdeptname.setText("");
    }

    private void deptLoadTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblDept.getModel();

        dtm.setRowCount(0);

        for (Department d : dto.viewAll()) {
            Object[] row = new Object[2];
            row[0] = d.getId();
            row[1] = d.getName();

            dtm.addRow(row);
        }

        tblDept.setModel(dtm);

    }

    public DepartmentFrame() {
        initComponents();
        deptLoadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdeptname = new javax.swing.JTextField();
        btnDinsert = new javax.swing.JButton();
        btnDupdate = new javax.swing.JButton();
        btnDdelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDept = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setBorder(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setNormalBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        btnDinsert.setText("Insert");
        btnDinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinsertActionPerformed(evt);
            }
        });

        btnDupdate.setText("Update");
        btnDupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDupdateActionPerformed(evt);
            }
        });

        btnDdelete.setText("Delete");
        btnDdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDdeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Departments");

        tblDept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department ID", "Department Name"
            }
        ));
        tblDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeptMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDept);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(48, 48, 48)
                                .addComponent(txtdeptname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnDinsert)
                                .addGap(18, 18, 18)
                                .addComponent(btnDupdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDdelete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdeptname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDinsert)
                    .addComponent(btnDupdate)
                    .addComponent(btnDdelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinsertActionPerformed

        String name = txtdeptname.getText();

        DepartmentTableOperations dop = new DepartmentTableOperations();

        int r = dop.insert(name);

        clear();
        deptLoadTable();

    }//GEN-LAST:event_btnDinsertActionPerformed

    private void btnDupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDupdateActionPerformed

        int dr = tblDept.getSelectedRow();
        int id = Integer.parseInt(tblDept.getValueAt(dr, 0).toString());
        String name = (tblDept.getValueAt(dr, 1).toString());

        DepartmentTableOperations dto = new DepartmentTableOperations();

        int r = dto.update(id, name);
        clear();
        deptLoadTable();

    }//GEN-LAST:event_btnDupdateActionPerformed

    private void btnDdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDdeleteActionPerformed

        int dr = tblDept.getSelectedRow();
        int id = Integer.parseInt(tblDept.getValueAt(dr, 0).toString());
        String name = (tblDept.getValueAt(dr, 1).toString());
        DepartmentTableOperations dto = new DepartmentTableOperations();
        dto.delete(id);

        clear();
        deptLoadTable();

    }//GEN-LAST:event_btnDdeleteActionPerformed

    private void tblDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeptMouseClicked
        int r = tblDept.getSelectedRow();

        txtdeptname.setText(tblDept.getValueAt(r, 1).toString());

    }//GEN-LAST:event_tblDeptMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDdelete;
    private javax.swing.JButton btnDinsert;
    private javax.swing.JButton btnDupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDept;
    private javax.swing.JTextField txtdeptname;
    // End of variables declaration//GEN-END:variables
}
