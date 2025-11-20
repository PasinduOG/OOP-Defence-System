package defenceSystem.view;

import defenceSystem.model.DefenceObserver;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tank extends javax.swing.JFrame implements DefenceObserver {

    private MainController mainController;
    private int soldierCount;
    private int ammoCount;
    private int fuel;

    public Tank(MainController mainController) {
        initComponents();
        this.mainController = mainController;
        ammoCount = 300;
        soldierCount = 10;
        fuel = 100;
        soldierSpinner.setValue(soldierCount);
        ammoSpinner.setValue(ammoCount);
        fuelSpinner.setValue(fuel);
        new Thread(() -> engineRunning()).start();
    }

    @Override
    public void updateMessage(String message) {
        txtChatArea.append(message + "\n");
    }

    @Override
    public void clearArea(boolean clear) {
        if (clear) {
            lblAreaStatus.setText("Area Cleared");
            areaStatusPanel.setBackground(Color.decode("#339900"));
        } else {
            lblAreaStatus.setText("Area Not Cleared");
            areaStatusPanel.setBackground(Color.decode("#FF0000"));
        }
    }

    @Override
    public void enableButtons(int value) {
        if (positionCheckbox.isSelected()) {
            jSlider1.setValue(value);
            lblValue.setText(String.valueOf(value));
            if (value == 0) {
                btnShoot.setEnabled(false);
                btnMissileOps.setEnabled(false);
                btnRadarOps.setEnabled(false);
                btnRotateShoot.setEnabled(false);
            } else if (value > 0 && value <= 25) {
                btnShoot.setEnabled(true);
                btnMissileOps.setEnabled(false);
                btnRadarOps.setEnabled(false);
                btnRotateShoot.setEnabled(false);
            } else if (value > 25 && value <= 50) {
                btnShoot.setEnabled(true);
                btnMissileOps.setEnabled(true);
                btnRadarOps.setEnabled(false);
                btnRotateShoot.setEnabled(false);
            } else if (value > 50 && value <= 75) {
                btnShoot.setEnabled(true);
                btnMissileOps.setEnabled(true);
                btnRadarOps.setEnabled(true);
                btnRotateShoot.setEnabled(false);
            } else if (value > 75) {
                btnShoot.setEnabled(true);
                btnMissileOps.setEnabled(true);
                btnRadarOps.setEnabled(true);
                btnRotateShoot.setEnabled(true);
            }
        }
    }
    
    @Override
    public int getSoldierCount() {
        return soldierCount;
    }

    @Override
    public int getFuelCount() {
        return fuel;
    }

    @Override
    public int getAmmoCount() {
        return ammoCount;
    }

    private void engineRunning() {
        while (fuel > 0) {
            fuelSpinner.setValue(--fuel);
            if (fuel < 0) {
                mainController.setSubmarineMessage(getTitle() + ": Need to refill fuel");
                JOptionPane.showMessageDialog(this, "Refill this Tank", "Low Fuel", JOptionPane.WARNING_MESSAGE);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void sendPrivateMessage(String message) {
        txtChatArea.append(message + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShoot = new javax.swing.JButton();
        btnMissileOps = new javax.swing.JButton();
        btnRadarOps = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChatArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soldierSpinner = new javax.swing.JSpinner();
        ammoSpinner = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        txtMessage = new javax.swing.JTextField();
        btnSendMessage = new javax.swing.JButton();
        positionCheckbox = new javax.swing.JCheckBox();
        btnRotateShoot = new javax.swing.JButton();
        areaStatusPanel = new javax.swing.JPanel();
        lblAreaStatus = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fuelSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tank");
        setMinimumSize(new java.awt.Dimension(600, 430));
        setResizable(false);

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnMissileOps.setText("Missile Operation");
        btnMissileOps.setEnabled(false);
        btnMissileOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileOpsActionPerformed(evt);
            }
        });

        btnRadarOps.setText("Radar Operation");
        btnRadarOps.setEnabled(false);
        btnRadarOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadarOpsActionPerformed(evt);
            }
        });

        txtChatArea.setEditable(false);
        txtChatArea.setColumns(20);
        txtChatArea.setRows(5);
        jScrollPane1.setViewportView(txtChatArea);

        jLabel2.setText("Soldier Count");

        jLabel3.setText("Ammo Count");

        soldierSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldierSpinnerStateChanged(evt);
            }
        });

        ammoSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammoSpinnerStateChanged(evt);
            }
        });

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setEnabled(false);

        btnSendMessage.setText("Send");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });

        positionCheckbox.setText("Position");

        btnRotateShoot.setText("Rotate Shooting");
        btnRotateShoot.setEnabled(false);
        btnRotateShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateShootActionPerformed(evt);
            }
        });

        areaStatusPanel.setBackground(new java.awt.Color(255, 0, 0));

        lblAreaStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreaStatus.setText("Area Not Cleared");

        javax.swing.GroupLayout areaStatusPanelLayout = new javax.swing.GroupLayout(areaStatusPanel);
        areaStatusPanel.setLayout(areaStatusPanelLayout);
        areaStatusPanelLayout.setHorizontalGroup(
            areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAreaStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaStatusPanelLayout.setVerticalGroup(
            areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAreaStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValue.setText("0");

        jLabel4.setText("Fuel");

        fuelSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fuelSpinnerStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("TANK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRadarOps, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMissileOps, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnRotateShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(positionCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soldierSpinner)
                                    .addComponent(ammoSpinner)
                                    .addComponent(fuelSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShoot)
                                    .addComponent(btnMissileOps))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRadarOps)
                                    .addComponent(positionCheckbox)
                                    .addComponent(btnRotateShoot)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(soldierSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(ammoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(fuelSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSendMessage))))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void soldierSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_soldierSpinnerStateChanged
        soldierCount = (int) soldierSpinner.getValue();
    }//GEN-LAST:event_soldierSpinnerStateChanged

    private void ammoSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ammoSpinnerStateChanged
        ammoCount = (int) ammoSpinner.getValue();
    }//GEN-LAST:event_ammoSpinnerStateChanged

    private void fuelSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fuelSpinnerStateChanged
        fuel = (int) fuelSpinner.getValue();
    }//GEN-LAST:event_fuelSpinnerStateChanged

    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        String message = txtMessage.getText();
        mainController.setTankMessage(getTitle() + ": " + message);
        txtChatArea.append("Me :" + message + "\n");
        txtMessage.setText("");
    }//GEN-LAST:event_btnSendMessageActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        int ammo = (int) ammoSpinner.getValue();

        if (ammo <= 0) {
            JOptionPane.showMessageDialog(this, "Ammo over! Please refill");
            ammoSpinner.setValue(0);
            return;
        }
        ammoSpinner.setValue(ammo - 1);
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnMissileOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileOpsActionPerformed
        int ammo = (int) ammoSpinner.getValue();

        if (ammo < 5) {
            JOptionPane.showMessageDialog(this, "Not enough ammo for missile! Need atleast 5.");
            return;
        }
        ammoSpinner.setValue(ammo - 5);
    }//GEN-LAST:event_btnMissileOpsActionPerformed

    private void btnRadarOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadarOpsActionPerformed
        JOptionPane.showMessageDialog(this, "Radar is Online!");
    }//GEN-LAST:event_btnRadarOpsActionPerformed

    private void btnRotateShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateShootActionPerformed
        JOptionPane.showMessageDialog(this, "Tank rotated!");
    }//GEN-LAST:event_btnRotateShootActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammoSpinner;
    private javax.swing.JPanel areaStatusPanel;
    private javax.swing.JButton btnMissileOps;
    private javax.swing.JButton btnRadarOps;
    private javax.swing.JButton btnRotateShoot;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JButton btnShoot;
    private javax.swing.JSpinner fuelSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblAreaStatus;
    private javax.swing.JLabel lblValue;
    private javax.swing.JCheckBox positionCheckbox;
    private javax.swing.JSpinner soldierSpinner;
    private javax.swing.JTextArea txtChatArea;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
