public class circle {
	double radius;
	String color;

	public circle (){
	

		radius = 2.0;
		color = "pink";
	}
	public  circle (double r){
		radius = r;
		color = "pink";
	}
	public  circle (double r, String c){
		radius = r;
		color = c;
	}
	public double getRadius () {
		return radius;
	}
	public  String getColor () {
		return color;
	}
	public  double getArea () {
		return radius*radius*Math.PI;
	}	
}