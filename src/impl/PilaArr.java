package impl;

import api.PilaTDA;

public class PilaArr implements PilaTDA {
	int[] pila;
	int indice;
	
	public void InicializarPila() {
		// TODO Auto-generated method stub
		pila = new int[100];
		indice=0;
	}

	
	public void apilar(int x) {
		// TODO Auto-generated method stub	
		indice++;
		pila[indice]=x;
		
		
	}

	
	public void desapilar() {
		// TODO Auto-generated method stub
		indice--;
		
	}

	
	public int tope() {
		// TODO Auto-generated method stub
		return pila[indice];
	}

	
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		if(indice!=0)
			return false;
		else
			return true;
	}
	
	

}
