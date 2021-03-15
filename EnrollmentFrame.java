package CollageManagement;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atif Hyder
 */
public class EnrollmentFrame extends javax.swing.JInternalFrame {

    EnrollmentTableOperations eto = new EnrollmentTableOperations();

    public EnrollmentFrame() {
        initComponents();
        loadDeptCombo();
        loadStudentCombo();
        enrollmentLoadTable();
    }

    private void loadDeptCombo() {

        DepartmentTableOperations dop = new DepartmentTableOperations();
        Vector<Department> list = dop.viewAll();

        cmbdept.removeAllItems();

        for (Department d : list) {

            cmbdept.addItem(d);

        }

    }

    private void loadCourseCombo(String dname) {

        CourseTableOperation cop = new CourseTableOperation();
        Vector<Course> list = cop.viewAll();

        cmbcrs.removeAllItems();

        for (Course c : list) {

            if (c.getDeptName().endsWith(dname)) {
                cmbcrs.addItem(c);
            }

        }

    }

    private void loadStudentCombo() {

        StudentTableOperations sop = new StudentTableOperations();

        Vector<Student> list = sop.viewAll();

        cmbstds.removeAllItems();

        for (Student s : list) {

            cmbstds.addItem(s);

        }

    }

    private void enrollmentLoadTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblenroll.getModel();

        dtm.setRowCount(0);

        for (Enrollment e : eto.viewAll()) {
            Object[] row = new Object[5];
            row[0] = e.getId();
            row[1] = e.getDate();
            row[2] = e.getDeptName();
            row[3] = e.getCrsName();
            row[4] = e.getStdnName();
            dtm.addRow(row);
        }

        tblenroll.setModel(dtm);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbstds = new javax.swing.JComboBox<>();
        cmbcrs = new javax.swing.JComboBox<>();
        cmbdept = new javax.swing.JComboBox<>();
        btnEinsert = new javax.swing.JButton();
        btnEupdate = new javax.swing.JButton();
        btnEdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblenroll = new javax.swing.JTable();

        setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Enrollments");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Department:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Courses:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Students:");

        cmbdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdeptActionPerformed(evt);
            }
        });

        btnEinsert.setText("Insert");
        btnEinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEinsertActionPerformed(evt);
            }
        });

        btnEupdate.setText("Update");
        btnEupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEupdateActionPerformed(evt);
            }
        });

        btnEdelete.setText("Delete");
        btnEdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdeleteActionPerformed(evt);
            }
        });

        tblenroll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Department", "Course", "Student"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblenroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblenrollMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblenroll);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbcrs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbstds, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbdept, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addComponent(btnEinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbcrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbstds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdelete)
                    .addComponent(btnEupdate)
                    .addComponent(btnEinsert))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdeptActionPerformed

        Department dept = (Department) cmbdept.getSelectedItem();
        int did = dept.getId();

        loadCourseCombo(dept.getName());
    }//GEN-LAST:event_cmbdeptActionPerformed

    private void btnEinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEinsertActionPerformed

        String date = eto.datime();

        Department dept = (Department) cmbdept.getSelectedItem();
        Course crs = (Course) cmbcrs.getSelectedItem();
        Student stdn = (Student) cmbstds.getSelectedItem();

        int r = eto.insert(date, dept.getId(), crs.getId(), stdn.getId());

        enrollmentLoadTable();

    }//GEN-LAST:event_btnEinsertActionPerformed

    private void btnEupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEupdateActionPerformed
        int er = tblenroll.getSelectedRow();
        int id = Integer.parseInt(tblenroll.getValueAt(er, 0).toString());
        String date = eto.datime();

        Department dept = (Department) cmbdept.getSelectedItem();
        Course crs = (Course) cmbcrs.getSelectedItem();
        Student stdn = (Student) cmbstds.getSelectedItem();

        int r = eto.update(id, date, dept.getId(), crs.getId(), stdn.getId());

        enrollmentLoadTable();

    }//GEN-LAST:event_btnEupdateActionPerformed

    private void btnEdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdeleteActionPerformed

        int er = tblenroll.getSelectedRow();
        int id = Integer.parseInt(tblenroll.getValueAt(er, 0).toString());
        eto.delete(id);
        enrollmentLoadTable();

    }//GEN-LAST:event_btnEdeleteActionPerformed

    private void tblenrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblenrollMouseClicked
        int er = tblenroll.getSelectedRow();

        int id = Integer.parseInt(tblenroll.getValueAt(er, 0).toString());
        String date = tblenroll.getValueAt(er, 1).toString();
        String deptName = tblenroll.getValueAt(er, 2).toString();
        String crsName = tblenroll.getValueAt(er, 3).toString();
        String stdnName = tblenroll.getValueAt(er, 4).toString();

        // System.out.println(deptName);
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

        // System.out.println(deptName);
        int loc1 = -1;

        for (int i = 0; i < cmbcrs.getItemCount(); i++) {

            Course crs = (Course) cmbcrs.getItemAt(i);

            if (crs.getName().equalsIgnoreCase(crsName)) {

                loc1 = i;
                //   System.out.println(loc);
            }
        }

        if (loc1 >= 0) {
            cmbcrs.setSelectedIndex(loc1);

        }

        // System.out.println(deptName);
        int loc2 = -1;

        for (int i = 0; i < cmbstds.getItemCount(); i++) {

            Student stdn = (Student) cmbstds.getItemAt(i);

            if (stdn.getName().equalsIgnoreCase(stdnName)) {

                loc2 = i;
                //   System.out.println(loc);
            }
        }

        if (loc >= 0) {
            cmbstds.setSelectedIndex(loc2);

        }

    }//GEN-LAST:event_tblenrollMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdelete;
    private javax.swing.JButton btnEinsert;
    private javax.swing.JButton btnEupdate;
    private javax.swing.JComboBox<Object> cmbcrs;
    private javax.swing.JComboBox<Object> cmbdept;
    private javax.swing.JComboBox<Object> cmbstds;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblenroll;
    // End of variables declaration//GEN-END:variables
}
