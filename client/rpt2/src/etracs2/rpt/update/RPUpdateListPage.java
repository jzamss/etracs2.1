/*
 * RPUpdateListPage.java
 *
 * Created on June 1, 2012, 1:58 PM
 */

package etracs2.rpt.update;

/**
 *
 * @author  JAYROME VERGARA
 */
public class RPUpdateListPage extends javax.swing.JPanel {
    
    /** Creates new form RPUpdateListPage */
    public RPUpdateListPage() {
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
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();

        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setDepends(new String[] {"selectedItem"});
        xActionBar1.setName("formActions");
        xActionBar1.setPreferredSize(new java.awt.Dimension(61, 32));

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Real Property Update List");
        jPanel1.setBorder(xTitledBorder1);
        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedItem");

        xActionTextField1.setActionName("listHandler.load");
        xActionTextField1.setHint("Search PIN");
        xActionTextField1.setName("filter.searchText");
        xActionTextField1.setPreferredSize(new java.awt.Dimension(114, 22));

        xComboBox1.setImmediate(true);
        xComboBox1.setItems("stateList");
        xComboBox1.setName("state");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(xActionTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 334, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xActionTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xActionBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(xActionBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    // End of variables declaration//GEN-END:variables
    
}
