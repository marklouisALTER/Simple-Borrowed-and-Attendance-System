/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemshs;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Teacher
 */
public class mainstudent extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pst =null;
     ResultSet rs =null;
    /**
     * Creates new form mainstudent
     */
    public mainstudent() {
        initComponents();
        con=SYSTEMSHS.connect();
            loadTable();
      off();
    }
    
    public void off(){
    id.setEnabled(false);
    lrn.setEnabled(false);
    fn.setEnabled(false);
    ln.setEnabled(false);
    mi.setEnabled(false);
    g.setEnabled(false);
    combo.setEnabled(false);
    male.setEnabled(false);
    female.setEnabled(false);
    in.setEnabled(false);
    out.setEnabled(false);
    date.setEnabled(false);
    okay.setEnabled(false);
  
    clear.setEnabled(false);
}
    
    public void loadTable(){
        try {
            String sql = "select * from MAIN";
            pst = con.prepareStatement(sql);
            rs= pst.executeQuery();
          
                
        }catch (Exception e)
        {
            
        }
      }
        String gender="";
    
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        ln = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        in = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        out = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        lrn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        mi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        okay = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        g = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        clear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(null);
        jPanel2.add(ln);
        ln.setBounds(600, 60, 160, 30);

        jLabel15.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("First Name :");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(430, 20, 120, 30);

        jLabel17.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Last Name :");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(630, 20, 100, 30);
        jPanel2.add(in);
        in.setBounds(30, 240, 160, 30);

        jLabel18.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Time Out :");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(250, 200, 100, 30);
        jPanel2.add(fn);
        fn.setBounds(410, 60, 160, 30);

        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        jPanel2.add(out);
        out.setBounds(220, 240, 160, 30);

        jLabel19.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Time In :");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(60, 200, 100, 30);

        jLabel20.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Gender :");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(430, 200, 100, 30);

        female.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female);
        female.setBounds(490, 240, 70, 25);

        male.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male);
        male.setBounds(420, 240, 60, 25);
        jPanel2.add(lrn);
        lrn.setBounds(220, 60, 160, 30);

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LRN :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 20, 100, 30);

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Charles Babbage", "Steve Jobs" }));
        jPanel2.add(combo);
        combo.setBounds(410, 150, 160, 30);

        jLabel21.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Section :");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(450, 110, 100, 30);
        jPanel2.add(mi);
        mi.setBounds(30, 150, 160, 30);

        jLabel16.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Middle Name :");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(50, 110, 110, 30);

        okay.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        okay.setText("LOG");
        okay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayActionPerformed(evt);
            }
        });
        jPanel2.add(okay);
        okay.setBounds(270, 330, 150, 30);

        add.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(100, 330, 150, 30);

        jLabel23.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Grade :");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(240, 110, 110, 30);
        jPanel2.add(g);
        g.setBounds(220, 150, 160, 30);
        jPanel2.add(id);
        id.setBounds(30, 60, 160, 30);

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student ID :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 20, 100, 30);

        clear.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear);
        clear.setBounds(440, 330, 150, 30);

        jLabel22.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Date :");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(630, 110, 100, 30);
        jPanel2.add(date);
        date.setBounds(600, 150, 160, 30);

        clear1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        clear1.setText("MONITOR");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel2.add(clear1);
        clear1.setBounds(610, 330, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 800, 380);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPUTER LOG RECORD");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 80);

        setSize(new java.awt.Dimension(816, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender="Female";        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender="Male";
    }//GEN-LAST:event_maleActionPerformed

    private void okayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayActionPerformed
        try {

            String sql = "insert into MAIN(StudentID,LRN,FirstName,LastName,MiddleName,Grade,Section,Date,Gender,TimeIn,TimeOut)values(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, id.getText());
            pst.setString(2, lrn.getText());
            pst.setString(3, fn.getText());
            pst.setString(4, ln.getText());
            pst.setString(5, mi.getText());
            pst.setString(6, g.getText());
            pst.setString(7, combo.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
            String a= sdf.format(date.getDate());
            pst.setString(8,a);
            pst.setString(9, gender);
            pst.setString(10, in.getText());
            pst.setString(11, out.getText());

            pst.execute();

            loadTable();
            
            id.setText("");
            lrn.setText("");
            fn.setText("");
            ln.setText("");
            mi.setText("");
            g.setText("");
            combo.setSelectedItem(0);
           JDateChooser date = new JDateChooser();
        this.date.setCalendar(null);
            male.setSelected(false);
            female.setSelected(false);
            rs.close();
            pst.close();
            JOptionPane.showMessageDialog(null, "Success");
        }
        
        catch(Exception exe){
            JOptionPane.showMessageDialog(null, exe);
            loadTable();
        }                       // TODO add your handling code here:
    }//GEN-LAST:event_okayActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        id.setEnabled(true);
        lrn.setEnabled(true);
        fn.setEnabled(true);
        ln.setEnabled(true);
        mi.setEnabled(true);
        g.setEnabled(true);
        combo.setEnabled(true);
        male.setEnabled(true);
        female.setEnabled(true);
        in.setEnabled(true);
        out.setEnabled(true);
        date.setEnabled(true);
        add.setEnabled(false);
        clear.setEnabled(true);
        okay.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id.setText("");
        lrn.setText("");
        fn.setText("");
        ln.setText("");
        mi.setText("");
        g.setText("");
        in.setText("");
        out.setText("");
        combo.setSelectedIndex(0);
        JDateChooser date = new JDateChooser();
        this.date.setCalendar(null);
             buttonGroup1.clearSelection();
            

    }//GEN-LAST:event_clearActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        TEACHERLOGIN obj= new TEACHERLOGIN();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clear1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JComboBox<String> combo;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField g;
    private javax.swing.JTextField id;
    private javax.swing.JTextField in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField lrn;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mi;
    private javax.swing.JButton okay;
    private javax.swing.JTextField out;
    // End of variables declaration//GEN-END:variables
}
