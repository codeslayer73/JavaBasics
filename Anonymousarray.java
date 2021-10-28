import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int s1 = sum(new int[]{13,24,6,34,12});
        System.out.print(s1);
	}
	public static int sum(int a[])
    {
        int total = 0;
        for(int i:a)
        {
            total = total+i;
        }
        return total;
    }
}
