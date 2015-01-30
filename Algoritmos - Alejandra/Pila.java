
public class Pila {
	//Atributos 
	private int tope;
	private int [] pila;

	//Constructores 
	public Pila (int max) {
		pila = new int [max];
		tope=-1;	
	}
	
	//Metodos 
	public boolean ValidaEspacio () {
		return (tope<pila.length-1);
	}

	public void Push (int dato) {
		pila [++tope]=dato; 
	}
	
	public boolean ValidaVacio (){
		return (tope == 1); 
	}
	
	public int Pop (){
		int aux = pila [tope];
		tope --;
		return (aux);
	}
	
	public void Listar (){
		int i; 
		for (i=tope; i>=0; i--)
			System.out.println(pila[i]);
	}
	
	public int DatoTope(){
		return pila [tope]; 
	}
}
