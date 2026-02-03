class Laptop{
    String brand;
    int price;

    public String toString(){
        return "Brand: " + this.brand + ", Price: " + this.price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Laptop that){
    //     if(this.brand.equals(that.brand) && this.price == that.price){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
}

public class ObjectClass {
    public static void main(String[] args) {
       Laptop lap1 = new Laptop();
        lap1.brand = "Dell";
        lap1.price = 80000; 

        Laptop lap2 = new Laptop();
        lap2.brand = "Apple";
        lap2.price = 80000;

        boolean result = lap1.equals(lap2);
        System.out.println(result);// false because equals() method of Object class compares references
    }
}
