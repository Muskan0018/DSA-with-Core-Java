public class FinallyEx {
    public static void main(String[] args) {
        
        try
        {
            int data = 25 / 0; // This will cause ArithmeticException
            System.out.println(data);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught: " + e);
        }
        finally
        {
            System.out.println("Finally block executed.");
        }
    }
}
