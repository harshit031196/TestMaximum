import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class TestMaximumMain {

	public static int getMaximum(Integer arrOfInt[]) {
		return Stream.of(arrOfInt).max(Integer::compareTo).get();
	}
	public static float getMaximumFloat(Float arrOfFloat[]) {
		return Stream.of(arrOfFloat).max(Float::compareTo).get();
	}
	public static String getMaximumString(String arrOfString[]) {
		return Stream.of(arrOfString).max(String::compareTo).get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer arrOfInt[] = new Integer[] {1,2,3};
		Float arrOfFloat[] = new Float[] {1.25f,-2.14f,30f};
		String arrOfString[] = new String[] {"Apple","Banana","Orange"};
		Integer max = getMaximum(arrOfInt);
		Float maxF = getMaximumFloat(arrOfFloat);
		String maxS = getMaximumString(arrOfString);
		System.out.println(max);
		System.out.println(maxF);
		System.out.println(maxS);
	}

}
