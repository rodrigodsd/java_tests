import java.util.Arrays;

public class QuickSort {

    public void main(String[] args) {

        int[] nums = new int[]{1, 8, 3, 9, 4};

        int[] result = quickSort(nums, 0, 4);

        System.out.println("nums : " + Arrays.toString(result));

    }

    int[] quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
        return arr;
    }

    private int partition(int[] arr, int begin, int end) {

        int pivot = arr[end];
        int leftIndex = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                leftIndex++;
                // swap
                int swapTemp = arr[leftIndex];
                arr[leftIndex] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[leftIndex + 1];
        arr[leftIndex + 1] = arr[end];
        arr[end] = swapTemp;

        return leftIndex + 1;
    }
}
