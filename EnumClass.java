// enmu class - a special class in java which represents a group of constants (unchangeable variables)
// enum class cannot extend within any other class because it internally extends java.lang.Enum class

enum Laptop{
            Mackbook(2000),
            XPS(1500),
            Surface,
            ThinkPad(1700);

            private int price;

            private Laptop() {
                this.price = 1000; // default price
                System.out.println(Laptop.this + " default constructor called");
            }

            private Laptop(int price) {
                this.price = price;
                System.out.println(Laptop.this + " parameterized constructor called");
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
public class EnumClass {
    public static void main(String[] args) {
        // Laptop l = Laptop.Mackbook;
        // System.out.println(l + " price is: " + l.getPrice());
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " price is: " + lap.getPrice());
        }
    }
}
