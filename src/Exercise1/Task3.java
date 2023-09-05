package Exercise1;

public class Task3 {
    public static int readInt() {
        return Integer.parseInt(
                System.console().readLine()
        );
    }
    public static int[] readNonEmptyArray() {
        System.out.println("Enter array's length");
        int len = readInt();
        if (len == 0)
            throw new RuntimeException("input length is 0");
        int[] array = new int[len];
        for (int i = 0; i < len; ++i) {
            System.out.println("enter new element: ");
            array[i] = readInt();
        }
        return array;
    }
    public static int arraySum(int[] array) {
        int sum = 0;
        for(int j : array)
            sum += j;
        return sum;
    }
    public static void solve() {
        int[] array = readNonEmptyArray();
        int sum  = arraySum(array);
        System.out.printf("Sum of array = %d\n", sum);
        System.out.printf("Mean of array = %f", (float) sum / array.length);
    }
}

