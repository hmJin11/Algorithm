package Part1.Ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 빠른AplusB_15552 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      String[] nums = br.readLine().split(" ");
      int a = Integer.parseInt(nums[0]);
      int b = Integer.parseInt(nums[1]);
      bw.write(a + b + "\n");
    }
    bw.flush();
  }
}
