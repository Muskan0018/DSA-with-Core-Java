////How to create CUSTOM EXCEPTION
//
//package exceptionhandling;
//
//
//class AgeInvalidException{
//    AgeInvalidException()
//    {
//        super("Age is invalid !");
//    }
//    AgeInvalidException(String message)
//    {
//        super(message);
//    }
//
//}
//
//AgeInvalidException ex = new AgeInvalidException();
//
//public class Example {
//    public static void main(String[] args) {
//        System.out.println("Started....");
//        try
//        {
//            int n1 = Integer.parseInt(args[0]);
//            int n2 = Integer.parseInt(args[5]);
//            System.out.println("We have got two numbers..");
//            int result = n1/n2;
//            System.out.println("Division is: "+ result);
//
//            if(n2 < 10)
//            {
//                throw new AgeInvalidException("My age is invalid");
//            }
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("n2 cannot be 0 ");
//            System.out.println(e.getMessage());
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("Invalid numbers ");
//            System.out.println(e.getMessage());
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("invalid Age");
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error");
//            System.out.println(e.getMessage());
//        }
//        finally
//        {
//            System.out.println("Finally always executed");
//            System.out.println("Closing all the resources");
//        }
//    }
//}
