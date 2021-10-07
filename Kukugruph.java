class Main {
    /**
    【課題】
  　　九九の表を以下の出力例の形式で表示してください。
  　【出力例】
  　　 |  1   2   3   4   5   6   7   8   9
  　　-+------------------------------------
  　　1|  1   2   3   4   5   6   7   8   9
  　　2|  2   4   6   8   10  12  14  16  18
  　　3|  3   6   9   12  15  18  21  24  27
  　　4|  4   8   12  16  20  24  28  32  36
  　　5|  5   10  15  20  25  30  35  40  45
  　　6|  6   12  18  24  30  36  42  48  54
  　　7|  7   14  21  28  35  42  49  56  63
  　　8|  8   16  24  32  40  48  56  64  72
  　　9|  9   18  27  36  45  54  63  72  81
  　【条件】
  　　・数字を横方向に揃える制御文字「\t」を利用してください。
  　　・水平方向の罫線(-と+と|で作る)は、表全体の出力を見ながら、決め打ちで出力してOKです。
    **/
    public static void main(String[] args) {
      // 九九表の一列目
      System.out.print(" |");
      for ( int i = 1; i <= 9; i ++ ) {
        System.out.print("\t"+ i);
      }

      // 水平方向の罫線
      System.out.println("　\n-+------------------------------------");

      //九九表
      for ( int i = 1; i <= 9; i ++ ) {
        System.out.print(i + "|");
        for ( int j = 1; j <= 9; j ++ ) {
          int m = i * j;
          System.out.print("\t" + m);
        }

        // 改行
        System.out.println();
      }
    }
  }