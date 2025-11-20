package defenceSystem.view;

import defenceSystem.model.DefenceObserver;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Submarine extends javax.swing.JFrame implements DefenceObserver {

    private MainController mainController;
    private int soldierCount;
    private int ammoCount;
    private int fuel;
    private int energy;
    private int oxygen;

    public Submarine(MainController mainController) {
        initComponents();
        this.mainController = mainController;
        ammoCount = 300;
        soldierCount = 50;
        fuel = 100;
        energy = 100;
        oxygen = 100;
        soldierSpinner.setValue(soldierCount);
        ammoSpinner.setValue(ammoCount);
        fuelSpinner.setValue(fuel);
        energySlider.setValue(energy);
        oxygenSlider.setValue(oxygen);
        new Thread(() -> useResources()).start();
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
            if (value == 0) {
                btnShoot.setEnabled(false);
                btnSonarOps.setEnabled(false);
                btnTomahawk.setEnabled(false);
                btnTrident.setEnabled(false);
            } else if (value > 0 && value <= 25) {
                btnShoot.setEnabled(true);
                btnSonarOps.setEnabled(false);
                btnTomahawk.setEnabled(false);
                btnTrident.setEnabled(false);
            } else if (value > 25 && value <= 50) {
                btnShoot.setEnabled(true);
                btnSonarOps.setEnabled(true);
                btnTomahawk.setEnabled(false);
                btnTrident.setEnabled(false);
            } else if (value > 50 && value <= 75) {
                btnShoot.setEnabled(true);
                btnSonarOps.setEnabled(true);
                btnTomahawk.setEnabled(true);
                btnTrident.setEnabled(false);
            } else if (value > 75) {
                btnShoot.setEnabled(true);
                btnSonarOps.setEnabled(true);
                btnTomahawk.setEnabled(true);
                btnTrident.setEnabled(true);
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

    private void useResources() {
        while (energy > 0) {
            energySlider.setValue(--energy);
            oxygenSlider.setValue(--oxygen);
            if (energy == 0) {
                mainController.setSubmarineMessage(getTitle() + ": Need to refill resources");
                JOptionPane.showMessageDialog(this, "Limited Resources", "Danger", JOptionPane.WARNING_MESSAGE);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void engineRunning() {
        while (fuel > 0) {
            fuelSpinner.setValue(--fuel);
            if (fuel < 0) {
                mainController.setSubmarineMessage(getTitle() + ": Need to refill fuel");
                JOptionPane.showMessageDialog(this, "Refill this Submarine", "Low Fuel", JOptionPane.WARNING_MESSAGE);
            }
            try {
                Thread.sleep(2000);
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
        btnSonarOps = new javax.swing.JButton();
        btnTomahawk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChatArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soldierSpinner = new javax.swing.JSpinner();
        ammoSpinner = new javax.swing.JSpinner();
        oxygenSlider = new javax.swing.JSlider();
        txtMessage = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        positionCheckbox = new javax.swing.JCheckBox();
        btnTrident = new javax.swing.JButton();
        areaStatusPanel = new javax.swing.JPanel();
        lblAreaStatus = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fuelSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        energySlider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submarine");
        setMaximumSize(new java.awt.Dimension(620, 490));
        setMinimumSize(new java.awt.Dimension(620, 490));
        setPreferredSize(new java.awt.Dimension(620, 490));
        setResizable(false);

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnSonarOps.setText("Sonar Operation");
        btnSonarOps.setEnabled(false);
        btnSonarOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarOpsActionPerformed(evt);
            }
        });

        btnTomahawk.setText("Tomahawk Missile");
        btnTomahawk.setEnabled(false);
        btnTomahawk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkActionPerformed(evt);
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

        oxygenSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        oxygenSlider.setValue(0);
        oxygenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                oxygenSliderStateChanged(evt);
            }
        });

        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        positionCheckbox.setText("Position");

        btnTrident.setText("Trident-2 Missile");
        btnTrident.setEnabled(false);
        btnTrident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentActionPerformed(evt);
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
        lblValue.setText("Energy");

        jLabel4.setText("Fuel");

        fuelSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fuelSpinnerStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("SUBMARINE");

        energySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        energySlider.setValue(0);
        energySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                energySliderStateChanged(evt);
            }
        });

        jLabel5.setText("Oxygen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTomahawk, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSonarOps, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnTrident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(positionCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ammoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fuelSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soldierSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(energySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oxygenSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShoot)
                                    .addComponent(btnSonarOps))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(fuelSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTomahawk)
                            .addComponent(positionCheckbox)
                            .addComponent(btnTrident))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(energySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblValue)
                                    .addComponent(jLabel5))
                                .addGap(1, 1, 1)
                                .addComponent(oxygenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addGap(8, 8, 8)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String message = txtMessage.getText();
        mainController.setSubmarineMessage(getTitle() + ": " + message);
        txtChatArea.append("Me :" + message + "\n");
        txtMessage.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void energySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_energySliderStateChanged
        energy = energySlider.getValue();
        oxygenSlider.setValue(energy);
    }//GEN-LAST:event_energySliderStateChanged

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        int ammo = (int) ammoSpinner.getValue();

        if (ammo <= 0) {
            JOptionPane.showMessageDialog(this, "Ammo over! Please refill");
            ammoSpinner.setValue(0);
            return;
        }
        ammoSpinner.setValue(ammo - 1);
    }//GEN-LAST:event_btnShootActionPerformed

    private void oxygenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_oxygenSliderStateChanged
        oxygen = oxygenSlider.getValue();
        energySlider.setValue(oxygen);
    }//GEN-LAST:event_oxygenSliderStateChanged

    private void btnSonarOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarOpsActionPerformed
        JOptionPane.showMessageDialog(this, "Sonar is Online!");
    }//GEN-LAST:event_btnSonarOpsActionPerformed

    private void btnTomahawkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkActionPerformed
        int ammo = (int) ammoSpinner.getValue();

        if (ammo < 5) {
            JOptionPane.showMessageDialog(this, "Not enough ammo for tomahawk missile! Need atleast 5.");
            return;
        }
        ammoSpinner.setValue(ammo - 5);
    }//GEN-LAST:event_btnTomahawkActionPerformed

    private void btnTridentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentActionPerformed
        int ammo = (int) ammoSpinner.getValue();

        if (ammo < 10) {
            JOptionPane.showMessageDialog(this, "Not enough ammo for trident missile! Need atleast 10.");
            return;
        }
        ammoSpinner.setValue(ammo - 10);
    }//GEN-LAST:event_btnTridentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammoSpinner;
    private javax.swing.JPanel areaStatusPanel;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonarOps;
    private javax.swing.JButton btnTomahawk;
    private javax.swing.JButton btnTrident;
    private javax.swing.JSlider energySlider;
    private javax.swing.JSpinner fuelSpinner;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaStatus;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider oxygenSlider;
    private javax.swing.JCheckBox positionCheckbox;
    private javax.swing.JSpinner soldierSpinner;
    private javax.swing.JTextArea txtChatArea;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
