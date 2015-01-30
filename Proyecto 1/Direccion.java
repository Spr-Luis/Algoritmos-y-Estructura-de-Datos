class Direccion{

   // Atributos
   private int num;
   private String calle;
   private int cp;
   private String colonia;


   // Metodos
   public void Capturar(){
      System.out.println("Escribir direccion...");
      CapturaCalle();
      CapturaNum();
      CapturaColonia();
      CapturaCP();
   }
   
   private void CapturaCalle(){
      calle = Teclado.cadena("Calle: ");
   }
   
   private void CapturaNum(){
      num = Teclado.entero("Numero: ");
   }
   
   private void CapturaCP(){
      cp = Teclado.entero("Codigo Postal: ");
   }
   
   private void CapturaColonia(){
      colonia = Teclado.cadena("Colonia: ");
   }
   public void Listar(){
      System.out.println("-Calle: "+calle+"\n-Numero: "+num+"\n-Colonia:"+colonia+"\n-Codigo Postal: "+cp);
   }
   
   public void Actualizar(){
      //Menu
      int opc;
      //Menu menu = new Menu();
      
      do{
         do {
            opc = Teclado.entero("Actualizar Direccion:\n1) Calle\n2) Numero\n3) Codigo Postal\n4) Colonia\n5) Salir\nOpcion: ");
            if (opc < 1 || opc > 5)
               System.out.println("Opncion no valida ");
   
         }while (opc < 1 || opc > 5);
         System.out.println("Actualizar:");
         switch(opc){
            case 1:
               CapturaCalle();
               break;
            case 2:
               CapturaNum();
               break;
            case 3:
               CapturaCP();
               break;
            case 4:
               CapturaColonia();
               break;
         }
      
      }while(opc != 5);
      
   }
}