package Exercise2_10;

public class HowMany {
    public static int test() {
        System.out.println("Enter your sentence:");
        String input = System.console().readLine();
        String[] spl = input.split("[,.?!;:]|\s");

        int numWords = spl.length;
        for(String str : spl)
            numWords -= str.isEmpty() ? 1 : 0;
        System.out.printf("Result is %d words\n", numWords);
        return numWords;
    }
}
