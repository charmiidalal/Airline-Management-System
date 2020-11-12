/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author Dinesh Kumar
 */
public class BookingDashboardJPanel extends javax.swing.JPanel {

    /* Create constructor for booking dashboard*/
    private final Flight bookedFlight;
    private final JPanel cardLayoutJPanel;
    private final String seatBooked;

    BookingDashboardJPanel(JPanel cardLayoutJPanel, Flight bookedFlight, String seatBooked) {
        initComponents();
        this.cardLayoutJPanel = cardLayoutJPanel;
        this.bookedFlight = bookedFlight;
        this.seatBooked = seatBooked;
        populateInputFields();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*Populate all the fields on selected row */
    private void populateInputFields() {
        airlinerTxt.setText(bookedFlight.getFlightOwner());
        destinationTxt.setText(bookedFlight.getFlightDestination());
        sourceTxt.setText(bookedFlight.getFlightSource());
        flightNumTxt.setText(bookedFlight.getFlightNumber());
        durationTxt.setText(Integer.toString(bookedFlight.getFlightDuration()));
        arrivalTimeTxt.setText(bookedFlight.getFlightArrTime());
        departureTimeTxt.setText(bookedFlight.getFlightDepTime());
        flightTimeTxt.setText(bookedFlight.getFlightTimePhase());
        String strDate = "";
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(bookedFlight.getFlightDate());
        } catch (Exception e) {
        }
        dateTxt.setText(strDate);
        seatTxt.setText(seatBooked);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookingDetailsLbl = new javax.swing.JLabel();
        airLineLbl = new javax.swing.JLabel();
        airlinerTxt = new javax.swing.JTextField();
        flightNumTxt = new javax.swing.JTextField();
        flightNumLbl = new javax.swing.JLabel();
        sourceLbl = new javax.swing.JLabel();
        destinationLbl = new javax.swing.JLabel();
        deptTimeLbl = new javax.swing.JLabel();
        ArrivalTimeLbl = new javax.swing.JLabel();
        durationLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        operatedTimeLbl = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        departureTimeTxt = new javax.swing.JTextField();
        arrivalTimeTxt = new javax.swing.JTextField();
        durationTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        flightTimeTxt = new javax.swing.JTextField();
        seatLbl = new javax.swing.JLabel();
        seatTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        bookingDetailsLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bookingDetailsLbl.setText("Booking Details");

        airLineLbl.setText("Airliner Name:");

        airlinerTxt.setBackground(new java.awt.Color(255, 204, 102));
        airlinerTxt.setEnabled(false);
        airlinerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerTxtActionPerformed(evt);
            }
        });

        flightNumTxt.setBackground(new java.awt.Color(255, 204, 102));
        flightNumTxt.setEnabled(false);
        flightNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTxtActionPerformed(evt);
            }
        });

        flightNumLbl.setText("Flight Number:");

        sourceLbl.setText("Source:");

        destinationLbl.setText("Destination:");

        deptTimeLbl.setText("Departure Time:");

        ArrivalTimeLbl.setText("Arrival Time:");

        durationLbl.setText("Duration:");

        dateLbl.setText("Flight Date:");

        operatedTimeLbl.setText("Flight Time of Day:");

        sourceTxt.setBackground(new java.awt.Color(255, 204, 102));
        sourceTxt.setEnabled(false);
        sourceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTxtActionPerformed(evt);
            }
        });

        destinationTxt.setBackground(new java.awt.Color(255, 204, 102));
        destinationTxt.setEnabled(false);

        departureTimeTxt.setBackground(new java.awt.Color(255, 204, 102));
        departureTimeTxt.setEnabled(false);

        arrivalTimeTxt.setBackground(new java.awt.Color(255, 204, 102));
        arrivalTimeTxt.setEnabled(false);

        durationTxt.setBackground(new java.awt.Color(255, 204, 102));
        durationTxt.setEnabled(false);
        durationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTxtActionPerformed(evt);
            }
        });

        dateTxt.setBackground(new java.awt.Color(255, 204, 102));
        dateTxt.setEnabled(false);

        flightTimeTxt.setBackground(new java.awt.Color(255, 204, 102));
        flightTimeTxt.setEnabled(false);
        flightTimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightTimeTxtActionPerformed(evt);
            }
        });

        seatLbl.setText("Seat No:");

        seatTxt.setBackground(new java.awt.Color(255, 204, 102));
        seatTxt.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airLineLbl)
                            .addComponent(flightNumLbl)
                            .addComponent(sourceLbl)
                            .addComponent(destinationLbl)
                            .addComponent(dateLbl))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(airlinerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(flightNumTxt)
                                .addComponent(sourceTxt)
                                .addComponent(destinationTxt)))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(durationLbl)
                                .addGap(116, 116, 116)
                                .addComponent(durationTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(operatedTimeLbl)
                                    .addComponent(seatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightTimeTxt)
                                    .addComponent(seatTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deptTimeLbl)
                                .addGap(74, 74, 74)
                                .addComponent(departureTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ArrivalTimeLbl)
                                .addGap(95, 95, 95)
                                .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(bookingDetailsLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(bookingDetailsLbl)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airLineLbl)
                    .addComponent(airlinerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptTimeLbl)
                    .addComponent(departureTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightNumLbl)
                    .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArrivalTimeLbl)
                    .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceLbl)
                    .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationLbl)
                    .addComponent(durationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationLbl)
                            .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatLbl)
                            .addComponent(seatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(operatedTimeLbl)
                        .addComponent(flightTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerTxtActionPerformed

    private void flightNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumTxtActionPerformed

    private void sourceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTxtActionPerformed

    private void durationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTxtActionPerformed

    private void flightTimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightTimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightTimeTxtActionPerformed
    /* Onclick on back button go to prev window */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();

        Component[] components = cardLayoutJPanel.getComponents();
        for (Component component : components) {
            if (component instanceof CustomerDashboardJPanel) {
                CustomerDashboardJPanel mpp = (CustomerDashboardJPanel) component;
                mpp.populateTable();
            }
        }

        layout.previous(cardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArrivalTimeLbl;
    private javax.swing.JLabel airLineLbl;
    private javax.swing.JTextField airlinerTxt;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bookingDetailsLbl;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField departureTimeTxt;
    private javax.swing.JLabel deptTimeLbl;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JTextField durationTxt;
    private javax.swing.JLabel flightNumLbl;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JTextField flightTimeTxt;
    private javax.swing.JLabel operatedTimeLbl;
    private javax.swing.JLabel seatLbl;
    private javax.swing.JTextField seatTxt;
    private javax.swing.JLabel sourceLbl;
    private javax.swing.JTextField sourceTxt;
    // End of variables declaration//GEN-END:variables
}
