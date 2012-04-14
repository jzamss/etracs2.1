/*
 * IRAFAddItem.java
 *
 * Created on May 9, 2011, 1:47 PM
 */

package etracs2.tc.af;

import com.rameses.rcp.ui.annotations.StyleSheet;
import java.awt.FlowLayout;

/**
 *
 * @author  MS
 */
@StyleSheet("etracs2/tc/af/IRAFAddItemLGUPage.style")
public class IRAFAddItemLGUPage extends javax.swing.JPanel {
    
    /** Creates new form IRAFAddItem */
    public IRAFAddItemLGUPage() {
        initComponents();
        xNumberField1.setFieldType( Integer.class );
        xNumberField2.setFieldType( Integer.class );
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
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(298, 214));
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
                .addContainerGap(207, Short.MAX_VALUE)
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
        xComboBox1.setCaptionWidth(130);
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("afList");
        xComboBox1.setName("afId");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 19));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xNumberField3.setCaption("Remaining Qty");
        xNumberField3.setCaptionWidth(130);
        xNumberField3.setName("item.qtyremaining");
        xNumberField3.setPreferredSize(new java.awt.Dimension(0, 19));
        xNumberField3.setReadonly(true);
        formPanel1.add(xNumberField3);

        xNumberField1.setCaption("Recived Qty");
        xNumberField1.setCaptionWidth(130);
        xNumberField1.setName("item.qtyreceived");
        xNumberField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xNumberField1.setRequired(true);
        formPanel1.add(xNumberField1);

        xTextField1.setCaption("Prefix");
        xTextField1.setCaptionWidth(130);
        xTextField1.setName("item.prefix");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField1);

        xTextField2.setCaption("Suffix");
        xTextField2.setCaptionWidth(130);
        xTextField2.setName("item.suffix");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField2);

        xNumberField2.setCaption("Start Series");
        xNumberField2.setCaptionWidth(130);
        xNumberField2.setName("item.startseries");
        xNumberField2.setPreferredSize(new java.awt.Dimension(0, 19));
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
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    // End of variables declaration//GEN-END:variables
    
}
