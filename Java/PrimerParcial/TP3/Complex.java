package numbers;
public class Complex{

	private final double r, i;
 
	public Complex(double r, double i){
		this.r = r;
		this.i = i;
	}
	public Complex(double r){
		this.r = r;
		this.i = 0;
	}
	public double getReal(){
		return r;
	}
	public double getIm(){
		return i;
	}
	public String plus(Complex num){
		double a = r+num.r, b = i+num.i;
		String c =a+" + "+b;
		return c; 
	}
	public String plus(double n1, double n2){
		double a = r+n1, b = i+n2;
		String c =a+" + "+b;
		return c; 
	}
	public String plus(double n1){
		double a = r+n1;
		String c =a+" + "+i;
		return c;  // se puede hacer de alguna forma sin la necesidad de sobreeescribir la misma funcion tantas veces?
	}
	//@Override
	public boolean equals(Complex num){
		if (r == num.r && i == num.i) {
			return true;
		}
		return false;
	}
}