class Pila{
    private final int MAXIMO;
    private int[] V;
    private int tope;

    public Pila(int max) {
        MAXIMO = max;
        this.V = new int[max];
        this.tope = -1;
    }

    public boolean esVacia() {
        return tope == -1;
    }

    public boolean esLlena() {
        return tope == MAXIMO - 1;
    }

    public void apilar(int a) {
        if (esLlena()) {
            System.out.println("Pila Llena!");
        } else {
            tope++;
            V[tope] = a;
        }
    }

    public int desapilar() {
        int a = Integer.MIN_VALUE;
        if (esVacia()) {
            System.out.println("Pila Vacia!");
        } else {
            a = V[tope];
            tope--;
        }
        return a;
    }

    public void vaciar(Pila B) {
        while (!B.esVacia()) {
            this.apilar(B.desapilar());
        }
    }

    public int tamanio() {
        return tope + 1;
    }
    public int cima() {
        return V[tope];
    }

    public void Listar() {
        Pila X = new Pila(MAXIMO);
        while (!esVacia()) {
            int a = desapilar();
            System.out.println(" " + a);
            X.apilar(a);
        }
        this.vaciar(X);
    }
}
