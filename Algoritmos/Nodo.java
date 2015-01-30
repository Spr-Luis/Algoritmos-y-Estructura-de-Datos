class Nodo{
  // Atributos
  private int dato;
  private Nodo next;

  // Constructor
  public Nodo(int dato, Nodo nextNodo){
    this.dato =  dato;
    next = nextNodo;
  }

  // Metodos
  public void setDato(int dato){
    this.dato = dato;
  }

  public int getDato(){
    return dato;
  }

  public void setNextNodo(Nodo s){
    next = s;
  }

  public Nodo getNextNodo(){
    return next;
  }
}
