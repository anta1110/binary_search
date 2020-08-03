import java.util.*;
import java.io.*;
import java.lang.*;


public class countOftheElement{
	
	public static int firstOccur(List<Integer> arr, int elem) {
		
        int len = arr.size();
		
		int start =0;
		int end = len -1;
		int res = -1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(elem == arr.get(mid)){
				res = mid;
				end = mid-1;
				
			}
				
			
			else if(elem < arr.get(mid))
			{
				start = mid +1;
			}
			else if(elem > arr.get(mid)) {
				end = mid -1;
				
			}
		}
		return res;
		
	}
	
public static int lastOccur(List<Integer> arr, int elem) {
	
	int len = arr.size();
	
	int start =0;
	int end = len -1;
	int res = -1;
	
	while(start<=end) {
		
		int mid = start + (end - start)/2;
		
		if(elem == arr.get(mid)){
			res = mid;
			start = mid + 1;
			
		}
			
		
		else if(elem < arr.get(mid))
		{
			start = mid +1;
		}
		else if(elem > arr.get(mid)) {
			end = mid -1;
			
		}
	}
	return res;
	
		
	}
	
	public static int countElem(List<Integer> arr, int elem) {
		
		int firstOccurance = firstOccur(arr, elem);
		int lastOccurance = lastOccur(arr,elem);
		
		int count = lastOccurance - firstOccurance +1;
		
		return count;
		
	}
	
public static void main(String args[]) {
		
		List<Integer> arr = Arrays.asList(90,77,23,23,23,23,23,23,23,23,23,23,11,7,3,1,0);
		int index = countElem(arr, 23);
		System.out.println("The count of the element is  "+ index +" number of times");
	}
}

