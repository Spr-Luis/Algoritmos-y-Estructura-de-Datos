import java.util.Random;

class ProcesoAleatorio{


    private static int numeroAleatorio(){
      Random rnd = new Random();
      return (int) (rnd.nextDouble()*10);
   }
   
   public static boolean otroProceso(){
      int num = numeroAleatorio();
      if ( num >= 0 && num <= 4){
         return true;
      }else{
         return false;
      }
   } 

}