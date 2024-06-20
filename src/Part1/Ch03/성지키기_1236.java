package Part1.Ch03;

import java.util.Scanner;

public class 성지키기_1236 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    char[][] map = new char[N][M];
    for (int i = 0; i < N; i++) {
      map[i] = sc.next().toCharArray();
    }

    // 1. 각 행/열에 대해 경비원이 있는지 확인한다.
    boolean[] existRow = new boolean[N];
    boolean[] existCol = new boolean[M];
    for (int i = 0; i < N; i++)
      for (int j = 0; j < M; j++)
        if (map[i][j] == 'X') {
          existRow[i] = true;
          existCol[j] = true;
        }

    // 2. 보호받지 못하는 행/열의 개수를 구한다.
    int needRowCount = N;
    int needColCount = M;
    for(int i = 0; i < N; i++)
      if (existRow[i]) needRowCount--;

    for(int i=0; i<M; i++)
      if (existCol[i]) needColCount--;

    System.out.println(Math.max(needRowCount, needColCount));
  }
}
