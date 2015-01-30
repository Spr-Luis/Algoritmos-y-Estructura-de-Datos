public class Alumno {
		 
	    private int cuenta;
	    private String nombre;
	    private int genero;
	    private int edad;
	    private int semestre;
       
       private int prestamosAlumno;
	    	        

	    public Alumno (String name){
            nombre = name;
	    	   //capturaNombre();
	        capturaCuenta();
	        capturaSemestre();
	        capturaGenero();
	        capturaEdad();   
           prestamosAlumno = 0;
	    }

	    public void capturaCuenta(){
	        
	        cuenta = Teclado.entero("Introduce el numero de cuenta: ");
	    }
	    

	    public void capturaNombre(){
	        
	        nombre = Teclado.cadena("Introduce el nombre: ");
	    }


		public void capturaGenero(){
            genero = Menu.DesplegarMenu("Genero: \n1)Masculino \n2)Femenino",2);				
		}
		public void capturaEdad(){
			edad=Teclado.entero("Edad: ");
		}
	 
      public String getNombre(){
	    	return nombre;
	    }

	    public int getCuenta(){
	          return cuenta;
	    }
	    public int getEdad(){
	    	return edad;
	    }
       
       public String getGenero(){
         if(genero == 1)
            return "Masculino";
         else
            return "Femenino";
       }
       
	    public void capturaSemestre(){
	    	semestre=Menu.DesplegarMenu("Selecciona Semestre: \n 1º,2º,3º,4º,5º,6º,7º,8º,9º  ",9);
	    }
       
	    public int getSemestre(){
	    	return semestre;
	    }
         
       public void agregarPrestamo(){
         prestamosAlumno++;
       }  
	    
	    public void Listar(){
			System.out.println("-No. de cuenta: "+cuenta+"\n-Nombre: "+nombre+"\n-Genero: "+getGenero()+"\n-Edad: "+edad+"\nSemestre: "+semestre);
			
		}
	    
	    public void Actualizar(){
	        int caso; 
	        do{
	        	caso = Menu.DesplegarMenu("¿Que deseas modificar? \n 1) No. cuenta \n 2)Nombre\n 3)Salir\n nOpcion: ",3);
	            switch(caso){
	                case 1:
	                    capturaCuenta();
	                    break;
	                case 2:
	                    capturaNombre();
	                    break;
	                case 3:
	                   System.out.println("\nSaliendo...\n");
	                    break;
	         
	                default:
	                    System.out.println("\nOpcion Invalida\n");
	            }
	        }while(caso != 4);
	    } 
	    
       
}
