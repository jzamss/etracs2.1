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
@StyleSheet("etracs2/bp/application/PermitPage.style")
public class PermitPage extends javax.swing.JPanel {
    
    /** Creates new form ApplicationInitialPage */
    public PermitPage() {
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        jPanel3 = new javax.swing.JPanel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(815, 531));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Permit Information");
        jPanel2.setBorder(xTitledBorder1);

        xTextField1.setCaption("Plate No.");
        xTextField1.setCaptionWidth(75);
        xTextField1.setName("permit.plateno");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xTextField1);

        jPanel2.add(formPanel2);
        formPanel2.setBounds(0, 20, 240, 50);

        xLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel4.setExpression("<html>Permit No.: <font color='blue''>#{permit.txnno}</font></html>");
        xLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel2.add(xLabel4);
        xLabel4.setBounds(170, 0, 420, 20);

        xDateField1.setCaption("Date");
        xDateField1.setCaptionWidth(100);
        xDateField1.setName("permit.txndate");
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel4.add(xDateField1);

        jPanel2.add(formPanel4);
        formPanel4.setBounds(350, 20, 240, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 0, 600, 70);

        jPanel3.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Business Information");
        jPanel3.setBorder(xTitledBorder2);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel8.setBorder(xLineBorder1);
        xLabel8.setCaption("Permittee");
        xLabel8.setExpression("#{permit.taxpayername}");
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xLabel8);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel9.setBorder(xLineBorder2);
        xLabel9.setCaption("Address");
        xLabel9.setExpression("#{permit.taxpayeraddress}");
        xLabel9.setName("application.info.taxpayeraddress");
        xLabel9.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xLabel9);

        jPanel3.add(formPanel3);
        formPanel3.setBounds(0, 20, 590, 50);

        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel1.setBorder(xLineBorder3);
        xLabel1.setCaption("Trade Name");
        xLabel1.setExpression("#{permit.tradename}");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel1.add(xLabel1);

        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel2.setBorder(xLineBorder4);
        xLabel2.setCaption("Address");
        xLabel2.setExpression("#{permit.businessaddress}");
        xLabel2.setName("application.info.taxpayeraddress");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel1.add(xLabel2);

        jPanel3.add(formPanel1);
        formPanel1.setBounds(0, 70, 590, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 70, 600, 140);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Line Of Business");
        xDataTable1.setBorder(xTitledBorder3);
        xDataTable1.setHandler("lobHandler");
        xDataTable1.setShowRowHeader(true);
        jPanel1.add(xDataTable1);
        xDataTable1.setBounds(10, 210, 600, 190);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}