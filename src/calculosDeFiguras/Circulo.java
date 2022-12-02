package calculosDeFiguras;

public class Circulo extends Figuras2D {

	private double raio;
	
	//Constructor Method
	public Circulo(String nome, double raio) {
		this.raio = raio;
		super.setNomeDaFigura(nome);
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

}
