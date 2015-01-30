public class ArregloLibros{

	//Atributos
	private Libro []arreglo;
	private int indice;
	
	//Constructor
	
	public ArregloLibros(int max){
		arreglo = new Libro[max];
		indice=-1;
	}
    
	//Metodos
	public void Insertar(Libro dato){
		indice++;
		arreglo[indice]=dato;
	}
    
    public boolean Validar(){
		if(indice==(arreglo.length-1)){
			return false;
		}else{
			return true;
		}
	}

   public void Listar(){
    
		for(int i=0; i<=indice; i++){
			arreglo[i].Listar();
      }
	}
	    
	public void Listar(int pos){
		arreglo[pos].Listar();
      System.out.println();
	}
	      
		
	public int BuscarDato(int serie){
		for(int i=0;i<=indice;i++){
			if(arreglo[i].getNumeroSerie()==serie){
				return i;
			}
		}
		return -1;
	}
   
   public int getIndice(){
      return indice;
   }
   
   public int posLibroMasSolicitado(){
      int res = arreglo[0].getCuentaPrestamo();
      int pos = 0;
   
      for(int i=1; i<indice+1; i++) { 
         if(arreglo[i].getCuentaPrestamo() > res) { 
            res = arreglo[i].getCuentaPrestamo(); 
            pos = i;
         } 
      } 
      return pos;
   }
   
   public int posLibroMenosSolicitado(){
      int res = arreglo[0].getCuentaPrestamo();
      int pos = 0;
   
      for(int i = 1; i<indice+1; i++) { 
         if(arreglo[i].getCuentaPrestamo() < res) { 
            res = arreglo[i].getCuentaPrestamo(); 
            pos = i;
         } 
      } 
      return pos;
   }
   
   public void materiaMenosSolicitada(){
      int pos = posLibroMenosSolicitado();
      System.out.println("\nMateria menos solicitada: "+arreglo[pos].getMateria());
   }
	public void materiaMasSolicitada(){
      int pos = posLibroMasSolicitado();
      System.out.println("\nMateria más solicitada: "+arreglo[pos].getMateria());
	}
   
   public int totalPrestamos(){
      int total = 0;
      for(int i = 0; i <= indice; i++){
         total = total + arreglo[i].getCuentaPrestamo();
      }
      return total;
   }
      
   public int BuscarDatoPrestamo(int serie){
		for(int i=0;i<=indice;i++){
			if(arreglo[i].getNumeroSerie()==serie){
            arreglo[i].agregaPrestamo();
				return i;
			}
		}
		return -1;
	}
	
	public void Actualizar(int pos){
			arreglo[pos].Actualizar();	
	}

	public Libro Borrar(int pos){
		Libro aux =arreglo[pos];
		arreglo[pos]=arreglo[indice];
		indice--;
		return aux;
	}

}
