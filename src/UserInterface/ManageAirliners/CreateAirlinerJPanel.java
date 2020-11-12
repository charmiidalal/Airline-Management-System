/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import UserInterface.AirlineAgencyMain;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anusha
 */
public class CreateAirlinerJPanel extends javax.swing.JPanel {
    /* Creates constructor and assignes object */
    private final JPanel cardLayoutJPanel;
    private final AirlinerDirectory airlinerDir;

    CreateAirlinerJPanel(JPanel cardSequenceJPanel, AirlinerDirectory airlinerDir) {
        initComponents();
        this.airlinerDir = airlinerDir;
        this.cardLayoutJPanel = cardSequenceJPanel;

    }
    
    /* This function clears all fields after airliner is created */
    public void clearAllFields() {
        nameTxt.setText("");
        codeTxt.setText("");
        fromCountryTxt.setText("");
        noOfFlightsTxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinerNameLbl = new javax.swing.JLabel();
        airlinerCodeLbl = new javax.swing.JLabel();
        countriesOperatedLbll = new javax.swing.JLabel();
        originCountryLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        codeTxt = new javax.swing.JTextField();
        fromCountryTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        fleetLbl = new javax.swing.JLabel();
        noOfFlightsTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createAirlinerLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        airlinerNameLbl.setText("Airliner Name:");

        airlinerCodeLbl.setText("Airliner No:");

        originCountryLbl.setText("From Country:");

        nameTxt.setBackground(new java.awt.Color(255, 204, 102));

        codeTxt.setBackground(new java.awt.Color(255, 204, 102));

        fromCountryTxt.setBackground(new java.awt.Color(255, 204, 102));

        createBtn.setBackground(new java.awt.Color(255, 204, 102));
        createBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createBtn.setText("Create");
        createBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        fleetLbl.setText("Fleet  Count:");

        noOfFlightsTxt.setBackground(new java.awt.Color(255, 204, 102));

        backBtn.setBackground(new java.awt.Color(255, 204, 102));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createAirlinerLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createAirlinerLbl.setText("Create Airliner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countriesOperatedLbll)
                        .addGap(629, 728, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(originCountryLbl)
                                .addGap(104, 104, 104)
                                .addComponent(fromCountryTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airlinerNameLbl)
                                    .addComponent(airlinerCodeLbl)
                                    .addComponent(fleetLbl))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noOfFlightsTxt)
                                    .addComponent(nameTxt)
                                    .addComponent(codeTxt))))
                        .addGap(198, 198, 198))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(createAirlinerLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(createAirlinerLbl)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerNameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlinerCodeLbl)
                    .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fleetLbl)
                    .addComponent(noOfFlightsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countriesOperatedLbll)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originCountryLbl)
                    .addComponent(fromCountryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    AirlineAgencyMain airlineAgencyMain = new AirlineAgencyMain();
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        /* On create airliner check if exbox values are not empty */
        if (nameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Airliner Name");
            return;
        }

        if (codeTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Airline No: ");
            return;
        }
        if (fromCountryTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter From Country");
            return;
        }

        try {
            Integer.parseInt(noOfFlightsTxt.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please Enter Number of Fleet");
            return;
        }
        Airliner newAirliner = new Airliner();
        newAirliner.setAirlineName(nameTxt.getText());
        newAirliner.setAirlineCount((int) Double.parseDouble(noOfFlightsTxt.getText()));
        newAirliner.setFromCountry(fromCountryTxt.getText());
        newAirliner.setAirlineCode(codeTxt.getText());
        airlinerDir.addAirliner(newAirliner);
        JOptionPane.showMessageDialog(null, "Airliner Created Successfully");
        airlineAgencyMain.showAirlinerComboBox();
        clearAllFields();
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        /* Go to airliner manager on click */
        cardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();

        Component[] components = cardLayoutJPanel.getComponents();
        for (Component component : components) {
            if (component instanceof AirlinerCatalogue) {
                AirlinerCatalogue mpp = (AirlinerCatalogue) component;
                mpp.populateTable();
            }
        }
        layout.previous(cardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlinerCodeLbl;
    private javax.swing.JLabel airlinerNameLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField codeTxt;
    private javax.swing.JLabel countriesOperatedLbll;
    private javax.swing.JLabel createAirlinerLbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel fleetLbl;
    private javax.swing.JTextField fromCountryTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField noOfFlightsTxt;
    private javax.swing.JLabel originCountryLbl;
    // End of variables declaration//GEN-END:variables
}