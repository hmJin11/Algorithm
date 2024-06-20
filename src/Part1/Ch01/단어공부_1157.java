package Part1.Ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어공부_1157 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      String text = st.nextToken().toUpperCase();
      int[] arr = new int[26];
      int max = -1;
      char str = '?';

      for (int i = 0; i < text.length(); i++) {
        arr[text.charAt(i) - 65]++;
        if (max < arr[text.charAt(i) - 65]) {
          max = arr[text.charAt(i) - 65];
          str = text.charAt(i);
        } else if (max == arr[text.charAt(i) - 65]) {
          str = '?';
        }
      }
      System.out.println(str);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
