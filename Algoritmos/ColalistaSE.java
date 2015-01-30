class ColalistaSE{
  private Nodo H,T;

  public ColalistaSE(){
    H = T = null;
  }


  public void InsertaAlFinal(int dato){
    Nodo q;
	 if(T==null){
				InsertaAlPrincipio(dato);
    }else{
	   q=new Nodo(dato,null);
		T.setNextNodo(q);
		T=q;
	 }
  }
  
  public void InsertaAlPrincipio(int dato){
		Nodo q=new Nodo(dato, H);
		if(H==null)
			T=q;
		T=q;
	}

  public void Listar(){
   Nodo i;
		for(i=H;i!=null;i=i.getNextNodo())
			System.out.println(i.getDato());
  }

  public Nodo Borrar(){
    Nodo aux = H;
    if(H == null){
      System.out.println("No Existe Dato");
    }else if(H == T){
      H = T =  null;
    }else{
        H.getNextNodo();
    }
    return aux;
  }
  
  


}
