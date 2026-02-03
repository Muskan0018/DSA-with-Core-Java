// super keyword refer to immediate parent
// super() method used to call parent class constructor from inside child class constructor

package oops;

public class Dog extends Animal{

    public Dog(){
        super(); // this must be the first line
    }
    int x = 4;
    public void speak(){
        System.out.println(x);
        System.out.println(this.x);   // for accessing (current class) child properties we use this
        System.out.println(super.x);  // for accessing parent properties we use super
    }
}
