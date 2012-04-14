/*
 * BPBillingInitPage.java
 *
 * Created on July 22, 2011, 11:40 AM
 */

package etracs2.bp.billing;

/**
 *
 * @author  user
 */
public class BPBillingInitPage extends javax.swing.JPanel {
    
    /** Creates new form BPBillingInitPage */
    public BPBillingInitPage() {
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
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(573, 171));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Taxpayer Information");
        formPanel1.setBorder(xTitledBorder1);
        xLookupField2.setCaption("Name");
        xLookupField2.setExpression("#{taxpayername}");
        xLookupField2.setHandler("lookupTaxpayer");
        xLookupField2.setHint("Search Tax payer");
        xLookupField2.setName("bp");
        xLookupField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField2.setRequired(true);
        formPanel1.add(xLookupField2);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel1.setCaption("Tradename");
        xLabel1.setDepends(new String[] {"entity.info.taxpayername"});
        xLabel1.setExpression("#{entity.info.tradename}");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel2.setCaption("Address");
        xLabel2.setDepends(new String[] {"entity.info.taxpayername"});
        xLabel2.setExpression("#{entity.info.businessaddress}");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel1.add(xLabel2);

        jPanel1.add(formPanel1);
        formPanel1.setBounds(10, 10, 540, 140);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    // End of variables declaration//GEN-END:variables
    
}