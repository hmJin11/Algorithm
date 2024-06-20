package Part1.Ch01;

import java.util.Scanner;

public class 소금폭탄_13223 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String current = sc.nextLine();
    String drop = sc.nextLine();

    String[] split1 = current.split(":");
    int currentHour = Integer.parseInt(split1[0]);
    int currentMinute = Integer.parseInt(split1[1]);
    int currentSecond = Integer.parseInt(split1[2]);
    int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

    String[] split2 = drop.split(":");
    int dropHour = Integer.parseInt(split2[0]);
    int dropMinute = Integer.parseInt(split2[1]);
    int dropSecond = Integer.parseInt(split2[2]);
    int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

    int needSecondAmount = dropSecondAmount - currentSecondAmount;
    if(needSecondAmount <= 0) {
      needSecondAmount += 24 * 3600;
    }

    int needHour = needSecondAmount / 3600;
    int needMinute = (needSecondAmount % 3600) / 60;
    int needSecond = (needSecondAmount % 60);

    System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
  }
}
