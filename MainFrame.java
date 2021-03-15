package CollageManagement;

import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

/**
 *
 * @author Atif Hyder
 */
public class MainFrame extends javax.swing.JFrame {

    StudentFrame s = null;

    CourseFrame1 c = null;

    DepartmentFrame d = null;

    EnrollmentFrame e = null;

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpage = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btndepartment = new javax.swing.JButton();
        btnstudent = new javax.swing.JButton();
        btncourses = new javax.swing.JButton();
        btnenrollments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout mainpageLayout = new javax.swing.GroupLayout(mainpage);
        mainpage.setLayout(mainpageLayout);
        mainpageLayout.setHorizontalGroup(
            mainpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        mainpageLayout.setVerticalGroup(
            mainpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CollageManagement/1492531735-icon-sets-school-outline-hand-drawn-iconfinder01_83191.png"))); // NOI18N

        btndepartment.setBackground(new java.awt.Color(51, 102, 255));
        btndepartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndepartment.setForeground(new java.awt.Color(255, 255, 255));
        btndepartment.setText("Departments");
        btndepartment.setBorder(null);
        btndepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepartmentActionPerformed(evt);
            }
        });

        btnstudent.setBackground(new java.awt.Color(102, 102, 102));
        btnstudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnstudent.setForeground(new java.awt.Color(255, 255, 255));
        btnstudent.setText("Students");
        btnstudent.setBorder(null);
        btnstudent.setFocusPainted(false);
        btnstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudentActionPerformed(evt);
            }
        });

        btncourses.setBackground(new java.awt.Color(255, 255, 102));
        btncourses.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncourses.setText("Courses");
        btncourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoursesActionPerformed(evt);
            }
        });

        btnenrollments.setBackground(new java.awt.Color(102, 255, 204));
        btnenrollments.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnenrollments.setText("Enrollments");
        btnenrollments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrollmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btncourses, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnenrollments, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncourses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnenrollments)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpage)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1102, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepartmentActionPerformed

        if (s != null) {
            s.dispose();
            s = null;
        }

        if (e != null) {
            e.dispose();
            e = null;
        }

        if (c != null) {
            c.dispose();
            c = null;
        }

        if (d == null) {
            d = new DepartmentFrame();
            mainpage.add(d);
            try {
                d.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println(ex.getMessage());
            }
            d.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Frame is already opned");
        }
    }//GEN-LAST:event_btndepartmentActionPerformed

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
        if (d != null) {
            d.dispose();
            d = null;
        }

        if (e != null) {
            e.dispose();
            e = null;
        }

        if (c != null) {
            c.dispose();
            c = null;
        }

        if (s == null) {
            s = new StudentFrame();
            mainpage.add(s);
            try {
                s.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println(ex.getMessage());
            }
            s.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Frame is already opned");
        }
    }//GEN-LAST:event_btnstudentActionPerformed

    private void btncoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoursesActionPerformed

        if (s != null) {
            s.dispose();
            s = null;
        }

        if (e != null) {
            e.dispose();
            e = null;
        }

        if (d != null) {
            d.dispose();
            d = null;
        }

        if (c == null) {
            c = new CourseFrame1();
            mainpage.add(c);
            try {
                c.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println(ex.getMessage());
            }
            c.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Frame is already opned");
        }
    }//GEN-LAST:event_btncoursesActionPerformed

    private void btnenrollmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenrollmentsActionPerformed
        if (s != null) {
            s.dispose();
            s = null;
        }

        if (d != null) {
            d.dispose();
            d = null;
        }

        if (c != null) {
            c.dispose();
            c = null;
        }

        if (e == null) {
            e = new EnrollmentFrame();
            mainpage.add(e);
            try {
                e.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println(ex.getMessage());
            }
            e.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Frame is already opned");
        }
    }//GEN-LAST:event_btnenrollmentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncourses;
    private javax.swing.JButton btndepartment;
    private javax.swing.JButton btnenrollments;
    private javax.swing.JButton btnstudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDesktopPane mainpage;
    // End of variables declaration//GEN-END:variables
}
