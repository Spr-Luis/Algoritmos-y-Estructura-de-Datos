public class Biblioteca{

	public static void main(String []args){

      // Variables Auxiliares
		int aux,opcion,tamano;
      Libro book ;
      Alumno aln;
      
      // Arreglo de Libros
      ArregloLibros libs = new ArregloLibros(10);
		String nom,con;
      
      ArregloAlumnos alums = new ArregloAlumnos(10);
      //Arreglo de Alumnos
		System.out.println("*----Bienvenido a la Biblioteca----*\n");

			do{
				opcion=Menu.DesplegarMenu("\n1) Iniciar Sesion\n2) Salir\n\nOpcion: ",2);
				switch(opcion){
					case 1:
						nom=Teclado.cadena("\nEscriba su nombre de usuario: ");
						con=Teclado.cadena("Escriba su contrasenha: ");
							if(InicioSesion.SuperUsuario(nom,con)){
								System.out.println("\nBienvenido SUPERUSUARIO\n*----Menu Super Usuario----*");
								int opc1;
                                do{
                                    opc1=Menu.DesplegarMenu("1) Libros \n2) Alumnos \n3)Salir\nOpcion: ",3);
                                    switch(opc1){
                                        case 1:
                                            int libOpc;
                                            do{
                                                int pos;
                                                libOpc= Menu.DesplegarMenu("\n Sistema de Libros: \n1) Agregar Libro\n2) Listar Libros\n3) Buscar Libro por Serie\n4) Actualizar Libro\n5) Borrar Libro\n\n Sistema de Estadisticas: \n6) Estadisticas Libros \n\t7)Salir\nOpcion: ",7);
                                                switch(libOpc){
                                                    case 1:
                                                        if(libs.Validar()){
                                                            book = new Libro();
                                                            libs.Insertar(book);
                                                        }else{
                                                            System.out.println("\n\tBiblioteca llena.");
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Los libros guardados en el sistema son: \n");
                                                        libs.Listar();
                                                        break;
                                                    case 3:
                                                        pos = libs.BuscarDato(Teclado.entero("Numero de serie del libro: "));
                                                        if(pos != -1)
                                                            libs.Listar(pos);
                                                        else
                                                            System.out.println("No se encontro el libro.");
                                                        break;
                                                    case 4:
                                                        pos = libs.BuscarDato(Teclado.entero("Serie: "));
                                                        if(pos != -1){
                                                            libs.Listar(pos);
                                                            libs.Actualizar(pos);
                                                        }else{
                                                            System.out.println("No se encontro el libro.");
                                                        }
                                                        break;
                                                    case 5:
                                                        pos = libs.BuscarDato(Teclado.entero("Numero de serie del libro a borrar: "));
                                                        if(pos!=-1)
                                                            libs.Borrar(pos);
                                                        else
                                                            System.out.println("No se encontro el libro.");
                                                    break;
                                                    
                                                    case 6:
                                                    
                                                    if(alums.getIndice() != -1){
                                                      Estadisticas edi = new Estadisticas();
                                                      edi.setArregloAlumnos(alums);
                                                      edi.ListarAlumnos(); 
                                                    }else{
                                                      System.out.println("Aun no hay estadisticas.");
                                                    }
                                             
                                                    
                                                                                                         
                                                    break;
                                
                                                }
                                            }while(libOpc != 7);
                                            break;
                           
                                        case 2:
                                        int aluOpc;
                                            do{
                                                int pos;
                                                aluOpc= Menu.DesplegarMenu("\n Sistema de Alumnos: \n1) Dar de alta a un Alumno\n2) Listar Alumnos\n3) Buscar Alumno por n° de cuenta\n4) Actualizar Alumno\n5) Borrar Alumno\n\n Sistema de Estadisticas: \n6) Estadisticas Alumnos\n\t7) Salir\nOpcion: ",7);
                                                switch(aluOpc){
                                                    case 1:
                                                    
                                                       nom=Teclado.cadena("\nEscriba un nombre de usuario: ");
						                                    con=Teclado.cadena("Escriba una contrasenha: ");
						                                    if(InicioSesion.Verificar(nom)){
					                                 		   System.out.println("Nombre de usuario activo. Intente otro");
					                                      	}else{
						                                 	   Alumno alu = InicioSesion.Registrar(nom,con);
                                                         if(alums.Validar()){
                                                            alums.Insertar(alu);
                                                        }else{
                                                            System.out.println("\n\tCupo lleno.");
                                                        }
						                                    }
                                                        break;
                                                    case 2:
                                                        System.out.println("Los alumnos guardados en el sistema son: \n");
                                                        alums.Listar();
                                                        break;
                                                    case 3:
                                                        pos = alums.BuscarDato(Teclado.entero("Numero de cuenta: "));
                                                        if(pos != -1)
                                                            alums.Listar(pos);
                                                        else
                                                            System.out.println("No se encontro el alumno.");
                                                        break;
                                                    case 4:
                                                        pos = alums.BuscarDato(Teclado.entero("Numero de cuenta: "));
                                                        if(pos != -1){
                                                            alums.Listar(pos);
                                                            alums.Actualizar(pos);
                                                        }else{
                                                            System.out.println("No se encontro el alumno.");
                                                        }
                                                        break;
                                                    case 5:
                                                        pos = alums.BuscarDato(Teclado.entero("Numero de cuenta del alumno a borrar: "));
                                                        if(pos!=-1)
                                                            alums.Borrar(pos);
                                                        else
                                                            System.out.println("No se encontro el alumno.");
                                                    break;
                                                    
                                                    case 6:
                                                    
                                                    if(alums.getIndice() != -1){
                                                      Estadisticas edi = new Estadisticas();
                                                      edi.setArregloAlumnos(alums);
                                                      edi.ListarAlumnos(); 
                                                    }else{
                                                      System.out.println("Aun no hay estadisticas.");
                                                    }
                                                    
                                                    break;
                                
                                                }
                                            }while(aluOpc != 7);
                                            break;

                                    }
                                }while(opc1 != 3);
                        
                            }else{
								if(InicioSesion.VerificarInicio(nom,con)){
									System.out.println("\nBienvenido al sistema "+nom);
                           System.out.println("\n\nSistema de prestamos de libros...");
                           //Buscamos al alumno en el sistema
                           int posAlu = alums.BuscarPorNombre(nom);
                           if(posAlu != -1){
                              //Existe Alumno
                              int opcAlumn;
                              do{
                                 opcAlumn = Menu.DesplegarMenu("1) Prestamo \n2)Salir\nOpcion: ",2);
                                 if(opcAlumn == 1){
                                    int serie = Teclado.entero("Numero de Serie: ");
                                    int pos = libs.BuscarDatoPrestamo(serie);
                                  if(pos != -1){
                                       System.out.println("Solicitud Aceptada");
                                       libs.Listar(pos);
                                       alums.addPrestamo(posAlu);
                                    }else{
                                      System.out.println("No se encontro el libro.");
                                    }
                                 }
                     
                              }while(opcAlumn != 2);
                           }else{
                              // No existe Alumno
                              System.out.println("No existe el alumno en arreglo, contactar al SuperUsuario.");
                           }
                           
                            
                     
                     
                           
								}else{
									System.out.println("Error en el inicio de sesion");
								}
							}
                     
					break;
					case 2:
						System.out.println("Hasta luego");	

					break;

				}
			}while(opcion != 2);

	}
}