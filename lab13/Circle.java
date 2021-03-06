package Lab13;

public class Circle
{
	private double radius;
	
	public Circle(double r)
	{ setRadius(r); }

	public double area()
	{ return Math.PI * Math.pow(radius, 2); }
	
	public double getRadius()
	{ return radius; }

	public void setRadius(double r)
	{ radius = r; }

	@Override
	public String toString()
	{		
		return ("Radius: " + radius);
	}
}
