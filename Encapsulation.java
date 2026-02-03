// Encapsulation - the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.

class Human
{
    private int age;
    private String name;
   
// Getter- Getter methods are used to retrieve the value of a private variable.

// Setter- Setter methods are used to set the value of a private variable.

    // Getter and Setter methods
    public int getAge(){
        return age;
    } 

    public String getName(){
        return name;
    }

    public void setAge(int a){
        this.age = a;
        // age = a;
    }

    public void setName(String n){
        this.name = n; 
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(18);
        obj.setName("Muskan");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
