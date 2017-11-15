
public class ArrayMethods2 
{
	public static void main(String[] args)
	{
		String[] list1 = {"abc", "bac"};
		String[] list2 = {"abcde", "dea"};
		printArray(merge(list1, list2));
	}
	
	public static String[ ] merge(String[] list1, String[] list2)
	{
		String[] list3;
		list3 = new String[list1.length + list2.length];
		
		int count = 0;
		
		for (int i = 0; i < list1.length; i++)
		{
			list3[count] = list1[i];
			count++;
		}
		
		for (int j = 0; j < list2.length; j++)
		{
			list3[count] = list2[j];
			count++;
		}
		
		for (int k = 0; k < list3.length; k++)
		{
			for (int l = 0; l < list3.length; l++)
			{
				if (k == l)
				{
					continue;
				}
			}
		}
		
		return list4;
	}
	
	public static String[] mergeSort(String[] list)
	{

	}
	
	public static int partition(int[] list)
	{
		
	}
	
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
}
