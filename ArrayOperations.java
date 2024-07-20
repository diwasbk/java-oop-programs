import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayOperation{
    ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList());
    Scanner sc = new Scanner(System.in);

    public void readArray(){
        for(int i =0; i<5; i++){
        System.out.print("Enter" + " string "+(i+1) + ": ");
            int values = sc.nextInt();
            myArray.add(values);
        }
        System.out.println(myArray);
        sc.close();
    };

    public void maxArray(){
        int max = myArray.get(0);
        int index = 0;
        int len = myArray.size();
        for (int i = 0; i <= len-1; i++) {
            if (myArray.get(i) > max) {
                max = myArray.get(i);
                index = i;
            }
        }
        System.out.println("Max array: " + max);
        System.out.println("Index of highest value (" + max + "): " + index);
    }

    public void minArray() {
        int min = myArray.get(0);
        int index = 0;
        int len = myArray.size();
        for (int i = 0; i <= len-1; i++) {
            if (myArray.get(i) < min) {
                min = myArray.get(i);
                index = i;
            }
        }
        System.out.println("Min array: " + min);
        System.out.println("Index of lowest value (" + min + "): " + index);
    }
}
public class ArrayOperations {
    public static void main(String[] args) {
        ArrayOperation a1 = new ArrayOperation();
        a1.readArray();
        a1.maxArray();
        a1.minArray();
    }
}