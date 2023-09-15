package week4.day1.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sathiyanarayanan";
		char [] ch = str.toCharArray();
		
		Set sets = new LinkedHashSet<>();
		for (char eachchar : ch) {
			sets.add(eachchar);
			}
		System.out.println(str);
		
		List<Character> liword = new ArrayList<>(sets);
		
		for (char uni : liword) {
			System.out.print(uni);
			
		}
	}

}
