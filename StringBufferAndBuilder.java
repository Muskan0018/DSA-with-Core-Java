public class StringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Muskan");
        // System.out.println(sb.capacity()); // default 16
        sb.append(" Mishra");
        System.out.println(sb);

        


    }
}


// StringBuffer -> synchronized -> thread-safe -> slower
// StringBuilder -> not synchronized -> not thread-safe -> faster