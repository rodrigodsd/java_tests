public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0, right = nums.length - 1, target = 6, mid;

        boolean exists;

        while(left <= right){

            mid = (left + right) / 2;
            if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

            if (nums[mid] == target){
                exists =  true;
                System.out.println("index : " + mid);
                break;
            }
        }
    }
}
