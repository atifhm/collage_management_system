package CollageManagement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atif Hyder
 */
public class StudentFrame extends javax.swing.JInternalFrame {

    StudentTableOperations sto = new StudentTableOperations();

    public StudentFrame() {
        initComponents();
        //   this.loadDeptCombo();
        this.studentLoadTable();

    }

    private void clear() {

        txtsname.setText("");
        txtscontact.setText("");
    }

    private void studentLoadTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();

        dtm.setRowCount(0);

        for (Student s : sto.viewAll()) {
            Object[] row = new Object[3];
            row[0] = s.getId();
            row[1] = s.getName();
            row[2] = s.getContact();

            dtm.addRow(row);
        }

        tblStudent.setModel(dtm);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        btnSinsert = new javax.swing.JButton();
        btnSupdate = new javax.swing.JButton();
        btnSdelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtscontact = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        jLabel5.setText("jLabel5");

        setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Student");

        btnSinsert.setText("Insert");
        btnSinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinsertActionPerformed(evt);
            }
        });

        btnSupdate.setText("Update");
        btnSupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupdateActionPerformed(evt);
            }
        });

        btnSdelete.setText("Delete");
        btnSdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSdeleteActionPerformed(evt);
            }
        });

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudent);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Contact:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtscontact, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(0, 382, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnSinsert)
                .addGap(18, 18, 18)
                .addComponent(btnSupdate)
                .addGap(18, 18, 18)
                .addComponent(btnSdelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtscontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSinsert)
                    .addComponent(btnSupdate)
                    .addComponent(btnSdelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinsertActionPerformed

        String name = txtsname.getText();
        String contact = txtscontact.getText();

        StudentTableOperations top = new StudentTableOperations();

        int r = top.insert(name, contact);
        clear();
        studentLoadTable();


    }//GEN-LAST:event_btnSinsertActionPerformed

    private void btnSupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupdateActionPerformed

        int r1 = tblStudent.getSelectedRow();
        int id = Integer.parseInt(tblStudent.getValueAt(r1, 0).toString());

        String name = (tblStudent.getValueAt(r1, 1).toString());

        String contact = (tblStudent.getValueAt(r1, 2).toString());

        StudentTableOperations top = new StudentTableOperations();

        int r = top.update(id, name, contact);
        clear();
        studentLoadTable();

    }//GEN-LAST:event_btnSupdateActionPerformed

    private void btnSdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSdeleteActionPerformed

        try {
            int r1 = tblStudent.getSelectedRow();
            int id = Integer.parseInt(tblStudent.getValueAt(r1, 0).toString());
            String name = (tblStudent.getValueAt(r1, 1).toString());

            String contact = (tblStudent.getValueAt(r1, 2).toString());

            sto.delete(id);

            clear();
            studentLoadTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Insert Correct ID!");

        }
    }//GEN-LAST:event_btnSdeleteActionPerformed

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        int r = tblStudent.getSelectedRow();

        String sid = tblStudent.getValueAt(r, 0).toString();
        txtsname.setText(tblStudent.getValueAt(r, 1).toString());
        txtscontact.setText(tblStudent.getValueAt(r, 2).toString());


    }//GEN-LAST:event_tblStudentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSdelete;
    private javax.swing.JButton btnSinsert;
    private javax.swing.JButton btnSupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtscontact;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
