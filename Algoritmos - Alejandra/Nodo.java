
public class Nodo {
	//atributos
	private int dato;
	private Nodo sig;
	//Constructor
	public Nodo(int dato, Nodo s){
		this.dato=dato;
		sig=s;
	}
	//metodos
	public void SetDato(int dato){
		this.dato=dato;
	}
	public int GetDato(){
		return dato;
	}
	public void SetSig(Nodo s){
		sig=s;
	}
	public Nodo GetSig(){
		return sig;
	}
}
