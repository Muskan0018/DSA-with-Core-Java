// Array is a collection of similar types of data items stored at contiguous memory locations.

public class Array {
    public static void main(String[] args) {
        // int nums [] = new int [4];
        // nums[0] = 10;
        // nums[1] = 20;
        // nums[2] = 30;
        // nums[3] = 40;


        int nums [] = {10, 20, 30, 40};
        nums[1] = 25; // updating value at index 1

        for(int i = 0; i < 4; i++){
            System.out.println(nums[i]);
        }

        // System.out.println(nums[1]);
    }
}

