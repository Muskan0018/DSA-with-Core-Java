// Method Overriding - A derived class provides a specific implementation of a method already defined in its base class.
class calc{
    public int add(int a, int b){
        return a + b;
    }
}
class adv extends calc{
    public int add(int a , int b){
        return a + b ;
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        adv obj = new adv();
        int r1 = obj.add(4,5);
        System.out.println(r1);
    }

}
