package org.generation;

class MiHilo2 implements Runnable {

	private String name;
	private long id;
	
	public MiHilo2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return Thread.currentThread().getId();
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

public class ThreadWithRunnable{
	public static void main(String[] args) {
		Thread hilo01 = new Thread(new MiHilo2("#1"));
		Thread hilo02 = new Thread(new MiHilo2("#2"));
		Thread hilo03 = new Thread(new MiHilo2("#3"));
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
	}
}
