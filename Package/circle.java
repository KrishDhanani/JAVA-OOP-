package Package;

import java.util.*;

class circle {
	public static void volume(int r) {
		int v = (int) Math.PI * r * r;
		System.out.println("Volume is:" + v);
	}

	public static void main(String[] args) {
		volume(10);
	}
}