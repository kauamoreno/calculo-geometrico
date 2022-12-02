package calculosDeFiguras;

public class Cilindro extends Figuras3D {

	private double raio;
	private double altura;
	
	//Constructor Method
	public Cilindro(String nome, double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
		super.setNomeDaFigura(nome);
	}
	
	@Override
	public double volume() {
		return Math.PI*Math.pow(raio, 2)*altura;
	}

	@Override
	public double area() {
		return 2*Math.PI*raio*(raio + altura);
	}

}
