//import java.util.Random;
class Main {
    /**
    【課題】
  　　配列yearsに西暦を表す4桁の数値が入っています。
  　　配列yearsの要素の西暦年が、グレゴリオ暦における閏(うるう)年であるかどうかを判定して以下の出力結果の形式で表示しなさい。
  　　int[] years = {2014, 2015, 2016, 2100, 2400};

  　【出力例】
  　　2014年は閏年ではありません。
  　　2015年は閏年ではありません。
  　　2016年は閏年です。
  　　2100年は閏年??????
  　　2400年は閏年??????

  　【条件1】
  　　mainメソッドではおもに、
  　　・西暦年格納用配列の定義
  　　・閏年判定メソッドの呼び出し
  　　・結果出力
  　　の処理を行い、対象の西暦年が閏年かどうかの処理は、閏年判定用メソッドに記述しなさい。

  　【条件2】
  　　閏年判定を行うメソッドは以下の定義に従ってください。
  　　引数は閏年判定対象の西暦年です。
  　　戻り値は判定対象の西暦年が閏年だった場合にtrue、閏年でない場合はfalseです。
  　　西暦年が閏年かどうかの判定条件は、以下の通りです。
  　　・西暦年が4で割り切れる年は閏年
  　　・ただし、西暦年が100で割り切れる年は平年(閏年でない)
  　　・ただし、西暦年が400で割り切れる年は閏年
    **/

    public static void main(String[] args) {

      int[] years = {2014, 2015, 2016, 2100, 2400};


      for(int i = 0; i < years.length; i++){
        if (isLeapYear(years[i])){
          System.out.println(years[i]+"年は閏年です。");
        }else{
          System.out.println(years[i]+"年は閏年ではありません。");
        }
      }



    }

    /**
      * 西暦年が閏年かどうか判定する.
      * @param year 西暦年
      * @return yearが閏年の場合true
      */
    private static boolean isLeapYear(int year){
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        return true;
      }
      return false;
    }
  }