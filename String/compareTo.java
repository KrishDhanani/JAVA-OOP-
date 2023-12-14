package String;

// For compare to String we use function :
// "Str1.compareTo(Str2)"
// In this function 'A' != 'a'
// But
// For solve that problem another function is:
// "str1.compareToIgnoreCase(Str2)"
// In this function 'A' == 'a'

public class compareTo {
    // In this program we find largest String among all String.
    public static void main(String[] args) {
        String[] fruit = { "apple", "banana", "mango" };

        String largest = fruit[0];

        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}

// Time complexity is: O(x*N)
// Where x is length of perticuler String and N is number os String.
