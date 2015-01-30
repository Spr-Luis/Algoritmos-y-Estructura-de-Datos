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
  public void InsertarAlPrincipio(Alumno dato){
    Nodo q = new Nodo(dato,H);
    H = q;

    if (H == null){
      T = q;
    }

    H = q;
  }

  public void InsertarAlFinal(Alumno dato){
    if(T == null){
      InsertarAlPrincipio(dato);
    }else{
      InsertaNodo(T, dato);
    }
  }

  public void Listar(){
    Nodo i;

    for(i = H; i != null; i.getNextNodo()){
      i.getDato().Listar();
    }
  }

  public Nodo Buscar(int noCuenta){
    Nodo i = H;
    while(i != null){
      if(i.getDato().getCuenta() == noCuenta){
        return i;
      }

      i = i.getNextNodo();
    }
    return null;
  }

  public void InsertaNodo(Nodo anterior, Alumno dato){
    Nodo nuevo = new Nodo(dato, anterior.getNextNodo());
    anterior.setNextNodo(nuevo);
    if(T == anterior){
        T = nuevo;
    }
  }


  public void InsertaDespues(Nodo anterior,Alumno dato){
    InsertaNodo(anterior,dato);
  }

  public void InsertaAntes(Alumno dato){
    Alumno nuevo;
    Nodo anterior = BuscaNodoAnt(dato.getCuenta());
    if(!existe){
      System.out.println("No existe el dato");
    }else if(anterior == null){
      
      nuevo = new Alumno(Teclado.cadena("Nombre: "));
      InsertarAlPrincipio(nuevo);
    }else{
      nuevo = new Alumno(Teclado.cadena("Nombre: "));
      InsertaNodo(anterior, nuevo);
    }
  }


  public Nodo BuscaNodoAnt(int cuenta){
    Nodo q, anterior = null;
    existe = false;
    // Inicializa "q" con H
    for(q = H; q != null; q = q.getNextNodo()){
      if(existe = q.getDato().getCuenta() == cuenta)
        return anterior;
      anterior = q;
    }

    return null;
  }

  public Nodo Borrar(int cuenta){
      Nodo aux = H, anterior =  BuscaNodoAnt(cuenta);
      
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
  
  public void ActualizarNodo(Nodo pos){
   Alumno nuevo = new Alumno(Teclado.cadena("Nombre: "));
   pos.setDato(nuevo);
  }

}
