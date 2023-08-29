package lib1;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int [] nums = {10,4,5,3,20};
		
		Arrays.sort(nums);
		
		for(int n : nums)
			System.out.println(n);

	}

}
