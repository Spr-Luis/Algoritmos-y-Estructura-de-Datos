public class ArregloAlumnos
{
	private Alumno []arreglo, i, dato;//cada casilla guardara un alumno
   private int indice;
	//Ordenamientos ordena= new Ordenamientos();
   
   /**
   * Constructor
   * @param int max Tamanio del Arreglo
   */
   
   public int getIndice(){
      return indice;
   }
   
	public ArregloAlumnos(int max){ 
		arreglo = new Alumno[max];
			
		indice = -1;
	}

   /**
   * ValidaEspacio()
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
   * Insertar(int dato)
   * Inserta entero al arreglo
   * @param int dato Valor del entero
   */
	public void Insertar(Alumno dato){
		indice++;
		arreglo[indice] = dato;
	}
	
   /**
   * Listar()
   * Lista todos los elemtos del arreglo
   */
	public void Listar(){
      int i;
		for(i = 0; i<=indice;i++)
			arreglo[i].Listar();
	
	}

   	
   /**
   * Listar(int pos)
   * Lista un elemento determinado del arreglo
   * @param int pos Posicion el cual listar
   */
	public void Listar(int pos){
		arreglo[pos].Listar();
	}
	
   /**
   * BuscarDato(int dato)
   * Busca el dato en el arreglo y devuelve la posicion
   * @param int dato Dato a buscar
   */
	public int BuscarDato(int dato){
      for(int i=0;i<=indice;i++){
			if(arreglo[i].getCuenta()==dato){
				return i;
			}
		}
		return -1;
	}
   
   public int BuscarPorNombre(String dato){
      for(int i=0;i<=indice;i++){
			if(arreglo[i].getNombre().equals(dato)){
				return i;
			}
		}
		return -1;
	}
   
   public void addPrestamo(int pos){
      arreglo[pos].agregarPrestamo();
	}
   
   /**
   * Actualizar(int pos)
   * Actualiza el dato en una determinada posicion
   * @param int pos Posicion en el arreglo a actualizar
   */
   public void Actualizar(int pos){
       arreglo[pos].Actualizar();
   }
   
   /**
   * Borrar(int pos)
   * Borrar un elemento en el arreglo
   * @param int pos Posicion en el arreglo a eliminar
   */
   public Alumno Borrar(int pos){
      Alumno aux= arreglo[pos];
      arreglo[pos]=arreglo[indice];
      indice--;
      return aux;
   }
   
   public int mujeres(){
      int countM = 0;
      for(int i=0;i<=indice;i++){
         if(arreglo[i].getGenero().equals("Femenino")){
            countM++;
         }
      }
      return countM;
   }
   
   public int hombres(){
      int countH = 0;
      for(int i=0;i<=indice;i++){
         if(arreglo[i].getGenero().equals("Masculino")){
            countH++;
         }
      }
      return countH;
   }
   
   public void promedioEdad(){
      int aux=0;
		for (int i=0;i<=indice;i++) {
			aux=aux+arreglo[i].getEdad();
		}
		float prom=aux/(indice+1);
		System.out.println("La edad promedio de alumnos es: "+prom);
	}
   
   public void semestreMasAlu(){
      int num_mas_usado = 0;
      int veces [ ] = new int [indice+1];
      int posicion = 0;
      
      for(int i = 0; i <= indice; i++){
         num_mas_usado = arreglo[i].getSemestre();
         for(int j = i; j <= indice; j++){
            if(arreglo[j].getSemestre() == num_mas_usado){
            veces[i]++;
            }
         }
      }
      
      num_mas_usado = 0;
      for(int k = 0; k < veces.length; k++){
         if(num_mas_usado < veces [k]){
            num_mas_usado = veces [k];
            posicion = k;
         }
      }
      
      System.out.println("Semestre con mas alumnos: "+arreglo[posicion].getSemestre());
   }
   
   
   public void semestreMenosAlu(){
      int num_mas_usado = 0;
      int veces [ ] = new int [indice+1];
      int posicion = 0;
      
      for(int i = 0; i <= indice; i++){
         num_mas_usado = arreglo[i].getSemestre();
         for(int j = i; j <= indice; j++){
            if(arreglo[j].getSemestre() == num_mas_usado){
            veces[i]++;
            }
         }
      }
      
      num_mas_usado = 0;
      for(int k = 0; k < veces.length; k++){
         if(num_mas_usado > veces [k]){
            num_mas_usado = veces [k];
            posicion = k;
         }
      }
      
      System.out.println("Semestre con menos alumnos: "+arreglo[posicion].getSemestre());
   }
   /**
   * Ordenar(int res)
   * Metodo para seleccionar el odenamiento
   * @param int res Opcion
   */
   /*
   public void ordenar(int res){
   switch(res){
   
   case 1:      ordena.SortIntercambio(indice, arreglo); break;
   case 2:      ordena.SortSelection(indice, arreglo); break;
   case 3:      ordena.SortInterseccion(indice, arreglo); break;
   default:     System.out.println("opcion incorrecta"); break;
         }
   }
	*/
   /**
   * Repetido(int rep)
   * Verifica si en el arreglo hay un valor repetido
   * @param int res Valor
   */
   public boolean Repetido(int rep){

		for(int i=0;i<=indice;i++){
			if(arreglo[i].getCuenta()==rep){
				return false;
			}else{
				return true;
			}
		}
		return true;
	}   
   
}
   
   