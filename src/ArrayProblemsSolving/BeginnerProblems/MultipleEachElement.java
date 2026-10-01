package ArrayProblemsSolving.BeginnerProblems;

//Multiplying each element of the array by 10:

public class MultipleEachElement {
    static int[] multiplyElements(int[] arr) {
        int size = arr.length;
        int newArr[] = new int[size];
    // Travel to old arr
        for (int i = 0; i < size; i++) {
            int currentElement = arr[i];    // current element in old arr
            int newElement = currentElement * 10;   // current ko multiply by 10 krke new element me store kraya
            newArr[i] = newElement;  // new element ko new arr me store kr diya
        }
        return newArr;    // return new arr
    }

    static void main() {
        int[] arr = {2, 4, 6, 8};
        int[] ans = multiplyElements(arr);
        System.out.print("Printing ans Array: ");
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
