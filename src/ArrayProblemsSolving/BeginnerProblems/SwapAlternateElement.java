package ArrayProblemsSolving.BeginnerProblems;

public class SwapAlternateElement {

    static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length - 1; i = i + 2) {     // To handle both even and odd-sized arrays, use:
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.print("After Swapping Aternate Element: ");
        for (int ele : arr) {
            System.out.print(ele + " ");

        }

//        For an odd-sized array like [1,2,3,4,5], the last element remains unchanged: [2,1,4,3,5].

    }
}
