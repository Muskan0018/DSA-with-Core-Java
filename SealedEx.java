// Sealed Classes - Sealed Classes restrict which other classes or interfaces may extend or implement them.

// Only the permitted classes can extend the sealed class.

// A sealed class is declared using the 'sealed' modifier, and the permitted subclasses are specified using the 'permits' clause.

// The permitted subclasses must be declared as either 'final', 'sealed', or 'non-sealed'.

// sealed interface must be implemented by permitted interfaces or classes only.

// The permitted interfaces or classes must be declared as either 'final', 'sealed', or 'non-sealed'.

sealed class Hello extends Thread implements Cloneable permits Hey, Hi{    // only Hey and Hi can extend Hello

}
final class Hey extends Hello{    

    
}
final class Hi extends Hello{

}
class Unrelated{

}

// Example of a sealed interface
sealed interface x permits y, z {

}
non-sealed interface y extends x {

}
non-sealed interface z extends x {

}
public class SealedEx {
    public static void main(String[] args) {
        
    }
}
