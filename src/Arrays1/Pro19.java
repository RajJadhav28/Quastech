package Arrays1;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Pro19 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input the size of the array
	        System.out.println("Enter the size of the array:");
	        int n = sc.nextInt();

	        // Input the array elements
	        int[] arr = new int[n];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Calculate the frequency of each element
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Print the frequency of each element
	        System.out.println("Frequency of elements:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println("Element " + entry.getKey() + " occured " + entry.getValue() + " times");
	        }

	        sc.close();
	    }
	}


