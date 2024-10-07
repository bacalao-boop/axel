
public class Resultado_Torneo extends javax.swing.JFrame {

    public int jugada_usuario1=0;
    public int jugada_usuario2=0;
    public int racha=0;
    public int num_partida=0;
    public String usuario1="maria";
    public String usuario2="ana";
    public String direc_historial="C:\\Users\\Cesia\\Desktop\\archivo\\historial.txt";
    public String resultado;
    public Resultado_Torneo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setResultado(String res){
        this.resultado=res;
    }
    public void setJugada_Usuario1(int jugada_usuario1) {
        this.jugada_usuario1 = jugada_usuario1;
    }

    public void setJugada_Usuario2(int jugada_usuario2) {
        this.jugada_usuario2 = jugada_usuario2;
    }

    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }

    public void setRacha(int racha) {
        this.racha = racha;
    }

    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida++;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public void cargar_datos(){
        String jugada1=Nom_Jugada(jugada_usuario1);
        String jugada2=Nom_Jugada(jugada_usuario2);
        if(!jugada1.equals("Retirado") && !jugada2.equals("Retirado")){
            lbl_usuario1.setText(usuario1+": "+jugada1);
            lbl_usuario2.setText(usuario2+": "+jugada2);
        }
        lbl_resultado.setText(resultado);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_volver_a_jugar = new javax.swing.JButton();
        BT_historial = new javax.swing.JButton();
        BT_Terminar_juego = new javax.swing.JButton();
        lbl_resultado = new javax.swing.JLabel();
        lbl_usuario1 = new javax.swing.JLabel();
        lbl_usuario2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_volver_a_jugar.setText("Volver A Jugar");
        BT_volver_a_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_volver_a_jugarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_volver_a_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 255, -1, -1));

        BT_historial.setText("Historial");
        BT_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_historialActionPerformed(evt);
            }
        });
        getContentPane().add(BT_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 255, -1, -1));

        BT_Terminar_juego.setText("Terminar Juego");
        BT_Terminar_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Terminar_juegoActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Terminar_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 255, -1, -1));

        lbl_resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_resultado.setText("Resultado");
        getContentPane().add(lbl_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 73, -1, -1));

        lbl_usuario1.setText(" ");
        getContentPane().add(lbl_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 107, -1, -1));

        lbl_usuario2.setText(" ");
        getContentPane().add(lbl_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 136, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/juego.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_volver_a_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_volver_a_jugarActionPerformed
        Juego_Torneo newframe=new Juego_Torneo();
        newframe.setUsuario2(usuario2);
        newframe.setUsuario1(usuario1);
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setRacha(racha);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_volver_a_jugarActionPerformed

    private void BT_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_historialActionPerformed
        Historial newframe = new Historial();
        newframe.setDireccion(direc_historial);
        newframe.cargar_historial();
        newframe.transparencia_BT_menu();
        newframe.setVisible(true);
    }//GEN-LAST:event_BT_historialActionPerformed

    private void BT_Terminar_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Terminar_juegoActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BT_Terminar_juegoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado_Torneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Terminar_juego;
    private javax.swing.JButton BT_historial;
    private javax.swing.JButton BT_volver_a_jugar;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel lbl_resultado;
    private static javax.swing.JLabel lbl_usuario1;
    private static javax.swing.JLabel lbl_usuario2;
    // End of variables declaration//GEN-END:variables

    private String Nom_Jugada(int jugada) {
        if(jugada==1)
            return "Piedra";
        if(jugada==2)
            return "Papel";
        if(jugada==3)
            return "Tijeras";
        return "Retirado";
    }
}
