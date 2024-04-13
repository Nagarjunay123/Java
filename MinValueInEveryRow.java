package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueInEveryRow {

		    public static int arrayPartition(int[] nums) {
		        Arrays.sort(nums);
		        int maxSum = 0;
		        for (int i = 0; i < nums.length; i += 2) {
		            maxSum += Math.min(nums[i], nums[i + 1]);
		            System.out.println(Math.min(nums[i],nums[i+1]));
		        }
		        return maxSum;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the array elements separated by commas:");
		        String[] input = scanner.nextLine().split(",");
		        int[] nums = new int[input.length];
		        for (int i = 0; i < input.length; i++) {
		            nums[i] = Integer.parseInt(input[i]);
		        }
		        System.out.println("Maximized sum: " + arrayPartition(nums));
		    }		
		
	}
