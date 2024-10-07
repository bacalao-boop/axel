import java.util.ArrayList;
public class Logros extends javax.swing.JFrame {

    public String usuario="";
    public String direc_logros="";
    public Logros() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void setDireccion(String direc){
        this.direc_logros=direc;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_logros = new javax.swing.JLabel();
        lbl_diseno = new javax.swing.JLabel();
        BT_Atras = new javax.swing.JButton();
        lbl_lista_logros_true = new javax.swing.JLabel();
        lbl_lista_logros_false = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_logros.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logros.setText("Logros");
        jPanel1.add(lbl_logros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 6, -1, -1));

        lbl_diseno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_diseno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_diseno.setText("NOMBRE | DESCRIPCION");
        jPanel1.add(lbl_diseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 42, -1, -1));

        BT_Atras.setText("Atras");
        BT_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(BT_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 260, -1, -1));

        lbl_lista_logros_true.setText(" ");
        jPanel1.add(lbl_lista_logros_true, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 63, -1, -1));

        lbl_lista_logros_false.setForeground(new java.awt.Color(204, 51, 0));
        lbl_lista_logros_false.setText(" ");
        jPanel1.add(lbl_lista_logros_false, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/fondo.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 460, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtrasActionPerformed
        Menu newframe= new Menu();
        newframe.setDirec_Historial("C:\\Users\\Cesia\\Desktop\\archivo\\"+usuario+"\\historial.txt");
        newframe.setDirec_Logros(direc_logros);
        newframe.setUsuario(usuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_AtrasActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_diseno;
    private static javax.swing.JLabel lbl_lista_logros_false;
    private static javax.swing.JLabel lbl_lista_logros_true;
    private javax.swing.JLabel lbl_logros;
    // End of variables declaration//GEN-END:variables
    
    public void mostrar_logros(ArrayList<Logro> lista){
        String logro_false="";
        String logro_true="";
            for(Logro aux: lista){
                if(aux.getEstado()){
                    if(logro_true.equals("")){
                        logro_true=aux.getNombre()+" | "+aux.getDescripcion();
                    }else{
                        logro_true=logro_true+"<p>"+aux.getNombre()+" | "+aux.getDescripcion();
                    }
                }else{
                    if(logro_false.equals("")){
                        logro_false=aux.getNombre()+" | "+aux.getDescripcion();
                    }else{
                        logro_false=logro_false+"<p>"+aux.getNombre()+" | "+aux.getDescripcion();
                    }
                }
            }
        lbl_lista_logros_true.setText("<html>"+logro_true+"<html>");
        lbl_lista_logros_false.setText("<html>"+logro_false+"<html>");
    }
}
