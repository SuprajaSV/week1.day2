package week1.day2;

public class OddIndexUpperCase {



	public static void main(String[] args) {
		
		String word = "supraja";
		char[] arr =word.toCharArray();
		int length = arr.length;
		System.out.println("odd index are: ");
		for (int i =0;i<length;i++) {
			if(i%2==0) {
				arr[i]=Character.toUpperCase(arr[i]);
				System.out.println("arr["+i+"] = "+arr[i]);
			}
		}

	}

}