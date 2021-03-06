import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethods2 
{
	public static void main(String[] args)
	{
		String[] list1 = {"apple", "banana", "cherry", "dude", "elephant"};
		String[] list2 = {"acorn", "cornnuts"};
		printArray(merge(list1, list2));
		
		String[] list4 = {"zap", "bat", "lamp", "corn", "apple", "oval", "rhino", "damp", "elephant", "acorn", "acre"};
		printArray(mergeSort(list4));
		
		int[] list3 = {5, 4, 3, 2, 1, 6, 3, 4, 3, 4, 1, 6, 7, 8};
		System.out.println(partition(list3));
	}
	
	/**
	 * An array of the two lists merged together in alphabetical order.
	 * @param list1 List of alphabetized Strings
	 * @param list2 List of alphabetized Strings
	 * @return A new list with the combination of the two lists in alphabetical order
	 */
	public static String[ ] merge(String[] list1, String[] list2)
	{
		String[] list3;
		list3 = new String[list1.length + list2.length];
		int count = 0;
		
		int l1 = 0;
		int l2 = 0;
		while (l1 + l2 < list3.length)
		{
			if (l1 == list1.length)
			{
				for (int i = l2; i < list2.length; i++)
				{
					list3[count] = list2[l2];
					count++;
					l2++;
				}
				break;
			}
			if (l2 == list2.length)
			{
				for (int i = l1; i < list1.length; i++)
				{
					list3[count] = list1[l1];
					count++;
					l1++;
				}
				break;
			}
			if ((list1[l1].compareTo(list2[l2])) < 0)
			{
				list3[count] = list1[l1];
				count++;
				l1++;
				continue;
			}
			if ((list2[l2]).compareTo(list1[l1]) < 0)
			{
				list3[count] = list2[l2];
				count++;
				l2++;
				continue;
			}
			if ((list1[l1].compareTo(list2[l2])) == 0)
			{
				list3[count] = list1[l1];
				count++;
				l1++;
				list3[count] = list2[l2];
				count++;
				l2++;
				continue;
			}
			
		}
		return list3;
		

	}
	
	/**
	 * Sorts an list of strings and organizes it into alphabetical order.
	 * @param list List of strings
	 * @return Original list alphabetized
	 */
	public static String[] mergeSort(String[] list)
	{
		if (list.length == 1)
		{
			return list;
		}
		else
		{
			int half = list.length / 2;
			String[] firstHalf = Arrays.copyOfRange(list, 0, half);
			String[] secondHalf = Arrays.copyOfRange(list, half, list.length);
			list = merge(mergeSort(firstHalf), mergeSort(secondHalf));
		}
		return list;
	}
	
	/**
	 * Rearranges the array of integers so the first element in the array is in between numbers that are less than and greater than the first element.
	 * @param list Array of integers
	 * @return Original array of numbers, but the numbers left of the pivot is less than or equal to the pivot and the numbers to the right is greater than the pivot.
	 */
	public static int partition(int[] list)
	{
		int larger = countLarge(list);
		int newPos = (list.length - larger) - 1;
		swap(list, 0, newPos);
		
		for (int i = 0; i < newPos; i++)
		{
			if (list[i] > list[newPos])
			{
				for (int j = newPos + 1; j < list.length; j++)
				{
					if (list[j] <= list[newPos])
					{
						swap(list, i, j);
					}
				}
			}
		}
		
		printArray(list);
		return newPos;
	}
	
	/**
	 * Calculates how many numbers are greater than the first element in the array.
	 * @param list Array of integers
	 * @return Number of integers greater than the first element in the array.
	 */
	public static int countLarge(int[] list)
	{
		int count = 0;
		for (int i = 1; i < list.length; i++)
		{
			if (list[0] < list[i])
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Swaps two number's positions.
	 * @param arr Array of integers
	 * @param i Position of the first number you want to swap.
	 * @param j Position of the second number you want to swap
	 */
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array that is being printed out
	 */
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array that is being printed out
	 */
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
}
