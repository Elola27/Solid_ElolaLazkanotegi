package OCP;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	Vector<Figure> figures=new Vector<>();
	
	public void addFigure(Figure s) {
		figures.add(s);
	}
	
	public void drawFigures() {
		Enumeration<Figure> efigures=figures.elements();
		Figure f;
		while (efigures.hasMoreElements()) {
			f=efigures.nextElement();
			f.draw();
		}
	}
	
	public void calculateAreas() {
		Enumeration<Figure> efigures=figures.elements();
		Figure f;
		while (efigures.hasMoreElements()) {
			f=efigures.nextElement();
			System.out.println("Area: " + f.getArea());
		}
	}
} 
