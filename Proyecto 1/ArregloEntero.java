import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ArregloEntero{

	//Atributos
	private int []arreglo;
	private int indice;
	
	//Constructor
	
	public ArregloEntero(){}

	public ArregloEntero(int max){
		arreglo = new int[max];
		indice=-1;
	}
    
	//Metodos
	public void Insertar(int dato){
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
		if(indice!=-1){
			for(int i=0;i<=indice;i++){
				System.out.println("Elemento "+i+": "+arreglo[i]);							
			}
		}else{
			System.out.println("Arreglo vacio");
		}
	}
	
 
    
	public void Listar(int pos){
		System.out.println("Posicion: "+pos+ "\nDato: " + arreglo[pos]);
	}
    
		
	public int BuscarDato(int cuenta){
		for(int i=0;i<=indice;i++){
			if(arreglo[i]==cuenta){
				return i;
			}
		}
		return -1;
	}
	
    public int BuscarRecursivo(int tam,int cuenta){
        tam=indice;
        if(tam==-1)
            return -1;
        if(arreglo[tam]==tam)
            return tam;
        else
            return BuscarRecursivo(tam-1,cuenta);
    }
    
    
	public void Actualizar(int pos){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el dato: ");
			arreglo[pos]=Integer.valueOf(br.readLine());
		}catch(IOException ioe){}
	}

	public int Borrar(int pos){
		int aux =arreglo[pos];
		arreglo[pos]=arreglo[indice];
		indice--;
		return aux;
	}

	public boolean Repetido(int rep){

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
