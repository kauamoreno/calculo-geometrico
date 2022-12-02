package calculosDeFiguras;

import java.text.DecimalFormat;

public class ClasseDrive {

	public static void main(String[] args) {
		
		//Serve para usar o formatador de numeros, para que fique só duas casas decimais
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		//Objetos inicialização
		Quadrado f1 = new Quadrado("Quadrado", 21.00);
		Triangulo f2 = new Triangulo("Triangulo", 20, 5.5);
		Circulo f3 = new Circulo("Circulo", 12.5);
		Cubo f4 = new Cubo("Cubo", 12);
		Cilindro f5 = new Cilindro("Cilindro", 2, 9.5);

		//Vetor onde será guardado os objetos inicializados
		FigurasGeometricas[] fg = new FigurasGeometricas[5];
		fg[0] = f1;
		fg[1] = f2;
		fg[2] = f3;
		fg[3] = f4;
		fg[4] = f5;

		//For Each para varrer o vetor
		for(FigurasGeometricas f : fg) {
			System.out.println("---------------------------");
			
			//Para separar somente as figuras 2D
			if(f instanceof Figuras2D) {
				//Downcast
				Figuras2D f2D = (Figuras2D) f;
				
				System.out.println("Nome: " + f2D.getNomeDaFigura());
				System.out.println("Tipo: 2D");
				System.out.println("Volume: " + formatador.format(f2D.area()));
				//System.out.println("Area: " + f2D.area());	
			}
			
			//Para separar somente as figuras 3D
			if(f instanceof Figuras3D) {
				//Downcast
				Figuras3D f3D = (Figuras3D) f;
				
				System.out.println("Nome: " + f3D.getNomeDaFigura());
				System.out.println("Tipo: 3D");
				System.out.println("Area: " + formatador.format(f3D.area()));
				System.out.println("Volume: " + formatador.format(f3D.volume()));
				//System.out.println("Area: " + f3D.area());
				//System.out.println("Volume: " + f3D.volume());	
			}
			
			System.out.println(); //Espaço
		}
		
	}
	
}
