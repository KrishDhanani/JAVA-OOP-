package Arrays;

public class Spiral_Metrix {
    public static void print_Spiral(int[][] arr) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length - 1;
        int endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Here in while loop we do < or "=" because of odd metrix middle part cover
            // krne ke liye.
            // or
            // && <-- for also considering n*m <-- vale metrix ko cover krne ke liye.

            // j<--For column
            // i<--For row

            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }

            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                // Incase in your program single col is there then you alredy write for it code
                // "right" no need to write again this condition.
                if (startrow == endrow) {
                    break;
                }

                System.out.print(arr[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                // Incase in your program single row is there then you alredy write for it code
                // "top" no need to write again this condition.
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
            }

            // Update
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        print_Spiral(matrix);
    }
}
