package OCP;

public class Circle extends Figure {
	
	float diameter;
	
	@Override
	public float getArea() {
		return (float)(Math.PI*Math.pow(diameter, 2));
	}

}
