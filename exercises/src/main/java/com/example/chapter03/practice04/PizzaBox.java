package com.example.chapter03.practice04;

public class PizzaBox {
	
	private int slices;
	
	/**
	 * コンストラクタ
	 * 
	 * @param initialSlices 初期値スライス数
	 */
	public PizzaBox(int initialSlices) {
		// 0 未満は 0を代入
		if (initialSlices < 0) {
			this.slices = 0;
			return;
		}
		// 、8 超えは 8を代入
		if (initialSlices > 8) {
			this.slices = 8;
			return;
		}
		this.slices = initialSlices;
	}

	/**
	 * count数だけスライス数を減らす
	 * 
	 * @param count
	 */
	public void eat(int count) {
		if (count < 0) {
			return;
		}
		// count数分スライスを減らす（0未満にならにように0で止める）
		if (this.slices - count < 0) {
			this.slices = 0;
			return;
		}
		this.slices -= count;
	}

	/**
	 * 「残り: X切れ」の形式で返す
	 * 
	 * @return
	 */
	public String label() {
		return "残り；　" + this.slices + "切れ";
	}

}
