class A{
    public void show() throws ClassNotFoundException
    {
            Class.forName("Pratiksha");
    }
    
}

public class throwsException {
    static
    {
        System.out.println("class is loaded");
    }
    public static void main(String[] args){
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}