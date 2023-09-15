package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,6,6,7,3,8,10};
		int length = data.length;
		Set<Integer> unique = new TreeSet<Integer>();
		for (int i=0; i<data.length;  i++){
			unique.add(data[i]);
		}
		System.out.println(unique);
		
		for (int i=1; i<length; i++) 
		{
			if(!unique.contains(i))
			{
				System.out.println("missing number is "+i );
			}
		}
	    }
		}

