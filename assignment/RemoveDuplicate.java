package week4.day1.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "PayPal India";

		char [] charSet = name.toCharArray();
		Set sets = new LinkedHashSet<>();
		for(char each : charSet) {
			sets.add(each);
		}
		System.out.println(charSet);
		List<Character> lchar = new ArrayList<>(sets);
		for (char eachnew : lchar) {

			System.out.print(eachnew);

		}

	}
	}
