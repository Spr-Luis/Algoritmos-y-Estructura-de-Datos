import java.io.*;

public class Teclado {
    static private String cadena;
    static private BufferedReader in;

    // mEtodos pUblicos
	 
    public static String cadena(String prompt) {
		  return  leerCadena(prompt);
    }

    public static String cadena() {
        return leerCadena("");
    }

    public static int entero(String prompt) {
        return leerEntero(prompt);
    }

    public static int entero() {
        return leerEntero("");
    }

    public static double Double(String prompt) {
        return leerReal(prompt);
    }

    public static double Double() {
        return leerReal("");
    }



    // mEtodos privados!

    private static void inicializar() {
	     if (in==null)
        	in = new BufferedReader(new InputStreamReader(System.in));
    }

    private static String leerCadena(String prompt) {
        try {
        		inicializar();
            if (prompt.compareTo("")==0)
                System.out.print(" >");
            else
                System.out.print(prompt);
            cadena = in.readLine();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: ");
        }
        return cadena;
    }

    private static int leerEntero(String prompt) {
        int i=0;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    i = Integer.parseInt(in.readLine());
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return i;
    }

    private static double leerReal(String prompt) {
        double d=0.0;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    d = (Double.valueOf(in.readLine())).doubleValue();
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return d;
    }

}
