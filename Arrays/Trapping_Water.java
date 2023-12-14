
package Arrays;

import java.util.*;

// time complexity is O(n)
public class Trapping_Water {

    public static int trappedRainwater(int[] height) {
        // Calculate left max boundary - array
        int[] leftmax = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Calculate right max boundary - array
        int[] rightmax = new int[height.length];
        rightmax[rightmax.length - 1] = height[height.length - 1];
        for (int i = rightmax.length - 2; i > 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedWater = 0;
        int width = 1;
        // loop
        for (int i = 0; i < height.length; i++) {

            // waterlevel = min(left max boundary, right max boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // traped water = waterlevel - height[i]
            trappedWater += (waterlevel - height[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 }; // height of different bars
        int a = trappedRainwater(height);
        System.out.println(a);
    }
}???
// right output is 11 the in program something error
