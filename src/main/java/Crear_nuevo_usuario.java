import java.io.*;

public class Crear_nuevo_usuario extends javax.swing.JFrame {

    public String modo="PC";
    public String usuario1=" ";
    public Crear_nuevo_usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setModo(String modo){
        this.modo=modo;
    }
    public void setUsuario1(String nombre){
        this.usuario1=nombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        TF_Usuario = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        PF_Contrasena = new javax.swing.JPasswordField();
        BT_Crear_Usuario = new javax.swing.JButton();
        BT_Iniciar_Sesion = new javax.swing.JButton();
        lbl_linea = new javax.swing.JLabel();
        lbl_aviso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lbl_logo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logo.setText("NIMBOR");
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 51));

        lbl_usuario.setText("Usuario:");
        lbl_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 106, -1, -1));

        TF_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TF_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 100, 201, -1));

        lbl_contrasena.setText("Contraseña:");
        getContentPane().add(lbl_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 155, -1, -1));
        getContentPane().add(PF_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 152, 201, -1));

        BT_Crear_Usuario.setText("Crear Usuario");
        BT_Crear_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Crear_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Crear_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 201, -1, -1));

        BT_Iniciar_Sesion.setText("Iniciar Sesion");
        BT_Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Iniciar_SesionActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Iniciar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 255, -1, -1));

        lbl_linea.setText("__________________________________");
        getContentPane().add(lbl_linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 230, -1, 13));

        lbl_aviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_aviso.setForeground(new java.awt.Color(153, 0, 0));
        lbl_aviso.setText(" ");
        getContentPane().add(lbl_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 63, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/axel/Downloads/fotos/fondo.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 470, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_UsuarioActionPerformed

    private void BT_Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Iniciar_SesionActionPerformed
        Iniciar_Sesion newframe=new Iniciar_Sesion();
        newframe.setUsuario1(usuario1);
        newframe.setModo(modo);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_Iniciar_SesionActionPerformed

    private void BT_Crear_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Crear_UsuarioActionPerformed
        File direcUsuario=new File("C:\\Users\\Cesia\\Desktop\\archivo\\Usuarios.txt");
        String Direccion_Principal="C:\\Users\\Cesia\\Desktop\\archivo\\";
        String nombre=TF_Usuario.getText(); 
        String contrasena=PF_Contrasena.getText();
        Usuario us1=new Usuario(nombre,contrasena);
        if(!nombre.equals("") && !contrasena.equals("")){
            if(!us1.Usuario_Existe(direcUsuario,nombre)){
                us1.Registrar_Usuario(direcUsuario,nombre,contrasena,Direccion_Principal);

                if(modo.equals("PC")){
                    Menu newframe=new Menu();
                    newframe.setDirec_Historial(Direccion_Principal+nombre+"\\historial.txt");
                    newframe.setDirec_Logros(Direccion_Principal+nombre+"\\logros.txt");
                    newframe.setUsuario(nombre);
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
                    newframe.cargar_datos();
                    newframe.setVisible(true);
                    this.dispose();
                }
            }
            lbl_aviso.setText("<html>El nombre de usuario ya esta ocupado<p>Ingrese un nuevo nombre<html>");
        }
        if(nombre.equals("") && contrasena.equals(""))
            lbl_aviso.setText("<html>Rellene el registro por favor<html>");
    }//GEN-LAST:event_BT_Crear_UsuarioActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_nuevo_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Crear_Usuario;
    private javax.swing.JButton BT_Iniciar_Sesion;
    private javax.swing.JPasswordField PF_Contrasena;
    private javax.swing.JTextField TF_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_aviso;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}
