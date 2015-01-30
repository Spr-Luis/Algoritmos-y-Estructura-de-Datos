class ColaCircularLSE {

	private Nodo h,t;

	public void insertar(Proceso dato){
		Nodo q=new Nodo(dato,h);
		if(t==null){
			h=q;
			t=q;
			q.SetSig(h);
		}else{
			t.SetSig(q);
			t=q;
		}
	}

	public void listar(){
		if(h!=null){
			h.GetDato().listarProceso();
			for(Nodo i=h.GetSig();i!=h;i=i.GetSig())
                i.GetDato().listarProceso();
		}

	}

	public Proceso borrar(){
		Nodo aux=h;
		if(h==null)
			System.out.println("No hay datos");
		else{
			if(h==t){
				h=null;
				t=null;
			}else{
				h=h.GetSig();
				t.SetSig(h);
			}
		}
		return aux.GetDato();
	}
   
   public boolean estaVacia(){
      Nodo aux = h;
      if(h == null)
         return true;
      else
         return false;     
   }

	
}
