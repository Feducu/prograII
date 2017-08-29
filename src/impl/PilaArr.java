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
	
	public void Apilar(int x) {
		// TODO Auto-generated method stub	
		pila[indice]=x;
		indice++;		
	}
	
	public void Desapilar() {
		// TODO Auto-generated method stub
		indice--;		
	}
	
	public int Tope() {
		// TODO Auto-generated method stub
		return pila[indice-1];
	}
	
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return (indice==0);
	}
	
	

}
