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
public class IntegerValuePage extends javax.swing.JPanel {
    
    /** Creates new form IntegerValuePage */
    public IntegerValuePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xNumberField1 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        xNumberField1.setFieldType(Integer.class);
        xNumberField1.setName("value");
        add(xNumberField1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XNumberField xNumberField1;
    // End of variables declaration//GEN-END:variables
    
}
