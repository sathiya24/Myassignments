package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLarges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> unique = new TreeSet<Integer>();
		for (int i=0; i<data.length;  i++){
			unique.add(data[i]);
		}
		System.out.println(unique);
		List<Integer> Seclargest = new ArrayList<>(unique);
		int size = Seclargest.size();
		System.out.println(size);
		int secLar = Seclargest.get(size-2);
		System.out.println("The second largest number is "+ secLar);
		

		
		

	}

}
