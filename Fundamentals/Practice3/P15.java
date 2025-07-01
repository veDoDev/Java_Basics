import java.io.*;

class P15 
{
	public static void main(String args[])
	{
		Console c = System.console();

		int len = Integer.parseInt(c.readLine("Enter the nums.lengthgth of numsay:"));
		
		if(len > 0)
		{
			int nums[] = new int[len];
			
			for(int i = 0; i < nums.length; i++)
			{
				nums[i] = Integer.parseInt(c.readLine("enter the element:"));
			}
			
			int min = nums[0], max = nums[0];

			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] < min)	min = nums[i];
				if(nums[i] > max)	max = nums[i];

			}

			System.out.println("max : " + max);
			System.out.println("min : " + min);

		}

	}

}