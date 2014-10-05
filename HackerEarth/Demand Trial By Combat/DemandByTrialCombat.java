package HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemandByTrialCombat {

	public static void main(String[] args) throws Exception {

		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
				System.in));
		int noTestCase = Integer.parseInt(bufferRead.readLine());
		for (int i = 0; i < noTestCase; i++) {
			String temp = bufferRead.readLine();
			int person = Integer.parseInt(temp.split(" ")[0].trim());
			int hour = Integer.parseInt(temp.split(" ")[1].trim());
			execute(person, hour, getIntArray(bufferRead.readLine().split(" ")));
		}

	}

	public static void execute(int person, int hour, int[] initialPos) {

		int[] copy = new int[initialPos.length];

		for (int i = 0; i < initialPos.length; i++) {
			copy[i] = initialPos[i];
		}

		for (int i = 0; i < hour; i++) {
			for (int k = 0; k < copy.length; k++) {
				if (checkLeft(k, copy) && checkRight(k, copy)) {
					initialPos[k] = 1;
				} else {
					initialPos[k] = 0;
				}
			}
			copy(initialPos, copy);
		}
		for (int i : copy) {
			System.out.print(i + " ");
		}
	}

	public static void copy(int[] src, int[] dest) {
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
	}

	public static boolean checkLeft(int pos, int[] a) {

		if (pos == 0) {
			return true;
		}

		if (a[pos - 1] == 1) {
			return true;
		}
		return false;
	}

	public static boolean checkRight(int pos, int a[]) {

		if (pos == a.length - 1) {
			return true;
		}

		if (a[pos + 1] == 1) {
			return true;
		}
		return false;
	}

	public static int[] getIntArray(String[] s) {
		int[] k = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			k[i] = Integer.parseInt(s[i]);
		}
		return k;
	}
}
