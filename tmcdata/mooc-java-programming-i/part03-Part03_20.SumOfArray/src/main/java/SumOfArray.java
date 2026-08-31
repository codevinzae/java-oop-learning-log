
public class SumOfArray {

    public static void main(String[] args) {
        int sum = 0;
        int[] array = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(array);
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int index = 0;
        int sum = 0;
        while(index < array.length){
            sum += array[index];
            index++;
        }
        return sum;
    }
}
