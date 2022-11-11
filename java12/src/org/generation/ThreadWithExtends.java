package org.generation;

class MiHilo extends Thread{
	
	public MiHilo(String nombreHilo){
		super(nombreHilo);
	}
	
	@Override
	public void run() {
		System.out.printf("%nHilo iniciado: %s - ID: %d ", this.getName(), this.getId());
		
		try {
			for (int i=1; i<6; i++) {
				Thread.sleep(1000); //Suspende el hilo por un tiempo determinado, en milisegundos.
				System.out.printf("%nEl %s cuenta %d", this.getName(), i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%nHilo finalizado: %S - ID: %d", this.getName(),this.getId());
		
	}
}

public class ThreadWithExtends {
	public static void main(String[] args) {
		System.out.println("Multihilo con herencia");
		System.out.println("Número de ID del método main: " +Thread.currentThread().getId());
		
		MiHilo hilo01 = new MiHilo("#1");
		MiHilo hilo02 = new MiHilo("#2");
		MiHilo hilo03 = new MiHilo("#3");
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
	}
}
