package sort;

public class SortArrayQuicksort {

    public void main(String[] args) {
        int[] nums = new int[]{55, 8, 15, 23, 117, 87, 6, 10};

        int left = 0, right = nums.length - 1;

        sortArray(nums, left, right);
    }

    private int[] sortArray(int[] nums, int left, int right) {
        if (left < right) {

            int partitionIndex = partition(nums, left, right);

            sortArray(nums, left, partitionIndex - 1);
            sortArray(nums, partitionIndex + 1, right);

        }

        return nums;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];

        int i = left - 1; // i usado para guardar a posição do último numero menor que o pivot encontrado

        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(i, j, nums); // coloca todos os números menores que o pivot para o lado esquerdo
            }
        }

        swap(i + 1, right, nums); // coloca o pivot depois do último numero menor encontrado

        return i + 1;
    }

    private void swap(int indexHigh, int indexLow, int[] nums) {
        int tmpValue = nums[indexHigh];
        nums[indexHigh] = nums[indexLow];
        nums[indexLow] = tmpValue;
    }
}
