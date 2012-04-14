/*
 * ApplicationInitialPage.java
 *
 * Created on June 6, 2011, 1:20 PM
 */

package etracs2.bp.application;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  MS
 */
@StyleSheet("etracs2/bp/application/ApplicationInitialPage.style")
public class ApplicationInitialPageA extends javax.swing.JPanel {
    
    /** Creates new form ApplicationInitialPage */
    public ApplicationInitialPageA() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(546, 229));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(null);

        jPanel1.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xTitledBorder1.setTitle(" Business Application");
        jPanel1.setBorder(xTitledBorder1);

        xLookupField2.setCaption("Permitee");
        xLookupField2.setExpression("#{entityname}");
        xLookupField2.setHandler("lookupTaxpayer");
        xLookupField2.setHint("Search Tax payer");
        xLookupField2.setName("taxpayer");
        xLookupField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField2.setRequired(true);
        formPanel1.add(xLookupField2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel1.setBorder(xLineBorder1);
        xLabel1.setCaption("Address");
        xLabel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xLabel1.setDepends(new String[] {"taxpayerSearch"});
        xLabel1.setExpression("#{application.info.taxpayeraddress}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 0, 11));
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        jPanel1.add(formPanel1);
        formPanel1.setBounds(0, 20, 490, 70);

        xComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "application.txntype" }));
        xComboBox1.setCaption("Type");
        xComboBox1.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xComboBox1.setDepends(new String[] {"taxpayerSearch"});
        xComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xComboBox1.setItems("typeList");
        xComboBox1.setName("application.txntype");
        xComboBox1.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox1.setRequired(true);
        formPanel2.add(xComboBox1);

        xComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "application.txnmode" }));
        xComboBox2.setCaption("Mode");
        xComboBox2.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xComboBox2.setDepends(new String[] {"taxpayerSearch"});
        xComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11));
        xComboBox2.setItems("modeList");
        xComboBox2.setName("application.txnmode");
        xComboBox2.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox2.setRequired(true);
        formPanel2.add(xComboBox2);

        jPanel1.add(formPanel2);
        formPanel2.setBounds(0, 90, 490, 60);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(10, 0, 500, 150);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    // End of variables declaration//GEN-END:variables
    
}
