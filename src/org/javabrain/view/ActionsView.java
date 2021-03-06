package org.javabrain.view;

import org.javabrain.controller.NeuronControl;

/**
 *
 * @author Fernando García
 */
public class ActionsView extends javax.swing.JPanel {

    public ActionsView() {
        initComponents();
        NeuronControl nc = NeuronControl.newInstance();
        nc.setActionsView(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBnt = new javax.swing.JButton();
        restarBtn = new javax.swing.JButton();

        startBnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon_start.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(startBnt, org.openide.util.NbBundle.getMessage(ActionsView.class, "ActionsView.startBnt.text")); // NOI18N
        startBnt.setToolTipText(org.openide.util.NbBundle.getMessage(ActionsView.class, "ActionsView.startBnt.toolTipText")); // NOI18N

        restarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icon_restart.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(restarBtn, org.openide.util.NbBundle.getMessage(ActionsView.class, "ActionsView.restarBtn.text")); // NOI18N
        restarBtn.setToolTipText(org.openide.util.NbBundle.getMessage(ActionsView.class, "ActionsView.restarBtn.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(startBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(restarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton restarBtn;
    public javax.swing.JButton startBnt;
    // End of variables declaration//GEN-END:variables
}
