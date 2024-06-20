package Part1.Ch01;

import java.util.Scanner;

public class 애너그램만들기_1919 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    int[] countA = getAlphabetCount(a);
    int[] countB = getAlphabetCount(b);

    int ans = 0;

    for (int i = 0; i < 26; i++) {
      ans += Math.abs(countA[i] - countB[i]);
    }

    System.out.println(ans);
  }

  public static int[] getAlphabetCount(String text) {
    int[] count = new int[26];
    for (int i = 0; i < text.length(); i++) {
      count[text.charAt(i) - 'a']++;
    }
    return count;
  }
}
