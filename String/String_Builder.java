package String;
// Before see program in the noteboook must read String Builder chapter

// We know that String is immutable in java and if we want to change in our String that time our time complexity is very high and It's Slow down our program.
// For solve that problem we use String Builder.
// Wenever we want to little changes in our program that time we use String Builder

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // Inside the parenthisis initialize String

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c); // Basically here append function add krta he character ko kisibhi String me
                          // pichhe.
        }

        System.out.println(sb);
        System.out.println(sb.length());
    }
}

// Also one more function is there which is: sb.toString();
// we use this function when we want change any data type to our program in
// String Data Type.
// NOTE: when use it that time always "object.toString()" Use and not use it as
// "Variable.toString()".