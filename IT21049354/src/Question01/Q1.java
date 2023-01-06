//IT21049354
//Athauda A.M.I.R.B
//Foundations of Algorithms - Assigment Question 1

package Question01;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//getting the array length from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int arraysize = s.nextInt();
		
		//creating the array
		int [] array = new int[arraysize];
		
		//setting the array elements
		System.out.println("Set the Array Elements:");
		for(int i = 0; i<arraysize; i++) {
			array[i] = s.nextInt();
			
		}
		//getting minimum and maximum value using a function
		int min = getMinvalue(array);
		int max = getMaxvalue(array);
		
		//showing the outputs
		System.out.println("\nArray Elements are: "+Arrays.toString(array));
		System.out.println("\nMax Value: " + max);
        System.out.println("\nMin Value: " + min);
        
        //calculating the weight
        int w = max-min;
        
        //showing the weight of the array
		System.out.println("\nWeight of the Array is: "+w);

	}

	//getting maximum value
    private static int getMaxvalue(int[] array) {
        int maxValue = array[0];
        for (int j = 0; j < array.length; j++){
            if (array[j] > maxValue){
                maxValue = array[j];
            }
        }
        return maxValue;
    }

    //getting minimum value
	private static int getMinvalue(int[] array) {
        int minValue = array[0];
        for (int a = 0; a < array.length; a++){
            if (array[a] < minValue){
                minValue = array[a];
            }
        }
        return minValue;
    }

}



 