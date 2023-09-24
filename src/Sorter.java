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
    public static void sort(int arr[]){
        selectionSort(arr);
    }
}
