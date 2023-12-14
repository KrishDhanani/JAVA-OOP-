package String;

// Given route contain four direction(N,S,E,W) find the shortest path to reach the direction.
// "WNEENESENNN"
// N=north,S=south,W=west,E=east. 
import java.util.*;

public class Practice2 {
    public static void shortestpath(String s) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) { // O(n)
            if (s.charAt(i) == 'N') {
                y++;
            } else if (s.charAt(i) == 'S') {
                y--;
            } else if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'W') {
                x--;
            }
        }
        System.out.println("You need to find shortest path for" + "(" + x + "," + y + ")");
        float shortestpath = (float) Math.sqrt((x * x) + (y * y));

        System.out.println("Your shortest path is:" + shortestpath);
    }

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        shortestpath(Path);
    }
}
