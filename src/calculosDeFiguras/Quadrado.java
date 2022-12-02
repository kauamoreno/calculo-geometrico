package calculosDeFiguras;

public class Quadrado extends Figuras2D {

	private double lado;
	
	//Constructor Method
	public Quadrado(String nome, double lado) {
		this.lado = lado;
		super.setNomeDaFigura(nome);
	}
	
	@Override
	public double area() {
		return Math.pow(this.lado, 2);
	}

}
