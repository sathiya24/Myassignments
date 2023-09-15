package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		int len = array.length;
		System.out.println(len);
		List<String> arrayList = new ArrayList<>();
		for (String each:array) {
			arrayList.add(each);
			Collections.sort(arrayList);
			System.out.println("The sorted list is "+arrayList);
		}
		
		List<String> desOrder = new ArrayList<>();
		for(int i=arrayList.size()-1;i>=0; i--) {
			desOrder.add(arrayList.get(i));
		}
		System.out.println(desOrder);

	}

}
