package krish.shape;
import java.util.*;
class Rectangle{
	public static void volume(int x,int y){
		int v = x * x * y * y;
		System.out.println("Volume is:"+v);
	}
	public static void main(String[] args){
		volume(10,20);
	}
}