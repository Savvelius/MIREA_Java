package Exercise1;

public class Task4 {
    public static int arrayMax(int[] array) {
        int start = Integer.MIN_VALUE;
        for(int i : array)
            start = Math.max(i, start);
        return start;
    }
    public static int arrayMin(int[] array) {
        int start = Integer.MAX_VALUE;
        for(int i : array)
            start = Math.min(i, start);
        return start;
    }
    public static void solve() {
        int[] array = Task3.readNonEmptyArray();
        System.out.printf("Sum of array = %d\n", Task3.arraySum(array));
        System.out.printf("Minimum element of array = %d\n", arrayMin(array));
        System.out.printf("Maximum element of array = %d\n", arrayMax(array));
    }
}
