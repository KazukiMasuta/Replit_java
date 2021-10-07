/**
   ■ゲームを作ってもらいます
  　・登場人物
  　　MJ HP100
  　　みっちー HP100
 　■ゲームの流れ
  　・MJに行動を選択肢を表示させ入力させる
  　　選択肢→攻撃、防御
  　・攻撃を選択した場合
  　　パンチ、キックの選択肢を表示
  　　パンチ→みっちーのHPを30減らせる
  　　キック→みっちーのHPを40減らせる（キックは一回のみしか使えない）
  　　※二回目選択したら使えません等のメッセージを出す
  　・防御を選択した場合
  　　みっちーの攻撃を半減させる
  　　
  　・MJの行動選択後みっちーが攻撃してくる
  　　覇王色の覇気（30ダメージ）かビンタ（20ダメージ）を50％ずつの確率で行う
  　　覇王色の覇気（たまに一撃必殺）※確率はおまかせ

  　・ゲームなのでダメージを与えたら相手の残りのHP
  　　相手が攻撃してきたら自分の残HPを表示

　 ■条件
  　・MJの攻撃メソッド（攻撃の種類を投げるとダメージを返してくれる）を作ってください
  　・みっちーの攻撃メソッドを作ってください
  　・ゲームなので他に楽しそうな要素があったら盛り込んでください（仕様の変更はせずに）　
  　・Scanner sc1 = new Scanner(System.in);を利用して文字の入力をできるようにしてください。
**/
import java.util.Scanner;
import java.util.Random;
import java.io.*;
class Main {
  public static void main(String[] args)throws NumberFormatException, IOException{
    String player1 = "MJ";
    int hp1 = 100;
    int atk1_1 = 30;
    int atk1_2 = 40;
    boolean flag = false;

    String player2 = "みっちー";
    int hp2 = 100;
    int atk2_1 = 20;
    int atk2_2 = new Random().nextInt(60) * 2;
    int num = new Random().nextInt(2);


    System.out.println();
    System.out.println(player2 + "があらわれた。");


    while (hp1 > 0 && hp2 > 0){
      System.out.println("--------------------------");
		  System.out.println(player1 + "	     	   HP:" + hp1);
	  	System.out.println(player2 + "	   HP:" + hp2);
		  System.out.println("--------------------------");
      Scanner choice = new Scanner(System.in);
      System.out.println(player1 + "はどうする？   攻撃 -> 1 : 防御 -> 2");
      int battle1 = choice.nextInt();
      switch(battle1){
      case 1:
        System.out.println(player1 + "の攻撃！");
        System.out.println("どんな攻撃をする？   パンチ -> 1 : キック -> 2");

        int battle2 = choice.nextInt();
        switch(battle2){
        case 1:
          System.out.println(player1 + "は" + player2 + "にパンチをした！");
          System.out.println(player2 + "に" + atk1_1 + "のダメージ！");
          hp2 -= atk1_1;
          break;

        case 2:
        if (flag == false){
          System.out.println(player1 + "は" + player2 + "にキックをした！");
          System.out.println(player2 + "に" + atk1_2 + "のダメージ！");
          hp2 -= atk1_2;
          flag = true;
          break;
        }else{
          System.out.println(player1 + "はもうキックができない！");
        }



        }
        if (hp1 - hp2 >= hp1){
          System.out.println(player1 + "は" + player2 + "を倒した！");
        }else if(hp2 - hp1 >= hp2) {
          System.out.println(player1 + "は" + player2 + "に敗れてしまった。。。");
        }
        System.out.println("--------------------------");
        System.out.println(player2 + "の攻撃！！");

        if (num == 1){
          System.out.println(player2 + "は" + player1 + "にビンタをした！");
          System.out.println(player1 + "に" + atk2_1 + "のダメージ！");
          hp1 -= atk2_1;
        }else{
          System.out.println(player2 + "の覇王色の覇気！");            System.out.println(player1 + "に" + atk2_2 + "のダメージ！");
          hp1 -= atk2_2;
        }
        break;
      case 2:
        System.out.println(player1 + "は防御をえらんだ！");
        System.out.println(player2 + "の攻撃！！");
        if (num == 1){
          System.out.println(player2 + "は" + player1 + "にビンタをした！");

          System.out.println(player1 + "に" + atk2_1 / 2 + "のダメージ！");
          hp1 -= atk2_1 / 2;
        }else{
          System.out.println(player2 + "の覇王色の覇気！");            System.out.println(player1 + "に" + atk2_2 / 2 + "のダメージ！");

          hp1 -= atk2_2 / 2;
        }
        System.out.println(player1 + "は" + player2 + "の攻撃を半減した！");
        break;

      }
      if (hp1 - hp2 >= hp1){
        System.out.println(player1 + "は" + player2 + "を倒した！");
      }else if(hp2 - hp1 >= hp2) {
        System.out.println(player1 + "は" + player2 + "に敗れてしまった。。。");
      }

    }





  }

}
