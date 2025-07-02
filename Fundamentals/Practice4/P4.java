import java.io.*;


class P4
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the length of array:"));
		double arr[] = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Double.parseDouble(c.readLine("Enter the element: "));

		}
		
		int cntPos = 0, cntNeg = 0, cntZero = 0;

		for(int i = 0; i < n; i++)
		{
			if(arr[i] < 0)	cntNeg++;
			else if(arr[i] > 0)	cntPos++;
			else	cntZero++;

		}
		System.out.println("positive count = " + cntPos);	
		System.out.println("zero count = " + cntZero);
		System.out.println("negative count = " + cntNeg);
	}

}