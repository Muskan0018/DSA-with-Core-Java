// A functional interface is an interface that contains exactly one abstract method.


// This is Program To implement the Functional Interface

interface Writable
{  
    void write(String txt);  
}  
        // FuninterExp is a Example of Functional Interface
   public class FunctionalInterface implements Writable
    {  
           public void write(String txt)
        {  
            System.out.println(txt);  
        }  
        
     public static void main(String[] args)
     {  
        FunctionalInterface obj = new FunctionalInterface();  
        obj.write(" GFG - GEEKS FOR GEEKS ");  
     }  
}


// @FunctionalInterface
// interface A {
//     void show();
// }
// // class B implements A {
// //     public void show() {
// //         System.out.println("Implementation of show method in class B");
// //     }
// // }


// public class FunctionalInterface {
//     public static void main(String[] args) {
//         A obj = new A(){
//             public void show(){
//                 System.out.println("in show");
//             }
//         };
//         obj.show();
//     }
// }
