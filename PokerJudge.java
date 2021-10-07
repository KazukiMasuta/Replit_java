/**
    ■数字を入力したらその数値の役が何かを判定するシステムを作ってもらいます
    ストレート
    →数字が連続している

    4カード
    →5枚中4枚同一の数字

    フルハウス
    →3枚同一の数字、2枚同一の数字

    3カード
    →5枚中3枚同一の数字

    2ペア
    →5枚中2枚同一が2組

    1ペア
    →5枚中2枚同一

    役なし
    →上記以外

　　【例】
    12345⇒ストレート
    77775⇒4カード
    55666⇒フルハウス（3カードではないので注意）
    22295⇒3カード
    13355⇒2ペア
    11346⇒1ペア
    14689⇒役なし

    上記のように数字を入力したら対応する役が出力されるようにしてください
    その他の数字を入力しても、対応する役が出力されるようにしてください

    【条件】
      入力可能な数字は1～9です
      5桁の数字以外を入力した場合は、「正常な値を入力してください」と表示してください
      同一の数字を5個以上入力した場合は「正常な値を入力してください」と表示してください
      数字の入力→役判定→数字入力と何回も入力できるようにするためwhile文は残しておいてください
  */
  import java.util.Scanner;
  import java.util.*;

  class Main {
    public static void main(String[] args) throws NumberFormatException{
      Scanner sc = new Scanner(System.in);

      Label1:while(true){
        String str ;
        try{
          str = sc.next();
          int num = Integer.parseInt(str);


        if (num < 10000 || num > 100000 ){
          System.out.println("正常な値を入力してください");
          continue Label1;
        }
        int[] array = new int[5];
        for(int i = 0;i < 5;i++){
          array[i] = num % 10;
          if (num % 10 == 0){
            System.out.println("正常な値を入力してください");
            continue Label1;
          }
          num /= 10;
        }
        Arrays.sort(array);
        int diff0 = 0;
        int diff1 = 0;

        for(int i = 0; i < array.length - 1 ; i++){
          if(array[i] - array[i+1] == -1){
            diff1 += 1;
          }
          if(array[i] - array[i+1] == 0){
            diff0 += 1;
          }

        }
        if (diff1 == 4){
          System.out.println("ストレート！");
          continue Label1;
        }
        if (diff0 == 4){
          System.out.println("正常な値を入力してください");
          continue Label1;
        }
        if (array[0]==array[3] || array[1]==array[4]){
          System.out.println("4カード！");
          continue Label1;
        }

        if(array[0] == array[1] && array[2] == array[4] || array[0]==array[2] && array[3]==array[4]){
          System.out.println("フルハウス");
          continue Label1;
        }
        if(array[0]==array[2] || array[1]==array[3] || array[2]==array[4]){
          System.out.println("3カード");
          continue Label1;
        }

        if (diff0 == 2){
          System.out.println("2ペア");
        }
        if (diff0 == 1){
          System.out.println("1ペア");
        }
        if (diff0 == 0){
          System.out.println("ノーペア");
        }
        }catch(Exception e){
          System.out.println("正常な値を入力してください");
          continue;
        }
      }

    }
  }