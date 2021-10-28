import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int n = s.nextInt();// n is the number of iteration
        int arr[]=new int[n];// here n is the size of array declared
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();// inputing the elements from console 1 by 1 
        }
		//int[] arr = {12,4,5,2,5};
		for(int i = 0; i<arr.length;i++){
		    System.out.print(arr[i] + " ");// Output is printed in same order of input
		}
	}
}
