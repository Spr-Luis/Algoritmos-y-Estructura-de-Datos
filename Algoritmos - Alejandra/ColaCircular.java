
public class ColaCircular {
	//Atributos

	private int []cola;
	private int t,h;

	//Constructor

	ColaCircular(int max){
		cola=new int[max];
		t=-1;
		h=-1;	
	}
	
	//Metodos

	public boolean ValidaEspacio(){
		return !((t==cola.length-1 && h==0)||(t+1==h));
	}

	public boolean ValidaVacio(){
		return h==-1;
	}

	public void Insertar(int dato){
		if(t==-1){
			h=0;
		}else{
			if(t==cola.length-1)
				t=-1;
		}
	t++;
	cola[t]=dato;
	}

	public void Listar(){
		if(t>=h){
			for(int i=h;i<=t;i++)
				System.out.println("["+i+"]: "+cola[i]);
		}else{
			for(int i=h;i<=cola.length-1;i++)
				System.out.println("["+i+"]: "+cola[i]);
			for(int i=0;i<=t;i++)
				System.out.println("["+i+"]: "+cola[i]);
		}
	}

	public int Borrar(){
		int aux=cola[h];
		if(t==h){
			t=-1;
			h=-2;
		}else{
			if(h==cola.length-1)
				h=-1;
		}
		h++;
		return aux;
	}


}
