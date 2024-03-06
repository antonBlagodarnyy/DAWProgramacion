package abstracts;

public abstract class figuraGeometrica {
	private int color;
	private int lado;
	
	
	
	public figuraGeometrica(int color, int lado) {
		this.color = color;
		this.lado = lado;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public abstract double getArea();
	
}
