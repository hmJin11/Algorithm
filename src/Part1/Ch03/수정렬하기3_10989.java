package Part1.Ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수정렬하기3_10989 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] cnt = new int[10001];
    for (int i = 0; i < N; i++)
      cnt[Integer.parseInt(br.readLine())]++;

    for (int i = 1; i <= 10000; i++)
      while (cnt[i]-- > 0) {
        bw.write(i + "\n");
      }
    bw.flush();
  }
}
