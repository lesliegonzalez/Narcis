package guiedani;

public class TestCafe {

	public static void main(String[] args) {

		System.out.println("No. de bolsas de café vendidas: " + Cafe.numProduc);
		
		Cafe cafeChiapas = new Cafe("Chiapas", "molido", "oscuro", 480, 139);
		System.out.println(cafeChiapas.informacion());
		
		System.out.println("No. de bolsas de café vendidas: " + Cafe.numProduc);
		
		Cafe cafeOaxaca = new Cafe("Oaxaca", "en grano", "medio", 900, 320);
		System.out.println(cafeOaxaca.informacion());
		
		System.out.println("No. de bolsas de café vendidas: " + Cafe.numProduc);
		
		Cafe cafeQueretaro = new Cafe("Querétaro", "molido", "medio oscuro", 250, 105);
		System.out.println(cafeQueretaro.informacion());
		
		System.out.println("No. de bolsas de café vendidas: " + Cafe.numProduc);
	}

}
