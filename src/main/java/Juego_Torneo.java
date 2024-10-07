import java.io.*;
public class Juego_Torneo extends javax.swing.JFrame {

    public int jugada_usuario1=0;
    public int jugada_usuario2=0;
    public int racha=0;
    public int num_partida=0;
    public String usuario1="m";
    public String usuario2="";
    public String direc_historial="";
    public Juego_Torneo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }

    public void setRacha(int racha) {
        this.racha = racha;
    }

    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida+1;
    }

    public void setUsuario1(String usuario) {
        this.usuario1 = usuario;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public void cargar_datos(){
        lbl_usuario.setText(usuario1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_piedra_1 = new javax.swing.JButton();
        BT_papel_1 = new javax.swing.JButton();
        BT_tijeras_1 = new javax.swing.JButton();
        BT_piedra_2 = new javax.swing.JButton();
        BT_papel_2 = new javax.swing.JButton();
        BT_tijeras_2 = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        BT_rendirse_usuario1 = new javax.swing.JButton();
        BT_rendirse_usuario2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_piedra_1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/piedra.png")); // NOI18N
        BT_piedra_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_piedra_1ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_piedra_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        BT_papel_1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/papel.png")); // NOI18N
        BT_papel_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_papel_1ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_papel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        BT_tijeras_1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/tijera.png")); // NOI18N
        BT_tijeras_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tijeras_1ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_tijeras_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        BT_piedra_2.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/piedra.png")); // NOI18N
        BT_piedra_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_piedra_2ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_piedra_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        BT_papel_2.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/papel.png")); // NOI18N
        BT_papel_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_papel_2ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_papel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        BT_tijeras_2.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/tijera.png")); // NOI18N
        BT_tijeras_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tijeras_2ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_tijeras_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        lbl_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_mensaje.setText("Es el turno de:");
        getContentPane().add(lbl_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 119, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_usuario.setText("________");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 142, -1, -1));

        BT_rendirse_usuario1.setText("Rendirse");
        BT_rendirse_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_rendirse_usuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_rendirse_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 59, -1, -1));

        BT_rendirse_usuario2.setText("Rendirse");
        BT_rendirse_usuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_rendirse_usuario2ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_rendirse_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 185, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/juego.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_piedra_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_piedra_1ActionPerformed
        this.jugada_usuario1=1;
        lbl_usuario.setText(usuario2);
    }//GEN-LAST:event_BT_piedra_1ActionPerformed

    private void BT_papel_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_papel_1ActionPerformed
        this.jugada_usuario1=2;
        lbl_usuario.setText(usuario2);
    }//GEN-LAST:event_BT_papel_1ActionPerformed

    private void BT_tijeras_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tijeras_1ActionPerformed
        this.jugada_usuario1=3;
        lbl_usuario.setText(usuario2);
    }//GEN-LAST:event_BT_tijeras_1ActionPerformed

    private void BT_rendirse_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_rendirse_usuario1ActionPerformed
        String final_partida="Gano "+usuario2;
        Partida act=new Partida(num_partida,final_partida);
        act.guardarHistorial(act, direc_historial);
        
        Resultado_Torneo newframe=new Resultado_Torneo();
        newframe.setUsuario1(usuario1);
        newframe.setUsuario2(usuario2);
        newframe.setResultado(final_partida);
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setJugada_Usuario1(jugada_usuario1);
        newframe.setJugada_Usuario2(jugada_usuario2);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_rendirse_usuario1ActionPerformed

    private void BT_piedra_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_piedra_2ActionPerformed
        jugada_usuario2=1;
        juego();
    }//GEN-LAST:event_BT_piedra_2ActionPerformed

    private void BT_papel_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_papel_2ActionPerformed
        jugada_usuario2=2;
        juego();
    }//GEN-LAST:event_BT_papel_2ActionPerformed

    private void BT_tijeras_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tijeras_2ActionPerformed
        jugada_usuario2=3;
        juego();
    }//GEN-LAST:event_BT_tijeras_2ActionPerformed

    private void BT_rendirse_usuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_rendirse_usuario2ActionPerformed
        String final_partida="Gano "+usuario1;
        Partida act=new Partida(num_partida,final_partida);
        act.guardarHistorial(act, direc_historial);
        
        Resultado_Torneo newframe=new Resultado_Torneo();
        newframe.setUsuario1(usuario1);
        newframe.setUsuario2(usuario2);
        newframe.setResultado(final_partida );
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setJugada_Usuario1(jugada_usuario1);
        newframe.setJugada_Usuario2(jugada_usuario2);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_rendirse_usuario2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego_Torneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_papel_1;
    private javax.swing.JButton BT_papel_2;
    private javax.swing.JButton BT_piedra_1;
    private javax.swing.JButton BT_piedra_2;
    private javax.swing.JButton BT_rendirse_usuario1;
    private javax.swing.JButton BT_rendirse_usuario2;
    private javax.swing.JButton BT_tijeras_1;
    private javax.swing.JButton BT_tijeras_2;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel lbl_mensaje;
    private static javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

    public String ganador(int usuario2, int usuario1) {
        if (usuario1==usuario2)
            return "Empate";
        if ((usuario1 == 1 &&  usuario2== 3)||(usuario1 == 2 && usuario2 == 1)||(usuario1 == 3 && usuario2 == 2))
            return "Ganaste";
        return "Perdiste";
    }
    private void juego(){
        String final_partida=ganador(jugada_usuario2,jugada_usuario1);
        if(final_partida.equals("Ganaste"))
            final_partida="Gano "+usuario1;
        if(final_partida.equals("Perdiste"))
            final_partida="Gano "+usuario2;
        
        Partida act=new Partida(num_partida,final_partida);
        act.guardarHistorial(act, direc_historial);
        
        Resultado_Torneo newframe=new Resultado_Torneo();
        newframe.setUsuario1(usuario1);
        newframe.setUsuario2(usuario2);
        newframe.setResultado(final_partida);
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setJugada_Usuario1(jugada_usuario1);
        newframe.setJugada_Usuario2(jugada_usuario2);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }
    
    public int obtener_num_partida(String direc_historial) {
        File archivo=new File (direc_historial);
        String contenido="";
        int aux=-1;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            while(contenido != null){
            contenido = lectura.readLine();
            aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return aux;
    }
}
