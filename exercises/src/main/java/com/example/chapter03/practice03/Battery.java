package com.example.chapter03.practice03;

/*
 * スマホのバッテリー（Battery）を表すクラス。
 * 残量を 0〜100% の範囲で管理します。
 */
public class Battery {

  /**
   * バッテリー残量（0〜100%）
   */
  private int percentage;

  /**
   * コンストラクタ。 初期残量を指定してバッテリーを作ります。
   *
   * @param initial 初期残量（%）
   */
  public Battery(int initial) {
    /*
        ガード処理を実装してください。

        【ガード処理とは？】
        ・メソッドやコンストラクタ内で、受け取った値がルール外なら
          その場で安全な値に直したり、先に処理を打ち切るためのチェックのことです。
        ・この課題では、初期残量が範囲外のときに「0〜100」に直してから
          フィールドに代入することを指します。
          例）0 未満は 0、100 超えは 100、それ以外はそのまま代入する
     */
		// 0 未満は 0を代入
		if (initial < 0) {
			this.percentage = 0;
			return;
		}
		// 100 超えは 100を代入
		if (initial > 100) {
			this.percentage = 100;
			return;
		}
    this.percentage = initial; // ここを修正する
	}

	/**
	 * バッテリー残量にチャージ残量を加算
	 * 
	 * @param percent チャージ残量
	 */
	public void charge(int percent) {
		// 0未満は0をセット（上段でも判定済）
		if (this.percentage + percent < 0) {
			this.percentage = 0;
			return;
		}
		// 合計が100超はバッテリー残量を100にする
		if (this.percentage + percent > 100) {
			this.percentage = 100;
			return;
		}
		this.percentage += percent;
	}

	/**
	 * 現在の残量を「バッテリー: X%」の形式で表示
	 * 
	 * @return
	 */
	public String label() {
		return "バッテリー；　" + this.percentage + "%";
	}
}
