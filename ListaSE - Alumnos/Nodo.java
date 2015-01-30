class Nodo{
  // Atributos
  private Alumno dato;
  private Nodo next;

  // Constructor
  public Nodo(Alumno dato, Nodo nextNodo){
    this.dato =  dato;
    next = nextNodo;
  }

  // Metodos
  public void setDato(Alumno dato){
    this.dato = dato;
  }

  public Alumno getDato(){
    return dato;
  }

  public void setNextNodo(Nodo s){
    next = s;
  }

  public Nodo getNextNodo(){
    return next;
  }
}
