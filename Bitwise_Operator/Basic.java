package Bitwise_Operator;

public class Basic {
    public static void main(String[] args) {
        // There are so many bitwise Operator like;
        // Binary AND -> &
        // Binary OR -> |
        // Binary XOR -> ^
        // Binary One's Compliment -> ~
        // Binary left shift -> <<
        // Binary right shift -> >>

        // 1. Binary AND &
        System.out.println((5 & 6)); // first we convert 5 or 6 in to normal binary form after apply AND logic gate
                                     // between all binary number after convert answer back to decimal form and it is
                                     // your answer.

        // 2. Binary OR |
        System.out.println((5 | 6));

        // 3. Binary XOR ^
        System.out.println((5 ^ 6));

        // 4. Binary One'scomplement ~
        System.out.println((~5));

        // 5. Binary left shift <<
        System.out.println(5 << 2);

        // 6. Binary right shift >>
        System.out.println(6 >> 1);

    }
}
