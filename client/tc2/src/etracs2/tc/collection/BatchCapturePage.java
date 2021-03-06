/*
 * BatchCapturePage.java
 *
 * Created on October 22, 2011, 8:57 AM
 */

package etracs2.tc.collection;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  jzamora
 */
@StyleSheet("etracs2/tc/collection/BatchCapturePage.style")
public class BatchCapturePage extends javax.swing.JPanel {
    
    /** Creates new form BatchCapturePage */
    public BatchCapturePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel2 = new javax.swing.JPanel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 110));

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Collector");
        xLabel1.setCaptionWidth(110);
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("collector.name");
        xLabel1.setPreferredSize(new java.awt.Dimension(250, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("AF Control");
        xLabel2.setCaptionWidth(110);
        xLabel2.setExpression("AF #{afcontrol.afid}: #{afcontrol.currentseries} - #{afcontrol.endseries}");
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel2.setName("afcontrolinfo");
        xLabel2.setPreferredSize(new java.awt.Dimension(250, 19));
        formPanel1.add(xLabel2);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("Collection Type");
        xLabel3.setCaptionWidth(110);
        xLabel3.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel3.setName("collectiontype.name");
        xLabel3.setPreferredSize(new java.awt.Dimension(250, 19));
        formPanel1.add(xLabel3);

        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setName("formActions");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xActionBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .add(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(xActionBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add(jPanel1, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Collection Details");
        xDataTable1.setBorder(xTitledBorder1);
        xDataTable1.setFont(new java.awt.Font("Tahoma", 0, 14));
        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedItem");
        xDataTable1.setShowRowHeader(true);
        add(xDataTable1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        xLabel5.setForeground(new java.awt.Color(153, 51, 0));
        xLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        xLabel5.setName("errormsg");
        jPanel2.add(xLabel5, java.awt.BorderLayout.CENTER);

        formPanel2.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        formPanel2.setCaptionFont(new java.awt.Font("Arial", 1, 14));
        formPanel2.setPadding(new java.awt.Insets(3, 0, 3, 0));
        xNumberField1.setCaption("Total Collection");
        xNumberField1.setCaptionWidth(140);
        xNumberField1.setCellPadding(new java.awt.Insets(0, 0, 0, 5));
        xNumberField1.setDepends(new String[] {"selectedItem"});
        xNumberField1.setEnabled(false);
        xNumberField1.setFont(new java.awt.Font("Arial", 1, 14));
        xNumberField1.setName("total");
        xNumberField1.setPattern("#,##0.00");
        xNumberField1.setPreferredSize(new java.awt.Dimension(150, 24));
        formPanel2.add(xNumberField1);

        jPanel2.add(formPanel2, java.awt.BorderLayout.EAST);

        add(jPanel2, java.awt.BorderLayout.SOUTH);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    // End of variables declaration//GEN-END:variables
    
}
