import java.util.Arrays;

public class CountSort {

    public void main(String[] args) {
        int[] nums = new int[]{ 2,0,2,1,1,0 };
        int[] count = new int[3];

        for (int n : nums){
            count[n]++;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count[index] > 0){
                nums[i] = index;
            }else{
                nums[i] = ++index;
            }
            count[index]--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
