import java.util.*;
import java.io.*;
import java.lang.*;

public class firstAndLastOccurance{
	
	public static int funcFindElem(List<Integer> arr, int target) {
		
		int len = arr.size();
		
		int start =0;
		int end = len -1;
		int res = -1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(target == arr.get(mid)){
				res = mid;
				end = mid-1;
				
			}
				
			
			else if(target < arr.get(mid))
			{
				start = mid +1;
			}
			else if(target > arr.get(mid)) {
				end = mid -1;
				
			}
		}
		return res;
		
	}
	
	
	public static void main(String args[]) {
		
		List<Integer> arr = Arrays.asList(90,77,23,23,23,11,7,3,1,0);
		int index = funcFindElem(arr, 23);
		System.out.println("the first occurance is at location "+index);
	}
}