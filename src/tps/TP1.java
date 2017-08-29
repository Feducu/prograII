package tps;

import api.PilaTDA;
import impl.PilaArr;


public class TP1	{
	public static void main(String[] args) {
		PilaArr p=new PilaArr();
		p.InicializarPila();
		p.Apilar(5);
		PilaArr p1=new PilaArr();
		p1.InicializarPila();


		TP1.PasarPila(p,p1);

	}
	//EJ1
	public static void PasarPila(PilaTDA origen, PilaTDA destino){
		while (!origen.PilaVacia()){
			destino.Apilar(origen.Tope());
			origen.Desapilar();
		}
	}
}