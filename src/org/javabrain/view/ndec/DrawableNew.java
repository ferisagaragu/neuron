package org.javabrain.view.ndec;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author Fernando García
 */
public class DrawableNew extends javax.swing.JDialog implements WindowListener {

    public DrawableNew(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/res/netIcon.png")).getImage());
        setLocationRelativeTo(null);
        hideError();
        setTitle("New drawable");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        extensionFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        specialCheck = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        importLbl = new javax.swing.JLabel();
        importClassFld = new javax.swing.JTextField();
        declarationLbl = new javax.swing.JLabel();
        classFld = new javax.swing.JTextField();
        keyLbl = new javax.swing.JLabel();
        declarationFld = new javax.swing.JTextField();
        messageLbl = new javax.swing.JLabel();
        breackLbl = new javax.swing.JLabel();
        hintImport = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        extensionFld.setText(org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.extensionFld.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.jLabel2.text")); // NOI18N

        specialCheck.setBackground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(specialCheck, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.specialCheck.text")); // NOI18N
        specialCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                specialCheckMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        org.openide.awt.Mnemonics.setLocalizedText(importLbl, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.importLbl.text")); // NOI18N
        importLbl.setEnabled(false);

        importClassFld.setText(org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.importClassFld.text")); // NOI18N
        importClassFld.setEnabled(false);
        importClassFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                importClassFldKeyReleased(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(declarationLbl, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.declarationLbl.text")); // NOI18N
        declarationLbl.setEnabled(false);

        classFld.setText(org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.classFld.text")); // NOI18N
        classFld.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(keyLbl, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.keyLbl.text")); // NOI18N
        keyLbl.setEnabled(false);

        declarationFld.setText(org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.declarationFld.text")); // NOI18N
        declarationFld.setEnabled(false);

        messageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/info.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(messageLbl, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.messageLbl.text")); // NOI18N
        messageLbl.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(breackLbl, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.breackLbl.text")); // NOI18N
        breackLbl.setEnabled(false);

        hintImport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "javafx.scene.image.Image", "javax.swing.ImageIcon" }));
        hintImport.setEnabled(false);
        hintImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(declarationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(classFld, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(keyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(declarationFld)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(breackLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(importLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hintImport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(importClassFld))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(importClassFld)
                        .addGap(4, 4, 4)
                        .addComponent(hintImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(importLbl))
                .addGap(18, 18, 18)
                .addComponent(declarationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(breackLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(keyLbl)
                        .addComponent(declarationFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(classFld))
                .addGap(18, 18, 18)
                .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/clancel.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(cancelBtn, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.cancelBtn.text")); // NOI18N
        cancelBtn.setContentAreaFilled(false);

        okBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ok.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(okBtn, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.okBtn.text")); // NOI18N
        okBtn.setContentAreaFilled(false);

        errorLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/err.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(errorLbl, org.openide.util.NbBundle.getMessage(DrawableNew.class, "DrawableNew.errorLbl.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorLbl)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(specialCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(extensionFld))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extensionFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(specialCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void specialCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specialCheckMouseClicked
        importClassFld.setEnabled(specialCheck.isSelected());
        declarationFld.setEnabled(specialCheck.isSelected());
        classFld.setEnabled(specialCheck.isSelected());
        declarationLbl.setEnabled(specialCheck.isSelected());
        messageLbl.setEnabled(specialCheck.isSelected());
        importLbl.setEnabled(specialCheck.isSelected());
        breackLbl.setEnabled(specialCheck.isSelected());
        keyLbl.setEnabled(specialCheck.isSelected());
        hintImport.setEnabled(specialCheck.isSelected());
    }//GEN-LAST:event_specialCheckMouseClicked

    private void hintImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintImportActionPerformed
        importClassFld.setText(hintImport.getSelectedItem().toString());
        if (hintImport.getSelectedItem().toString().equals("javafx.scene.image.Image")) {
            classFld.setText("Image");
            declarationFld.setText("new Image(\"${value}\")");
        } else if (hintImport.getSelectedItem().toString().equals("javax.swing.ImageIcon")) {
            classFld.setText("ImageIcon");
            declarationFld.setText("new ImageIcon(R.class.getResource(\"${value}\"))");
        }
    }//GEN-LAST:event_hintImportActionPerformed

    private void importClassFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importClassFldKeyReleased
        if (importClassFld.getText().contains(".")) {
            String hint[] = importClassFld.getText().replace(".", ",").split(",");
            classFld.setText(hint[hint.length - 1]);
        }
    }//GEN-LAST:event_importClassFldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel breackLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField classFld;
    private javax.swing.JTextField declarationFld;
    private javax.swing.JLabel declarationLbl;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JTextField extensionFld;
    private javax.swing.JComboBox<String> hintImport;
    private javax.swing.JTextField importClassFld;
    private javax.swing.JLabel importLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel keyLbl;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JButton okBtn;
    private javax.swing.JCheckBox specialCheck;
    // End of variables declaration//GEN-END:variables

    public void hideDrawable() {
        importClassFld.setText("");
        declarationFld.setText("");
        classFld.setText("");
        extensionFld.setText("");
        this.setVisible(false);
        hideError();
    }

    public JTextField getClassFld() {
        return classFld;
    }

    public void setClassFld(JTextField classFld) {
        this.classFld = classFld;
    }

    public JTextField getDeclarationFld() {
        return declarationFld;
    }

    public void setDeclarationFld(JTextField declarationFld) {
        this.declarationFld = declarationFld;
    }

    public JTextField getImportClassFld() {
        return importClassFld;
    }

    public void setImportClassFld(JTextField importClassFld) {
        this.importClassFld = importClassFld;
    }

    public JTextField getExtensionFld() {
        return extensionFld;
    }

    public void setExtensionFld(JTextField extensionFld) {
        this.extensionFld = extensionFld;
    }
    
    public void showError(){
        errorLbl.setIcon(new ImageIcon(getClass().getResource("/res/err.png")));
        errorLbl.setText("<html><b style=\"color:#B71C1C;\">Empty fields are not allowed</b></html>");
    } 
    
    public void hideError(){
        errorLbl.setIcon(null);
        errorLbl.setText("<html><b style=\"color:white;\">Empty fields are not allowed</b></html>");
    }

    public JButton getCancelBtn() {
        return cancelBtn;
    }

    public void setCancelBtn(JButton cancelBtn) {
        this.cancelBtn = cancelBtn;
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    public void setOkBtn(JButton okBtn) {
        this.okBtn = okBtn;
    }

    public JCheckBox getSpecialCheck() {
        return specialCheck;
    }

    public void setSpecialCheck(JCheckBox specialCheck) {
        this.specialCheck = specialCheck;
    }

    
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        hideDrawable();
    }

    @Override
    public void windowClosed(WindowEvent e) {
            
    }

    @Override
    public void windowIconified(WindowEvent e) {
            
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
