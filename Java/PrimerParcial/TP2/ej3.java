public class ej3{
	public static void main (String[] args){
		int length=args.length;
		//String[] words = new String[length];
		for (int i = 0; i < length ;i++) {
			for (int j = 0; j < args[i].length();j++) {
				System.out.print(args[i].charAt(j));
				if (args[i].length() != j+1 ) {
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}
}