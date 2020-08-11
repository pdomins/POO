public class ej1{
	public static void main(String[] args){
		String s1,s2;
		s1=new String("hola");
		s2=s1;
		if (s1.equals(s2)) {
		//s1="hola" s2="hola" s1==s2 son distintos xq compara pos de memoria
		//s1="hola" s2="hola" s1.equals(s2) son iguales
		//s1="hola" s2=s1 son iguales en ambos casos
			System.out.println("Son iguales");			
		}else{
			System.out.println("Son distintos");
		}
	}
}