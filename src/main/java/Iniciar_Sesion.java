import java.io.*;

public class Iniciar_Sesion extends javax.swing.JFrame {

    public String modo="PC";
    public String usuario1=" ";
    private String Direccion_Principal="C:\\Users\\Cesia\\Desktop\\archivo\\";
    public Iniciar_Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logro = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        PFContrasena = new javax.swing.JPasswordField();
        BTiniciar_sesion = new javax.swing.JButton();
        lbl_linea = new javax.swing.JLabel();
        BTCrear_usuario = new javax.swing.JButton();
        lbl_aviso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logro.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 48)); // NOI18N
        lbl_logro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logro.setText("NIMBOR");
        getContentPane().add(lbl_logro, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 12, -1, 51));

        lbl_usuario.setText("Usuario:");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 97, -1, 16));

        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 94, 183, -1));

        lbl_contrasena.setText("Contraseña:");
        getContentPane().add(lbl_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 134, -1, -1));

        PFContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(PFContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 131, 183, -1));

        BTiniciar_sesion.setText("Iniciar Sesion");
        BTiniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTiniciar_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(BTiniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 172, -1, -1));

        lbl_linea.setText("________________________________________");
        getContentPane().add(lbl_linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 201, -1, 16));

        BTCrear_usuario.setText("Crear Usuario");
        BTCrear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCrear_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(BTCrear_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 229, -1, -1));

        lbl_aviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_aviso.setForeground(new java.awt.Color(153, 0, 0));
        lbl_aviso.setText(" ");
        getContentPane().add(lbl_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 69, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/fondo.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 490, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUsuario1(String usuario) {
        this.usuario1 = usuario;
    }
    
    public void setModo(String modo) {
        this.modo = modo;
    }

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void BTiniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTiniciar_sesionActionPerformed
        File direcUsuarios=new File("C:\\Users\\Cesia\\Desktop\\archivo\\Usuarios.txt");
        String nombre=TFUsuario.getText();
        String contrasena=PFContrasena.getText();
        Usuario us1=new Usuario(nombre,contrasena);
        if(!nombre.equals("") && !contrasena.equals("")){
            if(modo.equals("PC") && us1.Usuario_Existe(direcUsuarios,nombre) && us1.Confirmar_Contrasena(direcUsuarios,nombre,contrasena)){
                Menu newframe=new Menu();
                newframe.setUsuario(nombre);
                newframe.setDirec_Historial(Direccion_Principal+nombre+"\\historial.txt");
                newframe.setDirec_Logros(Direccion_Principal+nombre+"\\logros.txt");
                newframe.setVisible(true);
                this.dispose();
            }else if(modo.equals("Torneo")){
                String direccion=Direccion_Principal+"\\Torneo\\"+usuario1+"_"+nombre+".txt";
                File historial= new File(direccion);
                try{
                    if(historial.createNewFile()){
                        System.out.println(".");
                    }else{
                        System.out.println(".\n.\n.");
                    }
                }catch(IOException exepcion){
                    exepcion.printStackTrace(System.out);
                }
                Juego_Torneo newframe= new Juego_Torneo();
                newframe.setUsuario1(usuario1);
                newframe.setUsuario2(nombre);
                newframe.setDirec_Historial(direccion);
                newframe.setNum_partida(newframe.obtener_num_partida(direccion));
                newframe.setVisible(true);
                newframe.cargar_datos();
                this.dispose();
            }
            lbl_aviso.setText("<html>Usuario/Contraseña incorrecta<p>Intentelo de nuevo<html>");
        }
        if(nombre.equals("") || contrasena.equals(""))
        lbl_aviso.setText("<html>Ingrese sus datos para iniciar sesion<html>");
        
    }//GEN-LAST:event_BTiniciar_sesionActionPerformed

    private void BTCrear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCrear_usuarioActionPerformed
        Crear_nuevo_usuario newframe=new Crear_nuevo_usuario();
        newframe.setUsuario1(usuario1);
        newframe.setModo(modo);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTCrear_usuarioActionPerformed

    private void PFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFContrasenaActionPerformed

    }//GEN-LAST:event_PFContrasenaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCrear_usuario;
    private javax.swing.JButton BTiniciar_sesion;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_aviso;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_logro;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

}