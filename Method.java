// Every Method have its own Stack Memory

class Computer{
    public void playMusic(){              // method
        System.out.println("Playing Music");
    }
    public String getMePen(int cost){
        if(cost < 10){
            return "No Pen";
        }
        return "Pen";
    }
}

public class Method {
    public static void main(String[] args) {
       Computer myCom = new Computer();
       myCom.playMusic();
       String item = myCom.getMePen(10);
       System.out.println(item);
    }
}
