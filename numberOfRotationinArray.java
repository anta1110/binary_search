import java.util.*;

public class numberOfRotationinArray{
	
	public static int findRotation(List<Integer> arr ) {
		
		int start =0;
		int end = arr.size() - 1;
		
		if(arr.get(start)<= arr.get(end))
			return start;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			int next = (mid +1) %end;
			int prev = (mid -1 +end)%end;
			
			if(arr.get(mid) <= arr.get(next) && arr.get(mid) <= arr.get(prev))
				return mid;
			
			else if(arr.get(mid) <= arr.get(end))
			   end = mid -1;
			
			else if(arr.get(mid) >= arr.get(end))
				start = mid +1;
		}
		
		return -1;
				
	}

	
	public static void main(String args[]) {
		
		List<Integer> arr = Arrays.asList(90,77,23,0,2,6,45);
		int numRot = findRotation(arr);
		
		System.out.println("The number of rotation is "+numRot);
		
		
 	}
}