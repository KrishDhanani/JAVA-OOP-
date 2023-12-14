package Arrays;
// Approach:

// For search key Three method 
// 1.Brute Force (like linear form)
//          tc is: O(n^2)
// 2.Row wise (Binary search for all the row)
//         tc is: O(nlogn)
// 3. Clumn wise (Stair case search)

// Actually we apply here Stair case form
public class Key_search_Sorted_metrix {
    public void search(int[][] arr, int key) {
        int row = 0;
        int col = arr.length - 1;

        // Finding from top right cornor
        while (row <= arr.length - 1 && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Key found at:(" + row + "," + col + ")");
                break;
            } else if (key < arr[row][col]) {
                col--;
            } else {// if (key > arr[row][col])
                row++;
            }
        }

        // Finding from left side bottom(last row&first column) corner

        // int row = arr.length - 1;
        // int col = 0;
        // while (row >= 0 && col < arr.length) {
        // if (arr[row][col] == key) {
        // System.out.println("Key found at:(" + row + "," + col + ")");
        // break;
        // } else if (key < arr[row][col]) {
        // row--;
        // } else { // if(key>cellvalue)
        // col++;
        // }
        // }

    }

    public static void main(String[] args) {
        // Array must be sorted from row and column both
        int[][] array = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        Key_search_Sorted_metrix obj = new Key_search_Sorted_metrix();
        int key = 33;
        obj.search(array, key);
    }
}
