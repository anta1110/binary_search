import java.util.*;
import java.io.*;
import java.lang.*;

public class binaryReverse{
	
	public static int funcFindElem(List<Integer> arr, int target) {
		
		int len = arr.size();
		
		int start =0;
		int end = len -1;
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(target == arr.get(mid))
				return mid;
			
			else if(target < arr.get(mid))
			{
				start = mid +1;
			}
			else if(target > arr.get(mid)) {
				end = mid -1;
				
			}
		}
		return -1;
		
	}
	
	
	public static void main(String args[]) {
		
		List<Integer> arr = Arrays.asList(90,77,54,23,12,11,7,3,1,0);
		int index = funcFindElem(arr, 7);
		System.out.println("Element is found at location"+index);
	}
}