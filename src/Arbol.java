


class Arbol {
    private Nodo raiz;

    public Arbol() {

    }

    public boolean busquedaHeuristica(int busqueda) {
        return busquedaHeuristica(this.raiz, busqueda);
    }

    private boolean busquedaHeuristica(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }else 
        	System.out.println("Nodo "+n.getDato());
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return busquedaHeuristica(n.getIzquierda(), busqueda);
        } else {
            return busquedaHeuristica(n.getDerecha(), busqueda);
        }

    }
    
    public boolean busquedaExhaustiva(int busqueda) {
        return busquedaExhaustiva(this.raiz, busqueda);
    }
    
    public Boolean busquedaExhaustiva(Nodo n, int meta){
    	Boolean e = false;
        
    	if (n != null) {
    		
    		int actual = n.getDato();
	        System.out.println("Nodo " + actual);
	        
	        if (actual == meta) //si el nodo actual es igual a la meta
	        	e = true; 
    		else { //si el nodo actual no es igual a la meta
    			if (!e)
	        		e = busquedaExhaustiva(n.getIzquierda(), meta);
    			if (!e)
		        	e = busquedaExhaustiva(n.getDerecha(), meta);	
    		}
	        
    	}
    	return e;
    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }
    
    
}

