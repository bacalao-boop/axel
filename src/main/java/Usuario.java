import java.io.*;
public class Usuario {
    String nombre;
    String contrasena;
    public Usuario(String nombre, String contrasena){
        this.nombre=nombre;
        this.contrasena=contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
        
    public boolean Usuario_Existe(File archivo,String nombre) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(" ");  // Dividir el nombre y la contraseña
                String nombreAct = datos[0];
                
                // Comprobar si el nombre coincide
                if (nombre.equals(nombreAct)) {
                    return true;  // El usuario existe
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;  // El usuario no existe
    }
    //comprueba si la contraseña corresponde al usuario
    public boolean Confirmar_Contrasena(File archivo,String nombre,String contrasena) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(" ");  // Dividir el nombre y la contraseña
                String contrasenaAct = datos[1];
                String nombreAct= datos[0];
                
                // Comprobar si el nombre coincide
                if (nombre.equals(nombreAct) && contrasena.equals(contrasenaAct)) {
                    return true; //Contraseña correcta
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;  // Contraseña incorrecta
    }
    //crear un nuevo usuario
    public void Registrar_Usuario(File archivo,String nombre,String contrasena,String direccionPrincipal) {
        try (FileWriter writer = new FileWriter(archivo, true)) {
            // Escribir el usuario en el archivoDeUsuarios
            writer.write(nombre + " " + contrasena + "\n");
            System.out.println("Usuario registrado correctamente");

            // Crear una carpeta con el nombre del usuario
            File carpeta = new File(direccionPrincipal+nombre);
            //cambiar direccion (no es necesario___)
            //crea la carpeta del usuario
            if (carpeta.mkdir()) {
                System.out.println(".");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
            //crea el archivoTXT historial
            File historial= new File(direccionPrincipal+nombre+"\\historial.txt");
            try{
                if(historial.createNewFile()){
                    System.out.println(".");
                }else{
                    System.out.println("Error al crear el archivo");
                }
            }catch(IOException exepcion){
                exepcion.printStackTrace(System.out);
            }
            //crea el archivoTXT logros
            File logros=new File (direccionPrincipal+nombre+"\\logros.txt");
            try{
                if(logros.createNewFile()){
                    System.out.println(".");
                }else{
                    System.out.println("Error al crear el archivo");
                }
            }catch(IOException exepcion){
                exepcion.printStackTrace(System.out);
            }
            Logro aux=new Logro();
            aux.guardarLogros(aux.lista_logros(),direccionPrincipal+nombre+"\\logros.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
