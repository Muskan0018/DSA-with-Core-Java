// Exception Handling

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;

        int nums [] = new int[5];

        String str = null;

        try
        {
            j = 18/i;
            // j = i / j;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Something went wrong " );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds ");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong ");
        }
        // System.out.println(j);

        System.out.println("Bye....");
    }
}
