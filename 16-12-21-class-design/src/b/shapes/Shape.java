package b.shapes;

public class Shape {
	
	private String color;
	

	public Shape(String color) {
		super();
		this.color = color;
	}
		
	public Shape() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return -1;
		
		
		//no se como calcular el area de distintas formas, pero declaro el metodo
		//para que este presente, y le doy el valor -1 entre tanto porque no se
		//aun como calcularlo
	}

}
