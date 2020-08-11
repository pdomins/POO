public class ej7{
	public static void main (String[] args){
		int length=args.length;
		int[] nums = new int[11];
		for (int i = 0; i < length ;i++){
			int num = Integer.parseInt(args[i]);
			if (num==100) {
				nums[10]++;
			}else if (num >= 10) {
				num/=10;
				nums[num]++;
			}else{
				nums[0]++;
			}
		}
		for (int i = 0; i < 11 ; i ++ ) {
			System.out.print(i+"0 ");
			for (int j = 0; j < nums[i] ;j++ ) {
					System.out.print("X");
				}
				System.out.println();
				System.out.println("*****");
		}
	}
}