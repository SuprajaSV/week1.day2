package week1.day2;

public class Intersection {






	public static void main(String[] args) {
		
		int arra1[]= {1,3,5,7,9,11};
		int arra2[]= {11,5,8,4,9,7};
		System.out.println("Intersection ");
		for(int i=0;i<arra1.length;i++) {
			for(int j=0;j<arra2.length;j++) {
				if(arra1[i] ==arra2[j]) {
					System.out.println(arra2[j]);
				}
			}
		}
        
	}

}