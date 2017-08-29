package api;

public interface ColaTDA {
	
	void InicializarCola() ;
	
	void acolar(int x) ;
	
	void desacolar();
	
	boolean ColaVacia();
	
	int primero();

}
