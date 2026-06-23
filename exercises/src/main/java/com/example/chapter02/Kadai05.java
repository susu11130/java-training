package com.example.chapter02;

/*
  【問題05：最初に出てきた偶数を探す】
  あなたは数列の中から「最初に登場する偶数」を探そうとしています。
  配列 numbers の中を先頭から順番に調べ、最初に偶数を見つけたら
  その値を表示して探索を終了してください。

  ▼期待される出力結果（配列 numbers の中に偶数があった場合）
  3
  7
  8
  → 最初の偶数は 8 でした

  ▼期待される出力結果（配列 numbers の中に偶数がなかった場合）
  3
  7
  9
  5
  → 偶数は見つかりませんでした

  ▼指示
  ・while文を使って、配列 numbers を順番に調べてください。
  ・偶数を見つけたら、その値を表示し break で探索を終了してください。
  ・最後まで偶数が見つからなければ「偶数は見つかりませんでした」と表示してください。
*/
public class Kadai05 {

  public static void main(String[] args) {
    int[] numbers = {3, 7, 8, 9, 5};
    //int[] numbers = {3, 7, 9, 5};
    // ここに while文を書いて完成させる
		int i = 0;
		while (i < numbers.length) {
			System.out.println(numbers[i]);
			// 偶数の場合は処理終了
			if (numbers[i] % 2 == 0) {
				System.out.println("→ 最初の偶数は " + numbers[i] + " でした");
				break;
			}
			i++;
		}
		// 最後まで偶数が見つからない場合はメッセージ表示
		if (i == numbers.length) {
			System.out.println("→ 偶数は見つかりませんでした");
		}
  }
}