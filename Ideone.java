import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static List<Integer> SecondCount(List<Integer> list){
		List<Integer> li = new ArrayList<Integer>();
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, fCount = 1, sCount = 1;
		for(Integer i : list){
			if(i > first){
				second = first;
				sCount = fCount;
				first = i;
				fCount = 1;
			}
			else if(i > second && i != first){
				second = i;
				sCount = 1;
			}
			else if(i == first){
				fCount++;
			}
			else if(i == second){
				sCount++;
			}
		}
		li.add(second);
		li.add(sCount);
		return li;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		List<Integer> li = Arrays.asList(2, 2, 2, 2, 10, 10, 10, 20, -1, -1);
		List<Integer> seconds = SecondCount(li);
		System.out.println(seconds.get(0) + " "+ seconds.get(1));
	}
}