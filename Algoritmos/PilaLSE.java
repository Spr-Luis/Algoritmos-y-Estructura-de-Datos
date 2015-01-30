class PilaLSE{
  private Nodo tope;


  public void Push(int dato){
      Nodo q = new Nodo (dato,tope);
  }

  public Nodo Pop(){
    Nodo aux = tope;
    if(tope != null){
      tope = tope.getNextNodo();
      return aux;
    }else{
      System.out.println("No hay elementos.");
      return aux;
    }
  }

  public void Listar(){
    for(Nodo aux = tope; aux != null; aux.getNextNodo()){
      System.out.println(" - " + aux.getDato());
    }
  }

  
}
