package calculosDeFiguras;

public class Triangulo extends Figuras2D {

	private double base;
	private double altura;
	
	//Constructor Method
	public Triangulo(String nome, double base, double altura) {
		this.altura = altura;
		this.base = base;
		super.setNomeDaFigura(nome);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.base * this.altura)/2;
	}

}
