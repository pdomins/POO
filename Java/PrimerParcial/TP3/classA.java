public class classA{
	public static void method(Number n){
		System.out.println("ClassA: "+n+" "+n.getClass());
	}
	public static void main(String args[]){
		classA a = new classB();
		a.method(3);

		//classB b = new classA();
		//classA cannot be converted to classB
		//b.method(3);

		classB b = new classB();
		b.method(3);
	
		classB c = new classB();
		c.method((Number)3);//devuelve classA

		classB d = new classB();
		classA e = (classA)d;
		e.method(3);

		classB f = new classB();
		classA h = (classB)f;
		f.method(3);
	}

}
public class classB extends classA {
	public static void method(Integer d){
		System.out.println("ClassB: "+d+" "+d.getClass());
	}
}