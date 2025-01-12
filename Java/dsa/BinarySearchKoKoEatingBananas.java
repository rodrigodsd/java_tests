import java.util.Arrays;

public class BinarySearchKoKoEatingBananas {

    public static void main(String[] args) {

        int[] piles = new int[]{3,6,7,11};
        int h = 8 ;
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int mid = 0, min = 0;

        while (low < high) {
            mid = (low + high) / 2;

            int hours = 0;
            for(int pile : piles){
                hours += (int) Math.ceil(pile / (double) mid);
            }

            if(hours > h){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        System.out.println("Koko eat at least : " + low);
    }

}
