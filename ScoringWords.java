/*
    英単語のテストの採点ではどこまでをスペルミスとみなしてどこまでを別の単語とみなすかが悩みどころです。
      そこで以下の様な採点基準を導入してこれに従って厳密に採点することにしています。
      【条件】
      ・正解の単語と完全一致→ ◯ 2 点
      ・正解の単語と長さ(文字数)が異なる→ × 0 点
      ・正解の単語と長さは同じだが 1 文字だけ異なる→ △ 1 点
      ・正解の単語と長さは同じだが 2 文字以上異なる→ × 0 点

      ここで「文字が異なる」とは、同じ位置にある文字が異なるということを意味しています。
      【例】
      正解: apple, 解答: aple → 0 点 (長さが異なる)
      正解: orange, 解答: olange → 1 点 (長さは同じだが 1 文字だけ異なる)
      正解: grape, 解答: glepe → 0 点 (長さは同じだが 2 文字異なる)
      正解: lemon, 解答: lemon → 2 点 (完全一致)

      以下のように正解数、部分点数、不正回数、合計得点を出力てください。
      【出力】
      全4問 正解数1 部分点数1 不正解数2
      合計3点
  **/



  class Main {

    public static void main(String[] args) {
      String[] Q = {"apple", "orange", "grape", "lemon" };
      String[] Answer = {"aple", "olange", "glepe", "lemon"};

      int[] scores = new int[3];


      for (int i = 0; i < Q.length; i++) {
        int[] score = scoring(Q[i], Answer[i]);

        for (int j = 0; j < score.length; j++ ){
          scores[j] += score[j];
        }

      }


      System.out.print("全" + Q.length + "問" + " ");
      System.out.print("正解数" + scores[0] + " ");
      System.out.print("部分点数" + scores[1] + " ");
      System.out.println("不正解数" + (Q.length - scores[0] - scores[1]) + " ");
      System.out.println("合計" + scores[2] + "点");
    }

    public static int[] scoring(String a, String b) {
      int[] score = new int[3];

      /**
      score[0]:正解数
      score[1]:部分点数
      score[2]:点数
      **/

      if (a.equals(b)) {
        score[0] = 1;
        score[2] = 2;
      }
      if (a.length() != b.length()) {
        score[1] = 0;
        score[2] = 0;

      }

      int diff_count = 0;
      final int len = b.length();

      for (int i = 0; i < len; i++) {
        if (a.charAt(i) != b.charAt(i)) {
          diff_count++;
        }
      }
      if(diff_count == 1){
        score[1] = 1;
        score[2] = 1;
      }
      return score;
    }
  }
