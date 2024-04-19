

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main_6_5 {

  public static void main(String args[]) {
    var scanner = new Scanner(System.in);
    var n = scanner.nextInt();
    var a = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
    var b = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
    int s;
    Arrays.sort(a);
    Arrays.sort(b);
    s = IntStream.range(0, n).map(i -> a[i] * b[i]).sum();
    System.out.println(s);
  }
}
