/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PersonManager;

import Model.Person;
import Model.PersonDirectory;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruirui
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    PersonDirectory personDirectory;
    JPanel userProcessContainer;
    
    /**
     * Creates new form viewJPanle
     */
    public ManagePersonJPanel(JPanel container, PersonDirectory directory) {
        initComponents();
        
        userProcessContainer = container;
        personDirectory = directory;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setRequestFocusEnabled(false);
        setSize(new java.awt.Dimension(1200, 800));

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Sex", "Home Address", "Home Address", "Home City", "Home State", "Home Zip", "Home Phone", "Work Address", "Work Address", "Work City", "Work State", "Work Zip", "Work Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);
        if (tblPerson.getColumnModel().getColumnCount() > 0) {
            tblPerson.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblPerson.getColumnModel().getColumn(1).setPreferredWidth(70);
            tblPerson.getColumnModel().getColumn(2).setPreferredWidth(25);
            tblPerson.getColumnModel().getColumn(3).setPreferredWidth(25);
            tblPerson.getColumnModel().getColumn(4).setPreferredWidth(90);
            tblPerson.getColumnModel().getColumn(5).setPreferredWidth(90);
            tblPerson.getColumnModel().getColumn(6).setPreferredWidth(65);
            tblPerson.getColumnModel().getColumn(8).setPreferredWidth(65);
            tblPerson.getColumnModel().getColumn(10).setPreferredWidth(90);
            tblPerson.getColumnModel().getColumn(11).setPreferredWidth(90);
            tblPerson.getColumnModel().getColumn(12).setPreferredWidth(65);
            tblPerson.getColumnModel().getColumn(14).setPreferredWidth(65);
        }

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Person");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDetail.setText("View Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetail)
                .addContainerGap(454, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        
        if(selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Please Comfirm Deletion of the Selected Account.", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION) {
                Person selectedPerson = (Person) tblPerson.getValueAt(selectedRow, 0);
                personDirectory.deletePerson(selectedPerson);
                populateTable();
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Please Select an Account from the List to Delete.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        
        if(selectedRow >= 0) {
            Person selectedPerson = (Person) tblPerson.getValueAt(selectedRow, 0);
            
            ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, personDirectory, selectedPerson);
            userProcessContainer.add("ViewPersonJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select an Person from the List to View.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDetailActionPerformed

    private void displayPerson(){
//        txtFName.setText(person.getFirstName());
//        txtLName.setText(person.getLastName());
//        txtEmail.setText(person.getEmail());
//        txtPhone.setText(person.getPhone());
//        txtDLNum.setText(person.getdLicenseNum());
//        txtDLState.setText(person.getdLicenseState());
//        txtSSN.setText(person.getSocialSNum());
//        txtAge.setText(person.getAge());
//        txtSex.setText(person.getSex());
//        txtFax.setText(person.getFaxNum());
//        txtMStat.setText(person.getmStat());
//        txtLang.setText(person.getLanguage());
//        txtPWeb.setText(person.getPerWeb());
//        txtCOri.setText(person.getConOrigin());
//        
//        txtWAddressL1.setText(person.getwAddress1());
//        txtWAddressL2.setText(person.getwAddress2());
//        txtWCity.setText(person.getwCity());
//        txtWState.setText(person.getwState());
//        txtWZip.setText(person.getwZip());
//        txtWPhone.setText(person.getwPhone());
//        
//        txtHAddressL1.setText(person.gethAddress1());
//        txtHAddressL2.setText(person.gethAddress2());
//        txtHCity.setText(person.gethCity());
//        txtHState.setText(person.gethState());
//        txtHZip.setText(person.gethZip());
//        txtHPhone.setText(person.gethPhone());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        model.setRowCount(0);
        
        for(Person p : personDirectory.getPerson()) {
            
            Object[] row = new Object[16];
            row[0] = p.getFirstName();
            row[1] = p.getLastName();
            row[2] = p.getAge();
            row[3] = p.getSex();
            
            row[4] = p.gethAddress1();
            row[5] = p.gethAddress2();
            row[6] = p.gethCity();
            row[7] = p.gethState();
            row[8] = p.gethZip();
            row[9] = p.gethPhone();
            
            row[10] = p.getwAddress1();
            row[11] = p.getwAddress2();
            row[12] = p.getwCity();
            row[13] = p.getwState();
            row[14] = p.getwZip();
            row[15] = p.getwPhone();
            
            model.addRow(row);
        }
    }
    
}
