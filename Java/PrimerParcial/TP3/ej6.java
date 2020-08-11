public class ej6{
	public static void main(String[] args){
		Complex c1 = new Complex(12d,5);
		Complex c2 = new Complex(10);
		System.out.println(c1.equals(c2));//false
		System.out.println(c1.equals(new Complex(12,5))); //true
		System.out.println(c1.plus(c2));
		System.out.println(c1.plus(-3));
		System.out.println(c1.plus((double) -3));
	}
}
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
		return sum(r+num.r,i+num.i);
	}
	public String plus(double n1, double n2){
		return sum(r+n1,i+n2); 
	}
	public String plus(double n1){
		return sum(r+n1,i);
	}
	private String sum(double a1, double a2){
		String c = a1 + " + " +a2;
		return c;
 	}
	//@Override
	public boolean equals(Complex num){
		if (r == num.r && i == num.i) {
			return true;
		}
		return false;
	}
}