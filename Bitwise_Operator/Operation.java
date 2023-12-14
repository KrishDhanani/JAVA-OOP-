package Bitwise_Operator;

public class Operation {
    public static int getIthBit(int x, int i) {
        // we check Here ith bit 0 he ya 1
        // uske liye ask user which bit want to find (store it as ith bit)
        // Now you want to find ith bit so apko us ith bit pe &1 operation perform krna
        // padega
        // us ith bit pe jane ke liye apply (1<<i) <- left shit 11 to ith position and
        // apply And operation
        int bitmask = 1 << i;
        if ((x & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
        // How it work:
        // x=10 --> Binary: 1 0 1 0
        // i=2__So _______& 0 1 0 0
        // ________________--------
        // _________________0 0 0 0
    }

    public static int setIthBit(int x, int i) {
        // setBit means convert ith position bit to 1
        int bitmask = 1 << i;
        return x | bitmask;
        // How it work
        // x=10 --> Binary: 1 0 1 0
        // i=2__So _______| 0 1 0 0
        // ________________--------
        // _________________1 1 1 0 :(14) in decimal
    }

    public static int clearIthBit(int x, int i) {
        // clear means convert ith position bit to 0
        int bitmask = ~(1 << i);
        return x & bitmask;
        // How it work
        // x=10 --> Binary: 1 0 1 0
        // i=1__So _______& 1 1 0 1
        // ________________--------
        // _________________1 0 0 0 :(8) in decimal
    }

    public static int updateIthBit(int x, int i, int newBit) {
        // Solution 1...
        // if(newBit==0){
        // return clearIthBit(x, i);
        // }
        // else{
        // return setIthBit(x, i);
        // }

        // Solution 2...
        x = clearIthBit(x, i);
        int Bitmask = newBit << i;
        return x | Bitmask;
    }

    public static int ClearLastIthBit(int x, int i) {
        int Bitmask = ((-1) << i); // You can also tack here insted of (-1) (~0).
        return x & Bitmask;
        // (-1)&(~0) represent in binary 11111
    }

    public static int clearRangeOfBit(int x, int i, int j) {
        // Here we clear range of bit where number , i to j Range is given by the user.
        int a = (~(-1) << i);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return x & bitmask;
    }

    public static boolean isPowerOfTwo(int x) {
        // Here we check the number is Power of two or not.
        return (x & (x - 1)) == 0;
    }

    public static int CountSetBit(int x) {
        // It is return how many 1 in the Bit
        int count = 0;
        while (x > 0) {
            if ((x & 1) != 0) {
                count++;
            }
            x = x >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(ClearLastIthBit(15, 2));
        System.out.println(clearRangeOfBit(10, 2, 4));
        System.out.println(isPowerOfTwo(5));
        System.out.println(CountSetBit(15));
    }
}
