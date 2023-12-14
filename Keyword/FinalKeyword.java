package Keyword;

// 1.For not doing Override any Method or variable we doinng here final
// 2.we are also doing class to final so that any other class can not extend it
final class A {

}
// class B extends A // <--Throw error
// {

// }
public class FinalKeyword {
    public static void main(String[] args) {
        int a = 10;
        final int b = 20;
        // b=30; // <-- Throw error
    }
}
