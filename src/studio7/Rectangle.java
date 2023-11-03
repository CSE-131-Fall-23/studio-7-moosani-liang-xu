package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 5.0;
		width = 5.0;
	}
	
	public Rectangle(double inputLength, double inputWidth)
	{
		length = inputLength;
		width = inputWidth;
	}
	
	public double getPerimeter()
	{
		return (2*length) + (2*width);
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public boolean isSquare()
	{
		return length == width;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle test = new Rectangle(6.0,6.0);
		System.out.println(test.getPerimeter());
		System.out.println(test.getArea());
		System.out.println(test.isSquare());
		System.out.println(test.toString());

	}

}
