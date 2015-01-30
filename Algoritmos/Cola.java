class Cola{
  private int []cola;
  int H,T;

  public Cola(int max){
    cola = new int[max];
    H = T = -1;
  }

  public boolean ValidasEspacio(){
      return (T < cola.length -1);
  }

  public boolean ValidaVacio(){
    return (H == -1);
  }

  public void Listar(){
    for (int i = 0; i <= T; i++){
      System.out.println(cola[i]);
    }
  }

  public void Insertar(int dato){
    if(T==-1)
      H = 0;
    T++;
    cola[T] = dato;
  }

  public int Borrar(){
    int aux = cola[H];
    if(H==T)
      H=T=-1;
    else
      H++;
    return aux;
  }

}
