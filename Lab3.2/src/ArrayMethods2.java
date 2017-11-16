
public class ArrayMethods2 
{
	public static void main(String[] args)
	{
		String[] list1 = {"abc", "bac", "afasdf"};
		String[] list2 = {"abcde", "dea"};
		printArray(merge(list1, list2));
	}
	
	public static String[ ] merge(String[] list1, String[] list2)
	{
		String[] list3;
		list3 = new String[list1.length + list2.length];
		int count = 0;
		
		int l1 = 0;
		int l2 = 0;
		while (l1 + l2 < list3.length)
		{
			if ((list1[l1].compareTo(list2[l2])) < 0)
			{
				list3[count] = list1[l1];
				count++;
				l1++;
			}
			if ((list2[l2]).compareTo(list1[l1]) < 0)
			{
				list3[count] = list2[l2];
				count++;
				l2++;
			}
			if (l1 == list1.length)
			{
				list3[count] = list2[l2];
				l2++;
				count++;
			}
			if (l2 == list2.length)
			{
				list3[count] = list1[l1];
				l1++;
				count++;
			}
		}
		return list3;
		

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
