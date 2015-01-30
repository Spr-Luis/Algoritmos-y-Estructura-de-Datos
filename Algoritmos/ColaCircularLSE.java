//Cola Circular
class ColaCircularLSE{
  private Nodo H,T;

  public void Insertar (int dato){
    if(T == null){
      Nodo q = new Nodo(dato, H);
      H = T = q;
      q.setNextNodo(H);
    }else{
      Nodo q = new Nodo(dato,H);
      T.setNextNodo(q);
      T = q;
    }
  }

  public void Listar(){
    Nodo i = H;
    if(H != null){
      do{
         System.out.println("- "+i.getDato());
         i = i.getNextNodo();
      }while(i != H);
    }else{
      System.out.println("Cola Circular Vacia");
    } 
  }
  
  public Nodo Borrar(){
    Nodo aux = H;
    if(H == null){
      System.out.println("No hay datos");
    }else if(H == T){
      H = T = null;
    }else{
      H = H.getNextNodo();
      T.setNextNodo(H);
    }
    return aux;
  }
}
