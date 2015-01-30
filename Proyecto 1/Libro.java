public class Libro{

   // Atributos
   private String titulo;
   private String autor;
   private String materia;
   
   private int cuentaPrestamos;
   private int numeroSerie;
   private int noPaginas;
   
   //Constructor
   
   public Libro(){
         CapturaTitulo();
         CapturaAutor();
         CapturaMateria();
         CapturaSerie();
         CapturaPaginas();
         cuentaPrestamos = 0;
   }
   
   //Metodos
   public void CapturaTitulo(){
      titulo = Teclado.cadena("Titulo del Libro: ");
   } 
   
   public void CapturaAutor(){
      autor = Teclado.cadena("Nombre del Autor: ");
   }
   
   public void CapturaMateria(){
      materia = Teclado.cadena("Materia relacionada al libro: ");
   }
   
   public void CapturaSerie(){
      numeroSerie = Teclado.entero("No. de Serie: ");
   }
   
   public void CapturaPaginas(){
      noPaginas = Teclado.entero("No de Paginas: ");
   }
   
   public void agregaPrestamo(){
      cuentaPrestamos ++ ;
   }
   
   public int getCuentaPrestamo(){
      return cuentaPrestamos;
   }
   
   public String getMateria(){
      return materia;
   }
   
   public int getNumeroSerie(){
      return numeroSerie;
   }

   public void Actualizar(){
   int caso;
      do{
         caso=Menu.DesplegarMenu("Elija una opcion: \n1) Actualizar Titulo\n2) Actualizar Autor\n3) Actualizar Materia\n4) Actualizar # Serie\n5) # Paginas\n6) Salir\nOpcion: ",6);
            switch(caso){
               case 1:
                 CapturaTitulo();
               break;
               case 2:
                  CapturaAutor();   
               break;
              case 3:
                  CapturaMateria();
               break;
               case 4:
                  CapturaSerie();
               break;
               case 5:
                  CapturaPaginas();
              break;
               case 6:
                  System.out.println("Opcion no valida");
            }
      }while(caso!=6);

   }

   public void Listar(){
      System.out.println(titulo + ". "+ autor + ". "+ noPaginas + " paginas. # Serie "+ numeroSerie);
      System.out.println("Materia: "+materia + ", "+cuentaPrestamos+" prestamos.");
   }
   
}