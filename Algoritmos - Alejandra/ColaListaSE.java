
public class ColaListaSE {
	private Nodo h;
	private Nodo t;
	
	public ColaListaSE () {
		t=null;
	}
	
	public void InsertaAlFinal (int dato) {
		Nodo q;
	      if(t==null)
				InsertaAlPrincipio(dato);
			else{
				q=new Nodo(dato,null);
				t.SetSig(q);
				t=q;
			}
	}
	
	public void Listar () {
		Nodo i;
		for(i=h;i!=null;i=i.GetSig())
			System.out.println(i.GetDato());
	}
	
	public Nodo Borrar () {
		Nodo aux=h; 
		if (h==null)
			System.out.println ("No existe el dato.\n");
		else 
			if (h==t)
				h=t=null;
			else 
				h=h.GetSig();
		return aux;
	}
	
	public void InsertaAlPrincipio(int dato){
		Nodo q=new Nodo(dato, h);
		if(h==null)
			t=q;
		h=q;
	}
	
}
