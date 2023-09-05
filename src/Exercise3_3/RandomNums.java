package Exercise3_3;

import java.util.Arrays;
import java.util.Random;

public class RandomNums {
    public static final int length = 4;
    private int[] array = new int[length];
    public RandomNums() {
        Random generator = new Random();
        for(int i = 0; i < length; ++i)
            array[i] = generator.nextInt(10, 99);
    }
    @Override
    public String toString() {
        return "RandomNums(" + Arrays.toString(array) + ")\n";
    }
    public boolean isAscending() {
        int prev = Integer.MIN_VALUE;
        for(int i : array) {
            if (i <= prev) return false;
            prev = i;
        }
        return true;
    }
    public static RandomNums test() {
        RandomNums nums = new RandomNums();
        System.out.printf("Array before sort: %s", nums);
        if (nums.isAscending())
            System.out.println("Array is sorted in strictly ascending order");
        else
            System.out.println("Array is NOT sorted in strictly ascending order");
        return nums;
    }
}
