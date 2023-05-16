

public class Test {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
		llenar(arbol);         
		
		System.out.println("---- BUSQUEDA HEURISTICA Primero el mejor -----");
		primeroElMejor(arbol);
        
		System.out.println("---- BUSQUEDA EXHAUSTIVA Primero en profundidad -----");
		enProfundidad(arbol);    

	}
	
	public static void llenar(Arbol a) {
		int x, i;
		for (i = 0; i <= 6; i++) {
			if (i % 2 != 0)
				x = -i;
			else 
				x = i;
			a.insertar(x);
		}
	}
	
	public static void primeroElMejor (Arbol a) {
		boolean existe = a.busquedaHeuristica(6);
        if (existe)
        	System.out.println("Meta alcanzada");
        else
        	System.out.println("Meta no alcanzada");
	}
	
	public static void enProfundidad (Arbol a) {
		boolean existe = a.busquedaExhaustiva(6);
		 if (existe)
	        	System.out.println("Meta alcanzada");
	        else
	        	System.out.println("Meta no alcanzada");
	}

}
