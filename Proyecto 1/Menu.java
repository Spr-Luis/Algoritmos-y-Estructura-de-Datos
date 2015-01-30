class Menu{
	public static int DesplegarMenu(String texto, int maxopc){
	int opcion;
		do{
			opcion=Teclado.entero(texto);
			if(opcion<1 || opcion>maxopc)
				System.out.println("error, opcion no valida");
			}while(opcion<1 || opcion>maxopc);
			return opcion;
}
}
