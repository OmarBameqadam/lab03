public class Sorter{
    public static void main(String[] args) {
        System.out.println("O");
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumIndex = i;
            for (int j =i+1; j< arr.length;j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
    }
//Conflict (the same method in line 41)
    //Update this to sort 1
    public static void sort1(int arr[]){
        selectionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
    //Update this to sort2
    public static void sort2(int[] arr) {
        insertionSort(arr);
    }


}
