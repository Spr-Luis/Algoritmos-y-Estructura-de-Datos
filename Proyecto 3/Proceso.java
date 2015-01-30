import java.util.Random;

class Proceso{

	//Atributos
	private int id;
	private String nombre;
	private int tamano;

	//Constructor

	Proceso(){
   /*
		id=Teclado.entero("Introduce el numero del ID: ");
		nombre=Teclado.cadena("Ingresa el nombre del proceso: ");
		tamano=Teclado.entero("Ingresa el numero de paginas: ");	
   */
            Random rnd = new Random();

      id = (int) (rnd.nextDouble()*1000);
      nombre = "Proceso" + id;
      tamano = (int) (rnd.nextDouble()*50);
	}
   
    
    public void listarProceso(){
        System.out.println("\n\t*************************");
        System.out.println("\t* Proceso: "+nombre+"\t*");
        System.out.println("\t* ID: "+id+"\t\t*");
        System.out.println("\t* Tamaño: "+tamano+"\t\t*");
        System.out.println("\t*************************\n");
    }

    public boolean regresaNodo(int pag){
        if(tamano-pag <= 0){
         tamano = 0;
         return false;
        }else{
         tamano = tamano-pag;
         return true;
        }
    }

}
