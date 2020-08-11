public class PrintTester{
	public static void main(String[] args){
		A a = new A();
		a.print(3);
		a.print(3.14);
		a.print((Number)3);
		a.print((Object)3);
		System.out.println();
		A b1= new B();
		b1.print(3.14);
		b1.print("Hola");
		b1.print((Number)3);
		b1.print((Object)3);
		System.out.println();
		B b2= new B();
		b2.print(3.14);
		b2.print("Hola");
		b2.print((Number)3);
		b2.print((Object)3);
	}
}
public class A{
	static final String MESSAGE = "clase %s: Imprime %s %s que es de tipo %s";
	public void print(Object obj){
		System.out.println(String.format(MESSAGE,"A","Object",obj,obj.getClass()));
		}
	public void print(Number num){
		System.out.println(String.format(MESSAGE,"A","Number",num,num.getClass()));
		}
	public void print(Integer num){
	System.out.println(String.format(MESSAGE,"A","Integer",num,num.getClass()));
		}
}
public class B extends A{
	public void print(Number num){
		System.out.println(String.format(MESSAGE,"B","Number",num,num.getClass()));
	}
}