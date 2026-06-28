package com.example.chapter03.practice02;

/*
 * 信号機（TrafficLight）を表すクラス。現在の色を管理して切り替えます。
 */
public class TrafficLight {

  /**
   * 現在の色（"赤" / "黄" / "青"）
   */
  private String color;

  /**
   * 初期色を指定して信号機を作ります。
   *
   * @param initialColor 初期色（"赤" / "黄" / "青"）
   */
  public TrafficLight(String initialColor) {
    this.color = initialColor;
  }

  /**
   * 次の色へ切り替えます（赤→青→黄→赤）。
   */
  public void next() {
    // 実装する。
  	switch (this.color) {
	  	case "赤":
	  		this.color = "青";
	  		break;
	  	case "青":
	  		this.color = "黄";
	  		break;
	  	case "黄":
	  		this.color = "赤";
	  		break;
  	}
  }

  /**
   * 表示用の文字列（例: "信号: 青"）を返します。
   *
   * @return 表示用の文字列
   */
  public String label() {
    return "信号: " + this.color ;
  }
}