package Exercise3_1;

import Exercise1.Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.Vector;

public class RandomNums {
    private double[] nums;
    public final int length;
    public RandomNums() {
        System.out.println("Print length of the array:");
        length = Task3.readInt();
        if (length < 0)
            throw new RuntimeException("array can't have length less than zero");
        nums = new double[length];
    }
    public void fillMath() {
        for(int i = 0; i < nums.length; ++i)
           nums[i] = Math.random();
    }
    public void fillRandom() {
        Random generator = new Random();
        for(int i = 0; i < nums.length; ++i)
            nums[i] = generator.nextDouble();
    }
    public void sort() {
        Arrays.sort(nums);
    }
    public static RandomNums test() {
        RandomNums nums = new RandomNums();
        System.out.println("Using Math.random():");
        nums.fillMath();
        System.out.printf("Before sort: %s\n", nums);
        nums.sort();
        System.out.printf("After sort: %s\n", nums);

        System.out.println("Using Random class:");
        nums.fillRandom();
        System.out.printf("Before sort: %s\n", nums);
        nums.sort();
        System.out.printf("After sort: %s\n", nums);
        return nums;
    }
    @Override
    public String toString() {
        return "RandomNums(nums = " + Arrays.toString(nums) + ")\n";
    }
}





