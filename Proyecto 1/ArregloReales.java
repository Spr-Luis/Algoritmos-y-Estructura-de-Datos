public class ArregloReales{
    
    
    private double []arreglo, i, dato;
    private int indice;
	//Ordenamientos ordena= new Ordenamientos();
   
    
    
    
    public ArregloReales(){}
    
   /**
   * Constructor
   * @param int max Tamano del Arreglo
   */
   
	public ArregloReales(int max){ 
		arreglo = new double[max];
		indice = -1;
	}
    
    
    /**
     * Insertar(int dato)
     * Inserta entero al arreglo
     * @param int dato Valor del entero
     */
	public void Insertar(int dato){
		indice++;
		arreglo[indice] = dato;
	}
    
   /**
   * Validar()
   * Valida el espacio dentro del arreglo
   */
	public boolean Validar(){
		if(indice==(arreglo.length-1)){
			return false;
		}else{
			return true;
		}
	}

	
   /**
   * Listar()
   * Lista todos los elementos del arreglo
   */
    public void Listar(){
		if(indice!=-1){
			for(int i=0;i<=indice;i++){
				System.out.println("Elemento "+i+": "+arreglo[i]);
			}
		}else{
			System.out.println("Arreglo vacio");
		}
	}
   	
   /**
   * Listar(int pos)
   * Lista un elemento determinado del arreglo
   * @param int pos Posicion el cual listar
   */
	public void Listar(int pos){
		System.out.println("Posicion: "+pos+ "\nDato: " + arreglo[pos]);
	}
	
   /**
   * BuscarDato(int dato)
   * Busca el dato en el arreglo y devuelve la posicion
   * @param int dato Dato a buscar
   */
	public double BuscarDato(double dato){
      for(int i=0;i<=indice;i++){
			if(arreglo[i]==dato){
				return i;
			}
		}
		return -1;
	}
   
   /**
   * Actualizar(int pos)
   * Actualiza el dato en una determinada posicion
   * @param int pos Posicion en el arreglo a actualizar
   */
   public void Actualizar(int pos){
       arreglo[pos]=Teclado.Double("Ingresa el nuevo dato: ");
   }
   
   /**
   * Borrar(int pos)
   * Borrar un elemento en el arreglo
   * @param int pos Posicion en el arreglo a eliminar
   */
   public double Borrar(int pos){
       double aux = arreglo[pos];
       arreglo[pos]=arreglo[indice];
       indice--;
       return aux;
   }
   
   /**
   * Repetido(int rep)
   * Verifica si en el arreglo hay un valor repetido
   * @param int res Valor
   */
   public boolean Repetido(double rep){

		for(int i=0;i<=indice;i++){
			if(arreglo[i]==rep){
				return false;
			}else{
				return true;
			}
		}
		return true;
	}   
   
}
   
   