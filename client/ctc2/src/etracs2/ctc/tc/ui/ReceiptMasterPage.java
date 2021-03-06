package etracs2.ctc.tc.ui;

import com.rameses.rcp.ui.annotations.StyleSheet;
import java.math.BigDecimal;

/**
 *
 * @author  jaycverg
 */
public class ReceiptMasterPage extends javax.swing.JPanel {
    
    /**
     * Creates new form IndividualPage
     */
    public ReceiptMasterPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel3 = new javax.swing.JPanel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(942, 563));
        jPanel3.setLayout(new java.awt.BorderLayout());

        xLabel9.setBackground(new java.awt.Color(1, 47, 8));
        xLabel9.setForeground(new java.awt.Color(255, 255, 255));
        xLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        xLabel9.setName("collectiontitle");
        xLabel9.setOpaque(true);
        jPanel3.add(xLabel9, java.awt.BorderLayout.SOUTH);

        xActionBar1.setName("formActions");
        jPanel3.add(xActionBar1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(230, 100));
        jPanel2.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("Amount Due:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(12, 14, 158, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Total Payment:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 92, 206, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Change:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 170, 158, 20);

        xNumberField1.setFieldType(BigDecimal.class);
        xNumberField1.setFocusable(false);
        xNumberField1.setFont(new java.awt.Font("Tahoma", 1, 24));
        xNumberField1.setIndex(100);
        xNumberField1.setName("entity.info.amount");
        xNumberField1.setOpaque(false);
        xNumberField1.setPattern("#,##0.00");
        xNumberField1.setReadonly(true);
        jPanel2.add(xNumberField1);
        xNumberField1.setBounds(12, 38, 206, 48);

        xNumberField2.setEditable(false);
        xNumberField2.setFieldType(BigDecimal.class);
        xNumberField2.setFocusable(false);
        xNumberField2.setFont(new java.awt.Font("Tahoma", 1, 24));
        xNumberField2.setIndex(100);
        xNumberField2.setName("entity.info.totalpayment");
        xNumberField2.setOpaque(false);
        xNumberField2.setPattern("#,##0.00");
        xNumberField2.setReadonly(true);
        jPanel2.add(xNumberField2);
        xNumberField2.setBounds(12, 116, 206, 48);

        xNumberField3.setEditable(false);
        xNumberField3.setFieldType(BigDecimal.class);
        xNumberField3.setFocusable(false);
        xNumberField3.setFont(new java.awt.Font("Tahoma", 1, 24));
        xNumberField3.setForeground(new java.awt.Color(204, 0, 0));
        xNumberField3.setIndex(100);
        xNumberField3.setName("entity.info.change");
        xNumberField3.setOpaque(false);
        xNumberField3.setPattern("#,##0.00");
        xNumberField3.setReadonly(true);
        jPanel2.add(xNumberField3);
        xNumberField3.setBounds(12, 196, 206, 48);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.EAST);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    // End of variables declaration//GEN-END:variables
    
}
