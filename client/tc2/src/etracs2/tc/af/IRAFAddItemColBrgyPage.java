/*
 * IRAFAddItem.java
 *
 * Created on May 9, 2011, 1:47 PM
 */

package etracs2.tc.af;

import java.awt.FlowLayout;

/**
 *
 * @author  MS
 */
public class IRAFAddItemColBrgyPage extends javax.swing.JPanel {
    
    /** Creates new form IRAFAddItem */
    public IRAFAddItemColBrgyPage() {
        initComponents();
        xNumberField1.setFieldType( Integer.class );
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel2 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(306, 156));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.add(jSeparator1, java.awt.BorderLayout.NORTH);

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));
        xActionBar1.setName("formActions");
        xActionBar1.setUseToolBar(false);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .add(xActionBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xActionBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
        jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Add Item");
        formPanel1.setBorder(xTitledBorder1);
        xComboBox1.setCaption("AF No.");
        xComboBox1.setCaptionWidth(100);
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("afList");
        xComboBox1.setName("afId");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 21));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xNumberField1.setCaption("Remaining Qty");
        xNumberField1.setCaptionWidth(100);
        xNumberField1.setName("item.qtyremaining");
        xNumberField1.setPreferredSize(new java.awt.Dimension(0, 21));
        xNumberField1.setReadonly(true);
        xNumberField1.setRequired(true);
        formPanel1.add(xNumberField1);

        xNumberField2.setCaption("Received Qty");
        xNumberField2.setCaptionWidth(100);
        xNumberField2.setName("item.qtyreceived");
        xNumberField2.setPreferredSize(new java.awt.Dimension(0, 21));
        xNumberField2.setRequired(true);
        formPanel1.add(xNumberField2);

        jPanel2.add(formPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    // End of variables declaration//GEN-END:variables
    
}