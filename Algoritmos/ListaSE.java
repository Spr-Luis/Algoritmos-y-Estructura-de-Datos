class ListaSE{
  // Atributos
  private Nodo H;
  private Nodo T;
  private boolean existe;

  // Constuctores
  public ListaSE(){
    H = T = null;
  }

  // Métodos
  public void InsertarAlPrincipio(int dato){
    Nodo q = new Nodo(dato,H);
    H = q;

    if (H == null){
      T = q;
    }

    H = q;
  }

  public void InsertarAlFinal(int dato){
    if(T == null){
      InsertarAlPrincipio(dato);
    }else{
      InsertaNodo(T, dato);
    }
  }

  public void Listar(){
    Nodo i;

    for(i = H; i != null; i.getNextNodo()){
      System.out.println(i.getDato());
    }
  }

  public Nodo Buscar(int dato){
    Nodo i = H;
    while(i != null){
      if(i.getDato() == dato){
        return i;
      }

      i = i.getNextNodo();
    }
    return null;
  }

  public void InsertaNodo(Nodo anterior, int dato){
    Nodo nuevo = new Nodo(dato, anterior.getNextNodo());
    anterior.setNextNodo(nuevo);
    if(T == anterior){
        T = nuevo;
    }
  }


  public void InsertaDespues(Nodo anterior,int dato){
    InsertaNodo(anterior,dato);
  }

  public void InsertaAntes(int dato){
    int datoNuevo;
    Nodo anterior = BuscaNodoAnt(dato);
    if(!existe){
      System.out.println("No existe el dato");
    }else if(anterior == null){
      datoNuevo =  Teclado.entero("Dame nuevo dato: ");
      InsertarAlPrincipio(datoNuevo);
    }else{
      datoNuevo = Teclado.entero("Dame nuevo dato: ");
      InsertaNodo(anterior, datoNuevo);
    }
  }


  public Nodo BuscaNodoAnt(int dato){
    Nodo q, anterior = null;
    existe = false;
    // Inicializa "q" con H
    for(q = H; q != null; q = q.getNextNodo()){
      if(existe = q.getDato() == dato)
        return anterior;
      anterior = q;
    }

    return null;
  }

  public Nodo Borrar(int dato){
      Nodo aux = H, anterior =  BuscaNodoAnt(dato);
      
      if(!existe){
          System.out.println("No existe el dato");
          aux = null;
      }else if(H == T){
          H = T = null;
      }else if(anterior != null){
          aux = anterior.getNextNodo();
          anterior.setNextNodo(aux.getNextNodo());
          
          if(aux == T)
              T = anterior;
      }else{
          H = H.getNextNodo();
      }
      
      return aux;
    
  }

}
