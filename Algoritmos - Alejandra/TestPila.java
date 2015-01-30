
public class TestPila {
	public static void main (String []args){
		Pila obj = new Pila (3); 
		if (obj.ValidaEspacio())
			obj.Push(100);
		//obj.Listar();
		
		if (obj.ValidaEspacio())
			obj.Push(200);
		//obj.Listar();
		
		if (obj.ValidaEspacio())
			obj.Push(300);
		//obj.Listar();
		
		System.out.println("El dato borrado es:"+obj.Pop());
		obj.Listar();
		
	}
}
