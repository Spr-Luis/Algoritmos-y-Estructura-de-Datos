class Nodo{

	//Atributos
	private Proceso dato;
	private Nodo sig;

	//Constructor 

	public Nodo(Proceso dato, Nodo s){
		this.dato=dato;
		sig=s;
	}

	//Metodos

	public void SetDato(Proceso dato){
		this.dato=dato;
	}
	
	public Proceso GetDato(){
		return dato;
	}

	public void SetSig(Nodo s){
		sig=s;

	}	

	public Nodo GetSig(){
		return sig;
	}

}
