class Main{

	public static void main(String []args){
        
        ColaCircularLSE cc = new ColaCircularLSE();
        System.out.println("\nBienvenido a este progrma\n");
        int pro=Teclado.entero("\nIngresa el numero de procesos: ");
        int pag=Teclado.entero("\nIngresa cuAntas pAginas se procesarAn por ciclo: ");
        
        System.out.println("Procesos iniciales creados:");
        for(int i=0;i<pro;i++){
            Proceso inicial = new Proceso();
            inicial.listarProceso();
            cc.insertar(inicial);
        }
        
        System.out.println("\nSe han creador los procesos! Iniciaran los procesos...\n");
            
        while(!cc.estaVacia()){
        System.out.println("Se saca proceso: ");
         Proceso aux = cc.borrar();
         System.out.println(">>>>>>>>>>>");
         aux.listarProceso();
         System.out.println(">>>>>>>>>>>");
         //cc.listar();
         if(aux.regresaNodo(pag)){
            cc.insertar(aux);
         }else{
            System.out.println("Proceso terminado: ");
            aux.listarProceso();
            if(ProcesoAleatorio.otroProceso()){
               Proceso nuevoProceso = new Proceso();
               System.out.println("Nuevo Proceso: ");
               nuevoProceso.listarProceso();
               cc.insertar(nuevoProceso);
            }else{
               System.out.println("No se creo proceso.");
            }
            
         }
         System.out.println("Inicia Listar");
         cc.listar();
         System.out.println("Termina Listar");
         
        }
    
	}

}
