
public class LIstaSE {
	//atributos
	private Nodo h;
	private Nodo t;
	private boolean existe;
	//constructores
	public LIstaSE(){
		h=t=null;
	}
	//metodos
	public void InsertaAlPrincipio(int dato){
		Nodo q=new Nodo(dato, h);
		if(h==null)
			t=q;
		h=q;
	}
	public void InsertaAlFInal(int dato){
		Nodo q;
      if(t==null)
			InsertaAlPrincipio(dato);
		else{
			q=new Nodo(dato,null);
			t.SetSig(q);
			t=q;
		}
	}
	public void Listar(){
		Nodo i;
		for(i=h;i!=null;i=i.GetSig())
			System.out.println(i.GetDato());
	}
	public Nodo BuscaDato(int dato){
		Nodo i=h;
		while(i!=null){
			if(i.GetDato()==dato)
				return i;
			i=i.GetSig();
		}
		return null;
	}
	
	public void Actualizar (Nodo pos) {
		pos.SetDato(Teclado.entero("Dame el dato nuevo: "));
	}
	
	public void InsertaNodo (Nodo anterior, int datonvo){
		Nodo nuevo= new Nodo (datonvo, anterior.GetSig()); 
		anterior.SetSig (nuevo);
		if (t==anterior)
			t=nuevo;
	}
	
	public Nodo BuscaNodoAnt (int dato) {
		Nodo q, anterior= null; 
		existe = false;
		for (q=h; q!=null; q=q.GetSig()) {
			if (existe = q.GetDato()==dato)
				return anterior;
			anterior=q;
		}
		return null; 
	}
	
	public void InsertarAntes (int dato) {
		int datonvo; 
		Nodo anterior = BuscaNodoAnt(dato);
		if (!existe)
			System.out.println ("Error no exite el dato. \n");
		else
			if (anterior == null)
			{
				datonvo=Teclado.entero("Dame el dato nuevo: ");
			}
			else {
				datonvo=Teclado.entero("Dame el nuevo dato");
				InsertaNodo(anterior, datonvo);
			}
	}
	
	public Nodo Borrar (int dato) {
		Nodo aux=h, anterior=BuscaNodoAnt (dato);
		if (!existe){
			System.out.println ("no existe el dato");
			aux = null;
		}
		else
			if (h==t)
				h=t=null; 
			else 
				if (anterior != null) {
					aux = anterior.GetSig ();
					anterior.SetSig (aux.GetSig());
					t=anterior; 
				}
				else 
					h=h.GetSig();
		return aux;
	}
}
