// Same Method Name with Different Parameters is called Method Overloading




class Calcu {
    public int add(int n1, int n2, int n3) {            // method (add)
        // int r = n1 + n2;
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2) {            // method (add)
        // int r = n1 + n2;
        return n1 + n2;
    }
    public double add(double n1, int n2) {            // method (add)
        // double r = n1 + n2;
        return n1 + n2;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        Calcu cal = new Calcu();   // Object
        int r1 = cal.add(3,4);  // method call
        System.out.println(r1);
    }
}

