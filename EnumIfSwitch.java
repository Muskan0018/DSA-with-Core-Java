enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumIfSwitch {
    public static void main(String[] args) {
        Day s = Day.MONDAY;


        switch (s) {
            case SUNDAY:
                System.out.println("It's Sunday, time to relax!");
                break;
            case MONDAY:
                System.out.println("It's Monday, time to work!");
                break;
            default:
                System.out.println("It's a weekday.");
                break;
        }

        if (s == Day.MONDAY){
            System.out.println("It's Monday, time to work!");
        } else if (s == Day.SUNDAY) {
            System.out.println("It's Sunday, time to relax!");
            
        }else
        {
            System.out.println("It's a weekday.");
        }
    }
}
