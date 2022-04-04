public class Main {
    public static void main(String[] args)
    {
        System.out.println(giveFactorial(5));
        System.out.println(giveFactorial(10));
    }

    public static int giveFactorial(int num)
    {
        int result = 1;
        for (int i = num; num > 0; num--)
        {
            result *= num;
        }
        return result;
    }
}
