package ProblemsKK.Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int extraCandies = 12;
        int[] candies = {2, 8, 9, 55, 23, 44};
        int maxCandies = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();
        System.out.println(maxCandies);
        //finding maxCandies
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);

        }
        //storing on result
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies > maxCandies) {
                result.add(true);

            } else {
                result.add(false);
            }

        }
        System.out.println(result);


    }
}
