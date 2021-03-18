package testpackage;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrayOne[] = {"Manuel","Lima","Luna","Carolina"};
		int arrayTwo[] = {313,34,56,78};
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		numbers.add(12);
		numbers.add(34);
		numbers.add(14);
		numbers.add(17);
		for(int i = 0; i < arrayOne.length; i++) {
			System.out.println("Word is: " + arrayOne[i]);
			System.out.println(numbers.get(i));
			System.out.println(arrayTwo[i]);
			
		}
		
		

	}

}
