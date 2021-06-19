/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacistRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.ReliefFundOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClaimFundsWorkRequest;
import Business.WorkQueue.MedicineCollectionWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tashu
 */
public class ClaimFundsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EnterpriseDirectory directory;
    private MedicineCollectionWorkRequest requestMed;

    /**
     * Creates new form ClaimFundsJPanel
     */
    public ClaimFundsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EnterpriseDirectory directory, MedicineCollectionWorkRequest request) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.directory = directory;
        this.requestMed = request;
//        valueLabel.setText(enterprise.getName());
        txtAmount.setText(request.getCost() + "");
        txtAmount.setEnabled(false);
    }

    public boolean validateFields() {
        String validationMsg = "";
        if (txtLicenseNumber.getText() == null || txtLicenseNumber.getText().isEmpty() || txtLicenseNumber.getText().trim().isEmpty()) {
            validationMsg += "License number can't be empty.\n";
        }
        if (txtCompanyName.getText() == null || txtCompanyName.getText().isEmpty() || txtCompanyName.getText().trim().isEmpty()) {
            validationMsg += "Company name can't be empty.\n";
        }
        if (txtCompanyAddr.getText() == null || txtCompanyAddr.getText().isEmpty() || txtCompanyAddr.getText().trim().isEmpty()) {
            validationMsg += "Company address can't be empty.\n";
        }
        if (txtClaimPurpose.getText() == null || txtClaimPurpose.getText().isEmpty() || txtClaimPurpose.getText().trim().isEmpty()) {
            validationMsg += "Purpose can't be empty.\n";
        }
        if (txtAmount.getText() == null || txtAmount.getText().isEmpty() || txtAmount.getText().trim().isEmpty()) {
            validationMsg += "Amount can't be empty.\n";
        } else {
            try {
                Double.parseDouble(txtAmount.getText());
                if (Double.parseDouble(txtAmount.getText()) <= 0) {
                    validationMsg += "Claim amount should be greater than 0.\n";
                    txtAmount.setText("");
                }
            } catch (NumberFormatException e) {
                validationMsg += "Please enter a valid amount.\n";
                txtAmount.setText("");
            }
        }

        if (!validationMsg.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please review the below error(s):\n" + validationMsg);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        btnClaim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtClaimPurpose = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkBoxAgree = new javax.swing.JCheckBox();
        txtCompanyAddr = new javax.swing.JTextField();
        txtCompanyName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Amount:");

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Claim purpose:");

        txtLicenseNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnClaim.setBackground(new java.awt.Color(0, 153, 255));
        btnClaim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClaim.setForeground(new java.awt.Color(255, 255, 255));
        btnClaim.setText("Claim");
        btnClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaimActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("License Number");

        txtClaimPurpose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Company address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Company name");

        chkBoxAgree.setBackground(new java.awt.Color(255, 255, 255));
        chkBoxAgree.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkBoxAgree.setText("I hereby declare that the information given above is correct and complete in all aspects");

        txtCompanyAddr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCompanyName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Claim Funds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(chkBoxAgree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCompanyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClaimPurpose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCompanyAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnClaim, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton)
                    .addComponent(jLabel7))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaimPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCompanyAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chkBoxAgree))
                .addGap(36, 36, 36)
                .addComponent(btnClaim)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacistWorkAreaJPanel dwjp = (PharmacistWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        dwjp.populateRequirementsTable();
        dwjp.populateMedsAmountTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaimActionPerformed
        if (!validateFields()) {
            return;
        }
        double amount = Double.parseDouble(txtAmount.getText());
        String claimPurpose = txtClaimPurpose.getText();
        String companyName = txtCompanyName.getText();
        String companyAddress = txtCompanyAddr.getText();
        String lisenceNumber = txtLicenseNumber.getText();
        boolean termsChecked = chkBoxAgree.isSelected();

        if (!termsChecked) {
            JOptionPane.showMessageDialog(null, "Please confirm if the information given is complete.");
            return;
        }

        ClaimFundsWorkRequest request = new ClaimFundsWorkRequest();
        request.setCost(amount);
        request.setClaimPurpose(claimPurpose);
        request.setCompanyName(companyName);
        request.setCompanyAddress(companyAddress);
        request.setRequestDate(new Date());
        request.setLisenceNumber(lisenceNumber);
        request.setTermsChecked(termsChecked ? "Yes" : "No");
        request.setSender(userAccount);
        request.setStatus("Claim req sent");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof ReliefFundOrganization) {
                org = organization;
                break;
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Your claim request has been recorded");
        requestMed.setIsClaimed(true);    
        txtAmount.setEnabled(false);
        txtClaimPurpose.setEnabled(false);
        txtCompanyAddr.setEnabled(false);
        txtCompanyName.setEnabled(false);
        txtLicenseNumber.setEnabled(false);
        chkBoxAgree.setEnabled(false);
        btnClaim.setEnabled(false);

    }//GEN-LAST:event_btnClaimActionPerformed

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnClaim;
    private javax.swing.JCheckBox chkBoxAgree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtClaimPurpose;
    private javax.swing.JTextField txtCompanyAddr;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}