// Polymorphism - means many forms
//two types - Compile Time & Runtime Time
//Compile Time - Object is bound with their functionality at the compile-time
// Runtime - Object is bound with their functionality at the run-time

package polymorphism;

public class Students {
    public void read(){
        System.out.println("Student is reading XYZ book...");

    }
    public void read(String bookName){
        System.out.println("Reading " + bookName);
    }
}
