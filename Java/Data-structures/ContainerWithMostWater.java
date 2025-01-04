import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = new int[]{3, 4, 1, 2, 2, 4, 1, 3, 2};

        int left = 0, right = heights.length - 1;
        int current_max = 0;

        while (left < right) {
            int width = right - left;
            int height = min(heights[left], heights[right]);
            int current_area = width * height;

            current_max = max(current_max, current_area);

            if (heights[left] < heights[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        System.out.println("The max water is : " + current_max);
    }
}
