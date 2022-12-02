package calculosDeFiguras;

public class Cubo extends Figuras3D {

	private double aresta;
	
	//Constructor Method
	public Cubo(String nome, double aresta) {
		this.aresta = aresta;
		super.setNomeDaFigura(nome);
	}
	
	@Override
	public double volume() {
		return Math.pow(aresta, 3);
	}

	@Override
	public double area() {
		return Math.pow(aresta, 2)*6;
	}

}
