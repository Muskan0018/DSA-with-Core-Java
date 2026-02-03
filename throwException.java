class MuskanException extends Exception {
    public MuskanException(String message) {
        super(message);
    }
}

public class throwException {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try
        {
            j = 18/i;
            // j = i / j;
            if(j == 0)
            {
                // throw new ArithmeticException("j cannot be zero");
                throw new MuskanException("hello");
            }
        }
        catch(MuskanException me)
        {
            System.out.println("Muskan Exception occurred: " + me);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);

        System.out.println("Bye....");
    }
}
