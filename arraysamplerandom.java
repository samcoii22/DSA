import java.util.*;
import java.util.Random;
public class arraysamplerandom
{
	

    public static void main(String args[])
	{
		int max=0,total=0;
		Scanner s = new Scanner (System.in);
		
		System.out.println("how many numbers you would like to generate");
		int size=s.nextInt();
		System.out.println("please Enter the range of numbers to be generated");
		int range =s.nextInt();
        int arr[] = new int[size];
        int num;
        Random rand = new Random();
        for (int i = 0; i <arr.length; i++)
		{
            num = 1+ rand.nextInt(range);
            arr[i] = num;
            System.out.println("Random No. Index: "+i+"\t Value : "+arr[i]);
        }
		
		for(int j=0;j<arr.length;j++)
		{ 

			//System.out.println(arr[j]+",");
		  total = total + arr[j];//getting the summ of all element
		} 
		System.out.println("total = " +total);//print the sum of all array ... 

		for (int c=0; c<arr.length;c++)
		{
			if (arr[c] > max)
				max=arr[c];
		}

		System.out.println("Max number is = "+ max);

	}
    
}

