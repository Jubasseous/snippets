/**
 * Classwork with Traversal Practice
 * @author Jubes
 */
public class TraversalMethods 
{

	public static void main(String[] args) 
	
	{
		//Make a method that is passed an int array and 
		//returns the highest value in that array.
		int[] arr1 = { 2, 6, 3, 9, 1, 1, 4};
		getHighValue(arr1);
		
		//Ex: { 2, 6, 3, 9, 1, 1, 4} ---> returns 9
		System.out.println(getHighValue(arr1));

		//Make a method that is passed an array of doubles and 
		//returns a double array consisting of their average. 
		double[] arr2 = { 3.1, 4.2, 5.0, 6.2, 6.9};
		getAverageDoub(arr2);

		//Ex: { 3.1, 4.2, 5.0, 6.2, 6.9} --> returns 5.08
		
		//check
		System.out.println(getAverageDoub(arr2));

		//Make a method that is passed an int array and 
		//returns whether or not the array has any even numbers in it.
		int[] arr3 = { 1, 6, 9};
		hasEvenNums(arr3);

		//Ex: { 1, 6, 9} --> returns true

		//Ex: { 1, 5, 7} --> returns false
		
		//check
		System.out.println(hasEvenNums(arr3));

		//Make a method that is passed an int array and 
		//returns whether or not the array has ALL even numbers in it.
		int[] arr4 = { 1, 6, 9};
		checkIfAllEven(arr4);

		//Ex: { 1, 6, 9} --> returns false

		//Ex: { 4, 2, 18} --> returns true
		
		//check
		System.out.println(checkIfAllEven(arr4));

		//Make a method that is passed a double array and 
		//returns whether or not three consecutive doubles of the same 
		//value appear in the array.
		double[] arr5 = { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		threeConsecDoub(arr5);

		//Ex: { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1} --> returns true

		//Ex: {3.1, 7.1, 6.6, 9.3} --> returns false

		//Check
		System.out.println(threeConsecDoub(arr5));

	}
	
	/**
	 * Make a method that is passed an int array and 
	 * returns the highest value in that array.
	 * @param arr
	 * @return
	 */
	public static int getHighValue(int[] arr)
	{
		//declare int to be the first element of the array
		int max = arr[0];
		
		//go through the array
		for(int i = 0; i < arr.length; i++)
		{
			//check if the element at i is greater than the int max
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		//return the max value
		return max;
	}
	/**
	 * Make a method that is passed an array of doubles and 
	 * returns a double array consisting of their average.
	 * @param arr
	 * @return
	 */
	public static double getAverageDoub(double[] arr) 
	{
		//declare a double to be the total sum of all the elements
		double sum = 0;
		
		//create a for loop to add all the elements
		for(int i = 0; i < arr.length; i++)
		{
			//adds each element to the sum
			sum += arr[i];
		}
		
		//return the average
		return sum/arr.length;
	}

	/**
	 * Make a method that is passed an int array and 
	 * returns whether or not the array has any even numbers in it.
	 * @param arr
	 * @return
	 */
	public static boolean hasEvenNums(int[] arr)
	{
		//check all elements in the array
		for(int i = 0; i < arr.length; i++)
		{
			//check id there's an even number
			if(arr[i] % 2 == 0)
			{
				return true;
			}
		}
		
		//if no even
		return false;
	}
	/**
	 * Make a method that is passed an int array and 
	 * returns whether or not the array has ALL even numbers in it.
	 * @param arr
	 * @return
	 */
	public static boolean checkIfAllEven(int[] arr)
	{
		//check all elements
		for(int traverser = 0; traverser < arr.length; traverser++)
		{
			//check if the element is an odd number cause then it will immediately 
			//return false
			if(arr[traverser] % 2 != 0)
			{
				return false;
			}
		}
		
		//if all even 
		return true;
	}
	
	/**
	 *Make a method that is passed a double array and 
	 *returns whether or not three consecutive doubles of the same 
	 *value appear in the array.
	 * @param arr
	 * @return
	 */
	public static boolean threeConsecDoub(double[] arr)
	{
		//create a for loop that will check the arr, but traverser starts at index of 2 
		//so that we can check the other two before seeing if they share the same double
		for(int traverser = 2; traverser < arr.length; traverser++)
		{
			//check if the index at traverser is the same as the index one before 
			//and two before
			if(arr[traverser] == arr[traverser - 1] && arr[traverser] == arr[traverser - 2])
			{
				//return true
				return true;
			}
			
	
		}
		//if there are no 3 consecutive doubles then return false
		return false;
		
		
	}

}
