/*
 * IntegerValuePage.java
 *
 * Created on June 20, 2011, 1:47 PM
 */

package etracs2.common.rule;

/**
 *
 * @author  jzamora
 */
public class VariableValuePage extends javax.swing.JPanel {
    
    /** Creates new form IntegerValuePage */
    public VariableValuePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xButton1 = new com.rameses.rcp.control.XButton();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();

        setLayout(new java.awt.BorderLayout());

        xButton1.setText("...");
        xButton1.setMargin(new java.awt.Insets(3, 5, 3, 5));
        xButton1.setName("lookup");
        add(xButton1, java.awt.BorderLayout.EAST);

        xComboBox1.setItems("varlist");
        xComboBox1.setName("value");
        add(xComboBox1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    // End of variables declaration//GEN-END:variables
    
}
