import Collection.Student;

class Student {

    String name;
    int rollNo;
    int marks;
}

public class ArrayOfObject {
    public static void main(String[] args) {

        // Creating objects of Student class
        Student s1 = new Student();
        s1.name = "Alice";
        s1.rollNo = 1;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Dushhtt";
        s2.rollNo = 2;
        s2.marks = 80;

        Student s3 = new Student();
        s3.name = "Muskan";
        s3.rollNo = 3;
        s3.marks = 95;

        System.out.println(s1.name + " : " + s1.rollNo + " : " + s1.marks);

        Student students[] = new Student[3];  // An array which can hold student references. It cannot create object by itself.
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name + " : " + students[i].rollNo + " : " + students[i].marks);
        // }
//enhanced for loop
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.rollNo + " : " + stud.marks);
        }


    //     int digit[] = new int[6];
    //     digit[0] = 10;
    //     digit[1] = 20;
    //     digit[2] = 30;
    //     digit[3] = 40;
    //     // digit[4] = 50;
    //     // digit[5] = 60;

    //     for(int i = 0; i < digit.length; i++){
    //         System.out.println(digit[i]);
    //     } 
    }
}
