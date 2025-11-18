package defenceSystem.view;

import defenceSystem.controller.Controller;
import javax.swing.JOptionPane;

public class MainController extends javax.swing.JFrame {

    private Controller controller;
    private Helicopter helicopter;
    private Tank tank;
    private Submarine submarine;

    public MainController(Controller controller) {
        initComponents();
        this.controller = controller;
        helicopter = new Helicopter(this);
        tank = new Tank(this);
        submarine = new Submarine(this);
    }

    public void setHelicoperMessage(String message) {
        helicopterTxtArea.append(message + "\n");
    }

    public void setTankMessage(String message) {
        tankTxtArea.append(message + "\n");
    }

    public void setSubmarineMessage(String message) {
        subMarineTxtArea.append(message + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defencesCombobox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        areaClearCheckbox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        helicopterTxtArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tankTxtArea = new javax.swing.JTextArea();
        privateCheckBox = new javax.swing.JCheckBox();
        btnSendMessage = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        subMarineTxtArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnDeploy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        controllerTxtArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        defencesCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));

        jButton1.setText("Collect Informations");

        areaClearCheckbox.setText("Area Clear");
        areaClearCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearCheckboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Soldier Count");

        jLabel2.setText("Fuel Amount");

        jLabel3.setText("Ammo Amount");

        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel4.setText("Position");

        helicopterTxtArea.setEditable(false);
        helicopterTxtArea.setColumns(20);
        helicopterTxtArea.setRows(5);
        jScrollPane2.setViewportView(helicopterTxtArea);

        tankTxtArea.setEditable(false);
        tankTxtArea.setColumns(20);
        tankTxtArea.setRows(5);
        jScrollPane3.setViewportView(tankTxtArea);

        privateCheckBox.setText("Send Private");

        btnSendMessage.setText("Send");
        btnSendMessage.setEnabled(false);
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });

        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMessageKeyReleased(evt);
            }
        });

        subMarineTxtArea.setEditable(false);
        subMarineTxtArea.setColumns(20);
        subMarineTxtArea.setRows(5);
        jScrollPane4.setViewportView(subMarineTxtArea);

        jLabel5.setText("From Helicopter");

        jLabel6.setText("From Tank");

        jLabel7.setText("From Submarine");

        btnDeploy.setText("Deploy");
        btnDeploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeployActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("0");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("0");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("0");

        controllerTxtArea.setEditable(false);
        controllerTxtArea.setColumns(20);
        controllerTxtArea.setRows(5);
        jScrollPane1.setViewportView(controllerTxtArea);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("MAIN CONTROLLER");

        lblValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defencesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeploy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(107, 107, 107)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(privateCheckBox)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSendMessage))
                                        .addComponent(txtMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(areaClearCheckbox, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(6, 6, 6)))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defencesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnDeploy))
                .addGap(9, 9, 9)
                .addComponent(areaClearCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(privateCheckBox)
                            .addComponent(btnSendMessage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeployActionPerformed
        switch (defencesCombobox.getSelectedIndex()) {
            case 1:
                controller.addDefence(helicopter);
                helicopter.setVisible(true);
                defencesCombobox.setSelectedIndex(0);
                break;
            case 2:
                controller.addDefence(tank);
                tank.setVisible(true);
                defencesCombobox.setSelectedIndex(0);
                break;
            case 3:
                controller.addDefence(submarine);
                submarine.setVisible(true);
                defencesCombobox.setSelectedIndex(0);
                break;
        }
    }//GEN-LAST:event_btnDeployActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        int value = jSlider1.getValue();
        lblValue.setText(String.valueOf(value));
        controller.enableButtons(value);
    }//GEN-LAST:event_jSlider1StateChanged

    private void areaClearCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearCheckboxActionPerformed
        controller.setAreaClearMessage(areaClearCheckbox.isSelected());
    }//GEN-LAST:event_areaClearCheckboxActionPerformed

    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        String message = txtMessage.getText();
        if (privateCheckBox.isSelected()) {
            switch (defencesCombobox.getSelectedIndex()) {
                case 0:
                    JOptionPane.showMessageDialog(this, "Select a defence first!");
                    break;
                case 1:
                    controllerTxtArea.append("Me: " + message + "\n");
                    helicopter.updateMessage(getTitle() + ": " + message);
                    txtMessage.setText("");
                    break;
                case 2:
                    controllerTxtArea.append("Me: " + message + "\n");
                    tank.updateMessage(getTitle() + ": " + message);
                    txtMessage.setText("");
                    break;
                case 3:
                    controllerTxtArea.append("Me: " + message + "\n");
                    submarine.updateMessage(getTitle() + ": " + message);
                    txtMessage.setText("");
                    break;
            }
        } else {
            controllerTxtArea.append("Me: " + message + "\n");
            controller.updateDefence(getTitle() + ": " + message);
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnSendMessageActionPerformed

    private void txtMessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyReleased
        String message = txtMessage.getText();
        if (message == null || message.equals("")) {
            btnSendMessage.setEnabled(false);
            return;
        }
        btnSendMessage.setEnabled(true);
    }//GEN-LAST:event_txtMessageKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox areaClearCheckbox;
    private javax.swing.JButton btnDeploy;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JTextArea controllerTxtArea;
    private javax.swing.JComboBox<String> defencesCombobox;
    private javax.swing.JTextArea helicopterTxtArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblValue;
    private javax.swing.JCheckBox privateCheckBox;
    private javax.swing.JTextArea subMarineTxtArea;
    private javax.swing.JTextArea tankTxtArea;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
