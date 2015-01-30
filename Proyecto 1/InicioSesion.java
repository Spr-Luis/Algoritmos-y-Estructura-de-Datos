import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;	
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class InicioSesion{

    public static boolean VerificarInicio(String nombre,String contra){
                String aux = nombre.trim()+"$"+contra;
                try{
                        File f = new File("Hola.txt");
                        BufferedReader lec = new BufferedReader(new FileReader(f));
                        String linea="";
                        while(lec.ready()){
                                linea = lec.readLine();
                                if(linea.equals(aux)){
                                        return true;
                                }
                        }

                }catch(IOException ioe){
                        System.out.println("Error en el inicio de sesion");
                }
                return false;
        }

    public static Alumno Registrar(String nombre,String contra){
		
		
                String aux = nombre.trim() +"$"+contra;
                String est = "Hola.txt";
                try{
                        FileWriter fw = new FileWriter(est,true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter salida = new PrintWriter(bw);
                        salida.println(aux);
                        salida.close();
                        
                        System.out.println("\n\nBienvenido "+nombre);
                        Alumno alm = new Alumno(nombre);
                        return alm;
   
                }catch (IOException e){
                        System.out.println("Error");

                }

            return null;
        }

	public static boolean SuperUsuario(String us,String con){
		String aux=us+"$"+con;
        String clave ="root$alpine";
			if(aux.equals(clave)){
				return true;
			}
		return false;
	}


     public static boolean Verificar(String nombre){

                StringTokenizer str;
                nombre=nombre.trim();
                String aux ="";
                String nom ="";
                File f = new File("Hola.txt");
                BufferedReader lectura = null;

                try{
                        lectura = new BufferedReader(new FileReader(f));
                        String linea="";
                        while(lectura.ready()){

                                linea = lectura.readLine();
                                str = new StringTokenizer(linea,"$");
                                nom = str.nextToken();
                                if(nombre.equals(nom)){
                                        lectura.close();
                                        return true;
                                }
                        }
                lectura.close();
                }catch(IOException e){
                        System.out.println("Error en flujo de datos");
                }

                return false;
        }

	
}