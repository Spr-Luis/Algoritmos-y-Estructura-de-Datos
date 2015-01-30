public class Estadisticas{

	private ArregloLibros arregloL;
	private ArregloAlumnos arregloA;

	public Estadisticas(){

	}
   
   public void setArregloLibros(ArregloLibros lib){
      arregloL = lib;
   }
   
   public void setArregloAlumnos(ArregloAlumnos alu){
      arregloA = alu;
   }
   
   
	//Para los libros
   
   public void ListarLibros(){
      libroMasSolicitado();
      libroMenosSolicitado();
      materiaMasSolicitada();
      materiaMenosSolicitada();
      librosPrestados();
   }
	
	public void libroMasSolicitado(){
      int pos = arregloL.posLibroMasSolicitado();
      if(pos != -1){
         System.out.println("Libro más solicitado: ");
         arregloL.Listar(pos);
      }else{
         System.out.println("Error libro más solicitado.");
      }
	}

	public void libroMenosSolicitado(){
      int pos = arregloL.posLibroMenosSolicitado();
      if(pos != -1){
         System.out.println("Libro menos solicitado: ");
         arregloL.Listar(pos);
      }else{
         System.out.println("Error libro menos solicitado.");
      }

	}

   public void materiaMenosSolicitada(){
      arregloL.materiaMenosSolicitada();
   }
	public void materiaMasSolicitada(){
      arregloL.materiaMasSolicitada();
	}

	public void librosPrestados(){
		System.out.println("\nTotal de libros prestados: "+arregloL.totalPrestamos());
	}
	//Para los alumnos

   public void ListarAlumnos(){
      numeroMujeres();
      numeroHombres();
      arregloA.promedioEdad();
      arregloA.semestreMasAlu();
      arregloA.semestreMenosAlu();

   }

	public void numeroMujeres(){
		System.out.println("Total Mujeres: "+arregloA.mujeres());
	}
	public void numeroHombres(){
      System.out.println("Total Hombres: "+arregloA.hombres());
	}
	
}