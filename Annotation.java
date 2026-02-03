// Annotation - An Annotation is a form of metadata that provides data about a program but is not part of the program itself.
// Annotations have no direct effect on the operation of the code they annotate.

// @Deprecated   // This annotation indicates that the marked element is deprecated and should no longer be used.(you can use it but it is not recommended)

class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Class A");
    }
}
class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Class B");
    }
}
public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}