
public class inputarray
{
	public static void main(String[] args)
	{
		int total=0,maxnum=0;
	    Scanner s=new Scanner(System.in);
		

			System.out.println("enter array size ");

			int n=s.nextInt();//getting the size of array 

			int arr[]=new int[n]; // passing the array size 
			System.out.println("enter elements");
			for(int i=0;i<n;i++)
			{

				arr[i]=s.nextInt();//getting the elemet for each index
				//inputed by the user

			}

			for(int j=0;j<arr.length;j++)
			{ 

				//System.out.println(arr[j]+",");
				total = total + arr[j];//getting the summ of all element
			} 
			System.out.println("total = " +total);//print the sum of all array ... 

			for (int c=0; c<arr.length;c++)
			{
				if (arr[c] > maxnum)
					maxnum=arr[c];
			}

			System.out.println("Max number is = "+ maxnum);

		}

		
}
