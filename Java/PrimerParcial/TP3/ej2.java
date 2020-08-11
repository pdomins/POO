public class ej2{
	public static void main(String args[]){
		String s = "hola";
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
		System.out.println(s.getClass().equals(String.class));
		System.out.println(s.getClass().equals(Object.class));
		System.out.println(s.getClass());
		System.out.println(s.getClass());
	}
	//instanceof devuelve un boolean que dice si el elemento
	//pertenece a la clase que estoy diciendo
	//getClass devuelve a q clase pertenece un elemento
}